<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="com.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
       <div>
     <h3> Student Information List </h3> 
</div>
<div>
     <button> 
     <a href = "Student-Form">
     Click New Student Information
     </a>
     </button>
</div>

<br/>

<div> 
     <table border="3">
            <tr>
                <th>Student Id</th> 
                <th>Student Name</th> 
                <th>Student PhoneNo</th> 
                <th>Student EmailId</th> 
                <th>Student Address </th> 
                <th>Student Department </th> 
                <th>Student Cgpa </th> 
           </tr>
           
           <%List<Student> students = (List<Student>) request.getAttribute("studentKeyList");
           if(null != students && students.size()>0){
           for(Student student : students){
           %>
           
           <tr> 
                <td> <%=student.getId()%> </td>
                <td> <%=student.getName()%> </td>
                <td> <%=student.getPhone()%> </td>
                <td> <%=student.getEmail()%> </td>
                <td> <%=student.getAddress()%> </td>
                <td> <%=student.getDepartment()%> </td>
                <td> <%=student.getCgpa()%> </td>
           </tr>
           <% 
           }
           }else{
           
           %>
           <tr> 
           <td colspan="7" > no record</td> 
           </tr>
           <% } %>

     </table>
</div>
</body>
</html>