/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
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
package com.baidubce.services.iotshc.model.mqtt;

import com.baidubce.model.GenericAccountRequest;
import com.baidubce.services.iotshc.utils.CommonUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * get device mqtt connection information request
 */
@Getter
public class GetMqttInfoRequest extends GenericAccountRequest {

    private String fc;
    private String pk;
    private String ak;
    private String signature;
    @JsonProperty(value = "time_stamp")
    private long timestamp;

    public GetMqttInfoRequest(String fc, String pk, String ak, String sk) {
        this.fc = fc;
        this.pk = pk;
        this.ak = ak;
        this.timestamp = CommonUtils.getCurrentTimeMinutes();
        this.signature = CommonUtils.getSignature(ak, timestamp, sk);
    }
}
