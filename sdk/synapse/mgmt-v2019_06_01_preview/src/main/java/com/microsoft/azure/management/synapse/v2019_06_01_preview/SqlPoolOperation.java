/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SqlPoolOperationInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;
import org.joda.time.DateTime;

/**
 * Type representing SqlPoolOperation.
 */
public interface SqlPoolOperation extends HasInner<SqlPoolOperationInner>, HasManager<SynapseManager> {
    /**
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the errorCode value.
     */
    Integer errorCode();

    /**
     * @return the errorDescription value.
     */
    String errorDescription();

    /**
     * @return the errorSeverity value.
     */
    Integer errorSeverity();

    /**
     * @return the estimatedCompletionTime value.
     */
    DateTime estimatedCompletionTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isCancellable value.
     */
    Boolean isCancellable();

    /**
     * @return the isUserError value.
     */
    Boolean isUserError();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the operation value.
     */
    String operation();

    /**
     * @return the operationFriendlyName value.
     */
    String operationFriendlyName();

    /**
     * @return the percentComplete value.
     */
    Integer percentComplete();

    /**
     * @return the serverName value.
     */
    String serverName();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the state value.
     */
    ManagementOperationState state();

    /**
     * @return the type value.
     */
    String type();

}
