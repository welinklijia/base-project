package com.mybatis.study.entity;

import java.sql.Date;

public class ResourceEntity {
	private int id;
	private String resourceName;
	private String url;
	private int type;
	private Date insertTime;
	private int vaild;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
