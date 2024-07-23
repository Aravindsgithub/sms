<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="bootstrap.jsp" %>
</head>
<body>

<form action="register" method="post">
<input type="hidden" name="id">
<input type="text" placeholder="ENTER NAME" class="form-control" name="name">
<input type="text" placeholder="ENTER BRANCH" class="form-control" name="branch">
<input type="email" placeholder="ENTER EMAIL" class="form-control" name="email">
<input type="number" placeholder="ENTER PHNO" class="form-control" name="phno">
<button type="submit">Register</button>
</form>

</body>
</html>