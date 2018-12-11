package com.mybatis.study.dao;

import com.mybatis.study.entity.RuleFile;
import java.math.BigDecimal;

public interface RuleFileMapper {
    int deleteByPrimaryKey(BigDecimal serFileId);

    int insert(RuleFile record);

    int insertSelective(RuleFile record);

    RuleFile selectByPrimaryKey(BigDecimal serFileId);

    int updateByPrimaryKeySelective(RuleFile record);

    int updateByPrimaryKeyWithBLOBs(RuleFile record);

    int updateByPrimaryKey(RuleFile record);
}