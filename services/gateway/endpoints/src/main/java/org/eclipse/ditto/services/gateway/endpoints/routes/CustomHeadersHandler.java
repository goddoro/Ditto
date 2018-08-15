/*
 * Copyright (c) 2017 Bosch Software Innovations GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/org/documents/epl-2.0/index.php
 *
 * Contributors:
 *    Bosch Software Innovations GmbH - initial contribution
 */
package org.eclipse.ditto.services.gateway.endpoints.routes;

import org.eclipse.ditto.model.base.headers.DittoHeaders;

import akka.http.javadsl.server.RequestContext;

public interface CustomHeadersHandler {

    enum RequestType {
        API,
        WS,
        SSE
    }
    
    DittoHeaders handleCustomHeaders(String correlationId, RequestContext requestContext, RequestType requestType,
            DittoHeaders dittoDefaultHeaders);
}
