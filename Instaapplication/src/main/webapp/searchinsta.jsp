<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert search</title>
</head>
<body bgcolor="yellow">
	<h1>search result ....</h1>
	<c:if test="${not empty instainfo}">
	
	</c:if>
	username....${instainfo.username}<br>
	password....${instainfo.password}<br>
	email....${instainfo.email}<br>
	mobile....${instainfo.mobile}<br>
	<a href="search.html">searchpage</a>
	
</body>
</html>