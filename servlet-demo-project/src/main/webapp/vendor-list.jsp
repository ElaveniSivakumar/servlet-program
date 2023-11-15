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
</div>

<br/>

<div> 
     <table border="3">
            <tr>
                <th>Vendor Id</th> 
                <th>Vendor Name</th> 
                <th>Vendor PhoneNo</th> 
                <th>Vendor EmailId</th> 
                <th>Vendor Address </th> 
           </tr>
           
           <%List<Vendor> vendors = (List<Vendor>) request.getAttribute("vendorKeyList");
           if(null != vendors && vendors.size() > 0 ){
           for(Vendor vendor : vendors){
           %>
           
           <tr> 
                <td> <%=vendor.getId()%> </td>
                <td> <%=vendor.getName()%> </td>
                <td> <%=vendor.getPhone()%> </td>
                <td> <%=vendor.getEmail()%> </td>
                <td> <%=vendor.getAddress()%> </td>
           </tr>
           <% 
           }
           }else{
           %>
           <tr> 
                <td colspan = "5" align = "center"> No Records Found</td>
           </tr>
           <% } %>

     </table>
</div>

</body>
</html>