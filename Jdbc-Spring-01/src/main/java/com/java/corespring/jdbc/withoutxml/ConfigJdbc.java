package com.java.corespring.jdbc.withoutxml;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.java.corespring.jdbc.dao.StudentDao;
import com.java.corespring.jdbc.dao.StudentDaoImpl;
@Configuration
@ComponentScan(basePackages = {"com.java.corespring.jdbc.dao"})
public class ConfigJdbc {
	@Bean("ds")
   public DriverManagerDataSource getDataSource()
   {
	   
	   DriverManagerDataSource ds=new DriverManagerDataSource();
	   ds.setDriverClassName("com.mysql.jdbc.Driver");
	   ds.setUrl("jdbc:mysql://localhost:3306/spring-jdbc");
	   ds.setUsername("root");
	   ds.setPassword("123456");
	return ds;
	   
   }
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
	@Bean(name={"studentDao"})
	public StudentDao getDao()
	{
		StudentDaoImpl stDao=new StudentDaoImpl();
		stDao.setJdbcTemplate(getTemplate());
		return stDao;
	}
	
}
