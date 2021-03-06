/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31.implementation;

import com.microsoft.azure.management.costmanagement.v2018_05_31.ReportConfig;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.costmanagement.v2018_05_31.ReportConfigSchedule;
import com.microsoft.azure.management.costmanagement.v2018_05_31.FormatType;
import com.microsoft.azure.management.costmanagement.v2018_05_31.ReportConfigDeliveryInfo;
import com.microsoft.azure.management.costmanagement.v2018_05_31.ReportConfigDefinition;

class ReportConfigImpl extends CreatableUpdatableImpl<ReportConfig, ReportConfigInner, ReportConfigImpl> implements ReportConfig, ReportConfig.Definition, ReportConfig.Update {
    private String resourceGroupName;
    private String reportConfigName;
    private final CostManagementManager manager;

    ReportConfigImpl(String name, CostManagementManager manager) {
        super(name, new ReportConfigInner());
        this.manager = manager;
        // Set resource name
        this.reportConfigName = name;
        //
    }

    ReportConfigImpl(ReportConfigInner inner, CostManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.reportConfigName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.reportConfigName = IdParsingUtils.getValueFromIdByName(inner.id(), "reportconfigs");
        // set other parameters for create and update
    }

    @Override
    public CostManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ReportConfig> createResourceAsync() {
        ReportConfigsInner client = this.manager().inner().reportConfigs();
        return client.createOrUpdateByResourceGroupNameAsync(this.resourceGroupName, this.reportConfigName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ReportConfig> updateResourceAsync() {
        ReportConfigsInner client = this.manager().inner().reportConfigs();
        return client.createOrUpdateByResourceGroupNameAsync(this.resourceGroupName, this.reportConfigName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ReportConfigInner> getInnerAsync() {
        ReportConfigsInner client = this.manager().inner().reportConfigs();
        return client.getByResourceGroupAsync(this.resourceGroupName, this.reportConfigName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ReportConfigDefinition definition() {
        return this.inner().definition();
    }

    @Override
    public ReportConfigDeliveryInfo deliveryInfo() {
        return this.inner().deliveryInfo();
    }

    @Override
    public FormatType format() {
        return this.inner().format();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ReportConfigSchedule schedule() {
        return this.inner().schedule();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().tags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ReportConfigImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public ReportConfigImpl withDefinition(ReportConfigDefinition definition) {
        this.inner().withDefinition(definition);
        return this;
    }

    @Override
    public ReportConfigImpl withDeliveryInfo(ReportConfigDeliveryInfo deliveryInfo) {
        this.inner().withDeliveryInfo(deliveryInfo);
        return this;
    }

    @Override
    public ReportConfigImpl withFormat(FormatType format) {
        this.inner().withFormat(format);
        return this;
    }

    @Override
    public ReportConfigImpl withSchedule(ReportConfigSchedule schedule) {
        this.inner().withSchedule(schedule);
        return this;
    }

}
