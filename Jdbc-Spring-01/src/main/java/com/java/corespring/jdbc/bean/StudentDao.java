package com.java.corespring.jdbc.bean;

import java.util.List;

import com.java.corespring.jdbc.bean.Student;

public interface StudentDao {
//insert data
public  int insert(Student st);
//update details
public int change(Student st);
//delete details from database
public int remove(int id);
//select user
public Student getStudent(int id);
//select all
public List<Student> getAll();
}
