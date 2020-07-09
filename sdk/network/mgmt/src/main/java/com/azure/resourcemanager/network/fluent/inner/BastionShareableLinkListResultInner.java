// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The BastionShareableLinkListResult model. */
@Fluent
public final class BastionShareableLinkListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BastionShareableLinkListResultInner.class);

    /*
     * List of Bastion Shareable Links for the request.
     */
    @JsonProperty(value = "value")
    private List<BastionShareableLinkInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Bastion Shareable Links for the request.
     *
     * @return the value value.
     */
    public List<BastionShareableLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Bastion Shareable Links for the request.
     *
     * @param value the value value to set.
     * @return the BastionShareableLinkListResultInner object itself.
     */
    public BastionShareableLinkListResultInner withValue(List<BastionShareableLinkInner> value) {
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
     * @return the BastionShareableLinkListResultInner object itself.
     */
    public BastionShareableLinkListResultInner withNextLink(String nextLink) {
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
