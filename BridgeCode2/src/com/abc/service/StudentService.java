package com.abc.service;

import java.util.List;

import com.abc.model.Student;

public interface StudentService {
	public String save(Student student);

	public String updateById(Student student);

	Student displayStudent(String sid);

	List<Student> findById(String sid);
}

