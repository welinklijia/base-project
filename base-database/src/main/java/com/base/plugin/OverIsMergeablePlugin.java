package com.base.plugin;

import java.lang.reflect.Field;
import java.util.List;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
/*
 * Mybatis Generator 插件解决mapper.xml不被覆盖问题
 */
public class OverIsMergeablePlugin extends PluginAdapter {

	@Override
	public boolean validate(List<String> arg0) {
		return true;
	}
	@Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
        try {
            Field field = sqlMap.getClass().getDeclaredField("isMergeable");
            field.setAccessible(true);
            field.setBoolean(sqlMap, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
