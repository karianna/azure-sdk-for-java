// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ServiceEndpointPropertiesFormat model. */
@Fluent
public final class ServiceEndpointPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceEndpointPropertiesFormat.class);

    /*
     * The type of the endpoint service.
     */
    @JsonProperty(value = "service")
    private String service;

    /*
     * A list of locations.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /*
     * The provisioning state of the service endpoint resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the service property: The type of the endpoint service.
     *
     * @return the service value.
     */
    public String service() {
        return this.service;
    }

    /**
     * Set the service property: The type of the endpoint service.
     *
     * @param service the service value to set.
     * @return the ServiceEndpointPropertiesFormat object itself.
     */
    public ServiceEndpointPropertiesFormat withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Get the locations property: A list of locations.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: A list of locations.
     *
     * @param locations the locations value to set.
     * @return the ServiceEndpointPropertiesFormat object itself.
     */
    public ServiceEndpointPropertiesFormat withLocations(List<String> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the service endpoint resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
