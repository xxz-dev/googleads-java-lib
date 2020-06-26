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

package admanager.axis.v202005.reportservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.utils.v202005.ReportDownloader;
import com.google.api.ads.admanager.axis.v202005.ApiError;
import com.google.api.ads.admanager.axis.v202005.ApiException;
import com.google.api.ads.admanager.axis.v202005.Column;
import com.google.api.ads.admanager.axis.v202005.DateRangeType;
import com.google.api.ads.admanager.axis.v202005.Dimension;
import com.google.api.ads.admanager.axis.v202005.ExportFormat;
import com.google.api.ads.admanager.axis.v202005.ReportDownloadOptions;
import com.google.api.ads.admanager.axis.v202005.ReportJob;
import com.google.api.ads.admanager.axis.v202005.ReportQuery;
import com.google.api.ads.admanager.axis.v202005.ReportServiceInterface;
import com.google.api.ads.admanager.axis.v202005.TimeZoneType;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * This example runs a report on Ad Exchange data via the Ad Manager API.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class RunAdExchangeReport {

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws IOException if the report's contents could not be written to a temp file.
   * @throws InterruptedException if the thread was interrupted while waiting for the report to be
   *     ready.
   */
  public static void runExample(AdManagerServices adManagerServices, AdManagerSession session)
      throws IOException, InterruptedException {
    // Get the ReportService.
    ReportServiceInterface reportService =
        adManagerServices.get(session, ReportServiceInterface.class);

    // Create report query.
    ReportQuery reportQuery = new ReportQuery();
    reportQuery.setDimensions(
        new Dimension[] {Dimension.AD_EXCHANGE_DATE, Dimension.AD_EXCHANGE_COUNTRY_NAME});
    reportQuery.setColumns(
        new Column[] {
          Column.AD_EXCHANGE_AD_REQUESTS,
          Column.AD_EXCHANGE_IMPRESSIONS,
          Column.AD_EXCHANGE_ESTIMATED_REVENUE
        });

    // Run in pacific time.
    reportQuery.setTimeZoneType(TimeZoneType.AD_EXCHANGE);
    reportQuery.setAdxReportCurrency("EUR");

    // Set the dynamic date range type or a custom start and end date.
    reportQuery.setDateRangeType(DateRangeType.YESTERDAY);

    // Create report job.
    ReportJob reportJob = new ReportJob();
    reportJob.setReportQuery(reportQuery);

    // Run report job.
    reportJob = reportService.runReportJob(reportJob);

    // Create report downloader.
    ReportDownloader reportDownloader = new ReportDownloader(reportService, reportJob.getId());

    // Wait for the report to be ready.
    reportDownloader.waitForReportReady();

    // Change to your file location.
    File file = File.createTempFile("adexchange-report-", ".csv.gz");

    System.out.printf("Downloading report to %s ...", file.toString());

    // Download the report.
    ReportDownloadOptions options = new ReportDownloadOptions();
    options.setExportFormat(ExportFormat.CSV_DUMP);
    options.setUseGzipCompression(true);
    URL url = reportDownloader.getDownloadUrl(options);
    Resources.asByteSource(url).copyTo(Files.asByteSink(file));

    System.out.println("done.");
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    AdManagerServices adManagerServices = new AdManagerServices();

    try {
      runExample(adManagerServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      // RemoteException extends IOException, so this catch block must appear before the catch
      // block for IOException.
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    } catch (IOException ioe) {
      System.err.printf("Request failed unexpectedly due to IOException: %s%n", ioe);
    } catch (InterruptedException ie) {
      System.err.printf(
          "Thread was interrupted while waiting for the report to be ready: %s.%n", ie);
    }
  }
}
