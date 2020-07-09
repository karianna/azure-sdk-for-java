/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB Gremlin database resource object.
 */
public class GremlinDatabaseResource {
    /**
     * Name of the Cosmos DB Gremlin database.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get name of the Cosmos DB Gremlin database.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB Gremlin database.
     *
     * @param id the id value to set
     * @return the GremlinDatabaseResource object itself.
     */
    public GremlinDatabaseResource withId(String id) {
        this.id = id;
        return this;
    }

}
