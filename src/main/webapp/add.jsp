<!-- Directive Tags: Page, Include, TagLib  -->

<!-- Page -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.time.LocalDate,java.util.ArrayList"%>

<!-- Include -->
<%@ include file="header.jsp"%>

<!-- TagLib -->
<%--  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
	<!-- Declarative Tag  -->
	<%!int sum = 0;%>

	<!-- Scriptlet Tag  -->
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));

	sum = num1 + num2;
	LocalDate date = LocalDate.now();
	out.println("Date: " + date + " ");
	%>

	<br>

	<%
	out.println("Sum is: ");
	%>

	<!-- Expression Tag  -->
	<%=sum%>
</body>
</html>