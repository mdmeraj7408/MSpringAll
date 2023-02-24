package com.corespring.jdbc.crud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.corespring.jdbc.bean.Student;

public class rowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st=new Student();
		st.setId(rs.getInt(1));
		st.setName(rs.getString(2));
		st.setCourse(rs.getString(3));
		st.setPhone(rs.getInt(4));
		st.setCity(rs.getString(5));
		st.setEmail(rs.getString(6));
		
		return st;
	}

	
}
