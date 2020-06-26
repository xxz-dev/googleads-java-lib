// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Base for any test that needs a mock HTTP server.
 */
@RunWith(JUnit4.class)
public abstract class MockHttpIntegrationTest {

  protected TestHttpServer testHttpServer;
  
  /**
   * Default constructor.
   */
  public MockHttpIntegrationTest() {}

  /**
   * Starts the HTTP server. Run at the start of every test.
   */
  @Before
  public void startServer() throws Exception {
    testHttpServer = new TestHttpServer();
    testHttpServer.start();
  }

  /**
   * Stops the HTTP server. Run at the end of every test.
   */
  @After
  public void stopServer() throws Exception {
    testHttpServer.stop();
  }  
}
