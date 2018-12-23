package com.base.entity.subtype;

import java.util.List;

import com.base.entity.BaseResource;
import com.base.entity.BaseRole;
import com.base.entity.BaseUser;

public class SubBaseRole extends BaseRole {
	private List<BaseUser> listUser;
	private List<BaseResource> listResource;
	public List<BaseUser> getListUser() {
		return listUser;
	}
	public void setListUser(List<BaseUser> listUser) {
		this.listUser = listUser;
	}
	public List<BaseResource> getListResource() {
		return listResource;
	}
	public void setListResource(List<BaseResource> listResource) {
		this.listResource = listResource;
	}
	
}
