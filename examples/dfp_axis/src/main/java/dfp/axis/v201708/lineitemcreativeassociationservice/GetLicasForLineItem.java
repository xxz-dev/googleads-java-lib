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

package dfp.axis.v201708.lineitemcreativeassociationservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.LineItemCreativeAssociation;
import com.google.api.ads.dfp.axis.v201708.LineItemCreativeAssociationPage;
import com.google.api.ads.dfp.axis.v201708.LineItemCreativeAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all line item creative associations for a given line item.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetLicasForLineItem {

  private static class GetLicasForLineItemParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.LINE_ITEM_ID, required = true)
    private Long lineItemId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long lineItemId)
      throws Exception {
    LineItemCreativeAssociationServiceInterface lineItemCreativeAssociationService =
        dfpServices.get(session, LineItemCreativeAssociationServiceInterface.class);

    // Create a statement to select line item creative associations.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("lineItemId = :lineItemId")
        .orderBy("lineItemId ASC, creativeId ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("lineItemId", lineItemId);

    // Retrieve a small amount of line item creative associations at a time, paging through
    // until all line item creative associations have been retrieved.
    int totalResultSetSize = 0;
    do {
      LineItemCreativeAssociationPage page =
          lineItemCreativeAssociationService.getLineItemCreativeAssociationsByStatement(
          statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each line item creative association.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (LineItemCreativeAssociation lica : page.getResults()) {
          if (lica.getCreativeSetId() != null) {
            System.out.printf(
                "%d) LICA with line item ID %d and creative set ID %d was found.%n",
                i++,
                lica.getLineItemId(),
                lica.getCreativeSetId());
          } else {
            System.out.printf(
                "%d) LICA with line item ID %d and creative ID %d was found.%n",
                i++,
                lica.getLineItemId(),
                lica.getCreativeId());
          }
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

    GetLicasForLineItemParams params = new GetLicasForLineItemParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
    }

    runExample(dfpServices, session, params.lineItemId);
  }
}
