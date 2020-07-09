/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_03_01.DatabaseAccountListKeysResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class DatabaseAccountListKeysResultImpl extends WrapperImpl<DatabaseAccountListKeysResultInner> implements DatabaseAccountListKeysResult {
    private final CosmosDBManager manager;
    DatabaseAccountListKeysResultImpl(DatabaseAccountListKeysResultInner inner, CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public String primaryMasterKey() {
        return this.inner().primaryMasterKey();
    }

    @Override
    public String primaryReadonlyMasterKey() {
        return this.inner().primaryReadonlyMasterKey();
    }

    @Override
    public String secondaryMasterKey() {
        return this.inner().secondaryMasterKey();
    }

    @Override
    public String secondaryReadonlyMasterKey() {
        return this.inner().secondaryReadonlyMasterKey();
    }

}
