/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiReleases;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_12_01.ApiReleaseContract;

class ApiReleasesImpl extends WrapperImpl<ApiReleasesInner> implements ApiReleases {
    private final ApiManagementManager manager;

    ApiReleasesImpl(ApiManagementManager manager) {
        super(manager.inner().apiReleases());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public ApiReleaseContractImpl define(String name) {
        return wrapModel(name);
    }

    private ApiReleaseContractImpl wrapModel(ApiReleaseContractInner inner) {
        return  new ApiReleaseContractImpl(inner, manager());
    }

    private ApiReleaseContractImpl wrapModel(String name) {
        return new ApiReleaseContractImpl(name, this.manager());
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String apiId, String releaseId) {
        ApiReleasesInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, apiId, releaseId).toCompletable();
    }

    @Override
    public Observable<ApiReleaseContract> listByServiceAsync(final String resourceGroupName, final String serviceName, final String apiId) {
        ApiReleasesInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName, apiId)
        .flatMapIterable(new Func1<Page<ApiReleaseContractInner>, Iterable<ApiReleaseContractInner>>() {
            @Override
            public Iterable<ApiReleaseContractInner> call(Page<ApiReleaseContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApiReleaseContractInner, ApiReleaseContract>() {
            @Override
            public ApiReleaseContract call(ApiReleaseContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ApiReleaseContract> getAsync(String resourceGroupName, String serviceName, String apiId, String releaseId) {
        ApiReleasesInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, apiId, releaseId)
        .flatMap(new Func1<ApiReleaseContractInner, Observable<ApiReleaseContract>>() {
            @Override
            public Observable<ApiReleaseContract> call(ApiReleaseContractInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ApiReleaseContract)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String apiId, String releaseId, String ifMatch) {
        ApiReleasesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, apiId, releaseId, ifMatch).toCompletable();
    }

}
