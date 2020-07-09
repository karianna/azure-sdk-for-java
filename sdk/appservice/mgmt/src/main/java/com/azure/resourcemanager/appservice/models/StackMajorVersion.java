// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The StackMajorVersion model. */
@Fluent
public final class StackMajorVersion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StackMajorVersion.class);

    /*
     * Application stack major version (display only).
     */
    @JsonProperty(value = "displayVersion")
    private String displayVersion;

    /*
     * Application stack major version (runtime only).
     */
    @JsonProperty(value = "runtimeVersion")
    private String runtimeVersion;

    /*
     * <code>true</code> if this is the default major version; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /*
     * Minor versions associated with the major version.
     */
    @JsonProperty(value = "minorVersions")
    private List<StackMinorVersion> minorVersions;

    /*
     * <code>true</code> if this supports Application Insights; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "applicationInsights")
    private Boolean applicationInsights;

    /*
     * <code>true</code> if this stack is in Preview, otherwise
     * <code>false</code>.
     */
    @JsonProperty(value = "isPreview")
    private Boolean isPreview;

    /*
     * <code>true</code> if this stack has been deprecated, otherwise
     * <code>false</code>.
     */
    @JsonProperty(value = "isDeprecated")
    private Boolean isDeprecated;

    /*
     * <code>true</code> if this stack should be hidden for new customers on
     * portal, otherwise <code>false</code>.
     */
    @JsonProperty(value = "isHidden")
    private Boolean isHidden;

    /**
     * Get the displayVersion property: Application stack major version (display only).
     *
     * @return the displayVersion value.
     */
    public String displayVersion() {
        return this.displayVersion;
    }

    /**
     * Set the displayVersion property: Application stack major version (display only).
     *
     * @param displayVersion the displayVersion value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withDisplayVersion(String displayVersion) {
        this.displayVersion = displayVersion;
        return this;
    }

    /**
     * Get the runtimeVersion property: Application stack major version (runtime only).
     *
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: Application stack major version (runtime only).
     *
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the isDefault property: &lt;code&gt;true&lt;/code&gt; if this is the default major version; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: &lt;code&gt;true&lt;/code&gt; if this is the default major version; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isDefault the isDefault value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the minorVersions property: Minor versions associated with the major version.
     *
     * @return the minorVersions value.
     */
    public List<StackMinorVersion> minorVersions() {
        return this.minorVersions;
    }

    /**
     * Set the minorVersions property: Minor versions associated with the major version.
     *
     * @param minorVersions the minorVersions value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withMinorVersions(List<StackMinorVersion> minorVersions) {
        this.minorVersions = minorVersions;
        return this;
    }

    /**
     * Get the applicationInsights property: &lt;code&gt;true&lt;/code&gt; if this supports Application Insights;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the applicationInsights value.
     */
    public Boolean applicationInsights() {
        return this.applicationInsights;
    }

    /**
     * Set the applicationInsights property: &lt;code&gt;true&lt;/code&gt; if this supports Application Insights;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param applicationInsights the applicationInsights value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withApplicationInsights(Boolean applicationInsights) {
        this.applicationInsights = applicationInsights;
        return this;
    }

    /**
     * Get the isPreview property: &lt;code&gt;true&lt;/code&gt; if this stack is in Preview, otherwise
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: &lt;code&gt;true&lt;/code&gt; if this stack is in Preview, otherwise
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isPreview the isPreview value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
        return this;
    }

    /**
     * Get the isDeprecated property: &lt;code&gt;true&lt;/code&gt; if this stack has been deprecated, otherwise
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDeprecated value.
     */
    public Boolean isDeprecated() {
        return this.isDeprecated;
    }

    /**
     * Set the isDeprecated property: &lt;code&gt;true&lt;/code&gt; if this stack has been deprecated, otherwise
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isDeprecated the isDeprecated value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withIsDeprecated(Boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
        return this;
    }

    /**
     * Get the isHidden property: &lt;code&gt;true&lt;/code&gt; if this stack should be hidden for new customers on
     * portal, otherwise &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isHidden value.
     */
    public Boolean isHidden() {
        return this.isHidden;
    }

    /**
     * Set the isHidden property: &lt;code&gt;true&lt;/code&gt; if this stack should be hidden for new customers on
     * portal, otherwise &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isHidden the isHidden value to set.
     * @return the StackMajorVersion object itself.
     */
    public StackMajorVersion withIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (minorVersions() != null) {
            minorVersions().forEach(e -> e.validate());
        }
    }
}
