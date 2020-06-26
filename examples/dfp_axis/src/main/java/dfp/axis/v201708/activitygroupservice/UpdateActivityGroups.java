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

package dfp.axis.v201708.activitygroupservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.ActivityGroup;
import com.google.api.ads.dfp.axis.v201708.ActivityGroupPage;
import com.google.api.ads.dfp.axis.v201708.ActivityGroupServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Longs;
import java.util.Arrays;

/**
 * This example updates activity groups by adding a company. To determine which
 * activity groups exist, run GetAllActivityGroups.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateActivityGroups {

  private static class UpdateActivityGroupsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.ACTIVITY_GROUP_ID, required = true,
        description = "The ID of the activity group to update.")
    private Integer activityGroupId;

    @Parameter(names = ArgumentNames.ADVERTISER_COMPANY_ID, required = true,
        description = "The ID of the company to associate with the activity group.")
    private Long advertiserCompanyId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session,
      int activityGroupId, long advertiserCompanyId) throws Exception {
    // Get the ActivityGroupService.
    ActivityGroupServiceInterface activityGroupService =
        dfpServices.get(session, ActivityGroupServiceInterface.class);

    // Create a statement to only select a single activity group by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", activityGroupId);

    // Get the activity group.
    ActivityGroupPage page =
        activityGroupService.getActivityGroupsByStatement(statementBuilder.toStatement());

    ActivityGroup activityGroup = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update the companies.
    activityGroup.setCompanyIds(
        Longs.concat(activityGroup.getCompanyIds(), new long[] {advertiserCompanyId}));

    // Update the activity group on the server.
    ActivityGroup[] activityGroups =
        activityGroupService.updateActivityGroups(new ActivityGroup[] {activityGroup});

    for (ActivityGroup updatedActivityGroup : activityGroups) {
      System.out.printf(
          "Activity group with ID %d and name '%s' was updated.%n",
          updatedActivityGroup.getId(), updatedActivityGroup.getName());
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

    UpdateActivityGroupsParams params = new UpdateActivityGroupsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.activityGroupId = Integer.valueOf("INSERT_ACTIVITY_GROUP_ID_HERE");
      params.advertiserCompanyId = Long.parseLong("INSERT_ADVERTISER_COMPANY_ID_HERE");
    }

    runExample(dfpServices, session, params.activityGroupId, params.advertiserCompanyId);
  }
}
