/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ApplicationGatewayPrivateLinkResources.
 */
public class ApplicationGatewayPrivateLinkResourcesInner {
    /** The Retrofit service to perform REST calls. */
    private ApplicationGatewayPrivateLinkResourcesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of ApplicationGatewayPrivateLinkResourcesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ApplicationGatewayPrivateLinkResourcesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(ApplicationGatewayPrivateLinkResourcesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ApplicationGatewayPrivateLinkResources to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ApplicationGatewayPrivateLinkResourcesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_05_01.ApplicationGatewayPrivateLinkResources list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/applicationGateways/{applicationGatewayName}/privateLinkResources")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("applicationGatewayName") String applicationGatewayName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2020_05_01.ApplicationGatewayPrivateLinkResources listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ApplicationGatewayPrivateLinkResourceInner&gt; object if successful.
     */
    public PagedList<ApplicationGatewayPrivateLinkResourceInner> list(final String resourceGroupName, final String applicationGatewayName) {
        ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>> response = listSinglePageAsync(resourceGroupName, applicationGatewayName).toBlocking().single();
        return new PagedList<ApplicationGatewayPrivateLinkResourceInner>(response.body()) {
            @Override
            public Page<ApplicationGatewayPrivateLinkResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ApplicationGatewayPrivateLinkResourceInner>> listAsync(final String resourceGroupName, final String applicationGatewayName, final ListOperationCallback<ApplicationGatewayPrivateLinkResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, applicationGatewayName),
            new Func1<String, Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationGatewayPrivateLinkResourceInner&gt; object
     */
    public Observable<Page<ApplicationGatewayPrivateLinkResourceInner>> listAsync(final String resourceGroupName, final String applicationGatewayName) {
        return listWithServiceResponseAsync(resourceGroupName, applicationGatewayName)
            .map(new Func1<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>, Page<ApplicationGatewayPrivateLinkResourceInner>>() {
                @Override
                public Page<ApplicationGatewayPrivateLinkResourceInner> call(ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationGatewayPrivateLinkResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String applicationGatewayName) {
        return listSinglePageAsync(resourceGroupName, applicationGatewayName)
            .concatMap(new Func1<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>, Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> call(ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all private link resources on an application gateway.
     *
    ServiceResponse<PageImpl<ApplicationGatewayPrivateLinkResourceInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<ApplicationGatewayPrivateLinkResourceInner>> * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ApplicationGatewayPrivateLinkResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> listSinglePageAsync(final String resourceGroupName, final String applicationGatewayName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (applicationGatewayName == null) {
            throw new IllegalArgumentException("Parameter applicationGatewayName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2020-05-01";
        return service.list(resourceGroupName, applicationGatewayName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ApplicationGatewayPrivateLinkResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ApplicationGatewayPrivateLinkResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ApplicationGatewayPrivateLinkResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ApplicationGatewayPrivateLinkResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ApplicationGatewayPrivateLinkResourceInner&gt; object if successful.
     */
    public PagedList<ApplicationGatewayPrivateLinkResourceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ApplicationGatewayPrivateLinkResourceInner>(response.body()) {
            @Override
            public Page<ApplicationGatewayPrivateLinkResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ApplicationGatewayPrivateLinkResourceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ApplicationGatewayPrivateLinkResourceInner>> serviceFuture, final ListOperationCallback<ApplicationGatewayPrivateLinkResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationGatewayPrivateLinkResourceInner&gt; object
     */
    public Observable<Page<ApplicationGatewayPrivateLinkResourceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>, Page<ApplicationGatewayPrivateLinkResourceInner>>() {
                @Override
                public Page<ApplicationGatewayPrivateLinkResourceInner> call(ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all private link resources on an application gateway.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ApplicationGatewayPrivateLinkResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>, Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> call(ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all private link resources on an application gateway.
     *
    ServiceResponse<PageImpl<ApplicationGatewayPrivateLinkResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ApplicationGatewayPrivateLinkResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ApplicationGatewayPrivateLinkResourceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ApplicationGatewayPrivateLinkResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ApplicationGatewayPrivateLinkResourceInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ApplicationGatewayPrivateLinkResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ApplicationGatewayPrivateLinkResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
