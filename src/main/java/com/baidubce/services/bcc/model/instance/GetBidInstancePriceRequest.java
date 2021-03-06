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
package com.baidubce.services.bcc.model.instance;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.services.bcc.model.CreateCdsModel;
import com.baidubce.services.bcc.model.TagModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * The request for getting bid instance price.
 */
public class GetBidInstancePriceRequest extends AbstractBceRequest {

    /**
     * An ASCII string whose length is less than 64.
     * <p>
     * The request will be idempotent if clientToken is provided.
     * If the clientToken is not specified by the user, a random String generated by default algorithm will be used.
     * See more detail at
     * <a href = "https://bce.baidu.com/doc/BCC/API.html#.E5.B9.82.E7.AD.89.E6.80.A7">
     * BCE API doc</a>
     * When creating the storage optimized instance, one ephemeral disk must be created together.
     */
    @JsonIgnore
    private String clientToken;

    /**
     * The parameter to specified which kind of instance to be queried, there is default value when null.
     * see all of supported instance type in {@link com.baidubce.services.bcc.model.instance.InstanceType}
     */
    private String instanceType;

    /**
     * The parameter to specified the cpu core to the instance which is to be queried.
     */
    private int cpuCount;

    /**
     * The parameter to specified the capacity of memory in GB to the instance which is to be queried.
     */
    private int memoryCapacityInGB;

    /**
     * The parameter to specify the root disk size in GB.The root disk excludes the system disk, available is 40-500GB.
     */
    private int rootDiskSizeInGb;

    /**
     * The parameter to specify the root disk storage type. Default use of HP1 cloud disk.
     */
    private String rootDiskStorageType;

    /**
     * The optional list of volume detail info to query.
     */
    private List<CreateCdsModel> createCdsList;

    /**
     * The number of instance to query, the default value is 1.
     */
    private int purchaseCount = 1;

    /**
     * The optional parameter to desc the instance that will be query.
     */
    private String name;

    /**
     * The optional parameter to specify the password for the instance.
     * <p>
     * If specify the adminPass,the adminPass must be a 8-16 characters String which must
     * contains letters,numbers and symbols. The symbols only contains "!@#$%^*()".
     * The adminPass will be encrypted in AES-128 algorithm
     * with the substring of the former 16 characters of user SecretKey.
     * <p>
     * If not specify the adminPass, it will be specified by an random string.
     * See more detail on
     * <a href = "https://bce.baidu.com/doc/BCC/API.html#.7A.E6.31.D8.94.C1.A1.C2.1A.8D.92.ED.7F.60.7D.AF">
     * BCE API doc</a>
     */
    private String adminPass;

    /**
     * The id of the keypair
     */
    private String keypairId;

    /**
     * The id of asp
     */
    private String aspId;

    /**
     * The id of image,list all available image
     * in {@link com.baidubce.services.bcc.BccClient#listImages()}
     */
    private String imageId;

    /**
     * Specified the bidding model
     */
    private String bidModel;

    /**
     * Specified the bidding price
     */
    private String bidPrice;

    /**
     * The optional parameter to specify the bandwidth in Mbps for the instance to be queried.
     * <p>
     * It must among 0 and 200,default value is 0.
     * If it's specified to 0, it will get the internal ip address only.
     */
    private int networkCapacityInMbps = 0;

    /**
     * Indicates whether the tag is bound to all relation instances.
     */
    private boolean relationTag;

    /**
     * The list of tag to be bonded.
     */
    private List<TagModel> tags;

    /**
     * specify the securityGroupId of the instance to be queried, optional param
     * vpcId of the securityGroupId must be the same as the vpcId of subnetId
     * through listSecurityGroups, we can get all securityGroup info at current region
     */
    private String securityGroupId;

    /**
     * the id of subnet from vpc, optional param, default value is default subnet from default vpc
     */
    private String subnetId;

    /**
     * the name of available zone, optional param
     * through listZones, we can get all available zone info at current region
     * e.g. "cn-gz-a"  "cn-gz-b"
     */
    private String zoneName;

    /**
     * Specified the internet charge type
     */
    private String internetChargeType;

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * Configure optional client token for the request. The request will be idempotent if client token is provided.
     * If the clientToken is not specified by the user, a random String generated by default algorithm will be used.
     *
     * @param clientToken An ASCII string whose length is less than 64.
     *                    See more detail at
     *                    <a href = "https://bce.baidu.com/doc/BCC/API.html#.E5.B9.82.E7.AD.89.E6.80.A7">
     *                    BCE API doc</a>
     * @return GetBidInstancePriceRequest with specific clientToken
     */
    public GetBidInstancePriceRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * Configure instanceType for the request.
     *
     * @param instanceType The specified Specification to create the instance.
     *                     See more detail on
     *                     <a href = "https://bce.baidu.com/doc/BCC/API.html#.E5.AE.9E.E4.BE.8B.E5.A5.97.E9.A4.90.E8.A7.84.E6.A0.BC">
     *                     BCE API doc</a>
     * @return GetBidInstancePriceRequest with specific instanceType
     */
    public GetBidInstancePriceRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public void setCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * Configure cpuCount for the request.
     *
     * @param cpuCount The parameter to specified the cpu core to the instance which is to be queried.
     * @return GetBidInstancePriceRequest with specific cpuCount
     */
    public GetBidInstancePriceRequest withCpuCount(int cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }

