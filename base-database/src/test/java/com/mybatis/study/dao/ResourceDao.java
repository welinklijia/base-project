package com.mybatis.study.dao;

import java.util.List;

import com.mybatis.study.entity.ResourceEntity;

public interface ResourceDao {
	public ResourceEntity findById(int id);
	public List<ResourceEntity> findAllResource();
	public void addResource(ResourceEntity resource);
	public void updateResource(ResourceEntity resource);
	public void deleteResource(int id);
}
