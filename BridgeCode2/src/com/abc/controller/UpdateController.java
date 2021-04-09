package com.abc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abc.factory.StudentServiceFactory;
import com.abc.model.Student;
import com.abc.service.StudentService;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String semail = request.getParameter("semailid");
		String sphno = request.getParameter("sphno");
		String sadharno = request.getParameter("sadharno");
		String sbankacc = request.getParameter("sbankacc");

		Student student = new Student();
		student.setSid(sid);
		student.setSname(sname);
		student.setSemailid(semail);
		student.setSphno(sphno);
		student.setSadharno(sadharno);
		student.setSbankacc(sbankacc);
        System.out.println(student.getSemail());
		StudentService studentService = StudentServiceFactory.getStudentService();
		String status = studentService.updateById(student);

		if (status.equalsIgnoreCase("success")) {

			request.getRequestDispatcher("success.html").forward(request, response);

		} else {
			request.getRequestDispatcher("failure.html").forward(request, response);

		}

	}

}

