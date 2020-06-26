// Copyright 2017 Google Inc. All Rights Reserved.
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

package dfp.axis.v201708.nativestyleservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.NativeStyle;
import com.google.api.ads.dfp.axis.v201708.NativeStylePage;
import com.google.api.ads.dfp.axis.v201708.NativeStyleServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all native styles.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetAllNativeStyles {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    NativeStyleServiceInterface nativeStyleService =
        dfpServices.get(session, NativeStyleServiceInterface.class);

    // Create a statement to select native styles.
    StatementBuilder statementBuilder = new StatementBuilder()
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT);

    // Retrieve a small amount of native styles at a time, paging through
    // until all native styles have been retrieved.
    int totalResultSetSize = 0;
    do {
      NativeStylePage page =
          nativeStyleService.getNativeStylesByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each native style.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (NativeStyle nativeStyle : page.getResults()) {
          System.out.printf(
              "%d) Native style with ID %d and name '%s' was found.%n", i++,
              nativeStyle.getId(), nativeStyle.getName());
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

    runExample(dfpServices, session);
  }
}
