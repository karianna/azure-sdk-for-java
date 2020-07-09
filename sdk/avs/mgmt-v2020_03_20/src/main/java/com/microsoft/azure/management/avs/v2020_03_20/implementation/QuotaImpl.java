/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20.implementation;

import com.microsoft.azure.management.avs.v2020_03_20.Quota;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;
import com.microsoft.azure.management.avs.v2020_03_20.QuotaEnabled;

class QuotaImpl extends WrapperImpl<QuotaInner> implements Quota {
    private final AVSManager manager;
    QuotaImpl(QuotaInner inner, AVSManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AVSManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, Integer> hostsRemaining() {
        return this.inner().hostsRemaining();
    }

    @Override
    public QuotaEnabled quotaEnabled() {
        return this.inner().quotaEnabled();
    }

}
