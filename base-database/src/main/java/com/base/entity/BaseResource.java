package com.base.entity;

import java.util.Date;

public class BaseResource {
    private Integer resourceId;

    private String resourceName;

    private String resourceUrl;

    private Integer resourceParentId;

    private Integer resourceType;

    private Date resourceUpdateTime;

    private Date resourceInsertTime;

    private Short resourceValid;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public Integer getResourceParentId() {
        return resourceParentId;
    }

    public void setResourceParentId(Integer resourceParentId) {
        this.resourceParentId = resourceParentId;
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public Date getResourceUpdateTime() {
        return resourceUpdateTime;
    }

    public void setResourceUpdateTime(Date resourceUpdateTime) {
        this.resourceUpdateTime = resourceUpdateTime;
    }

    public Date getResourceInsertTime() {
        return resourceInsertTime;
    }

    public void setResourceInsertTime(Date resourceInsertTime) {
        this.resourceInsertTime = resourceInsertTime;
    }

    public Short getResourceValid() {
        return resourceValid;
    }

    public void setResourceValid(Short resourceValid) {
        this.resourceValid = resourceValid;
    }
}