package com.base.entity;

import java.util.Date;

public class BaseUser {
    private Long userId;

    private String userName;

    private String userPassword;

    private Date userRegisterTime;

    private Date userInsertTime;

    private Integer userDepartmentId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(Date userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public Date getUserInsertTime() {
        return userInsertTime;
    }

    public void setUserInsertTime(Date userInsertTime) {
        this.userInsertTime = userInsertTime;
    }

    public Integer getUserDepartmentId() {
        return userDepartmentId;
    }

    public void setUserDepartmentId(Integer userDepartmentId) {
        this.userDepartmentId = userDepartmentId;
    }
}