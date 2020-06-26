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
 * WebpageCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Logical expression for targeting webpages of an advertiser's website.
 * 
 *             <p>A condition is defined as {@code operand OP argument}
 * where {@code operand} is one of the values enumerated in
 *             {@link WebpageConditionOperand}, and, based on this value,
 * {@code OP} is either of {@code EQUALS} or {@code CONTAINS}.</p>
 */
public class WebpageCondition  implements java.io.Serializable {
    /* Operand of webpage targeting condition.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperand operand;

    /* Argument of the webpage targeting condition.
     *                 <span class="constraint MustNotContain">This string
     * must not contain a substring that matches the regular expression '\*|\>\>|\=\=|\&\+'</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 2048, inclusive.</span> */
    private java.lang.String argument;

    /* Operator of webpage targeting condition.
     *                 
     *                 <ul>
     *                 <li>{@code EQUALS} is only allowed for {@link WebpageConditionOperand#CATEGORY},
     * {@link
     *                 WebpageConditionOperand#CUSTOM_LABEL}, and {@link
     * WebpageConditionOperand#URL} operands.
     *                 <li>{@code CONTAINS} is only allowed for {@link WebpageConditionOperand#URL},
     * {@link
     *                 WebpageConditionOperand#PAGE_TITLE}, and {@link WebpageConditionOperand#PAGE_CONTENT}
     * operands.
     *                 </ul> */
    private com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperator operator;

    public WebpageCondition() {
    }

    public WebpageCondition(
           com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperand operand,
           java.lang.String argument,
           com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperator operator) {
           this.operand = operand;
           this.argument = argument;
           this.operator = operator;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("argument", getArgument())
            .add("operand", getOperand())
            .add("operator", getOperator())
            .toString();
    }

    /**
     * Gets the operand value for this WebpageCondition.
     * 
     * @return operand   * Operand of webpage targeting condition.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperand getOperand() {
        return operand;
    }


    /**
     * Sets the operand value for this WebpageCondition.
     * 
     * @param operand   * Operand of webpage targeting condition.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setOperand(com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperand operand) {
        this.operand = operand;
    }


    /**
     * Gets the argument value for this WebpageCondition.
     * 
     * @return argument   * Argument of the webpage targeting condition.
     *                 <span class="constraint MustNotContain">This string
     * must not contain a substring that matches the regular expression '\*|\>\>|\=\=|\&\+'</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 2048, inclusive.</span>
     */
    public java.lang.String getArgument() {
        return argument;
    }


    /**
     * Sets the argument value for this WebpageCondition.
     * 
     * @param argument   * Argument of the webpage targeting condition.
     *                 <span class="constraint MustNotContain">This string
     * must not contain a substring that matches the regular expression '\*|\>\>|\=\=|\&\+'</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 2048, inclusive.</span>
     */
    public void setArgument(java.lang.String argument) {
        this.argument = argument;
    }


    /**
     * Gets the operator value for this WebpageCondition.
     * 
     * @return operator   * Operator of webpage targeting condition.
     *                 
     *                 <ul>
     *                 <li>{@code EQUALS} is only allowed for {@link WebpageConditionOperand#CATEGORY},
     * {@link
     *                 WebpageConditionOperand#CUSTOM_LABEL}, and {@link
     * WebpageConditionOperand#URL} operands.
     *                 <li>{@code CONTAINS} is only allowed for {@link WebpageConditionOperand#URL},
     * {@link
     *                 WebpageConditionOperand#PAGE_TITLE}, and {@link WebpageConditionOperand#PAGE_CONTENT}
     * operands.
     *                 </ul>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this WebpageCondition.
     * 
     * @param operator   * Operator of webpage targeting condition.
     *                 
     *                 <ul>
     *                 <li>{@code EQUALS} is only allowed for {@link WebpageConditionOperand#CATEGORY},
     * {@link
     *                 WebpageConditionOperand#CUSTOM_LABEL}, and {@link
     * WebpageConditionOperand#URL} operands.
     *                 <li>{@code CONTAINS} is only allowed for {@link WebpageConditionOperand#URL},
     * {@link
     *                 WebpageConditionOperand#PAGE_TITLE}, and {@link WebpageConditionOperand#PAGE_CONTENT}
     * operands.
     *                 </ul>
     */
    public void setOperator(com.google.api.ads.adwords.axis.v201809.cm.WebpageConditionOperator operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebpageCondition)) return false;
        WebpageCondition other = (WebpageCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operand==null && other.getOperand()==null) || 
             (this.operand!=null &&
              this.operand.equals(other.getOperand()))) &&
            ((this.argument==null && other.getArgument()==null) || 
             (this.argument!=null &&
              this.argument.equals(other.getArgument()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getOperand() != null) {
            _hashCode += getOperand().hashCode();
        }
        if (getArgument() != null) {
            _hashCode += getArgument().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebpageCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "WebpageCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "operand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "WebpageConditionOperand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argument");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "argument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "WebpageConditionOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
