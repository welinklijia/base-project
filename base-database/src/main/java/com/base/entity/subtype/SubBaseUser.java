package com.base.entity.subtype;

import java.util.List;

import com.base.entity.BaseDepartment;
import com.base.entity.BaseRole;
import com.base.entity.BaseUser;

public class SubBaseUser extends BaseUser {
	private BaseDepartment department;
	private List<BaseRole> listRole;
	public BaseDepartment getDepartment() {
		return department;
	}
	public void setDepartment(BaseDepartment department) {
		this.department = department;
	}
	public List<BaseRole> getListRole() {
		return listRole;
	}
	public void setListRole(List<BaseRole> listRole) {
		this.listRole = listRole;
	}
	
}
