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
 * Content.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201708;


/**
 * A {@code Content} represents video metadata from a publisher's
 *             Content Management System (CMS) that has been synced to
 * DFP.
 *             <p>
 *             Video line items can be targeted to {@code Content}
 *             to indicate what ads should match when the {@code Content}
 * is being played.
 */
public class Content  implements java.io.Serializable {
    /* Uniquely identifies the {@code Content}. This attribute is
     * read-only and
     *                 is assigned by Google when the content is created. */
    private java.lang.Long id;

    /* The name of the {@code Content}. This attribute is read-only. */
    private java.lang.String name;

    /* The status of this {@code Content}. This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201708.ContentStatus status;

    /* Whether the content status was defined by the user, or by the
     * source CMS
     *                 from which the content was ingested. This attribute
     * is read-only. */
    private com.google.api.ads.dfp.axis.v201708.ContentStatusDefinedBy statusDefinedBy;

    /* The DAI ingest status of the {@code content}. This attribute
     * is read-only and is null if the
     *                 content is not eligible for dynamic ad insertion. */
    private com.google.api.ads.dfp.axis.v201708.DaiIngestStatus daiIngestStatus;

    /* The list of any errors that occurred during the DAI ingestion
     * process. This attribute is
     *                 read-only and will be null if the {@link #daiIngestStatus}
     * is {@link
     *                 DaiIngestStatus#STATUS_SUCCESS} or if the content
     * is not eligible for dynamic ad insertion. */
    private com.google.api.ads.dfp.axis.v201708.DaiIngestError[] daiIngestErrors;

    /* The date and time at which this content was last ingested for
     * DAI. This attribute is read-only
     *                 and will be null if the content is not eligible for
     * dynamic ad insertion. */
    private com.google.api.ads.dfp.axis.v201708.DateTime lastDaiIngestDateTime;

    /* The date and time at which this content was published. This
     * attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201708.DateTime importDateTime;

    /* The date and time at which this content was last modified.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201708.DateTime lastModifiedDateTime;

    /* A collection of custom targeting value IDs manually assigned
     * to this content
     *                 by the user. This attribute is optional. */
    private long[] userDefinedCustomTargetingValueIds;

    /* A collection of custom targeting value IDs automatically targeted
     * to this
     *                 content via metadata mapping rules. This attribute
     * is read-only. */
    private long[] mappingRuleDefinedCustomTargetingValueIds;

    /* Information about the content from the CMS it was ingested
     * from.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201708.CmsContent[] cmsSources;

    public Content() {
    }

    public Content(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201708.ContentStatus status,
           com.google.api.ads.dfp.axis.v201708.ContentStatusDefinedBy statusDefinedBy,
           com.google.api.ads.dfp.axis.v201708.DaiIngestStatus daiIngestStatus,
           com.google.api.ads.dfp.axis.v201708.DaiIngestError[] daiIngestErrors,
           com.google.api.ads.dfp.axis.v201708.DateTime lastDaiIngestDateTime,
           com.google.api.ads.dfp.axis.v201708.DateTime importDateTime,
           com.google.api.ads.dfp.axis.v201708.DateTime lastModifiedDateTime,
           long[] userDefinedCustomTargetingValueIds,
           long[] mappingRuleDefinedCustomTargetingValueIds,
           com.google.api.ads.dfp.axis.v201708.CmsContent[] cmsSources) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.statusDefinedBy = statusDefinedBy;
           this.daiIngestStatus = daiIngestStatus;
           this.daiIngestErrors = daiIngestErrors;
           this.lastDaiIngestDateTime = lastDaiIngestDateTime;
           this.importDateTime = importDateTime;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.userDefinedCustomTargetingValueIds = userDefinedCustomTargetingValueIds;
           this.mappingRuleDefinedCustomTargetingValueIds = mappingRuleDefinedCustomTargetingValueIds;
           this.cmsSources = cmsSources;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("cmsSources", getCmsSources())
            .add("daiIngestErrors", getDaiIngestErrors())
            .add("daiIngestStatus", getDaiIngestStatus())
            .add("id", getId())
            .add("importDateTime", getImportDateTime())
            .add("lastDaiIngestDateTime", getLastDaiIngestDateTime())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("mappingRuleDefinedCustomTargetingValueIds", getMappingRuleDefinedCustomTargetingValueIds())
            .add("name", getName())
            .add("status", getStatus())
            .add("statusDefinedBy", getStatusDefinedBy())
            .add("userDefinedCustomTargetingValueIds", getUserDefinedCustomTargetingValueIds())
            .toString();
    }

    /**
     * Gets the id value for this Content.
     * 
     * @return id   * Uniquely identifies the {@code Content}. This attribute is
     * read-only and
     *                 is assigned by Google when the content is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Content.
     * 
     * @param id   * Uniquely identifies the {@code Content}. This attribute is
     * read-only and
     *                 is assigned by Google when the content is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Content.
     * 
     * @return name   * The name of the {@code Content}. This attribute is read-only.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Content.
     * 
     * @param name   * The name of the {@code Content}. This attribute is read-only.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Content.
     * 
     * @return status   * The status of this {@code Content}. This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201708.ContentStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Content.
     * 
     * @param status   * The status of this {@code Content}. This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201708.ContentStatus status) {
        this.status = status;
    }


    /**
     * Gets the statusDefinedBy value for this Content.
     * 
     * @return statusDefinedBy   * Whether the content status was defined by the user, or by the
     * source CMS
     *                 from which the content was ingested. This attribute
     * is read-only.
     */
    public com.google.api.ads.dfp.axis.v201708.ContentStatusDefinedBy getStatusDefinedBy() {
        return statusDefinedBy;
    }


