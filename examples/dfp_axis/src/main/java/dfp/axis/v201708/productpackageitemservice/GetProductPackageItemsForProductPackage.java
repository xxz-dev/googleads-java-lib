// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201708.productpackageitemservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.ProductPackageItem;
import com.google.api.ads.dfp.axis.v201708.ProductPackageItemPage;
import com.google.api.ads.dfp.axis.v201708.ProductPackageItemServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all product package items belonging to a product package.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetProductPackageItemsForProductPackage {

  private static class GetProductPackageItemsForProductPackageParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PRODUCT_PACKAGE_ID, required = true)
    private Long productPackageId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long productPackageId)
      throws Exception {
    ProductPackageItemServiceInterface productPackageItemService =
        dfpServices.get(session, ProductPackageItemServiceInterface.class);

    // Create a statement to select product package items.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("productPackageId = :productPackageId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("productPackageId", productPackageId);

    // Retrieve a small amount of product package items at a time, paging through
    // until all product package items have been retrieved.
    int totalResultSetSize = 0;
    do {
      ProductPackageItemPage page =
          productPackageItemService.getProductPackageItemsByStatement(
              statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each product package item.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (ProductPackageItem productPackageItem : page.getResults()) {
          System.out.printf(
              "%d) Product package item with ID %d, product ID %d, "
              + "and product package ID %d was found.%n",
              i++,
              productPackageItem.getId(),
              productPackageItem.getProductId(),
              productPackageItem.getProductPackageId()
          );
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of results found: %d%n", totalResultSetSize);
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential for authentication.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an API session configured from a properties file and the OAuth2
    // credentials above.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    GetProductPackageItemsForProductPackageParams params =
        new GetProductPackageItemsForProductPackageParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.productPackageId = Long.parseLong("INSERT_PRODUCT_PACKAGE_ID_HERE");
    }

    runExample(dfpServices, session, params.productPackageId);
  }
}
