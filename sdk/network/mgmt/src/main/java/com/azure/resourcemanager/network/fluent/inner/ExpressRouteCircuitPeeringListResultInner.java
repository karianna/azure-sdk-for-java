// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExpressRouteCircuitPeeringListResult model. */
@Fluent
public final class ExpressRouteCircuitPeeringListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitPeeringListResultInner.class);

    /*
     * The peerings in an express route circuit.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitPeeringInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The peerings in an express route circuit.
     *
     * @return the value value.
     */
    public List<ExpressRouteCircuitPeeringInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The peerings in an express route circuit.
     *
     * @param value the value value to set.
     * @return the ExpressRouteCircuitPeeringListResultInner object itself.
     */
    public ExpressRouteCircuitPeeringListResultInner withValue(List<ExpressRouteCircuitPeeringInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ExpressRouteCircuitPeeringListResultInner object itself.
     */
    public ExpressRouteCircuitPeeringListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
