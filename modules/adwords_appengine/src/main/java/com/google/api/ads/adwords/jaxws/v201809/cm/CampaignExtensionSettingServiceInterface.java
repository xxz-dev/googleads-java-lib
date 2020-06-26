// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201809.cm;

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
 *       Service used to manage extensions at the campaign level. The extensions are managed by AdWords
 *       using existing feed services, including creating and modifying feeds, feed items, and campaign
 *       feeds for the user.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CampaignExtensionSettingServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CampaignExtensionSettingServiceInterface {


    /**
     * 
     *         Returns a list of CampaignExtensionSettings that meet the selector criteria.
     *         
     *         @param selector Determines which CampaignExtensionSettings to return. If empty, all
     *         CampaignExtensionSettings are returned.
     *         @return The list of CampaignExtensionSettings specified by the selector.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201809.cm.CampaignExtensionSettingPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809", className = "com.google.api.ads.adwords.jaxws.v201809.cm.CampaignExtensionSettingServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809", className = "com.google.api.ads.adwords.jaxws.v201809.cm.CampaignExtensionSettingServiceInterfacegetResponse")
    public CampaignExtensionSettingPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations (add, remove, and set).
     *         
     *         <p> Beginning in v201509, add and set operations are treated identically. Performing an add
     *         operation on a campaign with an existing ExtensionSetting will cause the operation to be
     *         treated like a set operation. Performing a set operation on a campaign with no
     *         ExtensionSetting will cause the operation to be treated like an add operation.
     *         
     *         @param operations The operations to apply. The same {@link CampaignExtensionSetting} cannot be
     *         specified in more than one operation.
     *         @return The changed {@link CampaignExtensionSetting}s.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201809.cm.CampaignExtensionSettingReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809", className = "com.google.api.ads.adwords.jaxws.v201809.cm.CampaignExtensionSettingServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809", className = "com.google.api.ads.adwords.jaxws.v201809.cm.CampaignExtensionSettingServiceInterfacemutateResponse")
    public CampaignExtensionSettingReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
        List<CampaignExtensionSettingOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of CampaignExtensionSettings that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return The list of CampaignExtensionSettings specified by the query.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201809.cm.CampaignExtensionSettingPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809", className = "com.google.api.ads.adwords.jaxws.v201809.cm.CampaignExtensionSettingServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809", className = "com.google.api.ads.adwords.jaxws.v201809.cm.CampaignExtensionSettingServiceInterfacequeryResponse")
    public CampaignExtensionSettingPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
        String query)
        throws ApiException_Exception
    ;

}
