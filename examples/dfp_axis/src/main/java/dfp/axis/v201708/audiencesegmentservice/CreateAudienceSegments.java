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

package dfp.axis.v201708.audiencesegmentservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201708.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201708.AudienceSegment;
import com.google.api.ads.dfp.axis.v201708.AudienceSegmentServiceInterface;
import com.google.api.ads.dfp.axis.v201708.CustomCriteria;
import com.google.api.ads.dfp.axis.v201708.CustomCriteriaComparisonOperator;
import com.google.api.ads.dfp.axis.v201708.CustomCriteriaNode;
import com.google.api.ads.dfp.axis.v201708.CustomCriteriaSet;
import com.google.api.ads.dfp.axis.v201708.CustomCriteriaSetLogicalOperator;
import com.google.api.ads.dfp.axis.v201708.FirstPartyAudienceSegment;
import com.google.api.ads.dfp.axis.v201708.FirstPartyAudienceSegmentRule;
import com.google.api.ads.dfp.axis.v201708.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201708.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201708.RuleBasedFirstPartyAudienceSegment;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates new rule based first party audience segments. To
 * determine which audience segments exist, run GetAllAudienceSegments.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateAudienceSegments {

  private static class CreateAudienceSegmentsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.TARGETING_KEY_ID, required = true,
        description = "The ID of the custom criteria to be used in the segment rule.")
    private Long customTargetingKeyId;

    @Parameter(names = ArgumentNames.TARGETING_VALUE_ID, required = true)
    private Long customTargetingValueId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long customTargetingKeyId, long customTargetingValueId) throws Exception {
    // Get the AudienceSegmentService.
    AudienceSegmentServiceInterface audienceSegmentService =
        dfpServices.get(session, AudienceSegmentServiceInterface.class);

    // Get the NetworkService.
    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);

    // Get the root ad unit ID used to target the whole site.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create inventory targeting.
    InventoryTargeting inventoryTargeting = new InventoryTargeting();

    // Create ad unit targeting for the root ad unit (i.e. the whole network).
    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId(rootAdUnitId);
    adUnitTargeting.setIncludeDescendants(true);

    inventoryTargeting.setTargetedAdUnits(new AdUnitTargeting[] {adUnitTargeting});

    // Create the custom criteria to be used in the segment rule.
    // TARGETING_KEY_ID == TARGETING_VALUE_ID
    CustomCriteria customCriteria = new CustomCriteria();
    customCriteria.setKeyId(customTargetingKeyId);
    customCriteria.setOperator(CustomCriteriaComparisonOperator.IS);
    customCriteria.setValueIds(new long[] {customTargetingValueId});

    // Create the custom criteria expression.
    CustomCriteriaSet topCustomCriteriaSet = new CustomCriteriaSet();
    topCustomCriteriaSet.setLogicalOperator(CustomCriteriaSetLogicalOperator.AND);
    topCustomCriteriaSet.setChildren(new CustomCriteriaNode[] {customCriteria});

    // Create the audience segment rule.
    FirstPartyAudienceSegmentRule rule = new FirstPartyAudienceSegmentRule();
    rule.setInventoryRule(inventoryTargeting);
    rule.setCustomCriteriaRule(topCustomCriteriaSet);

    // Create an audience segment.
    RuleBasedFirstPartyAudienceSegment audienceSegment = new RuleBasedFirstPartyAudienceSegment();
    audienceSegment.setName(
        "Sports enthusiasts audience segment #" + new Random().nextInt(Integer.MAX_VALUE));
    audienceSegment.setDescription("Sports enthusiasts between the ages of 20 and 30.");
    audienceSegment.setPageViews(6);
    audienceSegment.setRecencyDays(6);
    audienceSegment.setMembershipExpirationDays(88);
    audienceSegment.setRule(rule);

    // Create the audience segment on the server.
    AudienceSegment[] audienceSegments = audienceSegmentService.createAudienceSegments(
        new FirstPartyAudienceSegment[] {audienceSegment});

    for (AudienceSegment createdAudienceSegment : audienceSegments) {
      System.out.printf(
          "An audience segment with ID %d, name '%s', and type '%s' was created.%n",
          createdAudienceSegment.getId(), createdAudienceSegment.getName(),
          createdAudienceSegment.getType());
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

    CreateAudienceSegmentsParams params = new CreateAudienceSegmentsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customTargetingKeyId = Long.parseLong("INSERT_CUSTOM_TARGETING_KEY_ID_HERE");
      params.customTargetingValueId = Long.parseLong("INSERT_CUSTOM_TARGETING_VALUE_ID_HERE");
    }

    runExample(dfpServices, session, params.customTargetingKeyId, params.customTargetingValueId);
  }
}
