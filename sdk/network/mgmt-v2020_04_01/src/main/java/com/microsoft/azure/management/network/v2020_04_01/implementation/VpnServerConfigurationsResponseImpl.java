/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.management.network.v2020_04_01.VpnServerConfigurationsResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class VpnServerConfigurationsResponseImpl extends WrapperImpl<VpnServerConfigurationsResponseInner> implements VpnServerConfigurationsResponse {
    private final NetworkManager manager;
    VpnServerConfigurationsResponseImpl(VpnServerConfigurationsResponseInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<String> vpnServerConfigurationResourceIds() {
        return this.inner().vpnServerConfigurationResourceIds();
    }

}
