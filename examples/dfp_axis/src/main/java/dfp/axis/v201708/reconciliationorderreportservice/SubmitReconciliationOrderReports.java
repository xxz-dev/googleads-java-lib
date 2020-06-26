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

package dfp.axis.v201708.reconciliationorderreportservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.ReconciliationOrderReport;
import com.google.api.ads.dfp.axis.v201708.ReconciliationOrderReportPage;
import com.google.api.ads.dfp.axis.v201708.ReconciliationOrderReportServiceInterface;
import com.google.api.ads.dfp.axis.v201708.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import java.util.Arrays;

/**
 * This example submits a reconciliation order report. To get all reconciliation order reports
 * for a reconciliation report, run GetReconciliationOrderReportsForReconciliationReport.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class SubmitReconciliationOrderReports {

  private static class SubmitReconciliationOrderReportsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.RECONCILIATION_ORDER_REPORT_ID, required = true,
        description = "The ID of the reconciliation order report to submit.")
    private Long reconciliationOrderReportId;
  }

  public static void runExample(
      DfpServices dfpServices, DfpSession session, long reconciliationOrderReportId)
      throws Exception {
    // Get the ReconciliationOrderReportService.
    ReconciliationOrderReportServiceInterface reconciliationOrderReportService =
        dfpServices.get(session, ReconciliationOrderReportServiceInterface.class);

    // Create a statement to select reconciliation order reports.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", reconciliationOrderReportId);

    // Get reconciliation order reports by statement.
    ReconciliationOrderReportPage page =
        reconciliationOrderReportService.getReconciliationOrderReportsByStatement(
            statementBuilder.toStatement());

    ReconciliationOrderReport reconciliationOrderReport =
        Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    System.out.printf(
        "Reconciliation order report with ID %d will be submitted.%n",
        reconciliationOrderReport.getId());

    // Remove limit and offset from statement.
    statementBuilder.removeLimitAndOffset();

    // Create action to submit reconciliation order reports.
    com.google.api.ads.dfp.axis.v201708.SubmitReconciliationOrderReports action =
        new com.google.api.ads.dfp.axis.v201708.SubmitReconciliationOrderReports();

    // Perform action.
    UpdateResult result =
        reconciliationOrderReportService.performReconciliationOrderReportAction(
            action, statementBuilder.toStatement());

    if (result != null && result.getNumChanges() > 0) {
      System.out.printf(
          "Number of reconciliation order reports submitted: %d%n", result.getNumChanges());
    } else {
      System.out.println("No reconciliation order reports were submitted.");
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

    SubmitReconciliationOrderReportsParams params = new SubmitReconciliationOrderReportsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.reconciliationOrderReportId =
          Long.parseLong("INSERT_RECONCILIATION_ORDER_REPORT_ID_HERE");
    }

    runExample(dfpServices, session, params.reconciliationOrderReportId);
  }
}
