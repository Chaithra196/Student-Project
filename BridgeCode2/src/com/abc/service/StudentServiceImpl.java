package com.abc.service;
import java.util.List;

import com.abc.dao.StudentDao;
import com.abc.factory.StudentDaoFactory;
import com.abc.model.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public String save(Student student) {

		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		String status = studentDao.save(student);

		return status;
	}

	
	public List<Student> findById(String sid) {

		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		List<Student> student = studentDao.findById(sid);

		return student;
	}

	@Override
	public Student displayStudent(String sid) {

		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		Student student = studentDao.displayStudent(sid);
		return student;
	}

	@Override
	public String updateById(Student student) {

		StudentDao studentDao = StudentDaoFactory.getStudentDao();
		String status = studentDao.updateById(student);

		return status;
	}



}