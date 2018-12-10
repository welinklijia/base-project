package com.mybatis.study.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SqlSessionFactoryUtil {
	private static final Logger logger = LoggerFactory.getLogger(SqlSessionFactoryUtil.class); 
	public static SqlSessionFactory getSqlSessionFactory(){
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
