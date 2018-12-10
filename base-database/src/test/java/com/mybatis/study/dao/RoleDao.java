package com.mybatis.study.dao;

import java.util.List;

import com.mybatis.study.entity.RoleEntity;

public interface RoleDao {
	public RoleEntity findById(int id);
	public List<RoleEntity> findAllRoleEnity();
	public void addRole(RoleEntity role);
	public void updateRole(RoleEntity role);
	public void deleteById(int id);
}
