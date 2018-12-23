package com.base.dao;

import com.base.entity.BaseResource;

public interface BaseResourceMapper {
    int deleteByPrimaryKey(Integer resourceId);

    int insert(BaseResource record);

    int insertSelective(BaseResource record);

    BaseResource selectByPrimaryKey(Integer resourceId);

    int updateByPrimaryKeySelective(BaseResource record);

    int updateByPrimaryKey(BaseResource record);
}