    public int getMemoryCapacityInGB() {
        return memoryCapacityInGB;
    }

    public void setMemoryCapacityInGB(int memoryCapacityInGB) {
        this.memoryCapacityInGB = memoryCapacityInGB;
    }

    /**
     * Configure memoryCapacityInGB for the request.
     *
     * @param memoryCapacityInGB The parameter to specified the capacity of memory in GB to the instance
     *                           which is to be queried.
     * @return GetBidInstancePriceRequest with specific memoryCapacityInGB
     */
    public GetBidInstancePriceRequest withMemoryCapacityInGB(int memoryCapacityInGB) {
        this.memoryCapacityInGB = memoryCapacityInGB;
        return this;
    }

    public int getRootDiskSizeInGb() {
        return rootDiskSizeInGb;
    }

    public void setRootDiskSizeInGb(int rootDiskSizeInGb) {
        this.rootDiskSizeInGb = rootDiskSizeInGb;
    }

    /**
     * Configure rootDiskSizeInGb for the request.
     *
     * @param rootDiskSizeInGb The parameter to specify the root disk size in GB.
     *                         The root disk excludes the system disk, available is 40-500GB.
     * @return GetBidInstancePriceRequest with specific rootDiskSizeInGb
     */
    public GetBidInstancePriceRequest withRootDiskSizeInGb(int rootDiskSizeInGb) {
        this.rootDiskSizeInGb = rootDiskSizeInGb;
        return this;
    }

    public String getRootDiskStorageType() {
        return rootDiskStorageType;
    }

    public void setRootDiskStorageType(String rootDiskStorageType) {
        this.rootDiskStorageType = rootDiskStorageType;
    }

    /**
     * Configure rootDiskStorageType for the request.
     *
     * @param rootDiskStorageType The parameter to specify the root disk storage type.
     *                            Default use of HP1 cloud disk.
     * @return GetBidInstancePriceRequest with specific rootDiskStorageType
     */
    public GetBidInstancePriceRequest withRootDiskStorageType(String rootDiskStorageType) {
        this.rootDiskStorageType = rootDiskStorageType;
        return this;
    }

    public List<CreateCdsModel> getCreateCdsList() {
        return createCdsList;
    }

    public void setCreateCdsList(List<CreateCdsModel> createCdsList) {
        this.createCdsList = createCdsList;
    }

    public GetBidInstancePriceRequest withCreateCdsList(List<CreateCdsModel> createCdsList) {
        this.createCdsList = createCdsList;
        return this;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public GetBidInstancePriceRequest withPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetBidInstancePriceRequest withName(String name) {
        this.name = name;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public GetBidInstancePriceRequest withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getKeypairId() {
        return keypairId;
    }

    public void setKeypairId(String keypairId) {
        this.keypairId = keypairId;
    }

    public GetBidInstancePriceRequest withKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getAspId() {
        return aspId;
    }

    public void setAspId(String aspId) {
        this.aspId = aspId;
    }

    public GetBidInstancePriceRequest withAspId(String aspId) {
        this.aspId = aspId;
        return this;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public GetBidInstancePriceRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getBidModel() {
        return bidModel;
    }

    public void setBidModel(String bidModel) {
        this.bidModel = bidModel;
    }

    public GetBidInstancePriceRequest withBidModel(String bidModel) {
        this.bidModel = bidModel;
        return this;
    }

    public String getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    public GetBidInstancePriceRequest withBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    public int getNetworkCapacityInMbps() {
        return networkCapacityInMbps;
    }

    public void setNetworkCapacityInMbps(int networkCapacityInMbps) {
        this.networkCapacityInMbps = networkCapacityInMbps;
    }

    public GetBidInstancePriceRequest withNetworkCapacityInMbps(int networkCapacityInMbps) {
        this.networkCapacityInMbps = networkCapacityInMbps;
        return this;
    }

    public boolean isRelationTag() {
        return relationTag;
    }

    public void setRelationTag(boolean relationTag) {
        this.relationTag = relationTag;
    }

    public GetBidInstancePriceRequest withRelationTag(boolean relationTag) {
        this.relationTag = relationTag;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public void setTags(List<TagModel> tags) {
        this.tags = tags;
    }

    public GetBidInstancePriceRequest withTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public GetBidInstancePriceRequest withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public GetBidInstancePriceRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public GetBidInstancePriceRequest withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getInternetChargeType() {
        return internetChargeType;
    }

    public void setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
    }

    public GetBidInstancePriceRequest withInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }

    /**
     * Configure request credential for the request.
     *
     * @param credentials a valid instance of BceCredentials.
     * @return GetBidInstancePriceRequest with credentials.
     */
    @Override
    public AbstractBceRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }
}
