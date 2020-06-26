// Copyright 2015 Google Inc. All Rights Reserved.
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

package dfp.axis.v201708.packageservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.Package;
import com.google.api.ads.dfp.axis.v201708.PackagePage;
import com.google.api.ads.dfp.axis.v201708.PackageServiceInterface;
import com.google.api.ads.dfp.axis.v201708.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example creates all proposal line items within an IN_PROGRESS package.
 * To determine which packages exist, run GetAllPackages.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProposalLineItemsFromPackages {

  private static class CreateProposalLineItemsFromPackagesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PACKAGE_ID, required = true,
        description = "The ID of the package to create line items from.")
    private Long packageId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long packageId)
      throws Exception {
    // Get the PackageService.
    PackageServiceInterface packageService =
        dfpServices.get(session, PackageServiceInterface.class);

    // Create a statement to select a single package.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", packageId);

    // Get the package.
    PackagePage page = packageService.getPackagesByStatement(statementBuilder.toStatement());

    Package pkg = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    System.out.printf("Package with ID %d will create proposal line items using"
        + " product package with ID %d.%n", pkg.getId(), pkg.getProductPackageId());

    // Remove limit and offset from statement.
    statementBuilder.removeLimitAndOffset();

    // Create action to activate packages.
    com.google.api.ads.dfp.axis.v201708.CreateProposalLineItemsFromPackages action =
        new com.google.api.ads.dfp.axis.v201708.CreateProposalLineItemsFromPackages();

    // Perform action.
    UpdateResult result = packageService.performPackageAction(
        action, statementBuilder.toStatement());

    if (result != null && result.getNumChanges() > 0) {
      System.out.printf("Number of packages proposal line items were created for: %d%n",
          result.getNumChanges());
    } else {
      System.out.println("No proposal line items were created.");
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    CreateProposalLineItemsFromPackagesParams params =
        new CreateProposalLineItemsFromPackagesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.packageId = Long.parseLong("INSERT_PACKAGE_ID_HERE");
    }

    runExample(dfpServices, session, params.packageId);
  }
}
