// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedServerCreateMode. */
public final class ManagedServerCreateMode extends ExpandableStringEnum<ManagedServerCreateMode> {
    /** Static value Default for ManagedServerCreateMode. */
    public static final ManagedServerCreateMode DEFAULT = fromString("Default");

    /** Static value PointInTimeRestore for ManagedServerCreateMode. */
    public static final ManagedServerCreateMode POINT_IN_TIME_RESTORE = fromString("PointInTimeRestore");

    /**
     * Creates or finds a ManagedServerCreateMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedServerCreateMode.
     */
    @JsonCreator
    public static ManagedServerCreateMode fromString(String name) {
        return fromString(name, ManagedServerCreateMode.class);
    }

    /** @return known ManagedServerCreateMode values. */
    public static Collection<ManagedServerCreateMode> values() {
        return values(ManagedServerCreateMode.class);
    }
}
