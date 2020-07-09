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
 * Resources that have an association with the parent resource.
 */
public class TopologyAssociation {
    /**
     * The name of the resource that is associated with the parent resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The ID of the resource that is associated with the parent resource.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * The association type of the child resource to the parent resource.
     * Possible values include: 'Associated', 'Contains'.
     */
    @JsonProperty(value = "associationType")
    private AssociationType associationType;

    /**
     * Get the name of the resource that is associated with the parent resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is associated with the parent resource.
     *
     * @param name the name value to set
     * @return the TopologyAssociation object itself.
     */
    public TopologyAssociation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ID of the resource that is associated with the parent resource.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the ID of the resource that is associated with the parent resource.
     *
     * @param resourceId the resourceId value to set
     * @return the TopologyAssociation object itself.
     */
    public TopologyAssociation withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the association type of the child resource to the parent resource. Possible values include: 'Associated', 'Contains'.
     *
     * @return the associationType value
     */
    public AssociationType associationType() {
        return this.associationType;
    }

    /**
     * Set the association type of the child resource to the parent resource. Possible values include: 'Associated', 'Contains'.
     *
     * @param associationType the associationType value to set
     * @return the TopologyAssociation object itself.
     */
    public TopologyAssociation withAssociationType(AssociationType associationType) {
        this.associationType = associationType;
        return this;
    }

}
