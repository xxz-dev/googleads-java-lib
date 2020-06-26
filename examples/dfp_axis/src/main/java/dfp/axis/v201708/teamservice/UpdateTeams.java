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

package dfp.axis.v201708.teamservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.Team;
import com.google.api.ads.dfp.axis.v201708.TeamPage;
import com.google.api.ads.dfp.axis.v201708.TeamServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a team's description.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateTeams {

  private static class UpdateTeamsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.TEAM_ID, required = true,
        description = "The ID of the team to update.")
    private Long teamId;
  }

  public static void runExample(
      DfpServices dfpServices, DfpSession session, long teamId) throws Exception {
    // Get the TeamService.
    TeamServiceInterface teamService =
        dfpServices.get(session, TeamServiceInterface.class);

    // Create a statement to only select a single team by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", teamId);

    // Get the team.
    TeamPage page =
        teamService.getTeamsByStatement(statementBuilder.toStatement());

    Team team = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    String newDescription = team.getDescription() + " - UPDATED";
    team.setDescription(newDescription);

    // Update the team on the server.
    Team[] teams = teamService.updateTeams(new Team[] {team});

    for (Team updatedTeam : teams) {
      System.out.printf("Team with ID %d and name '%s' was updated.%n", updatedTeam.getId(),
          updatedTeam.getName());
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

    UpdateTeamsParams params = new UpdateTeamsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.teamId = Long.parseLong("INSERT_TEAM_ID_HERE");
    }

    runExample(dfpServices, session, params.teamId);
  }
}
