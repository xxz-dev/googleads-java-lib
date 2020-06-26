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
 *       Use this service to manage labels. The light weight label, once created, can be attached
 *       to campaign management entities such as campaigns, ad groups, creatives, criterion and etc.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LabelServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LabelServiceInterface {


    /**
     * 
     *         Returns a list of {@link Label}s.
     *         
     *         @param serviceSelector The selector specifying the {@link Label}s to return.
     *         @return The page containing the {@link Label}s which meet the criteria specified by the
     *         selector.
     *         @throws ApiException when there is at least one error with the request
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.LabelPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.LabelServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.LabelServiceInterfacegetResponse")
    public LabelPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations.
     *         
     *         @param operations The operations to apply. The same {@link Label} cannot be specified in
     *         more than one operation.
     *         @return The applied {@link Label}s.
     *         @throws ApiException when there is at least one error with the request
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.LabelReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.LabelServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.LabelServiceInterfacemutateResponse")
    public LabelReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        List<LabelOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of {@link Label}s that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @returns  The page containing the {@link Label}s which match the query.
     *         @throws ApiException when the query is invalid or there are errors processing the request.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.cm.LabelPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.LabelServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.cm.LabelServiceInterfacequeryResponse")
    public LabelPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201710")
        String query)
        throws ApiException_Exception
    ;

}
