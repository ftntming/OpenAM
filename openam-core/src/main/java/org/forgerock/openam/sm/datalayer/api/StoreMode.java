/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2014-2015 ForgeRock AS.
 */
package org.forgerock.openam.sm.datalayer.api;

/**
 * Describe the three possible modes connection states the data store can operate in.
 */
public enum StoreMode {
    /**
     * The data store defers to the Data Layer for standard configuration settings. These may be
     * the internal embedded store, or a configured external store.
     */
    DEFAULT,
    /**
     * The data store is operating in external mode which operates alongside the Data Layer
     * connection to any designated server. The connection details are assumed to be assigned.
     *
     * @see org.forgerock.openam.sm.datalayer.impl.ldap.ExternalLdapConfig
     */
    EXTERNAL
}
