/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.IntegrationRuntimeConnectionInfosInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing IntegrationRuntimeConnectionInfos.
 */
public interface IntegrationRuntimeConnectionInfos extends HasInner<IntegrationRuntimeConnectionInfosInner> {
    /**
     * Get integration runtime connection info.
     * Get connection info for an integration runtime.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param integrationRuntimeName Integration runtime name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationRuntimeConnectionInfo> getAsync(String resourceGroupName, String workspaceName, String integrationRuntimeName);

}
