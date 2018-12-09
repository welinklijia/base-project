package com.mybatis.study.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mybatis.study.dao.UserDao;
import com.mybatis.study.entity.UserEntity;

public class UserDaoTest {
	Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
	private int id = 1;
	@Test
	public void findUserById(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		UserEntity userEntity = userDao.findUserById(id);
		logger.info("查询结果:{}",userEntity);
		sqlSession.close();
	}
	@Test
	public void addUser(){
		//关闭事物为true
		SqlSession sqlSession = getSqlSessionFactory().openSession(true);
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		UserEntity user = new UserEntity();
		user.setUsername("九哥");
		user.setPassword("123456");
		user.setAge(28);
		userDao.addUser(user);
		sqlSession.close();
	}
	@Test
	public void updateUser(){
		SqlSession sqlSession = getSqlSessionFactory().openSession(true);
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		UserEntity user = userDao.findUserById(id);
		logger.info("将要修改的用户为:{}",user);
		user.setUsername("upate");
		user.setAge(1);
		userDao.updateUser(user);
		UserEntity updateuser = userDao.findUserById(id);
		logger.info("修改后的用户为:{}",updateuser);
		sqlSession.close();
	}
	@Test
	public void deleteUser(){
		SqlSession sqlSession = getSqlSessionFactory().openSession(true);
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		userDao.deleteUser(1);
		UserEntity user = userDao.findUserById(id);
		if(user == null){
			logger.info("用户id为{}的用户已经被删除",id);
		}
		sqlSession.close();
	}
	private SqlSessionFactory getSqlSessionFactory(){
		String mybatisConfig="mybatis.xml";
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
		Reader reader = null;
		try {
			 reader = Resources.getResourceAsReader(mybatisConfig);
		} catch (IOException e) {
			logger.error("读取mybatis配置文件报错:{}",e);
		}
		return factoryBuilder.build(reader);
	}
}
