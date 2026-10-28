<%@page import="model.Course"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Course</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<a href="CourseAdd.jsp" class="btn btn-primary rounded mt-4 ms-3">ADD Course</a>
<center>
<%ArrayList<Course> courses= (ArrayList<Course>) request.getAttribute("courseview");   %>
<table border="1">
<tr>
<th>Student id</th>
<th>Course id</th>
<th>Course name</th>
<th>Course days</th>
<th>Course start date</th>
<th>Course end date</th>
<th>Course Timing</th>
<th>Phone no</th>
<th>Price</th>
</tr>
<%if(!courses.isEmpty()) {%>
<%for(Course datas:courses){ %>
<tr>
<td><%=datas.getStudentid() %></td>
<td><%=datas.getCourseid() %></td>
<td><%=datas.getCoursename() %></td>
<td><%=datas.getCoursedays() %></td>
<td><%=datas.getStartdate() %></td>
<td><%=datas.getEnddate() %></td>
<td><%=datas.getCoursetime() %></td>
<td><%=datas.getPhone() %></td>
<td><%=datas.getPrice() %>
</tr>
<%} %>

<%} else{ %>
<tr>
<td colspan="9" style="text-align: center;">no Student is found</td>
</tr>
<%} %>
</table>
</center>
<a href="CourseUpdate.jsp" class="btn btn-warning ms-3">Update course</a>

</body>
</html>