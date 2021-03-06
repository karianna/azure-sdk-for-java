// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.webkey;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for JsonWebKeyCurveName.
 */
public final class JsonWebKeyCurveName {
    /** Static value P-256 for JsonWebKeyCurveName. */
    public static final JsonWebKeyCurveName P_256 = new JsonWebKeyCurveName("P-256");

    /** Static value P-384 for JsonWebKeyCurveName. */
    public static final JsonWebKeyCurveName P_384 = new JsonWebKeyCurveName("P-384");

    /** Static value P-521 for JsonWebKeyCurveName. */
    public static final JsonWebKeyCurveName P_521 = new JsonWebKeyCurveName("P-521");

    /** Static value SECP256K1 for JsonWebKeyCurveName. */
    public static final JsonWebKeyCurveName P_256K = new JsonWebKeyCurveName("P-256K");

    private String value;

    /**
     * Creates a custom value for JsonWebKeyCurveName.
     * @param value the custom value
     */
    public JsonWebKeyCurveName(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof JsonWebKeyCurveName)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        JsonWebKeyCurveName rhs = (JsonWebKeyCurveName) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
