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


package com.google.api.ads.adwords.jaxws.v201809.rm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201809.cm.ApiError;
import com.google.api.ads.adwords.jaxws.v201809.cm.ListReturnValue;


/**
 * 
 *             A container for return values from OfflineDataUploadService.
 *           
 * 
 * <p>Java class for OfflineDataUploadReturnValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflineDataUploadReturnValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}ListReturnValue">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/rm/v201809}OfflineDataUpload" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partialFailureErrors" type="{https://adwords.google.com/api/adwords/cm/v201809}ApiError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflineDataUploadReturnValue", propOrder = {
    "value",
    "partialFailureErrors"
})
public class OfflineDataUploadReturnValue
    extends ListReturnValue
{

    protected List<OfflineDataUpload> value;
    protected List<ApiError> partialFailureErrors;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfflineDataUpload }
     * 
     * 
     */
    public List<OfflineDataUpload> getValue() {
        if (value == null) {
            value = new ArrayList<OfflineDataUpload>();
        }
        return this.value;
    }

    /**
     * Gets the value of the partialFailureErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partialFailureErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartialFailureErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiError }
     * 
     * 
     */
    public List<ApiError> getPartialFailureErrors() {
        if (partialFailureErrors == null) {
            partialFailureErrors = new ArrayList<ApiError>();
        }
        return this.partialFailureErrors;
    }

}
