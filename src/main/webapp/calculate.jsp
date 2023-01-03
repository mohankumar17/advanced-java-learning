<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>

<!-- Include -->
<%@ include file="header.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Declarative Tag  -->
	<%!int res = 0;%>

	<!-- Scriptlet Tag  -->
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));

	String ops = request.getParameter("ops");
	if (ops.equals("add")) {
		res = num1 + num2;
	} else if (ops.equals("subtract")) {
		res = num1 - num2;
	} else if (ops.equals("multiply")) {
		res = num1 * num2;
	} else if (ops.equals("divide")) {
		/*try {
			res = num1 / num2;
		} catch (Exception ex) {
			out.println("Exception " + ex.getMessage());
		}*/
		res = num1 / num2;
	} else {
		res = 0;
	}
	%>

	<br>

	<%
	out.println("Result is: ");
	%>

	<!-- Expression Tag  -->
	<%=res%>

</body>
</html>