package com.base.entity.subtype;

import java.util.List;

import com.base.entity.BaseDepartment;
import com.base.entity.BaseOrganization;

public class SubBaseOrganization extends BaseOrganization {
	private List<BaseDepartment> listBaseDepart;
	private List<BaseOrganization> listBaseOrg;
	public List<BaseDepartment> getListBaseDepart() {
		return listBaseDepart;
	}
	public void setListBaseDepart(List<BaseDepartment> listBaseDepart) {
		this.listBaseDepart = listBaseDepart;
	}
	public List<BaseOrganization> getListBaseOrg() {
		return listBaseOrg;
	}
	public void setListBaseOrg(List<BaseOrganization> listBaseOrg) {
		this.listBaseOrg = listBaseOrg;
	}
	
}
