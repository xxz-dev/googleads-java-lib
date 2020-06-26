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


package com.google.api.ads.dfp.jaxws.v201708;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ReconciliationReport} objects.
 *             
 *             @param reconciliationReports the reconciliation reports to update
 *             @return the updated reconciliation reports
 *             @throws ApiException
 *           
 * 
 * <p>Java class for updateReconciliationReports element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateReconciliationReports">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reconciliationReports" type="{https://www.google.com/apis/ads/publisher/v201708}ReconciliationReport" maxOccurs="unbounded" minOccurs="0"/>
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
    "reconciliationReports"
})
@XmlRootElement(name = "updateReconciliationReports")
public class ReconciliationReportServiceInterfaceupdateReconciliationReports {

    protected List<ReconciliationReport> reconciliationReports;

    /**
     * Gets the value of the reconciliationReports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reconciliationReports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReconciliationReports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReconciliationReport }
     * 
     * 
     */
    public List<ReconciliationReport> getReconciliationReports() {
        if (reconciliationReports == null) {
            reconciliationReports = new ArrayList<ReconciliationReport>();
        }
        return this.reconciliationReports;
    }

}
