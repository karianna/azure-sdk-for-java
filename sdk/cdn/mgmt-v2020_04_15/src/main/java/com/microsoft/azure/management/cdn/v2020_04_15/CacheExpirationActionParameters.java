/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the parameters for the cache expiration action.
 */
public class CacheExpirationActionParameters {
    /**
     * The odatatype property.
     */
    @JsonProperty(value = "@odata\\.type", required = true)
    private String odatatype;

    /**
     * Caching behavior for the requests. Possible values include:
     * 'BypassCache', 'Override', 'SetIfMissing'.
     */
    @JsonProperty(value = "cacheBehavior", required = true)
    private CacheBehavior cacheBehavior;

    /**
     * The level at which the content needs to be cached.
     */
    @JsonProperty(value = "cacheType", required = true)
    private String cacheType;

    /**
     * The duration for which the content needs to be cached. Allowed format is
     * [d.]hh:mm:ss.
     */
    @JsonProperty(value = "cacheDuration")
    private String cacheDuration;

    /**
     * Creates an instance of CacheExpirationActionParameters class.
     * @param cacheBehavior caching behavior for the requests. Possible values include: 'BypassCache', 'Override', 'SetIfMissing'.
     */
    public CacheExpirationActionParameters() {
        odatatype = "#Microsoft.Azure.Cdn.Models.DeliveryRuleCacheExpirationActionParameters";
        cacheType = "All";
    }

    /**
     * Get the odatatype value.
     *
     * @return the odatatype value
     */
    public String odatatype() {
        return this.odatatype;
    }

    /**
     * Set the odatatype value.
     *
     * @param odatatype the odatatype value to set
     * @return the CacheExpirationActionParameters object itself.
     */
    public CacheExpirationActionParameters withOdatatype(String odatatype) {
        this.odatatype = odatatype;
        return this;
    }

    /**
     * Get caching behavior for the requests. Possible values include: 'BypassCache', 'Override', 'SetIfMissing'.
     *
     * @return the cacheBehavior value
     */
    public CacheBehavior cacheBehavior() {
        return this.cacheBehavior;
    }

    /**
     * Set caching behavior for the requests. Possible values include: 'BypassCache', 'Override', 'SetIfMissing'.
     *
     * @param cacheBehavior the cacheBehavior value to set
     * @return the CacheExpirationActionParameters object itself.
     */
    public CacheExpirationActionParameters withCacheBehavior(CacheBehavior cacheBehavior) {
        this.cacheBehavior = cacheBehavior;
        return this;
    }

    /**
     * Get the level at which the content needs to be cached.
     *
     * @return the cacheType value
     */
    public String cacheType() {
        return this.cacheType;
    }

    /**
     * Set the level at which the content needs to be cached.
     *
     * @param cacheType the cacheType value to set
     * @return the CacheExpirationActionParameters object itself.
     */
    public CacheExpirationActionParameters withCacheType(String cacheType) {
        this.cacheType = cacheType;
        return this;
    }

    /**
     * Get the duration for which the content needs to be cached. Allowed format is [d.]hh:mm:ss.
     *
     * @return the cacheDuration value
     */
    public String cacheDuration() {
        return this.cacheDuration;
    }

    /**
     * Set the duration for which the content needs to be cached. Allowed format is [d.]hh:mm:ss.
     *
     * @param cacheDuration the cacheDuration value to set
     * @return the CacheExpirationActionParameters object itself.
     */
    public CacheExpirationActionParameters withCacheDuration(String cacheDuration) {
        this.cacheDuration = cacheDuration;
        return this;
    }

}
