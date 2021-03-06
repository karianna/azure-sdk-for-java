/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common input details for network mapping operation.
 */
public class UpdateNetworkMappingInputProperties {
    /**
     * Recovery fabric name.
     */
    @JsonProperty(value = "recoveryFabricName")
    private String recoveryFabricName;

    /**
     * Recovery network Id.
     */
    @JsonProperty(value = "recoveryNetworkId")
    private String recoveryNetworkId;

    /**
     * Fabrics specific input network Id.
     */
    @JsonProperty(value = "fabricSpecificDetails")
    private FabricSpecificUpdateNetworkMappingInput fabricSpecificDetails;

    /**
     * Get recovery fabric name.
     *
     * @return the recoveryFabricName value
     */
    public String recoveryFabricName() {
        return this.recoveryFabricName;
    }

    /**
     * Set recovery fabric name.
     *
     * @param recoveryFabricName the recoveryFabricName value to set
     * @return the UpdateNetworkMappingInputProperties object itself.
     */
    public UpdateNetworkMappingInputProperties withRecoveryFabricName(String recoveryFabricName) {
        this.recoveryFabricName = recoveryFabricName;
        return this;
    }

    /**
     * Get recovery network Id.
     *
     * @return the recoveryNetworkId value
     */
    public String recoveryNetworkId() {
        return this.recoveryNetworkId;
    }

    /**
     * Set recovery network Id.
     *
     * @param recoveryNetworkId the recoveryNetworkId value to set
     * @return the UpdateNetworkMappingInputProperties object itself.
     */
    public UpdateNetworkMappingInputProperties withRecoveryNetworkId(String recoveryNetworkId) {
        this.recoveryNetworkId = recoveryNetworkId;
        return this;
    }

    /**
     * Get fabrics specific input network Id.
     *
     * @return the fabricSpecificDetails value
     */
    public FabricSpecificUpdateNetworkMappingInput fabricSpecificDetails() {
        return this.fabricSpecificDetails;
    }

    /**
     * Set fabrics specific input network Id.
     *
     * @param fabricSpecificDetails the fabricSpecificDetails value to set
     * @return the UpdateNetworkMappingInputProperties object itself.
     */
    public UpdateNetworkMappingInputProperties withFabricSpecificDetails(FabricSpecificUpdateNetworkMappingInput fabricSpecificDetails) {
        this.fabricSpecificDetails = fabricSpecificDetails;
        return this;
    }

}
