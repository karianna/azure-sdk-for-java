/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ODataAadServicePrincipalCredentialType.
 */
public final class ODataAadServicePrincipalCredentialType extends ExpandableStringEnum<ODataAadServicePrincipalCredentialType> {
    /** Static value ServicePrincipalKey for ODataAadServicePrincipalCredentialType. */
    public static final ODataAadServicePrincipalCredentialType SERVICE_PRINCIPAL_KEY = fromString("ServicePrincipalKey");

    /** Static value ServicePrincipalCert for ODataAadServicePrincipalCredentialType. */
    public static final ODataAadServicePrincipalCredentialType SERVICE_PRINCIPAL_CERT = fromString("ServicePrincipalCert");

    /**
     * Creates or finds a ODataAadServicePrincipalCredentialType from its string representation.
     * @param name a name to look for
     * @return the corresponding ODataAadServicePrincipalCredentialType
     */
    @JsonCreator
    public static ODataAadServicePrincipalCredentialType fromString(String name) {
        return fromString(name, ODataAadServicePrincipalCredentialType.class);
    }

    /**
     * @return known ODataAadServicePrincipalCredentialType values
     */
    public static Collection<ODataAadServicePrincipalCredentialType> values() {
        return values(ODataAadServicePrincipalCredentialType.class);
    }
}
