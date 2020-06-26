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

package dfp.axis.v201708.baserateservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.BaseRate;
import com.google.api.ads.dfp.axis.v201708.BaseRatePage;
import com.google.api.ads.dfp.axis.v201708.BaseRateServiceInterface;
import com.google.api.ads.dfp.axis.v201708.Money;
import com.google.api.ads.dfp.axis.v201708.ProductBaseRate;
import com.google.api.ads.dfp.axis.v201708.ProductTemplateBaseRate;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a base rate's value. To determine which base rates
 * exist, run GetAllBaseRates.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateBaseRates {

  private static class UpdateBaseRatesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.BASE_RATE_ID, required = true,
        description = "The base rate ID to update.")
    private Long baseRateId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long baseRateId)
      throws Exception {
    // Get the BaseRateService.
    BaseRateServiceInterface baseRateService =
        dfpServices.get(session, BaseRateServiceInterface.class);

    // Create a statement to only select a single base rate by ID.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", baseRateId);

    // Get the base rate.
    BaseRatePage page =
        baseRateService.getBaseRatesByStatement(statementBuilder.toStatement());

    BaseRate baseRate = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Update base rate value to $3 USD.
    Money newRate = new Money();
    newRate.setCurrencyCode("USD");
    newRate.setMicroAmount(3000000L);
    
    if (baseRate instanceof ProductTemplateBaseRate) {
      ((ProductTemplateBaseRate) baseRate).setRate(newRate);
    } else if (baseRate instanceof ProductBaseRate) {
      ((ProductBaseRate) baseRate).setRate(newRate);
    }
    
    // Update the base rate on the server.
    BaseRate[] baseRates = baseRateService.updateBaseRates(
        new BaseRate[] {baseRate});

    for (BaseRate updatedBaseRate : baseRates) {
      System.out.printf("Base rate with ID %d and type '%s',"
          + " belonging to rate card ID %d was updated.%n",
          updatedBaseRate.getId(), updatedBaseRate.getClass().getSimpleName(),
          updatedBaseRate.getRateCardId());
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

    UpdateBaseRatesParams params = new UpdateBaseRatesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.baseRateId = Long.parseLong("INSERT_BASE_RATE_ID_HERE");
    }

    runExample(dfpServices, session, params.baseRateId);
  }
}
