// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201710.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service used to manage campaign feed links, and matching functions.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CampaignFeedServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CampaignFeedServiceInterface {


    /**
     * 
     *         Returns a list of CampaignFeeds that meet the selector criteria.
     *         
     *         @param selector Determines which CampaignFeeds to return. If empty all
     *         Campaign feeds are returned.
     *         @return The list of CampaignFeeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.CampaignFeedPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignFeedServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignFeedServiceInterfacegetResponse")
    public CampaignFeedPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, sets or removes CampaignFeeds.
     *         
     *         @param operations The operations to apply.
     *         @return The resulting Feeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.CampaignFeedReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignFeedServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignFeedServiceInterfacemutateResponse")
    public CampaignFeedReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        List<CampaignFeedOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of {@link CampaignFeed}s inside a {@link CampaignFeedPage} that matches
     *         the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @throws ApiException when there are one or more errors with the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.CampaignFeedPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignFeedServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.CampaignFeedServiceInterfacequeryResponse")
    public CampaignFeedPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        String query)
        throws ApiException_Exception
    ;

}
