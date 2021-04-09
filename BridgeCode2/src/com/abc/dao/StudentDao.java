package com.abc.dao;

import java.util.List;

import com.abc.model.Student;

public interface StudentDao {
	
	public String save(Student student);

	public String updateById(Student student);

	public Student displayStudent(String sid);

	public List<Student> findById(String sid);

}

