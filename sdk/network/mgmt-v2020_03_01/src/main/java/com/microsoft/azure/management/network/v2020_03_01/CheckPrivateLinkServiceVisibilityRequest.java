/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body of the CheckPrivateLinkServiceVisibility API service call.
 */
public class CheckPrivateLinkServiceVisibilityRequest {
    /**
     * The alias of the private link service.
     */
    @JsonProperty(value = "privateLinkServiceAlias")
    private String privateLinkServiceAlias;

    /**
     * Get the alias of the private link service.
     *
     * @return the privateLinkServiceAlias value
     */
    public String privateLinkServiceAlias() {
        return this.privateLinkServiceAlias;
    }

    /**
     * Set the alias of the private link service.
     *
     * @param privateLinkServiceAlias the privateLinkServiceAlias value to set
     * @return the CheckPrivateLinkServiceVisibilityRequest object itself.
     */
    public CheckPrivateLinkServiceVisibilityRequest withPrivateLinkServiceAlias(String privateLinkServiceAlias) {
        this.privateLinkServiceAlias = privateLinkServiceAlias;
        return this;
    }

}
