package com.base.dao;

import com.base.entity.BaseOrganization;

public interface BaseOrganizationMapper {
    int deleteByPrimaryKey(Integer orgId);

    int insert(BaseOrganization record);

    int insertSelective(BaseOrganization record);

    BaseOrganization selectByPrimaryKey(Integer orgId);

    int updateByPrimaryKeySelective(BaseOrganization record);

    int updateByPrimaryKey(BaseOrganization record);
}