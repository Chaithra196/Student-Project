package com.abc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.abc.factory.ConnectionFactory;
import com.abc.model.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String save(Student student) {

		Connection connection = ConnectionFactory.getConnectionObj();
		String status = "";
		if (connection != null) {

			Statement statement;
			try {
				statement = connection.createStatement();
				if (statement != null) {

					String sid = student.getSid();
					String sname = student.getSname();
					String semailid = student.getSemail();
					String sphno = student.getSphno();
					String sadharno = student.getSadharno();
					String sbankacc = student.getSbankacc();

					sid = "'" + sid + "'";
					sname = "'" + sname + "'";
					semailid = "'" + semailid + "'";
					sphno = "'" + sphno + "'";
					sadharno = "'" + sadharno + "'";
					sbankacc = "'" + sbankacc + "'";

					String sqlInsertQuery = "insert into student(sid,sname,semailid,sphno,sadharno,sbankacc) values (" + sid + "," + sname + ","
							+ semailid + "," +sphno + "," +sadharno+ ","+sbankacc+ ")";
					int rowAffected = statement.executeUpdate(sqlInsertQuery);

					if (rowAffected == 1) {
						status = "success";
					}

				}

			} catch (SQLException e) {
				if (e.getErrorCode() == 1062) {
					status = "alreadyexisted";
				} else {
					status = "failure";
				}
				e.printStackTrace();
			}

		}

		return status;
	}

	@Override
	public String updateById(Student student) {
		Connection connection = ConnectionFactory.getConnectionObj();

		String status = "";
		
		String sid = student.getSid();
		String sname = student.getSname();
		String semailid = student.getSemail();
		String sphno = student.getSphno();
		String sadharno = student.getSadharno();
		String sbankacc = student.getSbankacc();

		
		sid = "'" + sid + "'";
		sname = "'" + sname + "'";
		semailid = "'" + semailid + "'";
		sphno = "'" + sphno + "'";
		sadharno = "'" + sadharno + "'";
		sbankacc = "'" + sbankacc + "'";
		

		if (connection != null) {

			Statement statement;
			try {
				statement = connection.createStatement();

				String sqlUpdateQuery = "update student set sname=" + sname + ", semailid="+semailid+",sphno="+sphno+",sadharno="+sadharno+",sbankacc="+sbankacc+" where sid =" + sid;
				int rowAffected = statement.executeUpdate(sqlUpdateQuery);

				if (rowAffected == 1) {
					status = "success";
				} else {
					status = "failure";
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return status;
	}

	@Override
	public Student displayStudent(String sid) {
		Connection connection = ConnectionFactory.getConnectionObj();
		Student student = null;
		if (connection != null) {

			Statement statement;
			try {
				statement = connection.createStatement();
				if (statement != null) {

					
					

					sid = "'" + sid + "'";

					String sqlInsertQuery = "select * from student where sid="+sid+"";
					 ResultSet resultSet = statement.executeQuery(sqlInsertQuery);

					if (resultSet.next()) {
						student = new Student();
						
						student.setSid(resultSet.getInt(1)+"");
						student.setSname(resultSet.getString(2));
						student.setSemailid(resultSet.getString(3));
						student.setSphno(resultSet.getString(4));
						student.setSadharno(resultSet.getString(5));
						student.setSbankacc(resultSet.getString(6));
						
					}

				}

			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}

		return student;
	
	}

	@Override
	public List<Student> findById(String sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
