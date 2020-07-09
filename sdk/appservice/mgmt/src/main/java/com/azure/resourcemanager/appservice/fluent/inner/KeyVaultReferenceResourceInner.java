// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ConfigReferenceLocation;
import com.azure.resourcemanager.appservice.models.ConfigReferenceSource;
import com.azure.resourcemanager.appservice.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.ResolveStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KeyVaultReferenceResource model. */
@JsonFlatten
@Fluent
public class KeyVaultReferenceResourceInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultReferenceResourceInner.class);

    /*
     * The reference property.
     */
    @JsonProperty(value = "properties.reference")
    private String reference;

    /*
     * The status property.
     */
    @JsonProperty(value = "properties.status")
    private ResolveStatus status;

    /*
     * The vaultName property.
     */
    @JsonProperty(value = "properties.vaultName")
    private String vaultName;

    /*
     * The secretName property.
     */
    @JsonProperty(value = "properties.secretName")
    private String secretName;

    /*
     * The secretVersion property.
     */
    @JsonProperty(value = "properties.secretVersion")
    private String secretVersion;

    /*
     * Type of managed service identity.
     */
    @JsonProperty(value = "properties.identityType")
    private ManagedServiceIdentityType identityType;

    /*
     * The details property.
     */
    @JsonProperty(value = "properties.details")
    private String details;

    /*
     * The source property.
     */
    @JsonProperty(value = "properties.source")
    private ConfigReferenceSource source;

    /*
     * The location property.
     */
    @JsonProperty(value = "properties.location")
    private ConfigReferenceLocation location;

    /**
     * Get the reference property: The reference property.
     *
     * @return the reference value.
     */
    public String reference() {
        return this.reference;
    }

    /**
     * Set the reference property: The reference property.
     *
     * @param reference the reference value to set.
     * @return the KeyVaultReferenceResourceInner object itself.
     */
    public KeyVaultReferenceResourceInner withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public ResolveStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the KeyVaultReferenceResourceInner object itself.
     */
    public KeyVaultReferenceResourceInner withStatus(ResolveStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the vaultName property: The vaultName property.
     *
     * @return the vaultName value.
     */
    public String vaultName() {
        return this.vaultName;
    }

    /**
     * Set the vaultName property: The vaultName property.
     *
     * @param vaultName the vaultName value to set.
     * @return the KeyVaultReferenceResourceInner object itself.
     */
    public KeyVaultReferenceResourceInner withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the secretName property: The secretName property.
     *
     * @return the secretName value.
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: The secretName property.
     *
     * @param secretName the secretName value to set.
     * @return the KeyVaultReferenceResourceInner object itself.
     */
    public KeyVaultReferenceResourceInner withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secretVersion property: The secretVersion property.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: The secretVersion property.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the KeyVaultReferenceResourceInner object itself.
     */
    public KeyVaultReferenceResourceInner withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Get the identityType property: Type of managed service identity.
     *
     * @return the identityType value.
     */
    public ManagedServiceIdentityType identityType() {
        return this.identityType;
    }

    /**
     * Set the identityType property: Type of managed service identity.
     *
     * @param identityType the identityType value to set.
     * @return the KeyVaultReferenceResourceInner object itself.
     */
    public KeyVaultReferenceResourceInner withIdentityType(ManagedServiceIdentityType identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * Get the details property: The details property.
     *
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details property: The details property.
     *
     * @param details the details value to set.
     * @return the KeyVaultReferenceResourceInner object itself.
     */
    public KeyVaultReferenceResourceInner withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * Get the source property: The source property.
     *
     * @return the source value.
     */
    public ConfigReferenceSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source property.
     *
     * @param source the source value to set.
     * @return the KeyVaultReferenceResourceInner object itself.
     */
    public KeyVaultReferenceResourceInner withSource(ConfigReferenceSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public ConfigReferenceLocation location() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the KeyVaultReferenceResourceInner object itself.
     */
    public KeyVaultReferenceResourceInner withLocation(ConfigReferenceLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
