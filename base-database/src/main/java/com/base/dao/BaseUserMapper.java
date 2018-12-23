package com.base.dao;

import com.base.entity.BaseUser;

public interface BaseUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(BaseUser record);

    int insertSelective(BaseUser record);

    BaseUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(BaseUser record);

    int updateByPrimaryKey(BaseUser record);
}