    /**
     * Sets the statusDefinedBy value for this Content.
     * 
     * @param statusDefinedBy   * Whether the content status was defined by the user, or by the
     * source CMS
     *                 from which the content was ingested. This attribute
     * is read-only.
     */
    public void setStatusDefinedBy(com.google.api.ads.dfp.axis.v201708.ContentStatusDefinedBy statusDefinedBy) {
        this.statusDefinedBy = statusDefinedBy;
    }


    /**
     * Gets the daiIngestStatus value for this Content.
     * 
     * @return daiIngestStatus   * The DAI ingest status of the {@code content}. This attribute
     * is read-only and is null if the
     *                 content is not eligible for dynamic ad insertion.
     */
    public com.google.api.ads.dfp.axis.v201708.DaiIngestStatus getDaiIngestStatus() {
        return daiIngestStatus;
    }


    /**
     * Sets the daiIngestStatus value for this Content.
     * 
     * @param daiIngestStatus   * The DAI ingest status of the {@code content}. This attribute
     * is read-only and is null if the
     *                 content is not eligible for dynamic ad insertion.
     */
    public void setDaiIngestStatus(com.google.api.ads.dfp.axis.v201708.DaiIngestStatus daiIngestStatus) {
        this.daiIngestStatus = daiIngestStatus;
    }


    /**
     * Gets the daiIngestErrors value for this Content.
     * 
     * @return daiIngestErrors   * The list of any errors that occurred during the DAI ingestion
     * process. This attribute is
     *                 read-only and will be null if the {@link #daiIngestStatus}
     * is {@link
     *                 DaiIngestStatus#STATUS_SUCCESS} or if the content
     * is not eligible for dynamic ad insertion.
     */
    public com.google.api.ads.dfp.axis.v201708.DaiIngestError[] getDaiIngestErrors() {
        return daiIngestErrors;
    }


    /**
     * Sets the daiIngestErrors value for this Content.
     * 
     * @param daiIngestErrors   * The list of any errors that occurred during the DAI ingestion
     * process. This attribute is
     *                 read-only and will be null if the {@link #daiIngestStatus}
     * is {@link
     *                 DaiIngestStatus#STATUS_SUCCESS} or if the content
     * is not eligible for dynamic ad insertion.
     */
    public void setDaiIngestErrors(com.google.api.ads.dfp.axis.v201708.DaiIngestError[] daiIngestErrors) {
        this.daiIngestErrors = daiIngestErrors;
    }

    public com.google.api.ads.dfp.axis.v201708.DaiIngestError getDaiIngestErrors(int i) {
        return this.daiIngestErrors[i];
    }

    public void setDaiIngestErrors(int i, com.google.api.ads.dfp.axis.v201708.DaiIngestError _value) {
        this.daiIngestErrors[i] = _value;
    }


