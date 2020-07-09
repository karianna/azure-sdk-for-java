/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_12_01.SignUpSettings;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.PortalSignupSettings;

class SignUpSettingsImpl extends WrapperImpl<SignUpSettingsInner> implements SignUpSettings {
    private final ApiManagementManager manager;

    SignUpSettingsImpl(ApiManagementManager manager) {
        super(manager.inner().signUpSettings());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName) {
        SignUpSettingsInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName).toCompletable();
    }

    @Override
    public Observable<PortalSignupSettings> getAsync(String resourceGroupName, String serviceName) {
        SignUpSettingsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName)
        .map(new Func1<PortalSignupSettingsInner, PortalSignupSettings>() {
            @Override
            public PortalSignupSettings call(PortalSignupSettingsInner inner) {
                return new PortalSignupSettingsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable updateAsync(String resourceGroupName, String serviceName, PortalSignupSettingsInner parameters, String ifMatch) {
        SignUpSettingsInner client = this.inner();
        return client.updateAsync(resourceGroupName, serviceName, parameters, ifMatch).toCompletable();
    }

    @Override
    public Observable<PortalSignupSettings> createOrUpdateAsync(String resourceGroupName, String serviceName, PortalSignupSettingsInner parameters) {
        SignUpSettingsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, serviceName, parameters)
        .map(new Func1<PortalSignupSettingsInner, PortalSignupSettings>() {
            @Override
            public PortalSignupSettings call(PortalSignupSettingsInner inner) {
                return new PortalSignupSettingsImpl(inner, manager());
            }
        });
    }

}
