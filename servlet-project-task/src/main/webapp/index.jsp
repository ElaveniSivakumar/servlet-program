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
<title>Student Web Interface </title>
</head>
<body>

<div>
     <h2>Student Bio-Data</h2>
</div>
<div>
     <button> 
     <a href="Student-Form"> 
     Click New Student Information
     </a>
     </button> 
     
     <button> 
     <a href="Student-Submit">
     View Existing Student List
     </a>
     </button>
     
</div>
<br/>
</body>
</html>