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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Income range criterion allows to target and exclude predefined income percentile ranges.
 *             <p>A criterion of this type can only be created using an ID. A criterion of this type can be either targeted or excluded.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for IncomeRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomeRange">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}Criterion">
 *       &lt;sequence>
 *         &lt;element name="incomeRangeType" type="{https://adwords.google.com/api/adwords/cm/v201809}IncomeRange.IncomeRangeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomeRange", propOrder = {
    "incomeRangeType"
})
public class IncomeRange
    extends Criterion
{

    @XmlSchemaType(name = "string")
    protected IncomeRangeIncomeRangeType incomeRangeType;

    /**
     * Gets the value of the incomeRangeType property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeRangeIncomeRangeType }
     *     
     */
    public IncomeRangeIncomeRangeType getIncomeRangeType() {
        return incomeRangeType;
    }

    /**
     * Sets the value of the incomeRangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeRangeIncomeRangeType }
     *     
     */
    public void setIncomeRangeType(IncomeRangeIncomeRangeType value) {
        this.incomeRangeType = value;
    }

}
