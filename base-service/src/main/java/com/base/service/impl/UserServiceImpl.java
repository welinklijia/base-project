package com.base.service.impl;

import java.util.List;

import com.base.dao.subdao.SubBaseUserMapper;
import com.base.entity.BaseUser;
import com.base.entity.subtype.SubBaseUser;
import com.base.service.UserService;

public class UserServiceImpl implements UserService {
	private SubBaseUserMapper subBaseUserMapper;
	
	@Override
	public void addBaseUser(BaseUser baseUser) {
		subBaseUserMapper.insertSelective(baseUser);
	}
	@Override
	public BaseUser findUserByName(String userName) {
		return subBaseUserMapper.selectUserByName(userName);
	}

	@Override
	public SubBaseUser findSubBaseUser(String userName) {
		return subBaseUserMapper.selectSubBaseUser(userName);
	}

	@Override
	public List<BaseUser> findUserByPage(Integer currentPageCount, Integer everyPageCount) {
		return subBaseUserMapper.pageQuery(currentPageCount, everyPageCount);
	}

	public SubBaseUserMapper getSubBaseUserMapper() {
		return subBaseUserMapper;
	}

	public void setSubBaseUserMapper(SubBaseUserMapper subBaseUserMapper) {
		this.subBaseUserMapper = subBaseUserMapper;
	}
	

}
