package com.mybatis.test.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SqlSessionFactoryUtil {
	private static final Logger logger = LoggerFactory.getLogger(SqlSessionFactoryUtil.class);
	private static SqlSessionFactory sqlSessionFactory;
	public static SqlSessionFactory getSqlSessionFactory(){
		String mybatisConfig="mybatis.xml";
		if(sqlSessionFactory == null){
			SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
			Reader reader = null;
			try {
				 reader = Resources.getResourceAsReader(mybatisConfig);
			} catch (IOException e) {
				logger.error("读取mybatis配置文件报错:{}",e);
			}
			sqlSessionFactory = factoryBuilder.build(reader);
		}
		return sqlSessionFactory;
		
	}
	public static SqlSessionFactory getBaseSqlSessionFactory(){
		String mybatisConfig="mybatis-test.xml";
		if(sqlSessionFactory == null){
			SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
			Reader reader = null;
			try {
				 reader = Resources.getResourceAsReader(mybatisConfig);
			} catch (IOException e) {
				logger.error("读取mybatis配置文件报错:{}",e);
			}
			sqlSessionFactory = factoryBuilder.build(reader);
		}
		return sqlSessionFactory;
		
	}
}
