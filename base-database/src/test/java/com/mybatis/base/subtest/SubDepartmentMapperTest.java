package com.mybatis.base.subtest;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.base.dao.BaseOrganizationMapper;
import com.base.dao.subdao.SubBaseDepartmentMapper;
import com.base.entity.BaseDepartment;
import com.base.entity.BaseOrganization;
import com.base.entity.BaseUser;
import com.base.entity.subtype.SubBaseDepartMent;
import com.mybatis.test.util.SqlSessionFactoryUtil;

public class SubDepartmentMapperTest {
	private static final Logger logger = LoggerFactory.getLogger(SubDepartmentMapperTest.class);
	@Test
	public void testInsert(){
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getBaseSqlSessionFactory().openSession();
			SubBaseDepartmentMapper subBaseDepartmentMapper = sqlSession.getMapper(SubBaseDepartmentMapper.class);
			BaseOrganizationMapper baseOrganizationMapper = sqlSession.getMapper(BaseOrganizationMapper.class);
			
			BaseOrganization organization = new BaseOrganization();
			organization.setOrgName("北极太阳能有限公司");
			organization.setOrgCreateTime(new Date());
			organization.setOrgInsertTime(new Date());
			baseOrganizationMapper.insertSelective(organization);
			
			BaseDepartment department = new BaseDepartment();
			department.setDepartmentName("能源监控");
			department.setOrganizationId(organization.getOrgId());
			department.setDepartInsertTime(new Date());
			department.setDepartCreateTime(new Date());
			subBaseDepartmentMapper.insertSelective(department);
			sqlSession.commit();
		} catch (Exception e) {
			logger.error("错误信息:{0}",e);
			sqlSession.rollback();
		}finally{
			sqlSession.close();
		}
	}
	@Test
	public void testSelectById(){
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getBaseSqlSessionFactory().openSession(true);
			SubBaseDepartmentMapper subBaseDepartmentMapper = sqlSession.getMapper(SubBaseDepartmentMapper.class);
			SubBaseDepartMent subBaseDepartMent = subBaseDepartmentMapper.selecOrganizationById(2);
			System.out.println("部门:"+subBaseDepartMent.getDepartmentName()+",公司:"+subBaseDepartMent.getOrganization().getOrgName());
		} catch (Exception e) {
			logger.error("错误信息:{0}",e);
		}finally{
			sqlSession.close();
		}
	}
	@Test
	public void testSelectAllDepartment(){
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getBaseSqlSessionFactory().openSession(true);
			SubBaseDepartmentMapper subBaseDepartmentMapper = sqlSession.getMapper(SubBaseDepartmentMapper.class);
			int n = 3;
			int everyPageCount = 4;
			int currentPageCount=(n-1)*everyPageCount;
			List<BaseDepartment> list = subBaseDepartmentMapper.pageQuery(currentPageCount, everyPageCount);
			for(BaseDepartment baseDepart:list){
				System.out.println("id:"+baseDepart.getDepartId()+",部门:"+baseDepart.getDepartmentName());
			}
		} catch (Exception e) {
			logger.error("错误信息:{0}",e);
		}finally{
			sqlSession.close();
		}
	}
	@Test
	public void selectDepartUsers(){
		SqlSession sqlSession = null;
		try {
			sqlSession = SqlSessionFactoryUtil.getBaseSqlSessionFactory().openSession(true);
			SubBaseDepartmentMapper subBaseDepartmentMapper = sqlSession.getMapper(SubBaseDepartmentMapper.class);
			SubBaseDepartMent subDepart = subBaseDepartmentMapper.selectDepmentUser(2);
			List<BaseUser> listUser = subDepart.getListUser();
			for(BaseUser user : listUser){
				System.out.println("用户id:"+user.getUserId()+"用户:"+user.getUserName()+",部门:"+subDepart.getDepartmentName());
			}
		}catch (Exception e) {
			logger.error("错误信息:{0}",e);
		}finally{
			sqlSession.close();
		}
	}
}
