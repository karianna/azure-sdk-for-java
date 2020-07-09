// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AutomaticOSUpgradePolicy model. */
@Fluent
public final class AutomaticOSUpgradePolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutomaticOSUpgradePolicy.class);

    /*
     * Indicates whether OS upgrades should automatically be applied to scale
     * set instances in a rolling fashion when a newer version of the OS image
     * becomes available. Default value is false. <br><br> If this is set to
     * true for Windows based scale sets,
     * [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet)
     * is automatically set to false and cannot be set to true.
     */
    @JsonProperty(value = "enableAutomaticOSUpgrade")
    private Boolean enableAutomaticOSUpgrade;

    /*
     * Whether OS image rollback feature should be disabled. Default value is
     * false.
     */
    @JsonProperty(value = "disableAutomaticRollback")
    private Boolean disableAutomaticRollback;

    /**
     * Get the enableAutomaticOSUpgrade property: Indicates whether OS upgrades should automatically be applied to scale
     * set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is
     * false. &lt;br&gt;&lt;br&gt; If this is set to true for Windows based scale sets,
     * [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet)
     * is automatically set to false and cannot be set to true.
     *
     * @return the enableAutomaticOSUpgrade value.
     */
    public Boolean enableAutomaticOSUpgrade() {
        return this.enableAutomaticOSUpgrade;
    }

    /**
     * Set the enableAutomaticOSUpgrade property: Indicates whether OS upgrades should automatically be applied to scale
     * set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is
     * false. &lt;br&gt;&lt;br&gt; If this is set to true for Windows based scale sets,
     * [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet)
     * is automatically set to false and cannot be set to true.
     *
     * @param enableAutomaticOSUpgrade the enableAutomaticOSUpgrade value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withEnableAutomaticOSUpgrade(Boolean enableAutomaticOSUpgrade) {
        this.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
        return this;
    }

    /**
     * Get the disableAutomaticRollback property: Whether OS image rollback feature should be disabled. Default value is
     * false.
     *
     * @return the disableAutomaticRollback value.
     */
    public Boolean disableAutomaticRollback() {
        return this.disableAutomaticRollback;
    }

    /**
     * Set the disableAutomaticRollback property: Whether OS image rollback feature should be disabled. Default value is
     * false.
     *
     * @param disableAutomaticRollback the disableAutomaticRollback value to set.
     * @return the AutomaticOSUpgradePolicy object itself.
     */
    public AutomaticOSUpgradePolicy withDisableAutomaticRollback(Boolean disableAutomaticRollback) {
        this.disableAutomaticRollback = disableAutomaticRollback;
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
