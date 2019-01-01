package com.base.service;

import java.util.List;

import com.base.entity.BaseUser;
import com.base.entity.subtype.SubBaseUser;

public interface UserService {
	public BaseUser findUserByName(String userName);
	public SubBaseUser findSubBaseUser(String userName);
	public List<BaseUser> findUserByPage(Integer currentPageCount,Integer everyPageCount);
}
