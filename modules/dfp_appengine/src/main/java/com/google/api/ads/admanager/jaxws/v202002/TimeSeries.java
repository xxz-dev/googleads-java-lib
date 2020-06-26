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


package com.google.api.ads.admanager.jaxws.v202002;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a chronological sequence of daily values.
 *           
 * 
 * <p>Java class for TimeSeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSeries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeSeriesDateRange" type="{https://www.google.com/apis/ads/publisher/v202002}DateRange" minOccurs="0"/>
 *         &lt;element name="timeSeriesValues" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valuePeriodType" type="{https://www.google.com/apis/ads/publisher/v202002}PeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSeries", propOrder = {
    "timeSeriesDateRange",
    "timeSeriesValues",
    "valuePeriodType"
})
public class TimeSeries {

    protected DateRange timeSeriesDateRange;
    @XmlElement(type = Long.class)
    protected List<Long> timeSeriesValues;
    @XmlSchemaType(name = "string")
    protected PeriodType valuePeriodType;

    /**
     * Gets the value of the timeSeriesDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getTimeSeriesDateRange() {
        return timeSeriesDateRange;
    }

    /**
     * Sets the value of the timeSeriesDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setTimeSeriesDateRange(DateRange value) {
        this.timeSeriesDateRange = value;
    }

    /**
     * Gets the value of the timeSeriesValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSeriesValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSeriesValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTimeSeriesValues() {
        if (timeSeriesValues == null) {
            timeSeriesValues = new ArrayList<Long>();
        }
        return this.timeSeriesValues;
    }

    /**
     * Gets the value of the valuePeriodType property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValuePeriodType() {
        return valuePeriodType;
    }

    /**
     * Sets the value of the valuePeriodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValuePeriodType(PeriodType value) {
        this.valuePeriodType = value;
    }

}
