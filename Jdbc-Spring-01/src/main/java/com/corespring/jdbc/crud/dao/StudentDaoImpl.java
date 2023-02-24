package com.corespring.jdbc.crud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.java.corespring.jdbc.bean.Student;
@Component("studentDao")

public class StudentDaoImpl implements StudentDao {
@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student st) {
		String query="insert into student(id,name,course,phone,city,email)values(?,?,?,?,?,?)";
		int r = this.jdbcTemplate.update(query,st.getId(),st.getName(),st.getCourse(),st.getPhone(),st.getCity(),st.getEmail());

		return r;
	}

	@Override
	public int change(Student st) {
		String query="UPDATE student SET name=?,course=?, phone=?,city=?, email=? WHERE id = 1";
		int r = this.jdbcTemplate.update(query,st.getName(),st.getCourse(),st.getPhone(),st.getCity(),st.getEmail());

		return r;
	}
	//delete data from database
	@Override
	public int remove(int id) {
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,id);

		return 0;
	}
	@Override
	public Student getStudent(int id) {
		String query="select*from student where id=?";
		RowMapper<Student> rowMapper=new rowMapperImpl();
		Student st = this.jdbcTemplate.queryForObject(query, rowMapper,id);
		return st;
	}
	//get all
	@Override
	public List<Student> getAll() {
		String query="select*from student";
	List<Student> list=this.jdbcTemplate.query(query,new rowMapperImpl());
		return list;
	}
}
