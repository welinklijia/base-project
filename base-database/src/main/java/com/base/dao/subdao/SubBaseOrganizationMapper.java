package com.base.dao.subdao;

import java.util.List;

import com.base.dao.BaseOrganizationMapper;
import com.base.entity.BaseOrganization;
import com.base.entity.subtype.SubBaseOrganization;

public interface SubBaseOrganizationMapper extends BaseOrganizationMapper {
	public List<SubBaseOrganization> selectBaseOrganizationDeparts(int orgId);
	public List<BaseOrganization> selectSonBaseOrganizations(int orgId);
	public List<BaseOrganization> pageQuery(int currentPageCount,int everyPageCount);
}
