// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202005;

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
 *       Provides methods for retrieving {@link MobileApplication} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "MobileApplicationServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MobileApplicationServiceInterface {


    /**
     * 
     *         Creates and claims {@link MobileApplication mobile applications}
     *         to be used for targeting in the network.
     *         
     *         @param mobileApplications the mobileApplications to create
     *         @return the created mobileApplications with their IDs filled in
     *       
     * 
     * @param mobileApplications
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202005.MobileApplication>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
    @RequestWrapper(localName = "createMobileApplications", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.MobileApplicationServiceInterfacecreateMobileApplications")
    @ResponseWrapper(localName = "createMobileApplicationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.MobileApplicationServiceInterfacecreateMobileApplicationsResponse")
    public List<MobileApplication> createMobileApplications(
        @WebParam(name = "mobileApplications", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
        List<MobileApplication> mobileApplications)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link MobileApplicationPage mobileApplicationPage} of
     *         {@link MobileApplication mobile applications} that satisfy the given {@link Statement}.
     *         The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th>
     *         <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link MobileApplication#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code displayName}</td>
     *         <td>{@link MobileApplication#displayName}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code appStore}</td>
     *         <td>{@link MobileApplication#appStore}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code appStoreId}</td>
     *         <td>{@link MobileApplication#appStoreId}</td>
     *         <tr/>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link MobileApplication#isArchived}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter a set of
     *         mobile applications.
     *         @return the mobile applications that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202005.MobileApplicationPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
    @RequestWrapper(localName = "getMobileApplicationsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.MobileApplicationServiceInterfacegetMobileApplicationsByStatement")
    @ResponseWrapper(localName = "getMobileApplicationsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.MobileApplicationServiceInterfacegetMobileApplicationsByStatementResponse")
    public MobileApplicationPage getMobileApplicationsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs an action on {@link MobileApplication mobile applications}.
     *         
     *         @param mobileApplicationAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of mobile applications.
     *         @return the result of the action performed
     *       
     * 
     * @param filterStatement
     * @param mobileApplicationAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202005.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
    @RequestWrapper(localName = "performMobileApplicationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.MobileApplicationServiceInterfaceperformMobileApplicationAction")
    @ResponseWrapper(localName = "performMobileApplicationActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.MobileApplicationServiceInterfaceperformMobileApplicationActionResponse")
    public UpdateResult performMobileApplicationAction(
        @WebParam(name = "mobileApplicationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
        MobileApplicationAction mobileApplicationAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link MobileApplication mobile applications}.
     *         
     *         @param mobileApplications the mobile applications to be updated
     *         @return the updated mobileApplications
     *       
     * 
     * @param mobileApplications
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202005.MobileApplication>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
    @RequestWrapper(localName = "updateMobileApplications", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.MobileApplicationServiceInterfaceupdateMobileApplications")
    @ResponseWrapper(localName = "updateMobileApplicationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005", className = "com.google.api.ads.admanager.jaxws.v202005.MobileApplicationServiceInterfaceupdateMobileApplicationsResponse")
    public List<MobileApplication> updateMobileApplications(
        @WebParam(name = "mobileApplications", targetNamespace = "https://www.google.com/apis/ads/publisher/v202005")
        List<MobileApplication> mobileApplications)
        throws ApiException_Exception
    ;

}
