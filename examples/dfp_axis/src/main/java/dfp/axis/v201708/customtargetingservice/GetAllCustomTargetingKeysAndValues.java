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

package dfp.axis.v201708.customtargetingservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.CustomTargetingKey;
import com.google.api.ads.dfp.axis.v201708.CustomTargetingKeyPage;
import com.google.api.ads.dfp.axis.v201708.CustomTargetingServiceInterface;
import com.google.api.ads.dfp.axis.v201708.CustomTargetingValue;
import com.google.api.ads.dfp.axis.v201708.CustomTargetingValuePage;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example gets all custom targeting keys and values. To create custom
 * targeting keys and values, run CreateCustomTargetingKeysAndValues.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetAllCustomTargetingKeysAndValues {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the CustomTargetingService.
    CustomTargetingServiceInterface customTargetingService =
        dfpServices.get(session, CustomTargetingServiceInterface.class);

    // Get all custom targeting keys.
    List<Long> customTargetingKeyIds = getAllCustomTargetingKeyIds(dfpServices, session);

    // Create a statement to get all custom targeting values for a custom
    // targeting key.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("customTargetingKeyId = :customTargetingKeyId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    int totalResultsCounter = 0;

    for (Long customTargetingKeyId : customTargetingKeyIds) {
      // Set the custom targeting key ID to select from.
      statementBuilder.withBindVariableValue("customTargetingKeyId", customTargetingKeyId);

      // Default for total result set size and offset.
      int totalResultSetSize = 0;
      statementBuilder.offset(0);

      do {
        // Get custom targeting values by statement.
        CustomTargetingValuePage page =
            customTargetingService.getCustomTargetingValuesByStatement(
                statementBuilder.toStatement());

        if (page.getResults() != null) {
          totalResultSetSize = page.getTotalResultSetSize();
          for (CustomTargetingValue customTargetingValue : page.getResults()) {
            System.out.printf("%d) Custom targeting value with ID %d, belonging to key "
                + "with ID %d, name '%s' and display name '%s' was found.%n",
                totalResultsCounter++,
                customTargetingValue.getId(),
                customTargetingValue.getCustomTargetingKeyId(),
                customTargetingValue.getName(),
                customTargetingValue.getDisplayName());
          }
        }

        statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
      } while (statementBuilder.getOffset() < totalResultSetSize);
    }

    System.out.printf("Number of results found: %d%n", totalResultsCounter);
  }

  /**
   * Gets all custom targeting key IDs.
   */
  private static List<Long> getAllCustomTargetingKeyIds(DfpServices dfpServices, DfpSession session)
      throws RemoteException {
    List<Long> customTargetingKeyIds = new ArrayList<>();

    // Get the CustomTargetingService.
    CustomTargetingServiceInterface customTargetingService =
        dfpServices.get(session, CustomTargetingServiceInterface.class);

    // Create a statement to get all custom targeting keys.
    StatementBuilder statementBuilder = new StatementBuilder()
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    // Default for total result set size.
    int totalResultSetSize = 0;

    do {
      // Get custom targeting keys by statement.
      CustomTargetingKeyPage page =
          customTargetingService.getCustomTargetingKeysByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (CustomTargetingKey customTargetingKey : page.getResults()) {
          System.out.printf("%d) Custom targeting key with ID %d, name '%s', and "
              + "display name '%s' was found.%n", i++, customTargetingKey.getId(),
              customTargetingKey.getName(), customTargetingKey.getDisplayName());
          customTargetingKeyIds.add(customTargetingKey.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);

    return customTargetingKeyIds;
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

    runExample(dfpServices, session);
  }
}
