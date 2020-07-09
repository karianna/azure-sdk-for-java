/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.GatewayHostnameConfigurationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing GatewayHostnameConfigurations.
 */
public interface GatewayHostnameConfigurations extends SupportsCreating<GatewayHostnameConfigurationContract.DefinitionStages.Blank>, HasInner<GatewayHostnameConfigurationsInner> {
    /**
     * Checks that hostname configuration entity specified by identifier exists for specified Gateway entity.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
     * @param hcId Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEntityTagAsync(String resourceGroupName, String serviceName, String gatewayId, String hcId);

    /**
     * Gets the details of the Gateway hostname configuration specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
     * @param hcId Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GatewayHostnameConfigurationContract> getAsync(String resourceGroupName, String serviceName, String gatewayId, String hcId);

    /**
     * Lists the collection of hostname configurations for the specified gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<GatewayHostnameConfigurationContract> listByServiceAsync(final String resourceGroupName, final String serviceName, final String gatewayId);

    /**
     * Deletes the specified hostname configuration from the specified Gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param gatewayId Gateway entity identifier. Must be unique in the current API Management service instance. Must not have value 'managed'
     * @param hcId Gateway hostname configuration identifier. Must be unique in the scope of parent Gateway entity.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String gatewayId, String hcId);

}
