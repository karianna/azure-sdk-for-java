/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SqlPoolOperationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SqlPoolOperations.
 */
public interface SqlPoolOperations extends HasInner<SqlPoolOperationsInner> {
    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SqlPoolOperation> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName);

}
