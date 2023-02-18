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
<%StudentData insert= new StudentData(); %>
<form action="insert">
<input type="hidden" name="roll_num" value=<%=insert.getRoll_Nom() %>>
Name: <input type="text" name="name"><br>
Branch: <input type="text" name="branch"><br>
DOB: <input type="text" name="dob"><br>
Marks1: <input type="text" name="m1"><br>
Marks2: <input type="text" name="m2"><br>
Marks3: <input type="text" name="m3"><br>
<button >Submit</button>
<button type="reset">cancel</button>
</form>
</body>
</html>