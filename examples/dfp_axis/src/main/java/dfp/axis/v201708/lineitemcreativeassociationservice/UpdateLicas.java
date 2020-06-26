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
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a LICA's destination URL. To determine which LICAs
 * exist, run GetAllLineItemCreativeAssociations.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateLicas {

  private static class UpdateLicasParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.LINE_ITEM_ID, required = true,
        description = "The line item ID of the LICA.")
    private Long lineItemId;

    @Parameter(names = ArgumentNames.CREATIVE_ID, required = true,
        description = "The master or creative set ID of the LICA. For creative sets, set the"
            + " master creative ID.")
    private Long creativeId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long lineItemId,
      long creativeId) throws Exception {
    // Get the LineItemCreativeAssociationService.
    LineItemCreativeAssociationServiceInterface licaService =
        dfpServices.get(session, LineItemCreativeAssociationServiceInterface.class);

    // Create a statement to select a single LICA for a line item.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("lineItemId = :lineItemId AND creativeId = :creativeId")
        .orderBy("lineItemId ASC, creativeId ASC")
        .limit(1)
        .withBindVariableValue("lineItemId", lineItemId)
        .withBindVariableValue("creativeId", creativeId);

    // Get the LICA.
    LineItemCreativeAssociationPage page =
        licaService.getLineItemCreativeAssociationsByStatement(statementBuilder.toStatement());

    LineItemCreativeAssociation lica = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the destination URL.
    lica.setDestinationUrl("http://news.google.com?newTrackingParameter");

    // Update the LICA on the server.
    LineItemCreativeAssociation[] licas =
        licaService.updateLineItemCreativeAssociations(new LineItemCreativeAssociation[] {lica});

    for (LineItemCreativeAssociation updatedLica : licas) {
      System.out.printf("LICA with line item ID %d and creative ID %d was updated.%n",
          updatedLica.getLineItemId(), updatedLica.getCreativeId());
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

    UpdateLicasParams params = new UpdateLicasParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.lineItemId = Long.parseLong("INSERT_LINE_ITEM_ID_HERE");
      params.creativeId = Long.parseLong("INSERT_CREATIVE_ID_HERE");
    }

    runExample(dfpServices, session, params.lineItemId, params.creativeId);
  }
}
