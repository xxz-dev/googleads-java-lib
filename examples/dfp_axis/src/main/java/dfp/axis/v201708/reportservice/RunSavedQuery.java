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

package dfp.axis.v201708.reportservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201708.ReportDownloader;
import com.google.api.ads.dfp.axis.utils.v201708.StatementBuilder;
import com.google.api.ads.dfp.axis.v201708.ExportFormat;
import com.google.api.ads.dfp.axis.v201708.ReportDownloadOptions;
import com.google.api.ads.dfp.axis.v201708.ReportJob;
import com.google.api.ads.dfp.axis.v201708.ReportQuery;
import com.google.api.ads.dfp.axis.v201708.ReportQueryAdUnitView;
import com.google.api.ads.dfp.axis.v201708.ReportServiceInterface;
import com.google.api.ads.dfp.axis.v201708.SavedQuery;
import com.google.api.ads.dfp.axis.v201708.SavedQueryPage;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Iterables;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import java.io.File;
import java.net.URL;
import java.util.Arrays;

/**
 * This example runs a report from a saved query.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class RunSavedQuery {

  private static class RunSavedQueryParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.SAVED_QUERY_ID, required = true,
        description = "The ID of the saved query to run. This ID is part of the URL in the"
            + " DFP UI.")
    private Long savedQueryId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long savedQueryId)
      throws Exception {
    // Get the ReportService.
    ReportServiceInterface reportService = dfpServices.get(session, ReportServiceInterface.class);

    // Create statement to retrieve the saved query.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("id = :id")
        .orderBy("id ASC")
        .limit(1)
        .withBindVariableValue("id", savedQueryId);

    SavedQueryPage page = reportService.getSavedQueriesByStatement(statementBuilder.toStatement());
    SavedQuery savedQuery = Iterables.getOnlyElement(Arrays.asList(page.getResults()));

    if (!savedQuery.getIsCompatibleWithApiVersion()) {
      throw new IllegalStateException("The saved query is not compatible with this API version.");
    }

    // Optionally modify the query.
    ReportQuery reportQuery = savedQuery.getReportQuery();
    reportQuery.setAdUnitView(ReportQueryAdUnitView.HIERARCHICAL);

    // Create report job using the saved query.
    ReportJob reportJob = new ReportJob();
    reportJob.setReportQuery(reportQuery);

    // Run report job.
    reportJob = reportService.runReportJob(reportJob);

    // Create report downloader.
    ReportDownloader reportDownloader = new ReportDownloader(reportService, reportJob.getId());

    // Wait for the report to be ready.
    reportDownloader.waitForReportReady();

    // Change to your file location.
    File file = File.createTempFile("inventory-report-", ".csv.gz");

    System.out.printf("Downloading report to %s ...", file.toString());

    // Download the report.
    ReportDownloadOptions options = new ReportDownloadOptions();
    options.setExportFormat(ExportFormat.CSV_DUMP);
    options.setUseGzipCompression(true);
    URL url = reportDownloader.getDownloadUrl(options);
    Resources.asByteSource(url).copyTo(Files.asByteSink(file));

    System.out.println("done.");
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

    RunSavedQueryParams params = new RunSavedQueryParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.savedQueryId = Long.parseLong("INSERT_SAVED_QUERY_ID_HERE");
    }

    runExample(dfpServices, session, params.savedQueryId);
  }
}
