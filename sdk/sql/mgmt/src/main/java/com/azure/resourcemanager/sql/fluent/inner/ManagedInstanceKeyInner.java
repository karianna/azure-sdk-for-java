// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.ServerKeyType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ManagedInstanceKey model. */
@JsonFlatten
@Fluent
public class ManagedInstanceKeyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedInstanceKeyInner.class);

    /*
     * Kind of encryption protector. This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * The key type like 'ServiceManaged', 'AzureKeyVault'.
     */
    @JsonProperty(value = "properties.serverKeyType")
    private ServerKeyType serverKeyType;

    /*
     * The URI of the key. If the ServerKeyType is AzureKeyVault, then the URI
     * is required.
     */
    @JsonProperty(value = "properties.uri")
    private String uri;

    /*
     * Thumbprint of the key.
     */
    @JsonProperty(value = "properties.thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * The key creation date.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /**
     * Get the kind property: Kind of encryption protector. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the serverKeyType property: The key type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @return the serverKeyType value.
     */
    public ServerKeyType serverKeyType() {
        return this.serverKeyType;
    }

    /**
     * Set the serverKeyType property: The key type like 'ServiceManaged', 'AzureKeyVault'.
     *
     * @param serverKeyType the serverKeyType value to set.
     * @return the ManagedInstanceKeyInner object itself.
     */
    public ManagedInstanceKeyInner withServerKeyType(ServerKeyType serverKeyType) {
        this.serverKeyType = serverKeyType;
        return this;
    }

    /**
     * Get the uri property: The URI of the key. If the ServerKeyType is AzureKeyVault, then the URI is required.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI of the key. If the ServerKeyType is AzureKeyVault, then the URI is required.
     *
     * @param uri the uri value to set.
     * @return the ManagedInstanceKeyInner object itself.
     */
    public ManagedInstanceKeyInner withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the thumbprint property: Thumbprint of the key.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the creationDate property: The key creation date.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
