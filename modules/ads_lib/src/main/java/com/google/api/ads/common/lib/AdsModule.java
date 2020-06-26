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

package com.google.api.ads.common.lib;

import com.google.api.ads.common.lib.auth.AuthModule;
import com.google.api.ads.common.lib.utils.AdsUtilityRegistry;
import com.google.api.ads.common.lib.utils.logging.LoggingModule;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * Guice module for common bindings.
 */
public abstract class AdsModule extends AbstractModule {
  public AdsModule() {}

  /**
   * Configure common Guice bindings.
   */
  @Override
  protected void configure() {
    install(new AuthModule());
  }

  /**
   * Configures the loggers given the prefix.
   *
   * @param loggerPrefix the logger prefix
   */
  protected void configureLogging(String loggerPrefix) {
    install(new LoggingModule(loggerPrefix));
  }

  /**
   * Provider method for Guice to ensure that all objects that need an AdsUtilityRegistry obtain the
   * same instance, even if those objects were injected by different Guice injectors.
   */
  @Provides
  private AdsUtilityRegistry getAdsUtilityRegistry() {
    return AdsUtilityRegistry.getInstance();
  }
}
