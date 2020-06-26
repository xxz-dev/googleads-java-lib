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

/**
 * CompanyServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202005;

public interface CompanyServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link Company} objects.
     *         
     *         
     * @param companies the companies to create
     *         
     * @return the created companies with their IDs filled in
     */
    public com.google.api.ads.admanager.axis.v202005.Company[] createCompanies(com.google.api.ads.admanager.axis.v202005.Company[] companies) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Gets a {@link CompanyPage} of {@link Company} objects that
     * satisfy the
     *         given {@link Statement#query}. The following fields are supported
     * for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Company#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Company#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Company#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Company#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of companies
     *         
     * @return the companies that match the given filter
     */
    public com.google.api.ads.admanager.axis.v202005.CompanyPage getCompaniesByStatement(com.google.api.ads.admanager.axis.v202005.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Performs actions on {@link Company} objects that match the
     * given {@code Statement}.
     *         
     *         
     * @param companyAction the action to perform
     *         
     * @param statement a PQL statement used to filter companies
     *         
     * @return the result of the action performed
     *         
     * @throws ApiException
     */
    public com.google.api.ads.admanager.axis.v202005.UpdateResult performCompanyAction(com.google.api.ads.admanager.axis.v202005.CompanyAction companyAction, com.google.api.ads.admanager.axis.v202005.Statement statement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;

    /**
     * Updates the specified {@link Company} objects.
     *         
     *         
     * @param companies the companies to update
     *         
     * @return the updated companies
     */
    public com.google.api.ads.admanager.axis.v202005.Company[] updateCompanies(com.google.api.ads.admanager.axis.v202005.Company[] companies) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202005.ApiException;
}
