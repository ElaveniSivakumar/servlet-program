package com.controller;

import java.io.IOException;


import java.util.List;

import com.dao.StudentDao;
import com.dto.Student;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class StudentCreationConnectionController
 */
@WebServlet("/Student-Submit")
public class StudentFromSubmissionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentFromSubmissionController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		List<Student> students = null;
		try {
		      StudentDao.getAllStudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.fillInStackTrace();
		} 
		
		request.setAttribute("studentKeyList",students);
		request.getRequestDispatcher("student-list.jsp").include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String StudentId = request.getParameter("studentId");
		String StudentName = request.getParameter("studentName");
		String StudentPhone = request.getParameter("studentPhone");
		String StudentEmail = request.getParameter("studentEmail");
		String StudentAddress = request.getParameter("studentAddress");
		String StudentDepartment = request.getParameter("studentDepartment");
		String StudentCgpa = request.getParameter("studentCgpa");
		
		Student student = new Student(Integer.parseInt(StudentId), StudentName, StudentPhone, StudentEmail, StudentAddress, StudentDepartment,Double.parseDouble(StudentCgpa));
		//System.out.println(StudentId +StudentName +StudentPhone + StudentEmail + StudentAddress + StudentDepartment + StudentCgpa);
		try {
			StudentDao.saveStudent(student);
		} catch (Exception e) {
			e.fillInStackTrace();
		}
		
		doGet(request, response);
	}

}
