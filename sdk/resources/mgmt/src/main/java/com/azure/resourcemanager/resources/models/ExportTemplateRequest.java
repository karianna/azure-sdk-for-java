// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExportTemplateRequest model. */
@Fluent
public final class ExportTemplateRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExportTemplateRequest.class);

    /*
     * The IDs of the resources to filter the export by. To export all
     * resources, supply an array with single entry '*'.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /*
     * The export template options. A CSV-formatted list containing zero or
     * more of the following: 'IncludeParameterDefaultValue',
     * 'IncludeComments', 'SkipResourceNameParameterization',
     * 'SkipAllParameterization'
     */
    @JsonProperty(value = "options")
    private String options;

    /**
     * Get the resources property: The IDs of the resources to filter the export by. To export all resources, supply an
     * array with single entry '*'.
     *
     * @return the resources value.
     */
    public List<String> resources() {
        return this.resources;
    }

    /**
     * Set the resources property: The IDs of the resources to filter the export by. To export all resources, supply an
     * array with single entry '*'.
     *
     * @param resources the resources value to set.
     * @return the ExportTemplateRequest object itself.
     */
    public ExportTemplateRequest withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the options property: The export template options. A CSV-formatted list containing zero or more of the
     * following: 'IncludeParameterDefaultValue', 'IncludeComments', 'SkipResourceNameParameterization',
     * 'SkipAllParameterization'.
     *
     * @return the options value.
     */
    public String options() {
        return this.options;
    }

    /**
     * Set the options property: The export template options. A CSV-formatted list containing zero or more of the
     * following: 'IncludeParameterDefaultValue', 'IncludeComments', 'SkipResourceNameParameterization',
     * 'SkipAllParameterization'.
     *
     * @param options the options value to set.
     * @return the ExportTemplateRequest object itself.
     */
    public ExportTemplateRequest withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
