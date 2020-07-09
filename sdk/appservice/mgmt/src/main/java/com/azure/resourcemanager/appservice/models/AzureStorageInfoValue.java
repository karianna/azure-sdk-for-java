// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureStorageInfoValue model. */
@Fluent
public final class AzureStorageInfoValue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureStorageInfoValue.class);

    /*
     * Type of storage.
     */
    @JsonProperty(value = "type")
    private AzureStorageType type;

    /*
     * Name of the storage account.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /*
     * Name of the file share (container name, for Blob storage).
     */
    @JsonProperty(value = "shareName")
    private String shareName;

    /*
     * Access key for the storage account.
     */
    @JsonProperty(value = "accessKey")
    private String accessKey;

    /*
     * Path to mount the storage within the site's runtime environment.
     */
    @JsonProperty(value = "mountPath")
    private String mountPath;

    /*
     * State of the storage account.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private AzureStorageState state;

    /**
     * Get the type property: Type of storage.
     *
     * @return the type value.
     */
    public AzureStorageType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of storage.
     *
     * @param type the type value to set.
     * @return the AzureStorageInfoValue object itself.
     */
    public AzureStorageInfoValue withType(AzureStorageType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the accountName property: Name of the storage account.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Name of the storage account.
     *
     * @param accountName the accountName value to set.
     * @return the AzureStorageInfoValue object itself.
     */
    public AzureStorageInfoValue withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the shareName property: Name of the file share (container name, for Blob storage).
     *
     * @return the shareName value.
     */
    public String shareName() {
        return this.shareName;
    }

    /**
     * Set the shareName property: Name of the file share (container name, for Blob storage).
     *
     * @param shareName the shareName value to set.
     * @return the AzureStorageInfoValue object itself.
     */
    public AzureStorageInfoValue withShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }

    /**
     * Get the accessKey property: Access key for the storage account.
     *
     * @return the accessKey value.
     */
    public String accessKey() {
        return this.accessKey;
    }

    /**
     * Set the accessKey property: Access key for the storage account.
     *
     * @param accessKey the accessKey value to set.
     * @return the AzureStorageInfoValue object itself.
     */
    public AzureStorageInfoValue withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * Get the mountPath property: Path to mount the storage within the site's runtime environment.
     *
     * @return the mountPath value.
     */
    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Set the mountPath property: Path to mount the storage within the site's runtime environment.
     *
     * @param mountPath the mountPath value to set.
     * @return the AzureStorageInfoValue object itself.
     */
    public AzureStorageInfoValue withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * Get the state property: State of the storage account.
     *
     * @return the state value.
     */
    public AzureStorageState state() {
        return this.state;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
