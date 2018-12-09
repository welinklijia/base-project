package com.mybatis.study.external.dataSource;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import com.alibaba.druid.pool.DruidDataSource;

public class DruidDataSourceFactory extends UnpooledDataSourceFactory {
	public DruidDataSourceFactory(){
		//mybatis配置外部数据源,使用druid连接池
		this.dataSource = new DruidDataSource();
	}
}
