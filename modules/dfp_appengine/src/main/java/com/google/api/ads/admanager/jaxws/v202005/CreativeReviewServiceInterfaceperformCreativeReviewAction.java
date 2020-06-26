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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link CreativeReview} objects that match the given {@link
 *             Statement#query}. You can use actions to approve (allow) or disapprove (block) creatives, as
 *             seen in the corresponding {@link CreativeReview} objects. You can also archive creatives to
 *             allow you to retrieve new {@link CreativeReview} objects while previously retrieved {@link
 *             CreativeReview} objects are in pending approval.
 *             
 *             @param creativeReviewAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter a set of creative
 *             reviews. Only {@code "WHERE id = <value>"} and {@code "WHERE id IN <list>"} are supported.
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performCreativeReviewAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performCreativeReviewAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeReviewAction" type="{https://www.google.com/apis/ads/publisher/v202005}CreativeReviewAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v202005}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creativeReviewAction",
    "filterStatement"
})
@XmlRootElement(name = "performCreativeReviewAction")
public class CreativeReviewServiceInterfaceperformCreativeReviewAction {

    protected CreativeReviewAction creativeReviewAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the creativeReviewAction property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeReviewAction }
     *     
     */
    public CreativeReviewAction getCreativeReviewAction() {
        return creativeReviewAction;
    }

    /**
     * Sets the value of the creativeReviewAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeReviewAction }
     *     
     */
    public void setCreativeReviewAction(CreativeReviewAction value) {
        this.creativeReviewAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
