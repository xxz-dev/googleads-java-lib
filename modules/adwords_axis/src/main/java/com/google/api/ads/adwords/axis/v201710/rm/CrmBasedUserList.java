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

/**
 * CrmBasedUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201710.rm;


/**
 * UserList of CRM users provided by the advertiser.
 */
public class CrmBasedUserList  extends com.google.api.ads.adwords.axis.v201710.rm.UserList  implements java.io.Serializable {
    /* Matching key type of the list. This field is read only and
     * set on the first upload by API and
     *                     remains immutable afterwards. Mixed data types
     * are not allowed on the same list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UploadKeyType".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201710.rm.CustomerMatchUploadKeyType uploadKeyType;

    /* Data source of the list.
     *                     Default value is FIRST_PARTY. Only whitelisted
     * customers can create third party sourced crm
     *                     lists.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DataSourceType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: SET.</span> */
    private com.google.api.ads.adwords.axis.v201710.rm.CrmDataSourceType dataSourceType;

    /* <span class="constraint Selectable">This field can be selected
     * using the value "DataUploadResult".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: ADD.</span> */
    private com.google.api.ads.adwords.axis.v201710.rm.DataUploadResult dataUploadResult;

    public CrmBasedUserList() {
    }

    public CrmBasedUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201710.rm.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.adwords.axis.v201710.rm.AccessReason accessReason,
           com.google.api.ads.adwords.axis.v201710.rm.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.adwords.axis.v201710.rm.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.adwords.axis.v201710.rm.SizeRange sizeRangeForSearch,
           com.google.api.ads.adwords.axis.v201710.rm.UserListType listType,
           java.lang.Boolean isEligibleForSearch,
           java.lang.Boolean isEligibleForDisplay,
           com.google.api.ads.adwords.axis.v201710.rm.UserListClosingReason closingReason,
           java.lang.String userListType,
           com.google.api.ads.adwords.axis.v201710.rm.CustomerMatchUploadKeyType uploadKeyType,
           com.google.api.ads.adwords.axis.v201710.rm.CrmDataSourceType dataSourceType,
           com.google.api.ads.adwords.axis.v201710.rm.DataUploadResult dataUploadResult) {
        super(
            id,
            isReadOnly,
            name,
            description,
            status,
            integrationCode,
            accessReason,
            accountUserListStatus,
            membershipLifeSpan,
            size,
            sizeRange,
            sizeForSearch,
            sizeRangeForSearch,
            listType,
            isEligibleForSearch,
            isEligibleForDisplay,
            closingReason,
            userListType);
        this.uploadKeyType = uploadKeyType;
        this.dataSourceType = dataSourceType;
        this.dataUploadResult = dataUploadResult;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("accessReason", getAccessReason())
            .add("accountUserListStatus", getAccountUserListStatus())
            .add("closingReason", getClosingReason())
            .add("dataSourceType", getDataSourceType())
            .add("dataUploadResult", getDataUploadResult())
            .add("description", getDescription())
            .add("id", getId())
            .add("integrationCode", getIntegrationCode())
            .add("isEligibleForDisplay", getIsEligibleForDisplay())
            .add("isEligibleForSearch", getIsEligibleForSearch())
            .add("isReadOnly", getIsReadOnly())
            .add("listType", getListType())
            .add("membershipLifeSpan", getMembershipLifeSpan())
            .add("name", getName())
            .add("size", getSize())
            .add("sizeForSearch", getSizeForSearch())
            .add("sizeRange", getSizeRange())
            .add("sizeRangeForSearch", getSizeRangeForSearch())
            .add("status", getStatus())
            .add("uploadKeyType", getUploadKeyType())
            .add("userListType", getUserListType())
            .toString();
    }

    /**
     * Gets the uploadKeyType value for this CrmBasedUserList.
     * 
     * @return uploadKeyType   * Matching key type of the list. This field is read only and
     * set on the first upload by API and
     *                     remains immutable afterwards. Mixed data types
     * are not allowed on the same list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UploadKeyType".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201710.rm.CustomerMatchUploadKeyType getUploadKeyType() {
        return uploadKeyType;
    }


    /**
     * Sets the uploadKeyType value for this CrmBasedUserList.
     * 
     * @param uploadKeyType   * Matching key type of the list. This field is read only and
     * set on the first upload by API and
     *                     remains immutable afterwards. Mixed data types
     * are not allowed on the same list.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "UploadKeyType".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setUploadKeyType(com.google.api.ads.adwords.axis.v201710.rm.CustomerMatchUploadKeyType uploadKeyType) {
        this.uploadKeyType = uploadKeyType;
    }


    /**
     * Gets the dataSourceType value for this CrmBasedUserList.
     * 
     * @return dataSourceType   * Data source of the list.
     *                     Default value is FIRST_PARTY. Only whitelisted
     * customers can create third party sourced crm
     *                     lists.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DataSourceType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201710.rm.CrmDataSourceType getDataSourceType() {
        return dataSourceType;
    }


    /**
     * Sets the dataSourceType value for this CrmBasedUserList.
     * 
     * @param dataSourceType   * Data source of the list.
     *                     Default value is FIRST_PARTY. Only whitelisted
     * customers can create third party sourced crm
     *                     lists.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DataSourceType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: SET.</span>
     */
    public void setDataSourceType(com.google.api.ads.adwords.axis.v201710.rm.CrmDataSourceType dataSourceType) {
        this.dataSourceType = dataSourceType;
    }


    /**
     * Gets the dataUploadResult value for this CrmBasedUserList.
     * 
     * @return dataUploadResult   * <span class="constraint Selectable">This field can be selected
     * using the value "DataUploadResult".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201710.rm.DataUploadResult getDataUploadResult() {
        return dataUploadResult;
    }


    /**
     * Sets the dataUploadResult value for this CrmBasedUserList.
     * 
     * @param dataUploadResult   * <span class="constraint Selectable">This field can be selected
     * using the value "DataUploadResult".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: ADD.</span>
     */
    public void setDataUploadResult(com.google.api.ads.adwords.axis.v201710.rm.DataUploadResult dataUploadResult) {
        this.dataUploadResult = dataUploadResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrmBasedUserList)) return false;
        CrmBasedUserList other = (CrmBasedUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.uploadKeyType==null && other.getUploadKeyType()==null) || 
             (this.uploadKeyType!=null &&
              this.uploadKeyType.equals(other.getUploadKeyType()))) &&
            ((this.dataSourceType==null && other.getDataSourceType()==null) || 
             (this.dataSourceType!=null &&
              this.dataSourceType.equals(other.getDataSourceType()))) &&
            ((this.dataUploadResult==null && other.getDataUploadResult()==null) || 
             (this.dataUploadResult!=null &&
              this.dataUploadResult.equals(other.getDataUploadResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUploadKeyType() != null) {
            _hashCode += getUploadKeyType().hashCode();
        }
        if (getDataSourceType() != null) {
            _hashCode += getDataSourceType().hashCode();
        }
        if (getDataUploadResult() != null) {
            _hashCode += getDataUploadResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CrmBasedUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201710", "CrmBasedUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadKeyType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201710", "uploadKeyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201710", "CustomerMatchUploadKeyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201710", "dataSourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201710", "CrmDataSourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataUploadResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201710", "dataUploadResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201710", "DataUploadResult"));
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
