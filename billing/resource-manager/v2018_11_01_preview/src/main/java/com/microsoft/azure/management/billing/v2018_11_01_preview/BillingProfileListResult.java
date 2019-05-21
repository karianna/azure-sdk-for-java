/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingProfileListResultInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingProfileInner;
import java.util.List;

/**
 * Type representing BillingProfileListResult.
 */
public interface BillingProfileListResult extends HasInner<BillingProfileListResultInner>, HasManager<BillingManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<BillingProfileInner> value();

}