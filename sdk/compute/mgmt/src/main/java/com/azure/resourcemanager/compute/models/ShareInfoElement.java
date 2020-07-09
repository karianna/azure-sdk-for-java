// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ShareInfoElement model. */
@Immutable
public final class ShareInfoElement {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ShareInfoElement.class);

    /*
     * A relative URI containing the ID of the VM that has the disk attached.
     */
    @JsonProperty(value = "vmUri", access = JsonProperty.Access.WRITE_ONLY)
    private String vmUri;

    /**
     * Get the vmUri property: A relative URI containing the ID of the VM that has the disk attached.
     *
     * @return the vmUri value.
     */
    public String vmUri() {
        return this.vmUri;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
