<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Update</title>
</head>
<body>
<center>
<h1>Course Update</h1>
<form action="courseupdate" method="post">
<input type="number" placeholder="Enter your Studentid" name="id">
<br>
<input type="text" placeholder="Enter your courseid" name="courseid">
<br>
<input type="text" placeholder="Enter your coursename" name="coursename">
<br>
<input type="text" placeholder="Enter your coursedays"  name="coursedays">
<br>
<input type="text" placeholder="Enter your coursetime" name="coursetime"> 
<br>
<span>Startdate:</span>
<input type="date" placeholder="Enter your startdate" name="startdate">
<br>
<span>Enddate</span>
<input type="date" placeholder="Enter your enddate" name="enddate">
<br>

<button type="submit">Add Update</button>
<a href="displayall">back</a>
</form>
</center>
<%String result=(String) request.getAttribute("result"); %>

<%if(result!=null) {%>
<p>Result:<%=result %></p>
<%} %>
</body>
</html>