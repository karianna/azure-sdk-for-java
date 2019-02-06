/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import org.joda.time.DateTime;
import java.util.Map;
import com.microsoft.azure.management.automation.v2015_10_31.RunbookAssociationProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Definition of the webhook type.
 */
@JsonFlatten
public class WebhookInner extends ProxyResource {
    /**
     * Gets or sets the value of the enabled flag of the webhook.
     */
    @JsonProperty(value = "properties.isEnabled")
    private Boolean isEnabled;

    /**
     * Gets or sets the webhook uri.
     */
    @JsonProperty(value = "properties.uri")
    private String uri;

    /**
     * Gets or sets the expiry time.
     */
    @JsonProperty(value = "properties.expiryTime")
    private DateTime expiryTime;

    /**
     * Gets or sets the last invoked time.
     */
    @JsonProperty(value = "properties.lastInvokedTime")
    private DateTime lastInvokedTime;

    /**
     * Gets or sets the parameters of the job that is created when the webhook
     * calls the runbook it is associated with.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, String> parameters;

    /**
     * Gets or sets the runbook the webhook is associated with.
     */
    @JsonProperty(value = "properties.runbook")
    private RunbookAssociationProperty runbook;

    /**
     * Gets or sets the name of the hybrid worker group the webhook job will
     * run on.
     */
    @JsonProperty(value = "properties.runOn")
    private String runOn;

    /**
     * Gets or sets the creation time.
     */
    @JsonProperty(value = "properties.creationTime")
    private DateTime creationTime;

    /**
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime")
    private DateTime lastModifiedTime;

    /**
     * Details of the user who last modified the Webhook.
     */
    @JsonProperty(value = "properties.lastModifiedBy")
    private String lastModifiedBy;

    /**
     * Gets or sets the description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get gets or sets the value of the enabled flag of the webhook.
     *
     * @return the isEnabled value
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set gets or sets the value of the enabled flag of the webhook.
     *
     * @param isEnabled the isEnabled value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get gets or sets the webhook uri.
     *
     * @return the uri value
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set gets or sets the webhook uri.
     *
     * @param uri the uri value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get gets or sets the expiry time.
     *
     * @return the expiryTime value
     */
    public DateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set gets or sets the expiry time.
     *
     * @param expiryTime the expiryTime value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withExpiryTime(DateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get gets or sets the last invoked time.
     *
     * @return the lastInvokedTime value
     */
    public DateTime lastInvokedTime() {
        return this.lastInvokedTime;
    }

    /**
     * Set gets or sets the last invoked time.
     *
     * @param lastInvokedTime the lastInvokedTime value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withLastInvokedTime(DateTime lastInvokedTime) {
        this.lastInvokedTime = lastInvokedTime;
        return this;
    }

    /**
     * Get gets or sets the parameters of the job that is created when the webhook calls the runbook it is associated with.
     *
     * @return the parameters value
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

    /**
     * Set gets or sets the parameters of the job that is created when the webhook calls the runbook it is associated with.
     *
     * @param parameters the parameters value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get gets or sets the runbook the webhook is associated with.
     *
     * @return the runbook value
     */
    public RunbookAssociationProperty runbook() {
        return this.runbook;
    }

    /**
     * Set gets or sets the runbook the webhook is associated with.
     *
     * @param runbook the runbook value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withRunbook(RunbookAssociationProperty runbook) {
        this.runbook = runbook;
        return this;
    }

    /**
     * Get gets or sets the name of the hybrid worker group the webhook job will run on.
     *
     * @return the runOn value
     */
    public String runOn() {
        return this.runOn;
    }

    /**
     * Set gets or sets the name of the hybrid worker group the webhook job will run on.
     *
     * @param runOn the runOn value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withRunOn(String runOn) {
        this.runOn = runOn;
        return this;
    }

    /**
     * Get gets or sets the creation time.
     *
     * @return the creationTime value
     */
    public DateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get gets or sets the last modified time.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withLastModifiedTime(DateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get details of the user who last modified the Webhook.
     *
     * @return the lastModifiedBy value
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set details of the user who last modified the Webhook.
     *
     * @param lastModifiedBy the lastModifiedBy value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get gets or sets the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set gets or sets the description.
     *
     * @param description the description value to set
     * @return the WebhookInner object itself.
     */
    public WebhookInner withDescription(String description) {
        this.description = description;
        return this;
    }

}