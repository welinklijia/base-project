package com.base.service;

import java.io.Serializable;

public abstract class BaseServiceAbstract<T,ID extends Serializable> implements BaseService<T,ID> {
	
	@Override
	public int deleteByPrimaryKey(ID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addGeneralServiceBo(T baseServiceBo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addGeneralServiceBoSelective(T baseServiceBo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(T baseServiceBo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(T baseServiceBo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T findByPrimaryKey(ID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
