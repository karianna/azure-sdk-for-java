/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HTTP configuration of the connectivity check.
 */
public class HTTPConfiguration {
    /**
     * HTTP method. Possible values include: 'Get'.
     */
    @JsonProperty(value = "method")
    private HTTPMethod method;

    /**
     * List of HTTP headers.
     */
    @JsonProperty(value = "headers")
    private List<HTTPHeader> headers;

    /**
     * Valid status codes.
     */
    @JsonProperty(value = "validStatusCodes")
    private List<Integer> validStatusCodes;

    /**
     * Get hTTP method. Possible values include: 'Get'.
     *
     * @return the method value
     */
    public HTTPMethod method() {
        return this.method;
    }

    /**
     * Set hTTP method. Possible values include: 'Get'.
     *
     * @param method the method value to set
     * @return the HTTPConfiguration object itself.
     */
    public HTTPConfiguration withMethod(HTTPMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get list of HTTP headers.
     *
     * @return the headers value
     */
    public List<HTTPHeader> headers() {
        return this.headers;
    }

    /**
     * Set list of HTTP headers.
     *
     * @param headers the headers value to set
     * @return the HTTPConfiguration object itself.
     */
    public HTTPConfiguration withHeaders(List<HTTPHeader> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get valid status codes.
     *
     * @return the validStatusCodes value
     */
    public List<Integer> validStatusCodes() {
        return this.validStatusCodes;
    }

    /**
     * Set valid status codes.
     *
     * @param validStatusCodes the validStatusCodes value to set
     * @return the HTTPConfiguration object itself.
     */
    public HTTPConfiguration withValidStatusCodes(List<Integer> validStatusCodes) {
        this.validStatusCodes = validStatusCodes;
        return this;
    }

}
