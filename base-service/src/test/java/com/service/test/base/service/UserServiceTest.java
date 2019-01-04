package com.service.test.base.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.base.entity.BaseDepartment;
import com.base.entity.BaseRole;
import com.base.entity.BaseUser;
import com.base.entity.subtype.SubBaseUser;
import com.base.service.UserService;
import com.service.test.spring.BaseJunit4Test;

public class UserServiceTest extends BaseJunit4Test {
	@Autowired
	private UserService userService;
	@Test
	public void findDepartUserRole(){
		SubBaseUser subBaseUser = userService.findDepartUserRole("lisi");
		System.out.println(subBaseUser.getDepartment().getDepartmentName());
		List<BaseRole> list = subBaseUser.getListRole();
		for(BaseRole role:list){
			System.out.println(role.getRoleName());
		}
	}
	@Test
	public void addUser(){
		BaseUser user2 = new BaseUser();
		user2.setUserName("zhangty");
		user2.setUserPassword("123456");
		user2.setUserDepartmentId(2);
		user2.setUserInsertTime(new Date());
		user2.setUserRegisterTime(new Date());
		//userService.addBaseUser(user2);
	}
	@Test
	public void addDepartment(){
		BaseDepartment department = new BaseDepartment();
		department.setDepartmentName("创新工场");
		department.setOrganizationId(1);
		department.setDepartInsertTime(new Date());
		department.setDepartCreateTime(new Date());
		//departmentService.addDepartment(department);
		System.out.println("插入部门表Department成功");
	}
	@Test
	public void addUserAndDepartment(){
		BaseDepartment department = new BaseDepartment();
		department.setDepartmentName("创新工场1");
		department.setOrganizationId(1);
		department.setDepartInsertTime(new Date());
		department.setDepartCreateTime(new Date());
		//departmentService.addDepartment(department);
		BaseUser user2 = new BaseUser();
		user2.setUserName("zhangty9");
		user2.setUserPassword("123456");
		user2.setUserDepartmentId(department.getDepartId());
		user2.setUserInsertTime(new Date());
		user2.setUserRegisterTime(new Date());
		//userService.addBaseUser(user2);
	}
}
