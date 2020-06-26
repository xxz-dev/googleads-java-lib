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

package com.google.api.ads.dfp.lib.soap;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

import com.google.api.ads.common.lib.soap.SoapClientHandlerInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

/**
 * Tests for {@link DfpHttpHeaderHandler}.
 */
@RunWith(JUnit4.class)
public class DfpHttpHeaderHandlerTest {

  private DfpHttpHeaderHandler dfpHttpHeaderHandler;

  @Mock private SoapClientHandlerInterface<Object> soapClientHandler;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    dfpHttpHeaderHandler = new DfpHttpHeaderHandler(soapClientHandler);
  }

  /**
   * Tests setting the headers.
   */
  @SuppressWarnings("unchecked")
  @Test
  public void testSetHeaders() throws Exception {
    Object soapClient = new Object();
    Credential credential = new Credential(BearerToken.authorizationHeaderAccessMethod());

    DfpSession dfpSession =
        new DfpSession.Builder()
            .withApplicationName("FooBar")
            .withOAuth2Credential(credential)
            .withEndpoint("https://ads.google.com")
            .withNetworkCode("networkCode")
            .build();

    dfpHttpHeaderHandler.setHttpHeaders(soapClient, dfpSession);

    verify(soapClientHandler).putAllHttpHeaders(eq(soapClient), any(Map.class));
  }

}
