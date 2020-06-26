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

package com.google.api.ads.admanager.lib;

import com.google.api.ads.admanager.lib.client.AdManagerServiceClient;
import com.google.api.ads.admanager.lib.conf.AdManagerConfigurationModule;
import com.google.api.ads.common.lib.AdsModule;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

/** Guice module for Ad Manager bindings. */
public class AdManagerModule extends AdsModule {

  public AdManagerModule() {}

  @Override
  protected void configure() {
    super.configure();
    configureLogging(AdManagerServiceClient.class.getName());
    install(new AdManagerConfigurationModule());
    bind(HttpTransport.class).to(NetHttpTransport.class);
  }
}
