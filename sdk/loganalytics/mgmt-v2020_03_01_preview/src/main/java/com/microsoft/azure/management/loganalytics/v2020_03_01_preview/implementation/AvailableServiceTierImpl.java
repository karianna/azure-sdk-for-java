/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.AvailableServiceTier;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.SkuNameEnum;

class AvailableServiceTierImpl extends WrapperImpl<AvailableServiceTierInner> implements AvailableServiceTier {
    private final LogAnalyticsManager manager;

    AvailableServiceTierImpl(AvailableServiceTierInner inner,  LogAnalyticsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }



    @Override
    public Long capacityReservationLevel() {
        return this.inner().capacityReservationLevel();
    }

    @Override
    public Long defaultRetention() {
        return this.inner().defaultRetention();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public String lastSkuUpdate() {
        return this.inner().lastSkuUpdate();
    }

    @Override
    public Long maximumRetention() {
        return this.inner().maximumRetention();
    }

    @Override
    public Long minimumRetention() {
        return this.inner().minimumRetention();
    }

    @Override
    public SkuNameEnum serviceTier() {
        return this.inner().serviceTier();
    }

}
