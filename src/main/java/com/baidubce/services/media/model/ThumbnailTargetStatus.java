package com.baidubce.services.media.model;

import java.util.ArrayList;
import java.util.List;

public class ThumbnailTargetStatus {

    /**
     * The target key prefix of thumbnails.
     */
    private String keyPrefix = null;
 
    /**
     * The file format of the thumbnails, can be jpg, png, mp4, gif or webp.
     */   
    private String format = null;

    /**
     * The display frame rate of thumbnails, only support in gif, webp, mp4 format, 0.01 - 30.0.
     */
    private Double frameRate = null;

    /**
     * The quality of gif, only support in gif format, can be medium or high.
     */
    private String gifQuality = null;

    /**
     * The sizing Policy of thumbnail, can be keep, shrinkToFit or stretch.
     */ 
    private String sizingPolicy = null;
    
    /**
     * The expected with of thumbnail, 10 - 2000.
     */
    private Integer widthInPixel = null;
    
    /**
     * The expected height of thumbnail, 10 - 2000.
     */
    private Integer heightInPixel = null;

    /**
     * Thumbnail sprite output configuration.
     */
    private SpriteOutputCfg spriteOutputCfg = null;

    public String getKeyPrefix() {
        return keyPrefix;
    }

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    public ThumbnailTargetStatus withKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
        return this;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ThumbnailTargetStatus withFormat(String format) {
        this.format = format;
        return this;
    }

    public Double getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    public ThumbnailTargetStatus withFrameRate(Double frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    public String getGifQuality() {
        return gifQuality;
    }

    public void setGifQuality(String gifQuality) {
        this.gifQuality = gifQuality;
    }

    public ThumbnailTargetStatus withGifQuality(String gifQuality) {
        this.gifQuality = gifQuality;
        return this;
    }

    public String getSizingPolicy() {
        return sizingPolicy;
    }

    public void setSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
    }

    public ThumbnailTargetStatus withSizingPolicy(String sizingPolicy) {
        this.sizingPolicy = sizingPolicy;
        return this;
    }

    public Integer getWidthInPixel() {
        return widthInPixel;
    }

    public void setWidthInPixel(Integer widthInPixel) {
        this.widthInPixel = widthInPixel;
    }

    public ThumbnailTargetStatus withWidthInPixel(Integer widthInPixel) {
        this.widthInPixel = widthInPixel;
        return this;
    }

    public Integer getHeightInPixel() {
        return heightInPixel;
    }

    public void setHeightInPixel(Integer heightInPixel) {
        this.heightInPixel = heightInPixel;
    }

    public ThumbnailTargetStatus withHeightInPixel(Integer heightInPixel) {
        this.heightInPixel = heightInPixel;
        return this;
    }

    public SpriteOutputCfg getSpriteOutputCfg() {
        return spriteOutputCfg;
    }

    public SpriteOutputCfg setSpriteOutputCfg(SpriteOutputCfg spriteOutputCfg) {
        return this.spriteOutputCfg = spriteOutputCfg;
    }

    public ThumbnailTargetStatus withSpriteOutputCfg(SpriteOutputCfg spriteOutputCfg) {
        this.spriteOutputCfg = spriteOutputCfg;
        return this;
    }

    private List<String> keys = new ArrayList<String>();

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }
    
    public ThumbnailTargetStatus withKeys(List<String> keys) {
        this.keys = keys;
        return this;
    }

    @Override
    public String toString() {
        return "ThumbnailTargetStatus [keyPrefix=" + keyPrefix 
                + ", format=" + format +  ", frameRate=" + frameRate + ", gifQuality=" + gifQuality
                + ", sizingPolicy=" + sizingPolicy + ", widthInPixel=" + widthInPixel
                + ", heightInPixel=" + heightInPixel + ", keys=" + keys + "]";
    }

}
