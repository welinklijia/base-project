package com.database.mybatis.pojo;

public class UserPojo {
	private int id;
	private String username;
	private String password;
	private int age;
	private int valid;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+username+",password:"+password+",age:"+age;
	}
	
}
