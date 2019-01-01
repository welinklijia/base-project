package com.service.test.spring;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-config.xml"})
//测试数据回滚，不写入数据库
@Rollback(value=true)
//指定事务管理器
@Transactional(transactionManager="transactionManager")
public class BaseJunit4Test {

}
