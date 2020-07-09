// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Dependency model. */
@Fluent
public final class Dependency {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Dependency.class);

    /*
     * The list of dependencies.
     */
    @JsonProperty(value = "dependsOn")
    private List<BasicDependency> dependsOn;

    /*
     * The ID of the dependency.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The dependency resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The dependency resource name.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Get the dependsOn property: The list of dependencies.
     *
     * @return the dependsOn value.
     */
    public List<BasicDependency> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn property: The list of dependencies.
     *
     * @param dependsOn the dependsOn value to set.
     * @return the Dependency object itself.
     */
    public Dependency withDependsOn(List<BasicDependency> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the id property: The ID of the dependency.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the dependency.
     *
     * @param id the id value to set.
     * @return the Dependency object itself.
     */
    public Dependency withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the resourceType property: The dependency resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The dependency resource type.
     *
     * @param resourceType the resourceType value to set.
     * @return the Dependency object itself.
     */
    public Dependency withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceName property: The dependency resource name.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: The dependency resource name.
     *
     * @param resourceName the resourceName value to set.
     * @return the Dependency object itself.
     */
    public Dependency withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dependsOn() != null) {
            dependsOn().forEach(e -> e.validate());
        }
    }
}
