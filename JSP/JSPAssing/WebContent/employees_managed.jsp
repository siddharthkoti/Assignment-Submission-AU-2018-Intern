<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees Managed</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>
	
	
	
	
	
	
	<table class="table table-sm">
  <thead>
    <tr>
   
      <th>Name</th>
      <th>Company</th>
    </tr>
  </thead>
  
  
   <tbody>
  	
  	<c:forEach items="${list}" var="user">
	  
	<tr>
    	<td>${user.name}</td>
     	<td>${user.company}</td>
    	<td><form action="getDetails" method="POST">
    	<input type="hidden" name="name" value="${user.name}">
    	<input type="hidden" name="email" value="${user.email}">
    	<input type="hidden" name="salary"value="${user.salary}">
    	<input type="hidden" name="project" value="${user.project}">
    	<input type="hidden" name="company" value="${user.company}">
    	<button type="submit" name="go" class="btn">GET MORE DETAILS</button>
    </form></td>
    </tr>
    
    
	
	</c:forEach>
  	</tbody>
  	</table>

</body>
</html>