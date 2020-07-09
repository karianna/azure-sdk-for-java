// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.servicebus.models.NamespaceProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The NamespacePropertiesEntryContent model. */
@JacksonXmlRootElement(localName = "null", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class NamespacePropertiesEntryContent {
    /*
     * Type of content in namespace info response
     */
    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    /*
     * The metadata related to a Service Bus namespace.
     */
    @JacksonXmlProperty(
            localName = "NamespaceInfo",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private NamespaceProperties namespaceProperties;

    /**
     * Get the type property: Type of content in namespace info response.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of content in namespace info response.
     *
     * @param type the type value to set.
     * @return the NamespacePropertiesEntryContent object itself.
     */
    public NamespacePropertiesEntryContent setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the namespaceProperties property: The metadata related to a Service Bus namespace.
     *
     * @return the namespaceProperties value.
     */
    public NamespaceProperties getNamespaceProperties() {
        return this.namespaceProperties;
    }

    /**
     * Set the namespaceProperties property: The metadata related to a Service Bus namespace.
     *
     * @param namespaceProperties the namespaceProperties value to set.
     * @return the NamespacePropertiesEntryContent object itself.
     */
    public NamespacePropertiesEntryContent setNamespaceProperties(NamespaceProperties namespaceProperties) {
        this.namespaceProperties = namespaceProperties;
        return this;
    }
}
