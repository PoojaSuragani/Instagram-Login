<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<title>display all data</title>
</head>
<body>
	<h1>list of available users</h1>
	<table border="1">
	<thead>
			<th>username</th>
			<th>password</th>
			<th>email</th>
			<th>mobile</th>
	</thead>
	<tbody>
		<c:forEach items="${users}" var="user">
		<tr>
			<td>${ user.username}</td>
			<td>${ user.password}</td>
			<td>${ user.email}</td>
			<td>${ user.mobile}</td>
		</tr>
		
		</c:forEach>
	</tbody>
	</table>
	<a href="./home.html"></a>
</body>
</html>