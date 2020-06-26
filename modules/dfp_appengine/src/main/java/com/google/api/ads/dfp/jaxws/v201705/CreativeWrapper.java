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


package com.google.api.ads.dfp.jaxws.v201705;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code CreativeWrapper} allows the wrapping of HTML snippets to be
 *             served along with {@code Creative} objects.
 *             <p>
 *             Creative wrappers must be associated with a
 *             {@link LabelType#CREATIVE_WRAPPER} label and applied to ad units by
 *             {@link AdUnit#appliedLabels}.
 *           
 * 
 * <p>Java class for CreativeWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreativeWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="labelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="header" type="{https://www.google.com/apis/ads/publisher/v201705}CreativeWrapperHtmlSnippet" minOccurs="0"/>
 *         &lt;element name="footer" type="{https://www.google.com/apis/ads/publisher/v201705}CreativeWrapperHtmlSnippet" minOccurs="0"/>
 *         &lt;element name="ordering" type="{https://www.google.com/apis/ads/publisher/v201705}CreativeWrapperOrdering" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201705}CreativeWrapperStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreativeWrapper", propOrder = {
    "id",
    "labelId",
    "header",
    "footer",
    "ordering",
    "status"
})
public class CreativeWrapper {

    protected Long id;
    protected Long labelId;
    protected CreativeWrapperHtmlSnippet header;
    protected CreativeWrapperHtmlSnippet footer;
    @XmlSchemaType(name = "string")
    protected CreativeWrapperOrdering ordering;
    @XmlSchemaType(name = "string")
    protected CreativeWrapperStatus status;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the labelId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLabelId() {
        return labelId;
    }

    /**
     * Sets the value of the labelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLabelId(Long value) {
        this.labelId = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeWrapperHtmlSnippet }
     *     
     */
    public CreativeWrapperHtmlSnippet getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeWrapperHtmlSnippet }
     *     
     */
    public void setHeader(CreativeWrapperHtmlSnippet value) {
        this.header = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeWrapperHtmlSnippet }
     *     
     */
    public CreativeWrapperHtmlSnippet getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeWrapperHtmlSnippet }
     *     
     */
    public void setFooter(CreativeWrapperHtmlSnippet value) {
        this.footer = value;
    }

    /**
     * Gets the value of the ordering property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeWrapperOrdering }
     *     
     */
    public CreativeWrapperOrdering getOrdering() {
        return ordering;
    }

    /**
     * Sets the value of the ordering property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeWrapperOrdering }
     *     
     */
    public void setOrdering(CreativeWrapperOrdering value) {
        this.ordering = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeWrapperStatus }
     *     
     */
    public CreativeWrapperStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeWrapperStatus }
     *     
     */
    public void setStatus(CreativeWrapperStatus value) {
        this.status = value;
    }

}
