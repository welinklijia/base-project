package com.mybatis.base.subtest;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.base.dao.subdao.SubBaseUserMapper;
import com.base.entity.BaseUser;
import com.mybatis.test.util.SqlSessionFactoryUtil;

public class SubUserMapperTest {
	private static final Logger logger = LoggerFactory.getLogger(SubUserMapperTest.class);
	@Test
	public void insertUserTest(){
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getBaseSqlSessionFactory().openSession(true);
			SubBaseUserMapper subBaseUserMapper = sqlSession.getMapper(SubBaseUserMapper.class);
			BaseUser user = new BaseUser();
			user.setUserName("zhangsan");
			user.setUserPassword("123456");
			user.setUserDepartmentId(2);
			user.setUserInsertTime(new Date());
			user.setUserRegisterTime(new Date());
			subBaseUserMapper.insertSelective(user);
			BaseUser user1 = new BaseUser();
			user1.setUserName("zhangsan");
			user1.setUserPassword("123456");
			user1.setUserDepartmentId(2);
			user1.setUserInsertTime(new Date());
			user1.setUserRegisterTime(new Date());
			subBaseUserMapper.insertSelective(user1);
			BaseUser user2 = new BaseUser();
			user2.setUserName("zhangsan");
			user2.setUserPassword("123456");
			user2.setUserDepartmentId(2);
			user2.setUserInsertTime(new Date());
			user2.setUserRegisterTime(new Date());
			subBaseUserMapper.insertSelective(user2);
		} catch (Exception e) {
			logger.info("错误信息:{0}", e);
		}finally{
			sqlSession.close();
		}
		
		
	}
}
