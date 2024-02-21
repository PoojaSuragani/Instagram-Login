<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>user registration</title>
</head>
<body bgcolor="pink">

	<c:if test="${result==1}">
	<h1>user registration successfully.....</h1>
	<a href="home.html"> goto homepage</a>
	</c:if>
	
	<c:if test="${result==0}">
	<h1>user registration unsuccessfully.....</h1>
	<jsp:include page="insta.html"/>
	</c:if>
	
	
</body>
</html>