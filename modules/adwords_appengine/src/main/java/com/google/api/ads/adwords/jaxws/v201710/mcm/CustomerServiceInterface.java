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


package com.google.api.ads.adwords.jaxws.v201710.mcm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201710.cm.Selector;


/**
 * 
 *       Service to access basic details about any customer.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomerServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201710.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201710.mcm.ObjectFactory.class
})
public interface CustomerServiceInterface {


    /**
     * 
     *         Returns details of all the customers directly accessible by the user authenticating the call.
     *         <p>
     *         Note: This method will return only test accounts if the developer token used has not been
     *         approved.
     *         <p>
     *         Starting with v201607, if {@code clientCustomerId} is specified in the request header,
     *         only details of that customer will be returned. To do this for prior versions, use the
     *         {@code get()} method instead.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201710.mcm.Customer>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710")
    @RequestWrapper(localName = "getCustomers", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.mcm.CustomerServiceInterfacegetCustomers")
    @ResponseWrapper(localName = "getCustomersResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.mcm.CustomerServiceInterfacegetCustomersResponse")
    public List<Customer> getCustomers()
        throws ApiException
    ;

    /**
     * 
     *         Retrieves the list of service links for the authorized customer.
     *         See {@link ServiceType} for information on the various linking types supported.
     *         
     *         @param selector describing which links to retrieve
     *         @throws ApiException
     *       
     * 
     * @param selector
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201710.mcm.ServiceLink>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710")
    @RequestWrapper(localName = "getServiceLinks", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.mcm.CustomerServiceInterfacegetServiceLinks")
    @ResponseWrapper(localName = "getServiceLinksResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.mcm.CustomerServiceInterfacegetServiceLinksResponse")
    public List<ServiceLink> getServiceLinks(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710")
        Selector selector)
        throws ApiException
    ;

    /**
     * 
     *         Update the authorized customer.
     *         
     *         <p>While there are a limited set of properties available to update, please read this
     *         <a href="https://support.google.com/analytics/answer/1033981">help center article
     *         on auto-tagging</a> before updating {@code customer.autoTaggingEnabled}.
     *         
     *         @param customer the requested updated value for the customer.
     *         @throws ApiException
     *       
     * 
     * @param customer
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201710.mcm.Customer
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.mcm.CustomerServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.mcm.CustomerServiceInterfacemutateResponse")
    public Customer mutate(
        @WebParam(name = "customer", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710")
        Customer customer)
        throws ApiException
    ;

    /**
     * 
     *         Modifies links to other services for the authorized customer.
     *         See {@link ServiceType} for information on the various linking types supported.
     *         
     *         @param operations to perform
     *         @throws ApiException
     *       
     * 
     * @param operations
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201710.mcm.ServiceLink>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710")
    @RequestWrapper(localName = "mutateServiceLinks", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.mcm.CustomerServiceInterfacemutateServiceLinks")
    @ResponseWrapper(localName = "mutateServiceLinksResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710", className = "com.google.api.ads.adwords.jaxws.v201710.mcm.CustomerServiceInterfacemutateServiceLinksResponse")
    public List<ServiceLink> mutateServiceLinks(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201710")
        List<ServiceLinkOperation> operations)
        throws ApiException
    ;

}
