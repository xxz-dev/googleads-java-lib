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

package dfp.axis.v201708.activityservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201708.Activity;
import com.google.api.ads.dfp.axis.v201708.ActivityServiceInterface;
import com.google.api.ads.dfp.axis.v201708.ActivityType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates new activities. To determine which activities exist, run
 * GetAllActivities.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateActivities {

  private static class CreateActivitiesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.ACTIVITY_GROUP_ID, required = true,
        description = "The ID of the activity group to create the activities for.")
    private Integer activityGroupId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session,
      int activityGroupId) throws Exception {
    // Get the ActivityService.
    ActivityServiceInterface activityService =
        dfpServices.get(session, ActivityServiceInterface.class);

    // Create a daily visits activity.
    Activity dailyVisitsActivity = new Activity();
    dailyVisitsActivity.setName("Activity #" + new Random().nextInt(Integer.MAX_VALUE));
    dailyVisitsActivity.setActivityGroupId(activityGroupId);
    dailyVisitsActivity.setType(ActivityType.DAILY_VISITS);

    // Create a custom activity.
    Activity customActivity = new Activity();
    customActivity.setName("Activity #" + new Random().nextInt(Integer.MAX_VALUE));
    customActivity.setActivityGroupId(activityGroupId);
    customActivity.setType(ActivityType.CUSTOM);

    // Create the activities on the server.
    Activity[] activities =
        activityService.createActivities(new Activity[] {dailyVisitsActivity, customActivity});

    for (Activity createdActivity : activities) {
      System.out.printf("An activity with ID %d, name '%s', and type '%s' was created.%n",
          createdActivity.getId(), createdActivity.getName(), createdActivity.getType());
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

    CreateActivitiesParams params = new CreateActivitiesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.activityGroupId = Integer.valueOf("INSERT_ACTIVITY_GROUP_ID_HERE");
    }

    runExample(dfpServices, session, params.activityGroupId);
  }
}
