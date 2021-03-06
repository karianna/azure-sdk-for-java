/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for testing all routes.
 */
public class TestAllRoutesInput {
    /**
     * Routing source. Possible values include: 'Invalid', 'DeviceMessages',
     * 'TwinChangeEvents', 'DeviceLifecycleEvents', 'DeviceJobLifecycleEvents'.
     */
    @JsonProperty(value = "routingSource")
    private RoutingSource routingSource;

    /**
     * Routing message.
     */
    @JsonProperty(value = "message")
    private RoutingMessage message;

    /**
     * Routing Twin Reference.
     */
    @JsonProperty(value = "twin")
    private RoutingTwin twin;

    /**
     * Get routing source. Possible values include: 'Invalid', 'DeviceMessages', 'TwinChangeEvents', 'DeviceLifecycleEvents', 'DeviceJobLifecycleEvents'.
     *
     * @return the routingSource value
     */
    public RoutingSource routingSource() {
        return this.routingSource;
    }

    /**
     * Set routing source. Possible values include: 'Invalid', 'DeviceMessages', 'TwinChangeEvents', 'DeviceLifecycleEvents', 'DeviceJobLifecycleEvents'.
     *
     * @param routingSource the routingSource value to set
     * @return the TestAllRoutesInput object itself.
     */
    public TestAllRoutesInput withRoutingSource(RoutingSource routingSource) {
        this.routingSource = routingSource;
        return this;
    }

    /**
     * Get routing message.
     *
     * @return the message value
     */
    public RoutingMessage message() {
        return this.message;
    }

    /**
     * Set routing message.
     *
     * @param message the message value to set
     * @return the TestAllRoutesInput object itself.
     */
    public TestAllRoutesInput withMessage(RoutingMessage message) {
        this.message = message;
        return this;
    }

    /**
     * Get routing Twin Reference.
     *
     * @return the twin value
     */
    public RoutingTwin twin() {
        return this.twin;
    }

    /**
     * Set routing Twin Reference.
     *
     * @param twin the twin value to set
     * @return the TestAllRoutesInput object itself.
     */
    public TestAllRoutesInput withTwin(RoutingTwin twin) {
        this.twin = twin;
        return this;
    }

}
