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

package dfp.axis.v201708.userteamassociationservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.UserTeamAssociation;
import com.google.api.ads.dfp.axis.v201708.UserTeamAssociationPage;
import com.google.api.ads.dfp.axis.v201708.UserTeamAssociationServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all user team associations (i.e. teams) for a given user.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetUserTeamAssociationsForUser {

  private static class GetUserTeamAssociationsForUserParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.USER_ID, required = true)
    private Long userId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long userId)
      throws Exception {
    UserTeamAssociationServiceInterface userTeamAssociationService =
        dfpServices.get(session, UserTeamAssociationServiceInterface.class);

    // Create a statement to select user team associations.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("userId = :userId")
        .orderBy("userId ASC, teamId ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("userId", userId);

    // Retrieve a small amount of user team associations at a time, paging through
    // until all user team associations have been retrieved.
    int totalResultSetSize = 0;
    do {
      UserTeamAssociationPage page =
          userTeamAssociationService.getUserTeamAssociationsByStatement(
              statementBuilder.toStatement());

      if (page.getResults() != null) {
        // Print out some information for each user team association.
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (UserTeamAssociation userTeamAssociation : page.getResults()) {
          System.out.printf(
              "%d) User team association with user ID %d and team ID %d was found.%n",
              i++,
              userTeamAssociation.getUserId(),
              userTeamAssociation.getTeamId()
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

    GetUserTeamAssociationsForUserParams params = new GetUserTeamAssociationsForUserParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.userId = Long.parseLong("INSERT_USER_ID_HERE");
    }

    runExample(dfpServices, session, params.userId);
  }
}
