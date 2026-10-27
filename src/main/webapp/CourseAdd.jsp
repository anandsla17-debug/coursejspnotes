<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Add</title>
</head>
<body>
<center>
<h1>Course Add</h1>
<form action="addcourse" method="post">
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
<input type="number" placeholder="Enter your phone" name="phone">
<br>
<input type="text" placeholder="Enter your price" name="price">
<br>
<button type="submit">Add Course</button>
</form>
</center>
</body>
</html>