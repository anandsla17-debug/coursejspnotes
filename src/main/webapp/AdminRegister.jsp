<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Register</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<form class="container border border-primary p-3 mt-2 rounded" style="width: 300px" action="register" method="post">
<p class="h4 text-center">Admin registration</p>
<input class="form-control" type="text" placeholder="Enter your  id"  maxlength="7" name="adminid" >
<input  class="form-control" type="text" placeholder="Enter your  name" name="adminname">
<input  class="form-control" type="text" placeholder="Enter your role" name="role">
<input  class="form-control" type="text" placeholder="Enter your password " name="adminpassword">
<button class="btn btn-primary w-100" type="submit">Register</button>
<p class="text-center mt-2">Do you you Account?<a href="AdminLogin.jsp">Sign in</a></p>
</form>
<%String result=(String) request.getAttribute("result"); %>
<%if(result!=null){ %>
<p>result:<%=result %></p>
<%} %>

</body>
</html>