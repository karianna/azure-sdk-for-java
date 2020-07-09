// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ImagePurchasePlan model. */
@Fluent
public final class ImagePurchasePlan {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImagePurchasePlan.class);

    /*
     * The plan ID.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The publisher ID.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * The product ID.
     */
    @JsonProperty(value = "product")
    private String product;

    /**
     * Get the name property: The plan ID.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The plan ID.
     *
     * @param name the name value to set.
     * @return the ImagePurchasePlan object itself.
     */
    public ImagePurchasePlan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publisher property: The publisher ID.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The publisher ID.
     *
     * @param publisher the publisher value to set.
     * @return the ImagePurchasePlan object itself.
     */
    public ImagePurchasePlan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the product property: The product ID.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: The product ID.
     *
     * @param product the product value to set.
     * @return the ImagePurchasePlan object itself.
     */
    public ImagePurchasePlan withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
