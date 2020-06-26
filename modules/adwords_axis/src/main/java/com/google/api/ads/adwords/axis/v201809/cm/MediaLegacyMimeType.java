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
 * MediaLegacyMimeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;

public class MediaLegacyMimeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MediaLegacyMimeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _IMAGE_JPEG = "IMAGE_JPEG";
    public static final java.lang.String _IMAGE_GIF = "IMAGE_GIF";
    public static final java.lang.String _IMAGE_PNG = "IMAGE_PNG";
    public static final java.lang.String _FLASH = "FLASH";
    public static final java.lang.String _TEXT_HTML = "TEXT_HTML";
    public static final java.lang.String _PDF = "PDF";
    public static final java.lang.String _MSWORD = "MSWORD";
    public static final java.lang.String _MSEXCEL = "MSEXCEL";
    public static final java.lang.String _RTF = "RTF";
    public static final java.lang.String _AUDIO_WAV = "AUDIO_WAV";
    public static final java.lang.String _AUDIO_MP3 = "AUDIO_MP3";
    public static final java.lang.String _HTML5_AD_ZIP = "HTML5_AD_ZIP";
    public static final MediaLegacyMimeType IMAGE_JPEG = new MediaLegacyMimeType(_IMAGE_JPEG);
    public static final MediaLegacyMimeType IMAGE_GIF = new MediaLegacyMimeType(_IMAGE_GIF);
    public static final MediaLegacyMimeType IMAGE_PNG = new MediaLegacyMimeType(_IMAGE_PNG);
    public static final MediaLegacyMimeType FLASH = new MediaLegacyMimeType(_FLASH);
    public static final MediaLegacyMimeType TEXT_HTML = new MediaLegacyMimeType(_TEXT_HTML);
    public static final MediaLegacyMimeType PDF = new MediaLegacyMimeType(_PDF);
    public static final MediaLegacyMimeType MSWORD = new MediaLegacyMimeType(_MSWORD);
    public static final MediaLegacyMimeType MSEXCEL = new MediaLegacyMimeType(_MSEXCEL);
    public static final MediaLegacyMimeType RTF = new MediaLegacyMimeType(_RTF);
    public static final MediaLegacyMimeType AUDIO_WAV = new MediaLegacyMimeType(_AUDIO_WAV);
    public static final MediaLegacyMimeType AUDIO_MP3 = new MediaLegacyMimeType(_AUDIO_MP3);
    public static final MediaLegacyMimeType HTML5_AD_ZIP = new MediaLegacyMimeType(_HTML5_AD_ZIP);
    public java.lang.String getValue() { return _value_;}
    public static MediaLegacyMimeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MediaLegacyMimeType enumeration = (MediaLegacyMimeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MediaLegacyMimeType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MediaLegacyMimeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "Media.LegacyMimeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
