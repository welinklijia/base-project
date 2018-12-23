package com.base.entity;

import java.util.Date;

public class BaseRole {
    private Integer roleId;

    private String roleName;

    private String roleDescripse;

    private Date roleCreateTime;

    private Date roleInsertTime;

    private Short roleValid;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescripse() {
        return roleDescripse;
    }

    public void setRoleDescripse(String roleDescripse) {
        this.roleDescripse = roleDescripse == null ? null : roleDescripse.trim();
    }

    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public Date getRoleInsertTime() {
        return roleInsertTime;
    }

    public void setRoleInsertTime(Date roleInsertTime) {
        this.roleInsertTime = roleInsertTime;
    }

    public Short getRoleValid() {
        return roleValid;
    }

    public void setRoleValid(Short roleValid) {
        this.roleValid = roleValid;
    }
}