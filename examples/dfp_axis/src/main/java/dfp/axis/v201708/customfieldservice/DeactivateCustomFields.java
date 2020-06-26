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

package dfp.axis.v201708.customfieldservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.CustomField;
import com.google.api.ads.dfp.axis.v201708.CustomFieldPage;
import com.google.api.ads.dfp.axis.v201708.CustomFieldServiceInterface;
import com.google.api.ads.dfp.axis.v201708.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example deactivates a custom field. To determine which custom fields
 * exist, run GetAllCustomFields.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class DeactivateCustomFields {

  private static class DeactivateCustomFieldsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOM_FIELD_ID, required = true,
        description = "The ID of the custom field to deactivate.")
    private Long customFieldId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long customFieldId)
      throws Exception {
    // Get the CustomFieldService.
    CustomFieldServiceInterface customFieldService =
        dfpServices.get(session, CustomFieldServiceInterface.class);

    // Create a statement to select a custom field.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE id = :id")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("id", customFieldId);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get custom fields by statement.
      CustomFieldPage page =
          customFieldService.getCustomFieldsByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (CustomField customField : page.getResults()) {
          System.out.printf(
              "%d) Custom field with ID %d will be deactivated.%n", i++, customField.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    System.out.printf("Number of custom fields to be deactivated: %d%n", totalResultSetSize);

    if (totalResultSetSize > 0) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201708.DeactivateCustomFields action =
          new com.google.api.ads.dfp.axis.v201708.DeactivateCustomFields();

      // Perform action.
      UpdateResult result = customFieldService.performCustomFieldAction(
          action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.printf("Number of custom fields deactivated: %d%n", result.getNumChanges());
      } else {
        System.out.println("No custom fields were deactivated.");
      }
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

    DeactivateCustomFieldsParams params = new DeactivateCustomFieldsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customFieldId = Long.parseLong("INSERT_CUSTOM_FIELD_ID_HERE");
    }

    runExample(dfpServices, session, params.customFieldId);
  }
}
