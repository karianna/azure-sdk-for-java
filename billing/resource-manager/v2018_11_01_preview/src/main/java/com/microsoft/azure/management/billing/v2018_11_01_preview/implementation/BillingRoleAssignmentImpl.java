/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleAssignment;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class BillingRoleAssignmentImpl extends WrapperImpl<BillingRoleAssignmentInner> implements BillingRoleAssignment {
    private final BillingManager manager;
    BillingRoleAssignmentImpl(BillingRoleAssignmentInner inner, BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public String billingRoleAssignmentName() {
        return this.inner().billingRoleAssignmentName();
    }

    @Override
    public String createdByPrincipalId() {
        return this.inner().createdByPrincipalId();
    }

    @Override
    public String createdByPrincipalTenantId() {
        return this.inner().createdByPrincipalTenantId();
    }

    @Override
    public String createdOn() {
        return this.inner().createdOn();
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
    public String principalId() {
        return this.inner().principalId();
    }

    @Override
    public String roleDefinitionName() {
        return this.inner().roleDefinitionName();
    }

    @Override
    public String scope() {
        return this.inner().scope();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}