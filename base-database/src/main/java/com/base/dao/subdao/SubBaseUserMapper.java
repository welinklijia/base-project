package com.base.dao.subdao;

import java.util.List;

import com.base.dao.BaseUserMapper;
import com.base.entity.BaseUser;
import com.base.entity.subtype.SubBaseUser;

public interface SubBaseUserMapper extends BaseUserMapper {
	public BaseUser selectUserByName(String userName);
	public SubBaseUser selectSubBaseUser(String userName);
	public List<BaseUser> pageQuery(Integer currentPageCount,Integer everyPageCount);
}
