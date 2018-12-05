package com.database.mybatis.pojo;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import junit.framework.Assert;

public class UserDaoTest {
	@Test
	public void findUserById(){
		SqlSession sqlSession = getSessionFactory().openSession();  
		try {
			sqlSession = getSessionFactory().openSession();
			UserDao userMapper = sqlSession.getMapper(UserDao.class);  
			UserPojo user = userMapper.findUserById(1);  
			System.out.println(user);
			UserPojo user1 = new UserPojo();
			user1.setUsername("张三");
			user1.setPassword("123456");
			user1.setAge(25);
			userMapper.addUser(user1);
			user1.setUsername("李四");
			userMapper.updateUser(user1);
			sqlSession.commit();
			System.out.println("修改后的记录:"+user1);
			int id = user1.getId();
			System.out.println("尝试删除该记录...");
			userMapper.deleteUser(id);
			UserPojo userPojo1=userMapper.findUserById(id);
			if(null==userPojo1){
				System.out.println("删除成功");
			}else{
				System.out.println("没有删除成功");
			}
			
			Assert.assertNotNull("没找到数据", user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			sqlSession.close();
		}
	}
 
	// Mybatis 通过SqlSessionFactory获取SqlSession, 然后才能通过SqlSession与数据库进行交互
	private static SqlSessionFactory getSessionFactory() {
		SqlSessionFactory sessionFactory = null;
		String resource = "mybatis.xml";
		try {
			sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sessionFactory;
	}
}
