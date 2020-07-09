/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2019_10_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.Subscriptions;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.SubscriptionOperations;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Billing resource management.
 */
public final class BillingManager extends ManagerCore<BillingManager, SubscriptionClientImpl> {
    private Subscriptions subscriptions;
    private SubscriptionOperations subscriptionOperations;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create BillingManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new BillingManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of BillingManager that exposes Billing resource management API entry points.
    *
    * @param credentials the credentials to use
    * @return the BillingManager
    */
    public static BillingManager authenticate(AzureTokenCredentials credentials) {
        return new BillingManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build());
    }
    /**
    * Creates an instance of BillingManager that exposes Billing resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @return the BillingManager
    */
    public static BillingManager authenticate(RestClient restClient) {
        return new BillingManager(restClient);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of BillingManager that exposes Billing management API entry points.
        *
        * @param credentials the credentials to use
        * @return the interface exposing Billing management API entry points that work across subscriptions
        */
        BillingManager authenticate(AzureTokenCredentials credentials);
    }

    /**
     * @return Entry point to manage Subscriptions.
     */
    public Subscriptions subscriptions() {
        if (this.subscriptions == null) {
            this.subscriptions = new SubscriptionsImpl(this);
        }
        return this.subscriptions;
    }

    /**
     * @return Entry point to manage SubscriptionOperations.
     */
    public SubscriptionOperations subscriptionOperations() {
        if (this.subscriptionOperations == null) {
            this.subscriptionOperations = new SubscriptionOperationsImpl(this);
        }
        return this.subscriptionOperations;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public BillingManager authenticate(AzureTokenCredentials credentials) {
           return BillingManager.authenticate(buildRestClient(credentials));
        }
     }
    private BillingManager(RestClient restClient) {
        super(
            restClient,
            null,
            new SubscriptionClientImpl(restClient));
    }
}
