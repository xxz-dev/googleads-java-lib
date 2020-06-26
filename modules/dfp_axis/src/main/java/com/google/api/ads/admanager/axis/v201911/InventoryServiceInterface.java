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
 * InventoryServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201911;

public interface InventoryServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link AdUnit} objects.
     *         
     *         
     * @param adUnits the ad units to create
     *         
     * @return the created ad units, with their IDs filled in
     */
    public com.google.api.ads.admanager.axis.v201911.AdUnit[] createAdUnits(com.google.api.ads.admanager.axis.v201911.AdUnit[] adUnits) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201911.ApiException;

    /**
     * Returns a set of all relevant {@link AdUnitSize} objects.
     *         
     *         <p>The given {@link Statement} is currently ignored but may
     * be honored in future versions.
     *         
     *         
     * @param filterStatement currently ignored but may be honored in future
     * versions
     *         
     * @return the ad unit sizes
     */
    public com.google.api.ads.admanager.axis.v201911.AdUnitSize[] getAdUnitSizesByStatement(com.google.api.ads.admanager.axis.v201911.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201911.ApiException;

    /**
     * Gets a {@link AdUnitPage} of {@link AdUnit} objects that satisfy
     * the given
     *         {@link Statement#query}. The following fields are supported
     * for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code adUnitCode}</td>
     *         <td>{@link AdUnit#adUnitCode}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdUnit#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdUnit#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code parentId}</td>
     *         <td>{@link AdUnit#parentId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdUnit#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link AdUnit#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of ad units
     *         
     * @return the ad units that match the given filter
     */
    public com.google.api.ads.admanager.axis.v201911.AdUnitPage getAdUnitsByStatement(com.google.api.ads.admanager.axis.v201911.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201911.ApiException;

    /**
     * Performs actions on {@link AdUnit} objects that match the given
     * {@link Statement#query}.
     *         
     *         
     * @param adUnitAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of ad units
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.admanager.axis.v201911.UpdateResult performAdUnitAction(com.google.api.ads.admanager.axis.v201911.AdUnitAction adUnitAction, com.google.api.ads.admanager.axis.v201911.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201911.ApiException;

    /**
     * Updates the specified {@link AdUnit} objects.
     *         
     *         
     * @param adUnits the ad units to update
     *         
     * @return the updated ad units
     */
    public com.google.api.ads.admanager.axis.v201911.AdUnit[] updateAdUnits(com.google.api.ads.admanager.axis.v201911.AdUnit[] adUnits) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v201911.ApiException;
}
