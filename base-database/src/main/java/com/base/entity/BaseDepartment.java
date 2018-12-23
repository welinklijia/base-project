package com.base.entity;

import java.util.Date;

public class BaseDepartment {
    private Integer departId;

    private String departmentName;

    private Date departCreateTime;

    private Date departInsertTime;

    private Integer organizationId;

    private Short departValid;

    private Integer departParentId;

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Date getDepartCreateTime() {
        return departCreateTime;
    }

    public void setDepartCreateTime(Date departCreateTime) {
        this.departCreateTime = departCreateTime;
    }

    public Date getDepartInsertTime() {
        return departInsertTime;
    }

    public void setDepartInsertTime(Date departInsertTime) {
        this.departInsertTime = departInsertTime;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Short getDepartValid() {
        return departValid;
    }

    public void setDepartValid(Short departValid) {
        this.departValid = departValid;
    }

    public Integer getDepartParentId() {
        return departParentId;
    }

    public void setDepartParentId(Integer departParentId) {
        this.departParentId = departParentId;
    }
}