/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolBlobAuditingPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.BlobAuditingPolicyState;
import java.util.List;
import java.util.UUID;

class SqlPoolBlobAuditingPolicyImpl extends CreatableUpdatableImpl<SqlPoolBlobAuditingPolicy, SqlPoolBlobAuditingPolicyInner, SqlPoolBlobAuditingPolicyImpl> implements SqlPoolBlobAuditingPolicy, SqlPoolBlobAuditingPolicy.Definition, SqlPoolBlobAuditingPolicy.Update {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String sqlPoolName;

    SqlPoolBlobAuditingPolicyImpl(String name, SynapseManager manager) {
        super(name, new SqlPoolBlobAuditingPolicyInner());
        this.manager = manager;
        // Set resource name
        this.sqlPoolName = name;
        //
    }

    SqlPoolBlobAuditingPolicyImpl(SqlPoolBlobAuditingPolicyInner inner, SynapseManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.sqlPoolName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.sqlPoolName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlPools");
        //
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SqlPoolBlobAuditingPolicy> createResourceAsync() {
        SqlPoolBlobAuditingPoliciesInner client = this.manager().inner().sqlPoolBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlPoolBlobAuditingPolicy> updateResourceAsync() {
        SqlPoolBlobAuditingPoliciesInner client = this.manager().inner().sqlPoolBlobAuditingPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlPoolBlobAuditingPolicyInner> getInnerAsync() {
        SqlPoolBlobAuditingPoliciesInner client = this.manager().inner().sqlPoolBlobAuditingPolicies();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.sqlPoolName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<String> auditActionsAndGroups() {
        return this.inner().auditActionsAndGroups();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isAzureMonitorTargetEnabled() {
        return this.inner().isAzureMonitorTargetEnabled();
    }

    @Override
    public Boolean isStorageSecondaryKeyInUse() {
        return this.inner().isStorageSecondaryKeyInUse();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer retentionDays() {
        return this.inner().retentionDays();
    }

    @Override
    public BlobAuditingPolicyState state() {
        return this.inner().state();
    }

    @Override
    public String storageAccountAccessKey() {
        return this.inner().storageAccountAccessKey();
    }

    @Override
    public UUID storageAccountSubscriptionId() {
        return this.inner().storageAccountSubscriptionId();
    }

    @Override
    public String storageEndpoint() {
        return this.inner().storageEndpoint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SqlPoolBlobAuditingPolicyImpl withExistingSqlPool(String resourceGroupName, String workspaceName, String sqlPoolName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.sqlPoolName = sqlPoolName;
        return this;
    }

    @Override
    public SqlPoolBlobAuditingPolicyImpl withState(BlobAuditingPolicyState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public SqlPoolBlobAuditingPolicyImpl withAuditActionsAndGroups(List<String> auditActionsAndGroups) {
        this.inner().withAuditActionsAndGroups(auditActionsAndGroups);
        return this;
    }

    @Override
    public SqlPoolBlobAuditingPolicyImpl withIsAzureMonitorTargetEnabled(Boolean isAzureMonitorTargetEnabled) {
        this.inner().withIsAzureMonitorTargetEnabled(isAzureMonitorTargetEnabled);
        return this;
    }

    @Override
    public SqlPoolBlobAuditingPolicyImpl withIsStorageSecondaryKeyInUse(Boolean isStorageSecondaryKeyInUse) {
        this.inner().withIsStorageSecondaryKeyInUse(isStorageSecondaryKeyInUse);
        return this;
    }

    @Override
    public SqlPoolBlobAuditingPolicyImpl withRetentionDays(Integer retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public SqlPoolBlobAuditingPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.inner().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    @Override
    public SqlPoolBlobAuditingPolicyImpl withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.inner().withStorageAccountSubscriptionId(storageAccountSubscriptionId);
        return this;
    }

    @Override
    public SqlPoolBlobAuditingPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.inner().withStorageEndpoint(storageEndpoint);
        return this;
    }

}
