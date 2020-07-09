// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for IpFilterTag. */
public enum IpFilterTag {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value XffProxy. */
    XFF_PROXY("XffProxy");

    /** The actual serialized value for a IpFilterTag instance. */
    private final String value;

    IpFilterTag(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a IpFilterTag instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed IpFilterTag object, or null if unable to parse.
     */
    @JsonCreator
    public static IpFilterTag fromString(String value) {
        IpFilterTag[] items = IpFilterTag.values();
        for (IpFilterTag item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
