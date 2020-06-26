// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utils.v201809.batchjob;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.api.ads.adwords.axis.AdWordsAxisModule;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.AxisDeserializer;
import com.google.api.ads.adwords.axis.v201809.cm.ApiError;
import com.google.api.ads.adwords.axis.v201809.cm.Campaign;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201809.cm.Operand;
import com.google.api.ads.adwords.axis.v201809.cm.Operation;
import com.google.api.ads.adwords.axis.v201809.cm.Operator;
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploader;
import com.google.inject.Guice;
import com.google.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Tests for {@link BatchJobHelper}. */
@RunWith(JUnit4.class)
public class BatchJobHelperTest
    extends com.google.api.ads.adwords.lib.utils.testing.BatchJobHelperTest<
        Operation, Operand, ApiError, MutateResult, BatchJobMutateResponse> {

  @Inject private AxisDeserializer deserializer;

  @Test
  public void testGetFromAdWordsServices() {
    BatchJobHelper helper = AdWordsServices.getInstance().getUtility(session, BatchJobHelper.class);
    assertNotNull("Helper from AdWordsServices is null", helper);
  }

  @Test
  public void testSessionBasedConstructor() {
    BatchJobHelper helper = new BatchJobHelper(session);
    assertNotNull("Helper from session-based constructor is null", helper);
  }

  @Override
  protected BatchJobHelperInterface<
          Operation, Operand, ApiError, MutateResult, BatchJobMutateResponse>
      createBatchJobHelper(BatchJobUploader uploader) {
    Guice.createInjector(new AdWordsAxisModule()).injectMembers(this);
    return new BatchJobHelper(
        new BatchJobHelperImpl(uploader, batchJobLogger, deserializer), adsUtilityRegistry);
  }

  @Override
  protected Operation getPauseCampaignOperation(Long campaignId) {
    CampaignOperation op = new CampaignOperation();
    Campaign campaign = new Campaign();
    campaign.setId(campaignId);
    campaign.setStatus(CampaignStatus.PAUSED);
    op.setOperand(campaign);
    op.setOperator(Operator.SET);

    return op;
  }

  @Override
  protected void assertDownloadResponse(BatchJobMutateResponse downloadResponse) {
    assertEquals("Wrong # of mutate results", 1, downloadResponse.getMutateResults().length);
    Operand operand = downloadResponse.getMutateResults()[0].getOperand();
    Campaign campaign = operand.getCampaign();
    assertEquals("ID is incorrect", Long.valueOf(12345L), campaign.getId());
    assertEquals("Status is incorrect", CampaignStatus.PAUSED, campaign.getStatus());
  }

  @Override
  protected String getVersion() {
    return "v201809";
  }

  @Override
  protected boolean expectNullResultsForEmptyResponse() {
    return false;
  }
}
