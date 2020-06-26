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

package dfp.axis.v201708.premiumrateservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201708.AdUnitPremiumFeature;
import com.google.api.ads.dfp.axis.v201708.PremiumAdjustmentType;
import com.google.api.ads.dfp.axis.v201708.PremiumRate;
import com.google.api.ads.dfp.axis.v201708.PremiumRateServiceInterface;
import com.google.api.ads.dfp.axis.v201708.PremiumRateValue;
import com.google.api.ads.dfp.axis.v201708.PricingMethod;
import com.google.api.ads.dfp.axis.v201708.RateType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a premium rate for a specific rate card.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreatePremiumRates {

  private static class CreatePremiumRatesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.RATE_CARD_ID, required = true,
        description = "The ID of the rate card to add premium rates to.")
    private Long rateCardId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long rateCardId)
      throws Exception {
    // Get the PremiumRateService.
    PremiumRateServiceInterface premiumRateService =
        dfpServices.get(session, PremiumRateServiceInterface.class);

    PremiumRate premiumRate = new PremiumRate();

    // Create an ad unit premium to apply to the rate card.
    AdUnitPremiumFeature adUnitPremiumFeature = new AdUnitPremiumFeature();

    // Create a CPM based premium rate value with adjustments in micro amounts.
    // This will adjust a CPM priced proposal line item that has
    // inventory targeting specified by 2 units of the currency associated with
    // the rate card (this comes from absolute value adjustment).
    PremiumRateValue cpmPremiumRateValue = new PremiumRateValue();
    cpmPremiumRateValue.setPremiumFeature(adUnitPremiumFeature);
    cpmPremiumRateValue.setRateType(RateType.CPM);
    cpmPremiumRateValue.setAdjustmentSize(2000000L);
    cpmPremiumRateValue.setAdjustmentType(PremiumAdjustmentType.ABSOLUTE_VALUE);

    // Create a CPC based premium rate value with adjustments in milli amounts.
    // This will adjust a CPC priced proposal line item that has
    // inventory targeting specified by 10% of the cost associated with the rate
    // card (this comes from a percentage adjustment).
    PremiumRateValue cpcPremiumRateValue = new PremiumRateValue();
    cpcPremiumRateValue.setPremiumFeature(adUnitPremiumFeature);
    cpcPremiumRateValue.setRateType(RateType.CPC);
    cpcPremiumRateValue.setAdjustmentSize(10000L);
    cpcPremiumRateValue.setAdjustmentType(PremiumAdjustmentType.PERCENTAGE);

    // Associate premium rate with the rate card and set premium information.
    // This premium will apply for proposal line items targeting 'any' ad unit
    // for both CPM and CPC rate types.
    premiumRate.setRateCardId(rateCardId);
    premiumRate.setPricingMethod(PricingMethod.ANY_VALUE);
    premiumRate.setPremiumFeature(adUnitPremiumFeature);
    premiumRate.setPremiumRateValues(new PremiumRateValue[] {
        cpmPremiumRateValue, cpcPremiumRateValue});

    PremiumRate[] createdPremiumRates =
        premiumRateService.createPremiumRates(new PremiumRate[] {premiumRate});

    for (PremiumRate createdPremiumRate : createdPremiumRates) {
      System.out.printf("A premium rate for '%s' was added to the rate card with ID of %d.%n",
          createdPremiumRate.getPremiumFeature().getClass().getSimpleName(),
          createdPremiumRate.getRateCardId());
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

    CreatePremiumRatesParams params = new CreatePremiumRatesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.rateCardId = Long.parseLong("INSERT_RATE_CARD_ID_HERE");
    }

    runExample(dfpServices, session, params.rateCardId);
  }
}
