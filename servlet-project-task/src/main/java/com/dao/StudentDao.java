package com.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.Student;
import com.jdbc.connection.DatabaseConnectionutil;

public class StudentDao {

	
	public static void saveStudent(Student student) throws ClassNotFoundException, SQLException {
        Connection connection = DatabaseConnectionutil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tb_student_elaveni(student_id,student_name,student_phone,student_email,student_address,student_department,student_cgpa) VALUES(?,?,?,?,?,?,?)");
	    preparedStatement.setInt(1,student.getId());
	    preparedStatement.setString(2,student.getName());
	    preparedStatement.setString(3,student.getPhone());
	    preparedStatement.setString(4,student.getEmail());
	    preparedStatement.setString(5,student.getAddress());
	    preparedStatement.setString(6,student.getDepartment());
	    preparedStatement.setDouble(7,student.getCgpa());
	    preparedStatement.executeUpdate();
	    
	} 
	
	public static List<Student> getAllStudent() throws ClassNotFoundException, SQLException {
		Connection connection = DatabaseConnectionutil.getConnection();
		String query = "SELECT student_id,student_name,student_phone,student_email,student_address,student_department,student_cgpa  FROM tb_student_elaveni";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
	    
	    ResultSet resultSet = preparedStatement.executeQuery();
	    List<Student> students = new ArrayList<Student>();
	    while (resultSet.next()) {
			Integer studentid = resultSet.getInt(1);
			String studentname = resultSet.getString(2);
			String studentphone  = resultSet.getString(3);
			String studentemail = resultSet.getString(4);
			String studentaddress = resultSet.getString(5);
			String studentdepartment = resultSet.getString(6);
			Double studentcgpa = resultSet.getDouble(7);
			Student student = new Student(studentid,studentname,studentphone,studentemail,studentaddress,studentdepartment,studentcgpa);
			students.add(student);
		}
	  return students;
	} 
	
	
}
