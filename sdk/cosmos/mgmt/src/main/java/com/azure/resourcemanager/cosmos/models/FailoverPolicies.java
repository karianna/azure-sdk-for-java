// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FailoverPolicies model. */
@Fluent
public final class FailoverPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FailoverPolicies.class);

    /*
     * List of failover policies.
     */
    @JsonProperty(value = "failoverPolicies", required = true)
    private List<FailoverPolicy> failoverPolicies;

    /**
     * Get the failoverPolicies property: List of failover policies.
     *
     * @return the failoverPolicies value.
     */
    public List<FailoverPolicy> failoverPolicies() {
        return this.failoverPolicies;
    }

    /**
     * Set the failoverPolicies property: List of failover policies.
     *
     * @param failoverPolicies the failoverPolicies value to set.
     * @return the FailoverPolicies object itself.
     */
    public FailoverPolicies withFailoverPolicies(List<FailoverPolicy> failoverPolicies) {
        this.failoverPolicies = failoverPolicies;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (failoverPolicies() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property failoverPolicies in model FailoverPolicies"));
        } else {
            failoverPolicies().forEach(e -> e.validate());
        }
    }
}
