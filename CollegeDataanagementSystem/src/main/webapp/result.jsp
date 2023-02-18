<%@page import="java.util.List"%>
<%@page import="DTO.StudentData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>RESULTS</h1>
	<table border=1px;>
		<tr align="center">
			<td>Name</td>
			<td>DOB</td>
			<td>Branch</td>
			<td>m1</td>
			<td>m2</td>
			<td>m3</td>
		</tr>

		<%List<StudentData> lt =(List<StudentData>)request.getAttribute("fetch");%>
		<% for(StudentData data: lt){%>
		<tr>
			<td><%=data.getName() %></td>
			<td><%=data.getDOB() %></td>
			<td><%=data.getBranch() %></td>
			<td><%=data.getMarks1() %></td>
			<td><%=data.getMarks2() %></td>
			<td><%=data.getMarks3() %></td>
			<%--here i need to give an action 
		,along with it i need to send a value to servlet class hence i m using URL rewriting (?)
		 and giving a variable n passing the valueto the class --%>
		</tr>

		<%} %>

	</table>
	<a href="Front.jsp"><button>Go Back</button></a>
</body>
</html>