    /**
     * Gets the lastDaiIngestDateTime value for this Content.
     * 
     * @return lastDaiIngestDateTime   * The date and time at which this content was last ingested for
     * DAI. This attribute is read-only
     *                 and will be null if the content is not eligible for
     * dynamic ad insertion.
     */
    public com.google.api.ads.dfp.axis.v201708.DateTime getLastDaiIngestDateTime() {
        return lastDaiIngestDateTime;
    }


    /**
     * Sets the lastDaiIngestDateTime value for this Content.
     * 
     * @param lastDaiIngestDateTime   * The date and time at which this content was last ingested for
     * DAI. This attribute is read-only
     *                 and will be null if the content is not eligible for
     * dynamic ad insertion.
     */
    public void setLastDaiIngestDateTime(com.google.api.ads.dfp.axis.v201708.DateTime lastDaiIngestDateTime) {
        this.lastDaiIngestDateTime = lastDaiIngestDateTime;
    }


    /**
     * Gets the importDateTime value for this Content.
     * 
     * @return importDateTime   * The date and time at which this content was published. This
     * attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201708.DateTime getImportDateTime() {
        return importDateTime;
    }


    /**
     * Sets the importDateTime value for this Content.
     * 
     * @param importDateTime   * The date and time at which this content was published. This
     * attribute is read-only.
     */
    public void setImportDateTime(com.google.api.ads.dfp.axis.v201708.DateTime importDateTime) {
        this.importDateTime = importDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this Content.
     * 
     * @return lastModifiedDateTime   * The date and time at which this content was last modified.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201708.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Content.
     * 
     * @param lastModifiedDateTime   * The date and time at which this content was last modified.
     *                 This attribute is read-only.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201708.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the userDefinedCustomTargetingValueIds value for this Content.
     * 
     * @return userDefinedCustomTargetingValueIds   * A collection of custom targeting value IDs manually assigned
     * to this content
     *                 by the user. This attribute is optional.
     */
    public long[] getUserDefinedCustomTargetingValueIds() {
        return userDefinedCustomTargetingValueIds;
    }


    /**
     * Sets the userDefinedCustomTargetingValueIds value for this Content.
     * 
     * @param userDefinedCustomTargetingValueIds   * A collection of custom targeting value IDs manually assigned
     * to this content
     *                 by the user. This attribute is optional.
     */
    public void setUserDefinedCustomTargetingValueIds(long[] userDefinedCustomTargetingValueIds) {
        this.userDefinedCustomTargetingValueIds = userDefinedCustomTargetingValueIds;
    }

    public long getUserDefinedCustomTargetingValueIds(int i) {
        return this.userDefinedCustomTargetingValueIds[i];
    }

    public void setUserDefinedCustomTargetingValueIds(int i, long _value) {
        this.userDefinedCustomTargetingValueIds[i] = _value;
    }


    /**
     * Gets the mappingRuleDefinedCustomTargetingValueIds value for this Content.
     * 
     * @return mappingRuleDefinedCustomTargetingValueIds   * A collection of custom targeting value IDs automatically targeted
     * to this
     *                 content via metadata mapping rules. This attribute
     * is read-only.
     */
    public long[] getMappingRuleDefinedCustomTargetingValueIds() {
        return mappingRuleDefinedCustomTargetingValueIds;
    }


    /**
     * Sets the mappingRuleDefinedCustomTargetingValueIds value for this Content.
     * 
     * @param mappingRuleDefinedCustomTargetingValueIds   * A collection of custom targeting value IDs automatically targeted
     * to this
     *                 content via metadata mapping rules. This attribute
     * is read-only.
     */
    public void setMappingRuleDefinedCustomTargetingValueIds(long[] mappingRuleDefinedCustomTargetingValueIds) {
        this.mappingRuleDefinedCustomTargetingValueIds = mappingRuleDefinedCustomTargetingValueIds;
    }

    public long getMappingRuleDefinedCustomTargetingValueIds(int i) {
        return this.mappingRuleDefinedCustomTargetingValueIds[i];
    }

    public void setMappingRuleDefinedCustomTargetingValueIds(int i, long _value) {
        this.mappingRuleDefinedCustomTargetingValueIds[i] = _value;
    }


    /**
     * Gets the cmsSources value for this Content.
     * 
     * @return cmsSources   * Information about the content from the CMS it was ingested
     * from.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201708.CmsContent[] getCmsSources() {
        return cmsSources;
    }


    /**
     * Sets the cmsSources value for this Content.
     * 
     * @param cmsSources   * Information about the content from the CMS it was ingested
     * from.
     *                 This attribute is read-only.
     */
    public void setCmsSources(com.google.api.ads.dfp.axis.v201708.CmsContent[] cmsSources) {
        this.cmsSources = cmsSources;
    }

    public com.google.api.ads.dfp.axis.v201708.CmsContent getCmsSources(int i) {
        return this.cmsSources[i];
    }

    public void setCmsSources(int i, com.google.api.ads.dfp.axis.v201708.CmsContent _value) {
        this.cmsSources[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Content)) return false;
        Content other = (Content) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusDefinedBy==null && other.getStatusDefinedBy()==null) || 
             (this.statusDefinedBy!=null &&
              this.statusDefinedBy.equals(other.getStatusDefinedBy()))) &&
            ((this.daiIngestStatus==null && other.getDaiIngestStatus()==null) || 
             (this.daiIngestStatus!=null &&
              this.daiIngestStatus.equals(other.getDaiIngestStatus()))) &&
            ((this.daiIngestErrors==null && other.getDaiIngestErrors()==null) || 
             (this.daiIngestErrors!=null &&
              java.util.Arrays.equals(this.daiIngestErrors, other.getDaiIngestErrors()))) &&
            ((this.lastDaiIngestDateTime==null && other.getLastDaiIngestDateTime()==null) || 
             (this.lastDaiIngestDateTime!=null &&
              this.lastDaiIngestDateTime.equals(other.getLastDaiIngestDateTime()))) &&
            ((this.importDateTime==null && other.getImportDateTime()==null) || 
             (this.importDateTime!=null &&
              this.importDateTime.equals(other.getImportDateTime()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.userDefinedCustomTargetingValueIds==null && other.getUserDefinedCustomTargetingValueIds()==null) || 
             (this.userDefinedCustomTargetingValueIds!=null &&
              java.util.Arrays.equals(this.userDefinedCustomTargetingValueIds, other.getUserDefinedCustomTargetingValueIds()))) &&
            ((this.mappingRuleDefinedCustomTargetingValueIds==null && other.getMappingRuleDefinedCustomTargetingValueIds()==null) || 
             (this.mappingRuleDefinedCustomTargetingValueIds!=null &&
              java.util.Arrays.equals(this.mappingRuleDefinedCustomTargetingValueIds, other.getMappingRuleDefinedCustomTargetingValueIds()))) &&
            ((this.cmsSources==null && other.getCmsSources()==null) || 
             (this.cmsSources!=null &&
              java.util.Arrays.equals(this.cmsSources, other.getCmsSources())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusDefinedBy() != null) {
            _hashCode += getStatusDefinedBy().hashCode();
        }
        if (getDaiIngestStatus() != null) {
            _hashCode += getDaiIngestStatus().hashCode();
        }
        if (getDaiIngestErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaiIngestErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaiIngestErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastDaiIngestDateTime() != null) {
            _hashCode += getLastDaiIngestDateTime().hashCode();
        }
        if (getImportDateTime() != null) {
            _hashCode += getImportDateTime().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getUserDefinedCustomTargetingValueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserDefinedCustomTargetingValueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserDefinedCustomTargetingValueIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMappingRuleDefinedCustomTargetingValueIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMappingRuleDefinedCustomTargetingValueIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMappingRuleDefinedCustomTargetingValueIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmsSources() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmsSources());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmsSources(), i);
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
        new org.apache.axis.description.TypeDesc(Content.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "Content"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ContentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDefinedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "statusDefinedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ContentStatusDefinedBy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daiIngestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "daiIngestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "DaiIngestStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daiIngestErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "daiIngestErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "DaiIngestError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastDaiIngestDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "lastDaiIngestDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "importDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDefinedCustomTargetingValueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "userDefinedCustomTargetingValueIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappingRuleDefinedCustomTargetingValueIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "mappingRuleDefinedCustomTargetingValueIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsSources");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "cmsSources"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "CmsContent"));
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
