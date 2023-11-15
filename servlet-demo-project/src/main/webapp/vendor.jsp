<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vendor Form </title>
</head>
<body>
<h3> Create New Vendor</h3>
      <form action="Vendor-Submit" method="POST">
         <div> 
              <label>Vendor ID</label>
              <input type="text" id="vendorId" name="vendorId"> <br/>
         </div>
         <br/>
         <div> 
              <label>Vendor Name</label>
              <input type="text" id="vendorName" name="vendorName"> <br/>
         </div>
         <br/>
      <div> 
              <label>Vendor Email</label>
              <input type="text" id="vendorEmail" name="vendorEmail"> <br/>
         </div>
         <br/>
      <div> 
              <label>Vendor Phone</label>
              <input type="text" id="vendorPhone" name="vendorPhone"> <br/>
         </div>
         <br/>
      <div> 
              <label>Vendor Address</label>
              <input type="text" id="vendorAddress" name="vendorAddress"> <br/>
         </div>
         <br/>
      <div> 
              
              <input type="submit" style= "background-color: green; color: white;" value="Create">
         </div>
      
      
      </form>
</body>
</html>