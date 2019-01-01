package com.base.service.impl;

import com.base.dao.subdao.SubBaseDepartmentMapper;
import com.base.entity.BaseDepartment;
import com.base.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
	private SubBaseDepartmentMapper subBaseDepartmentMapper;
	@Override
	public void addDepartment(BaseDepartment department) {
		subBaseDepartmentMapper.insertSelective(department);
	}
	public SubBaseDepartmentMapper getSubBaseDepartmentMapper() {
		return subBaseDepartmentMapper;
	}

	public void setSubBaseDepartmentMapper(SubBaseDepartmentMapper subBaseDepartmentMapper) {
		this.subBaseDepartmentMapper = subBaseDepartmentMapper;
	}
	
}
