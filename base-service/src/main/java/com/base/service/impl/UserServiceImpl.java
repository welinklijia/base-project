package com.base.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.base.business.bo.BaseDepartmentBo;
import com.base.business.bo.BaseRoleBo;
import com.base.business.bo.BaseUserBo;
import com.base.business.bo.UserRoleBo;
import com.base.dao.UserRoleMapper;
import com.base.dao.subdao.SubBaseDepartmentMapper;
import com.base.dao.subdao.SubBaseRoleMapper;
import com.base.dao.subdao.SubBaseUserMapper;
import com.base.entity.BaseUser;
import com.base.entity.UserRole;
import com.base.entity.subtype.SubBaseUser;
import com.base.service.UserService;

public class UserServiceImpl implements UserService {
	private SubBaseUserMapper subBaseUserMapper;
	private SubBaseDepartmentMapper subBaseDepartmentMapper;
	private SubBaseRoleMapper subBaseRoleMapper;
	private UserRoleMapper userRoleMapper;
	@Override
	public int addBaseUserSelective(BaseUserBo baseUserBo) {
		BaseUser baseUser = baseUserBo.getBaseUser();
		return subBaseUserMapper.insertSelective(baseUser);
	}
	@Override
	public int addBatchUser(List<BaseUserBo> listBaseUser) {
		return 0;
	}
	@Override
	public int addBaseUser(BaseUserBo baseUserBo) {
		BaseUser baseUser = baseUserBo.getBaseUser();
		return subBaseUserMapper.insert(baseUser);
	}
	@Override
	public int deleteByPrimaryKey(Long userid) {
		return subBaseUserMapper.deleteByPrimaryKey(userid);
	}
	@Override
	public int updateByPrimaryKeySelective(BaseUserBo baseUserBo) {
		BaseUser baseUser = baseUserBo.getBaseUser();
		return subBaseUserMapper.updateByPrimaryKeySelective(baseUser);
	}
	@Override
	public int updateUserByPrimaryKey(BaseUserBo baseUserBo) {
		BaseUser baseUser = baseUserBo.getBaseUser();
		return subBaseUserMapper.updateByPrimaryKey(baseUser);
	}
	@Override
	public BaseUserBo findUserByPrimaryKey(Long userid) {
		BaseUser baseUser = subBaseUserMapper.selectByPrimaryKey(userid);
		BaseUserBo baseUserBo = new BaseUserBo();
		baseUserBo.setBaseUser(baseUser);
		return baseUserBo;
	}
	@Override
	public int updateBatchUserBySelective(List<BaseUserBo> listUser) {
		return 0;
	}
	@Override
	public BaseUserBo findUserByName(String userName) {
		BaseUser baseUser = subBaseUserMapper.selectUserByName(userName);
		BaseUserBo baseUserBo = new BaseUserBo();
		baseUserBo.setBaseUser(baseUser);
		return baseUserBo;
	}

	@Override
	public SubBaseUser findDepartUserRole(String userName) {
		return subBaseUserMapper.selectSubBaseUser(userName);
	}
	@Override
	public SubBaseUser findDepartUser(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SubBaseUser findUserRole(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int addUserDepartmentRole(BaseUserBo baseUserBo,BaseDepartmentBo baseDepartmentBo,BaseRoleBo baseRoleBo,List<UserRoleBo> listUserRoleBo) {
		 subBaseDepartmentMapper.insertSelective(baseDepartmentBo.getBaseDepart());
		 subBaseUserMapper.insertSelective(baseUserBo.getBaseUser());
		 subBaseRoleMapper.insertSelective(baseRoleBo.getBaseRole());
		 for(UserRoleBo userRoleBo : listUserRoleBo){
			 UserRole userRole = userRoleBo.getUserRole();
			 userRoleMapper.insertSelective(userRole);
		 }
		 return 0;
	}
	@Override
	public int addUserDepartment(BaseUserBo baseUserBo,BaseDepartmentBo baseDepartmentBo) {
		subBaseDepartmentMapper.insertSelective(baseDepartmentBo.getBaseDepart());
		subBaseUserMapper.insertSelective(baseUserBo.getBaseUser());
		return 0;
	}
	@Override
	public int addUserRole(BaseUserBo baseUserBo,BaseRoleBo baseRoleBo,List<UserRoleBo> listUserRoleBo) {
		subBaseUserMapper.insertSelective(baseUserBo.getBaseUser());
		subBaseRoleMapper.insertSelective(baseRoleBo.getBaseRole());
		for(UserRoleBo userRoleBo : listUserRoleBo){
			 UserRole userRole = userRoleBo.getUserRole();
			 userRoleMapper.insertSelective(userRole);
		 }
		return 0;
	}
	@Override
	public List<BaseUserBo> findUserByPage(Integer currentPageCount, Integer everyPageCount) {
		currentPageCount=(currentPageCount-1)*everyPageCount;
		List<BaseUser> baseUserList = subBaseUserMapper.pageQuery(currentPageCount, everyPageCount);
		List<BaseUserBo> list = new ArrayList<>();
		for(BaseUser baseUser : baseUserList){
			BaseUserBo baseUserBo = new BaseUserBo();
			baseUserBo.setBaseUser(baseUser);
			list.add(baseUserBo);
		}
		return list;
	}
	@Override
	public boolean existBaseUser(String userName) {
		BaseUser baseUser = subBaseUserMapper.selectUserByName(userName);
		if(baseUser != null){
			return true;
		}
		return false;
	}
	public SubBaseUserMapper getSubBaseUserMapper() {
		return subBaseUserMapper;
	}

	public void setSubBaseUserMapper(SubBaseUserMapper subBaseUserMapper) {
		this.subBaseUserMapper = subBaseUserMapper;
	}
	public SubBaseDepartmentMapper getSubBaseDepartmentMapper() {
		return subBaseDepartmentMapper;
	}
	public void setSubBaseDepartmentMapper(SubBaseDepartmentMapper subBaseDepartmentMapper) {
		this.subBaseDepartmentMapper = subBaseDepartmentMapper;
	}
	public SubBaseRoleMapper getSubBaseRoleMapper() {
		return subBaseRoleMapper;
	}
	public void setSubBaseRoleMapper(SubBaseRoleMapper subBaseRoleMapper) {
		this.subBaseRoleMapper = subBaseRoleMapper;
	}
	

}
