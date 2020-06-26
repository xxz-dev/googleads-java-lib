// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.jaxws.utils;

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateRequestInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadBodyProvider;
import com.google.api.ads.common.lib.soap.jaxb.JaxBSerializer;
import com.google.api.client.http.ByteArrayContent;
import com.google.common.base.Preconditions;
import javax.xml.namespace.QName;

/**
 * Implementation of {@link BatchJobUploadBodyProvider} for JAX-WS.
 */
public class JaxWsBatchJobUploadBodyProvider<RequestT extends BatchJobMutateRequestInterface>
    implements BatchJobUploadBodyProvider {
  private static final String REQUEST_NAMESPACE_TEMPLATE =
      "https://adwords.google.com/api/adwords/cm/%s";

  private final QName requestQName;
  private final Class<RequestT> requestClass;

  public JaxWsBatchJobUploadBodyProvider(String apiVersion, Class<RequestT> requestClass) {
    this.requestQName = new QName(
        String.format(
            REQUEST_NAMESPACE_TEMPLATE, Preconditions.checkNotNull(apiVersion, "Null API version")),
        "mutate");
    this.requestClass = requestClass;
  }

  @SuppressWarnings("unchecked")
  @Override
  public ByteArrayContent getHttpContent(BatchJobMutateRequestInterface request,
      boolean isFirstRequest, boolean isLastRequest) throws BatchJobException {
    JaxBSerializer<RequestT> serializer =
        new JaxBSerializer<RequestT>(requestClass, requestQName);

    String serializedRequest = serializer.serialize((RequestT) request, false);

    return new ByteArrayContent("application/xml", serializedRequest.getBytes(UTF_8));
  }
}
