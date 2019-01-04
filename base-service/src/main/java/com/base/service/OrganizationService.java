package com.base.service;

import java.util.List;

import com.base.business.bo.BaseOrganizationBo;

public interface OrganizationService {
	public int addBaseOrganization(BaseOrganizationBo baseOrganizationBo);
	public int addBaseOrganizationSelective(BaseOrganizationBo baseOrganizationBo);
	public int deleteBaseOrganizationByPrimaryKey(Integer orgId);
	public int updateBaseOrganizationByPrimaryKey(BaseOrganizationBo baseOrganizationBo);
	public int updateBaseOrganizationByPrimaryKeySelective(BaseOrganizationBo baseOrganizationBo);
	public BaseOrganizationBo findBaseOrganizationByPrimaryKey(Integer orgId);
	public List<BaseOrganizationBo> findBaseOrganizationByPage(Integer currentPageCount,Integer everyPageCount);
}
