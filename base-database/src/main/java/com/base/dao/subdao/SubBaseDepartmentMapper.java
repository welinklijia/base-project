package com.base.dao.subdao;

import java.util.List;

import com.base.dao.BaseDepartmentMapper;
import com.base.entity.BaseDepartment;
import com.base.entity.subtype.SubBaseDepartMent;

public interface SubBaseDepartmentMapper extends BaseDepartmentMapper {
	/*
	 * 根据部门id查询organization对象一对一关联查询
	 * 
	 */
	public SubBaseDepartMent selecOrganizationById(Integer id);
	/*
	 * 根据部门id查询用户信息，一对多关联查询
	 */
	public SubBaseDepartMent selectDepmentUser(Integer id);
	/*
	 * mybatis单表分页查询
	 * parameter1 currentPageCount,当前页数
	 * parameter2 everyPageCount每页查询总数
	 */
	public List<BaseDepartment> pageQuery(int currentPageCount,int everyPageCount);
}
