<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    border: 1px solid black;
    padding: 10px;
    text-align: center;
}

th {
    background-color: lightgray;
}
</style>

<body>
<table>

<tr>
	<th>Student id</th>
	<th>Student name</th>
	<th>Student email</th>
	<th>Student contact</th>
	<th>Student password</th>
	<th>Student address</th>
	<th>Student qualification</th>
	<th>EDIT</th>
	<th>DELETE</th>
	
</tr>

<%
List<Student> list=StudentDao.getStudent();
for(Student s:list){
	%>
	
	<tr>
	<td><%=s.getStudentid() %>
	<td><%=s.getName() %> </td>
	<td><%=s.getEmail() %></td>
	<td><%=s.getContact() %></td>
	<td><%=s.getPassword() %> </td>
	<td><%=s.getAddress() %></td>
	<td><%=s.getQualification()%></td>
	<td>
	<form name="edit" method="post" action="StudentController">
	<input type="hidden" name="studentid" value="<%=s.getStudentid() %>">
	<input type="submit" name="action" value="EDIT" class="btn btn-primary">
	</form>
	</td>


	<td>
	<form name="delete" method="post" action="StudentController">
	<input type="hidden" name="studentid" value="<%=s.getStudentid() %>">
	<input type="submit" name="action" value="DELETE" class="btn btn-danger">
	</form>
</td>
	
<%	
}
%>
</table>

<a href="indexpage.jsp">
Add Student
</a>
</body>
</html>