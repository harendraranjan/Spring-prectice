package com.JDBC_Spring_02.Dao;

import java.util.List;

import com.JDBC_Spring_02.Model.Student;

public interface StudentDao {
	public int insert(Student studetn);
	public int UpdateDetail(Student student);
	public int Delete(int id);
	public int getDataById(int id);
	public List<Student> getAllList();

}
