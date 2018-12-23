package com.base.entity.subtype;

import java.util.List;

import com.base.entity.BaseResource;
import com.base.entity.BaseRole;

public class SubBaseResource extends BaseResource {
	private List<BaseRole> listRole;

	public List<BaseRole> getListRole() {
		return listRole;
	}
	public void setListRole(List<BaseRole> listRole) {
		this.listRole = listRole;
	}
	
}
