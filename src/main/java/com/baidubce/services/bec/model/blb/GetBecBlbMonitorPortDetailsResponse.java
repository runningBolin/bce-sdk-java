/*
 * Copyright (c) 2020 Baidu.com, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.bec.model.blb;

import com.baidubce.model.AbstractBceResponse;
import lombok.Data;

/**
 * The response for getting the BEC blb monitor port details.
 */
@Data
public class GetBecBlbMonitorPortDetailsResponse extends AbstractBceResponse {

    /**
     * Load balancing port.
     */
    private Port frontendPort;

    /**
     * Backend port.
     */
    private int backendPort;

    /**
     * Forwarding rules.
     */
    private String lbMode;

    /**
     * Health check settings.
     */
    private HealthCheck healthCheck;
}