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

package dfp.axis.v201708.reconciliationreportrowservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.BillFrom;
import com.google.api.ads.dfp.axis.v201708.ReconciliationReportRow;
import com.google.api.ads.dfp.axis.v201708.ReconciliationReportRowPage;
import com.google.api.ads.dfp.axis.v201708.ReconciliationReportRowServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example updates a reconciliation report row.
 *
 * To get reconciliation report rows for a reconciliation report, run
 * GetReconciliationReportRowsForReconciliationReport.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UpdateReconciliationReportRows {

  private static class UpdateReconciliationReportRowsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.RECONCILIATION_REPORT_ID, required = true,
        description = "The ID of the reconciliation report to retrieve rows for.")
    private Long reconciliationReportId;

    @Parameter(names = ArgumentNames.RECONCILIATION_REPORT_ROW_ID, required = true,
        description = "The ID of the reconciliation report row to retrieve.")
    private Long reconciliationReportRowId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long reconciliationReportId, long reconciliationReportRowId) throws Exception {
    // Get the ReconciliationReportRowService.
    ReconciliationReportRowServiceInterface reconciliationReportRowService =
        dfpServices.get(session, ReconciliationReportRowServiceInterface.class);

    // Create a statement to select reconciliation report rows.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :reconciliationReportRowId AND "
            + "reconciliationReportId = :reconciliationReportId")
        .orderBy("id ASC")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("reconciliationReportRowId", reconciliationReportRowId)
        .withBindVariableValue("reconciliationReportId", reconciliationReportId);

    // Get reconciliation report rows by statement.
    ReconciliationReportRowPage page =
        reconciliationReportRowService.getReconciliationReportRowsByStatement(
            statementBuilder.toStatement());

    ReconciliationReportRow row = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    // Set a comment on the reconciliation report row.
    row.setComments("Third party volume didn't match DFP - we agreed to split the difference");

    // Set and use a manual volume for billing.
    row.setManualVolume((row.getDfpVolume() + row.getThirdPartyVolume()) / 2);
    row.setReconciliationSource(BillFrom.MANUAL);

    ReconciliationReportRow[] updatedRows =
        reconciliationReportRowService.updateReconciliationReportRows(
            new ReconciliationReportRow[] {row});

    for (ReconciliationReportRow updatedRow : updatedRows) {
      System.out.printf(
          "Reconciliation report row for line item ID %d and creative ID %d was "
              + "updated, with manual volume %d.%n",
          updatedRow.getLineItemId(),
          updatedRow.getCreativeId(),
          updatedRow.getManualVolume());
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

    UpdateReconciliationReportRowsParams params = new UpdateReconciliationReportRowsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.reconciliationReportId = Long.parseLong("INSERT_RECONCILIATION_REPORT_ID_HERE");
      params.reconciliationReportRowId = Long.parseLong("INSERT_RECONCILIATION_REPORT_ROW_ID_HERE");
    }

    runExample(dfpServices, session, params.reconciliationReportId,
        params.reconciliationReportRowId);
  }
}
