<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Course</title>
</head>
<body>
<center>
<form action="deletecourse" method="post">
<input type="text" placeholder="Enter your Student id" name="studentid">
<br>
<button type="submit" >Delete</button>
<a href="displayall">Back</a>
</form>
</center>
<%String delete=(String) request.getAttribute("dresult"); %>
<%if(delete!=null){ %>
<p>Result:<%=delete %></p>
<%} %>

</body>
</html>