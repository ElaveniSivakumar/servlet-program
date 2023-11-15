<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student From</title>
</head>
<body>
<h3>Student Information</h3>
      <form action="Student-Submit" method="POST">
         <div> 
              <label>Student ID</label>
              <input type="text" id="studentId" name="studentId"> <br/>
         </div>
         <br/>
         <div> 
              <label>Student Name</label>
              <input type="text" id="studentName" name="studentName"> <br/>
         </div>
         <br/>
         <div> 
              <label>Student Phone</label>
              <input type="text" id="studentPhone" name="studentPhone"> <br/>
         </div>
         <br/>
      <div> 
              <label>Student Email</label>
              <input type="text" id="studentEmail" name="studentEmail"> <br/>
         </div>
         <br/>
      
      <div> 
              <label>Student Address</label>
              <input type="text" id="studentAddress" name="studentAddress"> <br/>
         </div>
         <br/>
         <div> 
              <label>Student Department</label>
              <input type="text" id="studentDepartment" name="studentDepartment"> <br/>
         </div>
         <br/>
         <div> 
              <label>Student Cgpa</label>
              <input type="text" id="studentCgpa" name="studentCgpa"> <br/>
         </div>
         <br/>
      <div> 
              
              <input type="submit" style= "background-color: green; color: white;" value="Create">
         </div>
      
      
      </form>
</body>
</html>