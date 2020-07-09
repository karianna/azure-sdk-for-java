/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Rule condition of type nat.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleConditionType", defaultImpl = NatRuleCondition.class)
@JsonTypeName("NatRuleCondition")
public class NatRuleCondition extends FirewallPolicyRuleCondition {
    /**
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     */
    @JsonProperty(value = "ipProtocols")
    private List<FirewallPolicyRuleConditionNetworkProtocol> ipProtocols;

    /**
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /**
     * List of destination IP addresses or Service Tags.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /**
     * List of destination ports.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /**
     * List of source IpGroups for this rule.
     */
    @JsonProperty(value = "sourceIpGroups")
    private List<String> sourceIpGroups;

    /**
     * Get array of FirewallPolicyRuleConditionNetworkProtocols.
     *
     * @return the ipProtocols value
     */
    public List<FirewallPolicyRuleConditionNetworkProtocol> ipProtocols() {
        return this.ipProtocols;
    }

    /**
     * Set array of FirewallPolicyRuleConditionNetworkProtocols.
     *
     * @param ipProtocols the ipProtocols value to set
     * @return the NatRuleCondition object itself.
     */
    public NatRuleCondition withIpProtocols(List<FirewallPolicyRuleConditionNetworkProtocol> ipProtocols) {
        this.ipProtocols = ipProtocols;
        return this;
    }

    /**
     * Get list of source IP addresses for this rule.
     *
     * @return the sourceAddresses value
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set list of source IP addresses for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set
     * @return the NatRuleCondition object itself.
     */
    public NatRuleCondition withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get list of destination IP addresses or Service Tags.
     *
     * @return the destinationAddresses value
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set list of destination IP addresses or Service Tags.
     *
     * @param destinationAddresses the destinationAddresses value to set
     * @return the NatRuleCondition object itself.
     */
    public NatRuleCondition withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get list of destination ports.
     *
     * @return the destinationPorts value
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set list of destination ports.
     *
     * @param destinationPorts the destinationPorts value to set
     * @return the NatRuleCondition object itself.
     */
    public NatRuleCondition withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
        return this;
    }

    /**
     * Get list of source IpGroups for this rule.
     *
     * @return the sourceIpGroups value
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups;
    }

    /**
     * Set list of source IpGroups for this rule.
     *
     * @param sourceIpGroups the sourceIpGroups value to set
     * @return the NatRuleCondition object itself.
     */
    public NatRuleCondition withSourceIpGroups(List<String> sourceIpGroups) {
        this.sourceIpGroups = sourceIpGroups;
        return this;
    }

}
