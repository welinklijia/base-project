package com.base.service;

import java.io.Serializable;

public interface BaseService<T,ID extends Serializable> {
	public int deleteByPrimaryKey(ID id);
	public int addGeneralServiceBo(T baseServiceBo);
	public int addGeneralServiceBoSelective(T baseServiceBo);
	public int updateByPrimaryKeySelective(T baseServiceBo);
	public int updateByPrimaryKey(T baseServiceBo);
	public T findByPrimaryKey(ID id);
}
