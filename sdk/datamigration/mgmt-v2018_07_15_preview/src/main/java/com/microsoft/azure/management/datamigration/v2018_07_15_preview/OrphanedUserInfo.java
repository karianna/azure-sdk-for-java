/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information of orphaned users on the SQL server database.
 */
public class OrphanedUserInfo {
    /**
     * Name of the orphaned user.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Parent database of the user.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * Get name of the orphaned user.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the orphaned user.
     *
     * @param name the name value to set
     * @return the OrphanedUserInfo object itself.
     */
    public OrphanedUserInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get parent database of the user.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set parent database of the user.
     *
     * @param databaseName the databaseName value to set
     * @return the OrphanedUserInfo object itself.
     */
    public OrphanedUserInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

}
