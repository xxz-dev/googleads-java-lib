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


package com.google.api.ads.adwords.jaxws.v201710.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchJobError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchJobError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="DISK_QUOTA_EXCEEDED"/>
 *     &lt;enumeration value="FAILED_TO_CREATE_JOB"/>
 *     &lt;enumeration value="INVALID_STATE_CHANGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchJobError.Reason")
@XmlEnum
public enum BatchJobErrorReason {

    UNKNOWN,

    /**
     * 
     *                 The user exceeded allowed disk quota for in-flight jobs.
     *               
     * 
     */
    DISK_QUOTA_EXCEEDED,

    /**
     * 
     *                 An internal error resulted in a failure to create the job.
     *               
     * 
     */
    FAILED_TO_CREATE_JOB,

    /**
     * 
     *                 The requested state change was invalid.
     *               
     * 
     */
    INVALID_STATE_CHANGE;

    public String value() {
        return name();
    }

    public static BatchJobErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
