package com.base.dao;

import com.base.entity.BaseDepartment;

public interface BaseDepartmentMapper {
    int deleteByPrimaryKey(Integer departId);

    int insert(BaseDepartment record);

    int insertSelective(BaseDepartment record);

    BaseDepartment selectByPrimaryKey(Integer departId);

    int updateByPrimaryKeySelective(BaseDepartment record);

    int updateByPrimaryKey(BaseDepartment record);
}