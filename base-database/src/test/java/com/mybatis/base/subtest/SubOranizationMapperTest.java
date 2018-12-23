package com.mybatis.base.subtest;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.base.dao.BaseOrganizationMapper;
import com.base.entity.BaseOrganization;
import com.mybatis.test.util.SqlSessionFactoryUtil;

public class SubOranizationMapperTest {
	Logger logger = LoggerFactory.getLogger(SubOranizationMapperTest.class);
	@Test
	public void testInsert(){
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getBaseSqlSessionFactory().openSession(true);
			BaseOrganizationMapper baseOrganizationMapper = sqlSession.getMapper(BaseOrganizationMapper.class);
			BaseOrganization organization = new BaseOrganization();
			organization.setOrgName("中兴物联");
			organization.setOrgCreateTime(new Date());
			organization.setOrgInsertTime(new Date());
			organization.setOrgParentId(1);
			baseOrganizationMapper.insertSelective(organization);
		} catch (Exception e) {
			logger.error("错误信息:{0}",e);
		}finally{
			sqlSession.close();
		}
	}
}
