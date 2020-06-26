// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202002;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LicenseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIRECT_LICENSE"/>
 *     &lt;enumeration value="GLOBAL_LICENSE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LicenseType")
@XmlEnum
public enum LicenseType {


    /**
     * 
     *                 A direct license is the result of a direct contract between the data provider and the
     *                 publisher.
     *               
     * 
     */
    DIRECT_LICENSE,

    /**
     * 
     *                 A global license is the result of an agreement between Google and the data provider, which
     *                 agrees to license their audience segments to all the publishers and/or advertisers of the
     *                 Google ecosystem.
     *               
     * 
     */
    GLOBAL_LICENSE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LicenseType fromValue(String v) {
        return valueOf(v);
    }

}
