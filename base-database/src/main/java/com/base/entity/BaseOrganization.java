package com.base.entity;

import java.util.Date;

public class BaseOrganization {
    private Integer orgId;

    private String orgName;

    private Date orgCreateTime;

    private Date orgInsertTime;

    private Short orgValid;

    private Integer orgParentId;

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Date getOrgCreateTime() {
        return orgCreateTime;
    }

    public void setOrgCreateTime(Date orgCreateTime) {
        this.orgCreateTime = orgCreateTime;
    }

    public Date getOrgInsertTime() {
        return orgInsertTime;
    }

    public void setOrgInsertTime(Date orgInsertTime) {
        this.orgInsertTime = orgInsertTime;
    }

    public Short getOrgValid() {
        return orgValid;
    }

    public void setOrgValid(Short orgValid) {
        this.orgValid = orgValid;
    }

    public Integer getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(Integer orgParentId) {
        this.orgParentId = orgParentId;
    }
}