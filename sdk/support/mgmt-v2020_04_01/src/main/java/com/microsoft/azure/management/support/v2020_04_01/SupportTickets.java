/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Observable;
import com.microsoft.azure.management.support.v2020_04_01.implementation.SupportTicketsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SupportTickets.
 */
public interface SupportTickets extends SupportsCreating<SupportTicketDetails.DefinitionStages.Blank>, SupportsListing<SupportTicketDetails>, HasInner<SupportTicketsInner> {
    /**
     * Get ticket details for an Azure subscription. Support ticket data is available for 12 months after ticket creation. If a ticket was created more than 12 months ago, a request for data might cause an error.
     *
     * @param supportTicketName Support ticket name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SupportTicketDetails> getAsync(String supportTicketName);

    /**
     * Check the availability of a resource name. This API should be used to check the uniqueness of the name for support ticket creation for the selected subscription.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameAvailabilityOutput> checkNameAvailabilityAsync(CheckNameAvailabilityInput checkNameAvailabilityInput);

}
