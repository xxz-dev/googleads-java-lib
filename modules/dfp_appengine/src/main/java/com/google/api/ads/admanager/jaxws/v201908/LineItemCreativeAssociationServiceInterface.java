// Copyright 2019 Google LLC
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


package com.google.api.ads.admanager.jaxws.v201908;

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
 *       Provides operations for creating, updating and retrieving
 *       {@link LineItemCreativeAssociation} objects.
 *       <p>
 *       A line item creative association (LICA) associates a {@link Creative} with a
 *       {@link LineItem}. When a line item is selected to serve, the LICAs specify which
 *       creatives can appear for the ad units that are targeted by the line item. In
 *       order to be associated with a line item, the creative must have a size that
 *       exists within the attribute {@link LineItem#creativePlaceholders}.
 *       </p>
 *       <p>
 *       Each LICA has a start and end date and time that defines when the creative
 *       should be displayed.
 *       </p>
 *       <p>
 *       To read more about associating creatives with line items, see this
 *       <a href="https://support.google.com/dfp_premium/answer/3187916">DFP Help Center</a> article.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LineItemCreativeAssociationServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LineItemCreativeAssociationServiceInterface {


    /**
     * 
     *         Creates new {@link LineItemCreativeAssociation} objects
     *         
     *         @param lineItemCreativeAssociations the line item creative associations to
     *         create
     *         @return the created line item creative associations with their IDs filled
     *         in
     *       
     * 
     * @param lineItemCreativeAssociations
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociation>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
    @RequestWrapper(localName = "createLineItemCreativeAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfacecreateLineItemCreativeAssociations")
    @ResponseWrapper(localName = "createLineItemCreativeAssociationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfacecreateLineItemCreativeAssociationsResponse")
    public List<LineItemCreativeAssociation> createLineItemCreativeAssociations(
        @WebParam(name = "lineItemCreativeAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        List<LineItemCreativeAssociation> lineItemCreativeAssociations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link LineItemCreativeAssociationPage} of
     *         {@link LineItemCreativeAssociation} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code creativeId}</td>
     *         <td>{@link LineItemCreativeAssociation#creativeId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code manualCreativeRotationWeight}</td>
     *         <td>{@link LineItemCreativeAssociation#manualCreativeRotationWeight}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code destinationUrl}</td>
     *         <td>{@link LineItemCreativeAssociation#destinationUrl}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemId}</td>
     *         <td>{@link LineItemCreativeAssociation#lineItemId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link LineItemCreativeAssociation#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link LineItemCreativeAssociation#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of line item creative associations
     *         @return the line item creative associations that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
    @RequestWrapper(localName = "getLineItemCreativeAssociationsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfacegetLineItemCreativeAssociationsByStatement")
    @ResponseWrapper(localName = "getLineItemCreativeAssociationsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfacegetLineItemCreativeAssociationsByStatementResponse")
    public LineItemCreativeAssociationPage getLineItemCreativeAssociationsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns an insite preview URL that references the specified site URL with
     *         the specified creative from the association served to it. For Creative Set
     *         previewing you may specify the master creative Id.
     *         
     *         @param lineItemId the ID of the line item, which must already exist
     *         @param creativeId the ID of the creative, which must already exist
     *         @param siteUrl the URL of the site that the creative should be previewed in
     *         @return a URL that references the specified site URL with the specified
     *         creative served to it
     *       
     * 
     * @param siteUrl
     * @param lineItemId
     * @param creativeId
     * @return
     *     returns java.lang.String
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
    @RequestWrapper(localName = "getPreviewUrl", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfacegetPreviewUrl")
    @ResponseWrapper(localName = "getPreviewUrlResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfacegetPreviewUrlResponse")
    public String getPreviewUrl(
        @WebParam(name = "lineItemId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        Long lineItemId,
        @WebParam(name = "creativeId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        Long creativeId,
        @WebParam(name = "siteUrl", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        String siteUrl)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of URLs that reference the specified site URL with the specified creative from
     *         the association served to it. For Creative Set previewing you may specify the master creative
     *         Id. Each URL corresponds to one available native style for previewing the specified creative.
     *         
     *         @param lineItemId the ID of the line item, which must already exist
     *         @param creativeId the ID of the creative, which must already exist and must be a native
     *         creative
     *         @param siteUrl the URL of the site that the creative should be previewed in
     *         @return the URLs that references the specified site URL and can be used to preview the
     *         specified creative with the available native styles
     *       
     * 
     * @param siteUrl
     * @param lineItemId
     * @param creativeId
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v201908.CreativeNativeStylePreview>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
    @RequestWrapper(localName = "getPreviewUrlsForNativeStyles", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfacegetPreviewUrlsForNativeStyles")
    @ResponseWrapper(localName = "getPreviewUrlsForNativeStylesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfacegetPreviewUrlsForNativeStylesResponse")
    public List<CreativeNativeStylePreview> getPreviewUrlsForNativeStyles(
        @WebParam(name = "lineItemId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        Long lineItemId,
        @WebParam(name = "creativeId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        Long creativeId,
        @WebParam(name = "siteUrl", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        String siteUrl)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link LineItemCreativeAssociation} objects that match
     *         the given {@link Statement#query}.
     *         
     *         @param lineItemCreativeAssociationAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of line item creative associations
     *         @return the result of the action performed
     *       
     * 
     * @param lineItemCreativeAssociationAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v201908.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
    @RequestWrapper(localName = "performLineItemCreativeAssociationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfaceperformLineItemCreativeAssociationAction")
    @ResponseWrapper(localName = "performLineItemCreativeAssociationActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfaceperformLineItemCreativeAssociationActionResponse")
    public UpdateResult performLineItemCreativeAssociationAction(
        @WebParam(name = "lineItemCreativeAssociationAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        LineItemCreativeAssociationAction lineItemCreativeAssociationAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link LineItemCreativeAssociation} objects
     *         
     *         @param lineItemCreativeAssociations the line item creative associations to
     *         update
     *         @return the updated line item creative associations
     *       
     * 
     * @param lineItemCreativeAssociations
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociation>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
    @RequestWrapper(localName = "updateLineItemCreativeAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfaceupdateLineItemCreativeAssociations")
    @ResponseWrapper(localName = "updateLineItemCreativeAssociationsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908", className = "com.google.api.ads.admanager.jaxws.v201908.LineItemCreativeAssociationServiceInterfaceupdateLineItemCreativeAssociationsResponse")
    public List<LineItemCreativeAssociation> updateLineItemCreativeAssociations(
        @WebParam(name = "lineItemCreativeAssociations", targetNamespace = "https://www.google.com/apis/ads/publisher/v201908")
        List<LineItemCreativeAssociation> lineItemCreativeAssociations)
        throws ApiException_Exception
    ;

}
