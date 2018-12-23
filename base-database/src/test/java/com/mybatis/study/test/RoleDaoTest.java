package com.mybatis.study.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mybatis.study.dao.RoleDao;
import com.mybatis.study.entity.RoleEntity;
import com.mybatis.test.util.SqlSessionFactoryUtil;

public class RoleDaoTest {
	private static final Logger logger = LoggerFactory.getLogger(RoleDaoTest.class);
	@Test
	public void testFindAllRole(){
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession(true);
			RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
			List<RoleEntity> list = roleDao.findAllRoleEnity();
			for(RoleEntity role : list){
				logger.info(role.getRoleName()+","+role.getInsertTime());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		
	}
}
