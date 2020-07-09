// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AutomaticTuningOptions model. */
@Fluent
public final class AutomaticTuningOptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutomaticTuningOptions.class);

    /*
     * Automatic tuning option desired state.
     */
    @JsonProperty(value = "desiredState")
    private AutomaticTuningOptionModeDesired desiredState;

    /*
     * Automatic tuning option actual state.
     */
    @JsonProperty(value = "actualState", access = JsonProperty.Access.WRITE_ONLY)
    private AutomaticTuningOptionModeActual actualState;

    /*
     * Reason code if desired and actual state are different.
     */
    @JsonProperty(value = "reasonCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer reasonCode;

    /*
     * Reason description if desired and actual state are different.
     */
    @JsonProperty(value = "reasonDesc", access = JsonProperty.Access.WRITE_ONLY)
    private AutomaticTuningDisabledReason reasonDesc;

    /**
     * Get the desiredState property: Automatic tuning option desired state.
     *
     * @return the desiredState value.
     */
    public AutomaticTuningOptionModeDesired desiredState() {
        return this.desiredState;
    }

    /**
     * Set the desiredState property: Automatic tuning option desired state.
     *
     * @param desiredState the desiredState value to set.
     * @return the AutomaticTuningOptions object itself.
     */
    public AutomaticTuningOptions withDesiredState(AutomaticTuningOptionModeDesired desiredState) {
        this.desiredState = desiredState;
        return this;
    }

    /**
     * Get the actualState property: Automatic tuning option actual state.
     *
     * @return the actualState value.
     */
    public AutomaticTuningOptionModeActual actualState() {
        return this.actualState;
    }

    /**
     * Get the reasonCode property: Reason code if desired and actual state are different.
     *
     * @return the reasonCode value.
     */
    public Integer reasonCode() {
        return this.reasonCode;
    }

    /**
     * Get the reasonDesc property: Reason description if desired and actual state are different.
     *
     * @return the reasonDesc value.
     */
    public AutomaticTuningDisabledReason reasonDesc() {
        return this.reasonDesc;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
