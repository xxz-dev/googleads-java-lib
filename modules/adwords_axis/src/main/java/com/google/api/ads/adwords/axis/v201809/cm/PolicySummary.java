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

/**
 * PolicySummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Summary of policy information for a single entity.
 */
public class PolicySummary  implements java.io.Serializable {
    /* List of policy findings. */
    private com.google.api.ads.adwords.axis.v201809.cm.PolicyTopicEntry[] policyTopicEntries;

    public PolicySummary() {
    }

    public PolicySummary(
           com.google.api.ads.adwords.axis.v201809.cm.PolicyTopicEntry[] policyTopicEntries) {
           this.policyTopicEntries = policyTopicEntries;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("policyTopicEntries", getPolicyTopicEntries())
            .toString();
    }

    /**
     * Gets the policyTopicEntries value for this PolicySummary.
     * 
     * @return policyTopicEntries   * List of policy findings.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.PolicyTopicEntry[] getPolicyTopicEntries() {
        return policyTopicEntries;
    }


    /**
     * Sets the policyTopicEntries value for this PolicySummary.
     * 
     * @param policyTopicEntries   * List of policy findings.
     */
    public void setPolicyTopicEntries(com.google.api.ads.adwords.axis.v201809.cm.PolicyTopicEntry[] policyTopicEntries) {
        this.policyTopicEntries = policyTopicEntries;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.PolicyTopicEntry getPolicyTopicEntries(int i) {
        return this.policyTopicEntries[i];
    }

    public void setPolicyTopicEntries(int i, com.google.api.ads.adwords.axis.v201809.cm.PolicyTopicEntry _value) {
        this.policyTopicEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicySummary)) return false;
        PolicySummary other = (PolicySummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyTopicEntries==null && other.getPolicyTopicEntries()==null) || 
             (this.policyTopicEntries!=null &&
              java.util.Arrays.equals(this.policyTopicEntries, other.getPolicyTopicEntries())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPolicyTopicEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyTopicEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyTopicEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicySummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PolicySummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyTopicEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "policyTopicEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "PolicyTopicEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
