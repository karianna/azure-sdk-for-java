/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Operations Management Suite (OMS) parameters.
 */
public class ClusterMonitoringRequest {
    /**
     * The Operations Management Suite (OMS) workspace ID.
     */
    @JsonProperty(value = "workspaceId")
    private String workspaceId;

    /**
     * The Operations Management Suite (OMS) workspace key.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /**
     * Get the Operations Management Suite (OMS) workspace ID.
     *
     * @return the workspaceId value
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the Operations Management Suite (OMS) workspace ID.
     *
     * @param workspaceId the workspaceId value to set
     * @return the ClusterMonitoringRequest object itself.
     */
    public ClusterMonitoringRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the Operations Management Suite (OMS) workspace key.
     *
     * @return the primaryKey value
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the Operations Management Suite (OMS) workspace key.
     *
     * @param primaryKey the primaryKey value to set
     * @return the ClusterMonitoringRequest object itself.
     */
    public ClusterMonitoringRequest withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

}