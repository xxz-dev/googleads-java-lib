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

/**
 * DateTimeRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201911;


/**
 * Represents a range of dates (combined with time of day) that has
 * an upper and/or lower bound.
 */
public class DateTimeRange  implements java.io.Serializable {
    /* The start date time of this range. This field is optional and
     * if it is not set then there is no
     *                 lower bound on the date time range. If this field
     * is not set then {@code endDateTime} must be
     *                 specified. */
    private com.google.api.ads.admanager.axis.v201911.DateTime startDateTime;

    /* The end date time of this range. This field is optional and
     * if it is not set then there is no
     *                 upper bound on the date time range. If this field
     * is not set then {@code startDateTime} must be
     *                 specified. */
    private com.google.api.ads.admanager.axis.v201911.DateTime endDateTime;

    public DateTimeRange() {
    }

    public DateTimeRange(
           com.google.api.ads.admanager.axis.v201911.DateTime startDateTime,
           com.google.api.ads.admanager.axis.v201911.DateTime endDateTime) {
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("endDateTime", getEndDateTime())
            .add("startDateTime", getStartDateTime())
            .toString();
    }

    /**
     * Gets the startDateTime value for this DateTimeRange.
     * 
     * @return startDateTime   * The start date time of this range. This field is optional and
     * if it is not set then there is no
     *                 lower bound on the date time range. If this field
     * is not set then {@code endDateTime} must be
     *                 specified.
     */
    public com.google.api.ads.admanager.axis.v201911.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this DateTimeRange.
     * 
     * @param startDateTime   * The start date time of this range. This field is optional and
     * if it is not set then there is no
     *                 lower bound on the date time range. If this field
     * is not set then {@code endDateTime} must be
     *                 specified.
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v201911.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this DateTimeRange.
     * 
     * @return endDateTime   * The end date time of this range. This field is optional and
     * if it is not set then there is no
     *                 upper bound on the date time range. If this field
     * is not set then {@code startDateTime} must be
     *                 specified.
     */
    public com.google.api.ads.admanager.axis.v201911.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this DateTimeRange.
     * 
     * @param endDateTime   * The end date time of this range. This field is optional and
     * if it is not set then there is no
     *                 upper bound on the date time range. If this field
     * is not set then {@code startDateTime} must be
     *                 specified.
     */
    public void setEndDateTime(com.google.api.ads.admanager.axis.v201911.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateTimeRange)) return false;
        DateTimeRange other = (DateTimeRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime())));
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
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateTimeRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "DateTimeRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "DateTime"));
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
