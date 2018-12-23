package com.base.entity.subtype;

import java.util.List;

import com.base.entity.BaseDepartment;
import com.base.entity.BaseOrganization;
import com.base.entity.BaseUser;

public class SubBaseDepartMent extends BaseDepartment {
	private BaseOrganization organization;
	private List<BaseUser> listUser;

	public BaseOrganization getOrganization() {
		return organization;
	}

	public void setOrganization(BaseOrganization organization) {
		this.organization = organization;
	}

	public List<BaseUser> getListUser() {
		return listUser;
	}

	public void setListUser(List<BaseUser> listUser) {
		this.listUser = listUser;
	}
	
	
}
