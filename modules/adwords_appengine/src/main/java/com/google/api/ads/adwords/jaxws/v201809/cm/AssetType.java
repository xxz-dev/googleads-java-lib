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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Asset.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Asset.Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="IMAGE"/>
 *     &lt;enumeration value="YOUTUBE_VIDEO"/>
 *     &lt;enumeration value="MEDIA_BUNDLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Asset.Type")
@XmlEnum
public enum AssetType {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Text asset
     *               
     * 
     */
    TEXT,

    /**
     * 
     *                 Image asset
     *               
     * 
     */
    IMAGE,

    /**
     * 
     *                 YouTube video asset
     *               
     * 
     */
    YOUTUBE_VIDEO,

    /**
     * 
     *                 Media bundle asset
     *               
     * 
     */
    MEDIA_BUNDLE;

    public String value() {
        return name();
    }

    public static AssetType fromValue(String v) {
        return valueOf(v);
    }

}
