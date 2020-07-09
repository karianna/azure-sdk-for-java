/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.BgpPeerStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for list BGP peer status API service call.
 */
public class BgpPeerStatusListResultInner {
    /**
     * List of BGP peers.
     */
    @JsonProperty(value = "value")
    private List<BgpPeerStatus> value;

    /**
     * Get list of BGP peers.
     *
     * @return the value value
     */
    public List<BgpPeerStatus> value() {
        return this.value;
    }

    /**
     * Set list of BGP peers.
     *
     * @param value the value value to set
     * @return the BgpPeerStatusListResultInner object itself.
     */
    public BgpPeerStatusListResultInner withValue(List<BgpPeerStatus> value) {
        this.value = value;
        return this;
    }

}
