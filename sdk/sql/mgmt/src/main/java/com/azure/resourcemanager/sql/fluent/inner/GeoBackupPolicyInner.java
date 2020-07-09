// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.GeoBackupPolicyState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GeoBackupPolicy model. */
@JsonFlatten
@Fluent
public class GeoBackupPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoBackupPolicyInner.class);

    /*
     * Kind of geo backup policy.  This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * Backup policy location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The state of the geo backup policy.
     */
    @JsonProperty(value = "properties.state", required = true)
    private GeoBackupPolicyState state;

    /*
     * The storage type of the geo backup policy.
     */
    @JsonProperty(value = "properties.storageType", access = JsonProperty.Access.WRITE_ONLY)
    private String storageType;

    /**
     * Get the kind property: Kind of geo backup policy. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the location property: Backup policy location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the state property: The state of the geo backup policy.
     *
     * @return the state value.
     */
    public GeoBackupPolicyState state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the geo backup policy.
     *
     * @param state the state value to set.
     * @return the GeoBackupPolicyInner object itself.
     */
    public GeoBackupPolicyInner withState(GeoBackupPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the storageType property: The storage type of the geo backup policy.
     *
     * @return the storageType value.
     */
    public String storageType() {
        return this.storageType;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (state() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property state in model GeoBackupPolicyInner"));
        }
    }
}
