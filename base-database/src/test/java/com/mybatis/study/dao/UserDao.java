package com.mybatis.study.dao;

import com.mybatis.study.entity.UserEntity;

public interface UserDao {
	public UserEntity findUserById(int id);
	public void addUser(UserEntity userEntity);
	public void updateUser(UserEntity userEntity);
	public void deleteUser(int id);
}
