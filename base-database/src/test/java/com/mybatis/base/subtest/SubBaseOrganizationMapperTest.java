package com.mybatis.base.subtest;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.base.dao.subdao.SubBaseOrganizationMapper;
import com.base.entity.BaseDepartment;
import com.base.entity.BaseOrganization;
import com.base.entity.subtype.SubBaseOrganization;
import com.mybatis.test.util.SqlSessionFactoryUtil;

public class SubBaseOrganizationMapperTest {
	@Test
	public void insertSelective(){
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getBaseSqlSessionFactory().openSession();
			SubBaseOrganizationMapper orgMapper = sqlSession.getMapper(SubBaseOrganizationMapper.class);
			BaseOrganization record = new BaseOrganization();
			record.setOrgName("西安亿阳信通股份有限公司");
			record.setOrgParentId(1);
			record.setOrgCreateTime(new Date());
			record.setOrgInsertTime(new Date());
			orgMapper.insertSelective(record);
			BaseOrganization record1 = new BaseOrganization();
			record1.setOrgName("北京亿阳信通股份有限公司");
			record1.setOrgParentId(1);
			record1.setOrgCreateTime(new Date());
			record1.setOrgInsertTime(new Date());
			orgMapper.insertSelective(record1);
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	@Test
	public void selectBaseOrganizationDeparts(){

		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getBaseSqlSessionFactory().openSession();
			SubBaseOrganizationMapper orgMapper = sqlSession.getMapper(SubBaseOrganizationMapper.class);
			List<SubBaseOrganization> list = orgMapper.selectBaseOrganizationDeparts(1);
			for(SubBaseOrganization sub : list){
				String orgName = sub.getOrgName();
				System.out.println("当前公司:"+orgName);
				List<BaseDepartment> listDepart = sub.getListBaseDepart();
				for(BaseDepartment baseDepartment:listDepart){
					System.out.println("部门:"+baseDepartment.getDepartmentName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	
	}
	
}
