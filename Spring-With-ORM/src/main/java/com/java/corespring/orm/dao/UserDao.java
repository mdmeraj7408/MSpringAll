package com.java.corespring.orm.dao;




import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.java.corespring.orm.entities.User;

public class UserDao {
	//Hibernate Template
	private	HibernateTemplate hibernateTemplate;



	//insert data
	@Transactional
	public int insert(User user)
	{
		Integer i = (Integer)this.hibernateTemplate.save(user);
		return i;
	}

	//get details by id
	@Transactional
	public User getById(int id)
	{
		User user= this.hibernateTemplate.get(User.class, id);
		return user;
	}
	//get all details 
	public List<User> getAllDetails()
	{
		List<User> loadAll = this.hibernateTemplate.loadAll(User.class);
		return loadAll;
	}
	//deleting the data
	@Transactional
	public int deleteUserDeatils(int id)
	{
		User user = this.hibernateTemplate.get(User.class,id);
		this.hibernateTemplate.delete(user);
		return id;
	}
	//updating data
	@Transactional
	public User updateData(User user)
	{
		this.hibernateTemplate.update(user);
		return user ;
	}
	//-------------------------------------------------------
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
