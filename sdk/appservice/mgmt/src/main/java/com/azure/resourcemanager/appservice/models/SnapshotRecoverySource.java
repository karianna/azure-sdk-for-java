// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SnapshotRecoverySource model. */
@Fluent
public final class SnapshotRecoverySource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SnapshotRecoverySource.class);

    /*
     * Geographical location of the source web app, e.g. SouthEastAsia,
     * SouthCentralUS
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * ARM resource ID of the source app.
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}
     * for production slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the location property: Geographical location of the source web app, e.g. SouthEastAsia, SouthCentralUS.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Geographical location of the source web app, e.g. SouthEastAsia, SouthCentralUS.
     *
     * @param location the location value to set.
     * @return the SnapshotRecoverySource object itself.
     */
    public SnapshotRecoverySource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the id property: ARM resource ID of the source app.
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production
     * slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ARM resource ID of the source app.
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production
     * slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     *
     * @param id the id value to set.
     * @return the SnapshotRecoverySource object itself.
     */
    public SnapshotRecoverySource withId(String id) {
        this.id = id;
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
