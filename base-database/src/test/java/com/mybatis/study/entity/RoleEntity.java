package com.mybatis.study.entity;

import java.util.Date;

public class RoleEntity {
	private int id;
	private String roleName;
	private Date insertTime;
	private int vaild;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}
	public int getVaild() {
		return vaild;
	}
	public void setVaild(int vaild) {
		this.vaild = vaild;
	}
	
}
