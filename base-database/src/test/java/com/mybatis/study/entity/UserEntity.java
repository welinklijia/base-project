package com.mybatis.study.entity;

import java.util.List;
import com.mybatis.study.constant.Sex;

public class UserEntity {
	private int id;
	private String username;
	private String password;
	private int age;
	private int valid;
	private Sex sex;
	private List<RoleEntity> listRole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getValid() {
		return valid;
	}
	public void setValid(int valid) {
		this.valid = valid;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public List<RoleEntity> getListRole() {
		return listRole;
	}
	public void setListRole(List<RoleEntity> listRole) {
		this.listRole = listRole;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		String roleListStr="";
		if(listRole != null){
			for(RoleEntity role:listRole){
				sb.append(role.getRoleName()).append("\n\t,");
			}
			String roleList = sb.toString();
			roleListStr = roleList.substring(0,roleList.lastIndexOf("\n\t,"));
		}
		return "name:"+username+",password:"+password+",age:"+age+",性别:"+sex.getName()+"角色列表："+roleListStr;
	}
}
