// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;

import com.google.api.ads.common.lib.utils.Streams;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPOutputStream;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link ReportDownloadResponse}.
 */
@RunWith(JUnit4.class)
public class ReportDownloadResponseTest {
  
  @Rule
  public ExpectedException thrown = ExpectedException.none();
  @Rule
  public TemporaryFolder tempFolder = new TemporaryFolder();

  /**
   * Test method for
   * {@link com.google.api.ads.adwords.lib.utils.ReportDownloadResponse#getInputStream()}.
   */
  @Test
  public void testGetInputStream() throws IOException {
    String expectedContents = "a,b,c\nd,e,f\n";
    InputStream inputStream = new ByteArrayInputStream(expectedContents.getBytes(UTF_8));
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(HttpURLConnection.HTTP_OK,
        inputStream, UTF_8, "CSV");
    ReportDownloadResponse response = new ReportDownloadResponse(rawResponse);
    String actualContents = Streams.readAll(response.getInputStream(), UTF_8);
    assertEquals("input stream contents are incorrect", expectedContents, actualContents);
  }

  /**
   * Test method for
   * {@link com.google.api.ads.adwords.lib.utils.ReportDownloadResponse#getAsString()}.
   */
  @Test
  public void testGetAsString() throws IOException {
    String expectedContents = "a,b,c\nd,e,f\n";
    InputStream inputStream = new ByteArrayInputStream(expectedContents.getBytes(UTF_8));
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(HttpURLConnection.HTTP_OK,
        inputStream, UTF_8, "CSV");
    ReportDownloadResponse response = new ReportDownloadResponse(rawResponse);
    assertEquals("contents as string are incorrect", expectedContents, response.getAsString());
  }

  /**
   * Test method for
   * {@link com.google.api.ads.adwords.lib.utils.ReportDownloadResponse#getAsString()}
   * when response data is compressed.
   */
  @Test
  public void testGetAsString_gzippedCSV() throws IOException {
    String expectedContents = "a,b,c\nd,e,f\n";

    ByteArrayOutputStream zippedBytesOut = new ByteArrayOutputStream();
    Streams.copy(new ByteArrayInputStream(expectedContents.getBytes(UTF_8)),
        new GZIPOutputStream(zippedBytesOut));

    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(HttpURLConnection.HTTP_OK,
        new ByteArrayInputStream(zippedBytesOut.toByteArray()), UTF_8,
        "GZIPPED_CSV");
    ReportDownloadResponse response = new ReportDownloadResponse(rawResponse);
    assertEquals("contents as string are incorrect for gzipped format", expectedContents,
        response.getAsString());
  }

  /**
   * Test method for
   * {@link com.google.api.ads.adwords.lib.utils.ReportDownloadResponse#saveToFile(String)}
   */
  @Test
  public void testSaveToFile() throws IOException {
    File outputFile = tempFolder.newFile("ReportOutput.csv");
    String expectedContents = "a,b,c\nd,e,f\n";
    InputStream inputStream = new ByteArrayInputStream(expectedContents.getBytes(UTF_8));
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(HttpURLConnection.HTTP_OK,
        inputStream, UTF_8, "CSV");
    ReportDownloadResponse response = new ReportDownloadResponse(rawResponse);
    response.saveToFile(outputFile.getPath());

    assertEquals("contents saved to file are incorrect", expectedContents,
        Streams.readAll(new FileInputStream(outputFile), UTF_8));
  }

  @Test
  public void testFailedResponse_fails() {
    RawReportDownloadResponse rawResponse = new RawReportDownloadResponse(
        HttpURLConnection.HTTP_BAD_REQUEST, new ByteArrayInputStream("failed".getBytes(UTF_8)),
        UTF_8, "CSV");
    thrown.expect(IllegalArgumentException.class);
    new ReportDownloadResponse(rawResponse);
  }
}
