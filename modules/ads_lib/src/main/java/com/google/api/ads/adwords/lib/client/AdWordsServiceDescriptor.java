// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.client;

import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.common.lib.client.AdsServiceDescriptor;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.compatability.AxisCompatible;
import com.google.api.ads.common.lib.soap.compatability.JaxWsCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.inject.assistedinject.Assisted;
import java.net.MalformedURLException;
import java.net.URL;
import javax.inject.Inject;

/**
 * {@code AdWordsServiceDescriptor} provides a class which defines a service
 * that can be instantiated through reflection.
 */
public class AdWordsServiceDescriptor implements AdsServiceDescriptor, AxisCompatible,
    JaxWsCompatible {

  private final Class<?> interfaceClass;
  private final String version;
  private final AdWordsApiConfiguration apiConfig;

  /**
   * Constructor. Requires the necessary information to instantiate an AdWords
   * service.
   *
   * @param interfaceClass the {@code Class<?>} object of the requested
   *     interfaceClass
   * @param version the version of the service
   * @param apiConfig the API configuration
   */
  @Inject
  public AdWordsServiceDescriptor(@Assisted("interfaceClass") Class<?> interfaceClass,
        @Assisted("version") String version, AdWordsApiConfiguration apiConfig) {
    this.interfaceClass = interfaceClass;
    this.version = version;
    this.apiConfig = apiConfig;
  }

  /**
   * @see AdsServiceDescriptor#getInterfaceClass()
   */
  @Override
  public Class<?> getInterfaceClass() throws ServiceException {
    return interfaceClass;
  }

  /**
   * @throws MalformedURLException
   * @see AdsServiceDescriptor#getEndpointAddress(String)
   */
  @Override
  public String getEndpointAddress(String endpointServer) throws MalformedURLException {
    String serviceName = getServiceName();
    String endpointServerUrl = new URL(endpointServer).toString();
    if (endpointServerUrl.endsWith("/")) {
      endpointServerUrl = endpointServerUrl.substring(0, endpointServerUrl.length() - 1);
    }
    return endpointServerUrl + "/api/adwords/"
        + apiConfig.getServiceUrlGroup(version, serviceName) + "/" + version + "/" + serviceName;
  }

  /**
   * @see AdsServiceDescriptor#getVersion()
   */
  @Override
  public String getVersion() {
    return version;
  }

  /**
   * @see AxisCompatible#getLocatorClass()
   */
  @Override
  public Class<?> getLocatorClass() throws ClassNotFoundException {
    return Class.forName(
        interfaceClass.getPackage().getName() + "." + getServiceName() + "Locator");
  }

  /**
   * @see JaxWsCompatible#getServiceClass()
   */
  @Override
  public Class<?> getServiceClass() throws ClassNotFoundException {
    return Class.forName(interfaceClass.getPackage().getName() + "." + getServiceName());
  }

  /**
   * Generates the name of this service by using reflection.
   *
   * @return the name of the service this descriptor represents
   */
  @VisibleForTesting
  String getServiceName() {
    String simpleName = interfaceClass.getSimpleName();
    return simpleName.substring(0, simpleName.indexOf("Interface"));
  }

  /**
   * Gets the package group that the service is in i.e. "cm", "o", etc...
   */
  public String getPackageGroup() {
    String packageName = interfaceClass.getPackage().getName();
    String[] parts = packageName.split("\\.");
    return parts[parts.length - 1];
  }
  
  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("interfaceClass", interfaceClass)
        .add("version", version)
        .toString();
  }
}
