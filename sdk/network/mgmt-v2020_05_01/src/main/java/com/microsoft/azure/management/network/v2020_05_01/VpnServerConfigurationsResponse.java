/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.VpnServerConfigurationsResponseInner;
import java.util.List;

/**
 * Type representing VpnServerConfigurationsResponse.
 */
public interface VpnServerConfigurationsResponse extends HasInner<VpnServerConfigurationsResponseInner>, HasManager<NetworkManager> {
    /**
     * @return the vpnServerConfigurationResourceIds value.
     */
    List<String> vpnServerConfigurationResourceIds();

}
