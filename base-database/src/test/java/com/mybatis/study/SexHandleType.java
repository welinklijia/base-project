package com.mybatis.study;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import com.mybatis.study.constant.Sex;

public class SexHandleType implements TypeHandler<Sex> {
	@Override
	public void setParameter(PreparedStatement ps, int i, Sex parameter, JdbcType jdbcType) throws SQLException {
		ps.setInt(i, parameter.getValue());
	}
	@Override
	public Sex getResult(CallableStatement cs, int columnIndex) throws SQLException {
		int value = cs.getInt(columnIndex);
		return Sex.getEnum(value);
	}
	@Override
	public Sex getResult(ResultSet rs, String columnName) throws SQLException {
		int value = rs.getInt(columnName);
		return Sex.getEnum(value);
	}
	@Override
	public Sex getResult(ResultSet rs, int columnIndex) throws SQLException {
		int value = rs.getInt(columnIndex);
		return Sex.getEnum(value);
	}

}
