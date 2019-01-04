package com.base.service;

import java.util.List;

import com.base.business.bo.BaseDepartmentBo;
import com.base.business.bo.BaseRoleBo;
import com.base.business.bo.BaseUserBo;
import com.base.business.bo.UserRoleBo;
import com.base.entity.subtype.SubBaseUser;

public interface UserService {
	public int deleteByPrimaryKey(Long userid);
	public int addBaseUser(BaseUserBo baseUserBo);
	public int addBaseUserSelective(BaseUserBo baseUserBo);
	public int updateByPrimaryKeySelective(BaseUserBo baseUser);
	public int updateUserByPrimaryKey(BaseUserBo baseUser);
	public BaseUserBo findUserByPrimaryKey(Long userid);
	public int addBatchUser(List<BaseUserBo> listBaseUserBo);
	public int updateBatchUserBySelective(List<BaseUserBo> listUserBo);
	public BaseUserBo findUserByName(String userName);
	public SubBaseUser findDepartUserRole(String userName);
	public SubBaseUser findDepartUser(String userName);
	public SubBaseUser findUserRole(String userName);
	public List<BaseUserBo> findUserByPage(Integer currentPageCount,Integer everyPageCount);
	public int addUserDepartmentRole(BaseUserBo baseUserBo,BaseDepartmentBo baseDepartmentBo,BaseRoleBo baseRoleBo,List<UserRoleBo> listUserRoleBo);
	public int addUserDepartment(BaseUserBo baseUserBo,BaseDepartmentBo baseDepartmentBo);
	public int addUserRole(BaseUserBo baseUserBo,BaseRoleBo baseRoleBo,List<UserRoleBo> listUserRoleBo);
	public boolean existBaseUser(String userName);
}
