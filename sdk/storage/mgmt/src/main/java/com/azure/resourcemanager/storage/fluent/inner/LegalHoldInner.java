// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LegalHold model. */
@Fluent
public final class LegalHoldInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LegalHoldInner.class);

    /*
     * The hasLegalHold public property is set to true by SRP if there are at
     * least one existing tag. The hasLegalHold public property is set to false
     * by SRP if all existing legal hold tags are cleared out. There can be a
     * maximum of 1000 blob containers with hasLegalHold=true for a given
     * account.
     */
    @JsonProperty(value = "hasLegalHold", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasLegalHold;

    /*
     * Each tag should be 3 to 23 alphanumeric characters and is normalized to
     * lower case at SRP.
     */
    @JsonProperty(value = "tags", required = true)
    private List<String> tags;

    /**
     * Get the hasLegalHold property: The hasLegalHold public property is set to true by SRP if there are at least one
     * existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared
     * out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     *
     * @return the hasLegalHold value.
     */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }

    /**
     * Get the tags property: Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     *
     * @return the tags value.
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Each tag should be 3 to 23 alphanumeric characters and is normalized to lower case at SRP.
     *
     * @param tags the tags value to set.
     * @return the LegalHoldInner object itself.
     */
    public LegalHoldInner withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tags() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property tags in model LegalHoldInner"));
        }
    }
}
