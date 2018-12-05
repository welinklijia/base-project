package com.database.mybatis.pojo;

public interface UserDao {
	public UserPojo findUserById(int id);
	public void addUser(UserPojo userPojo);
	public void updateUser(UserPojo userPojo);
	public void deleteUser(int id);
}
