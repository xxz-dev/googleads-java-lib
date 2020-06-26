// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.common.lib.utils.Internals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Ensures that all of the Guice bindings work correctly when
 * {@link AdWordsInternals} is used.
 */
@RunWith(JUnit4.class)
public class AdWordsInternalsTest {

  public AdWordsInternalsTest() {}

  /**
   * Test method for {@link AdWordsInternals#getInstance()}.
   */
  @Test
  public void testGetInstance() {
    Internals internals = AdWordsInternals.getInstance();
    String userAgent = internals.getUserAgentCombiner().getUserAgent("test");

    assertTrue(userAgent.contains("AwApi"));
    assertFalse(userAgent.contains("DfaApi"));
    assertFalse(userAgent.contains("DfpApi"));
  }

}
