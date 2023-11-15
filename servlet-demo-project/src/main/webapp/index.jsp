<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="com.dto.Vendor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vendor Information System </title>
</head>
<body>
<div>
     <h3> Vendor Information System </h3>
</div>
<div>
     <button> 
     <a href = "Vendor-Form">
     Click New Vendor
     </a>
     </button> 
     
     <button> 
     <a href = "Vendor-Submit">
     View Existing Vendors
     </a>
     </button>
     
     
</div>

<br/>

</body>
</html>