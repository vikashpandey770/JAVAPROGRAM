<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
table {
    border-collapse: collapse;
    width: 80%;
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
	<th>Action</th>
	<th>Action</th>
	
	

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
	<form name="update" method="post" value="StudentController">
	<input type="hidden" name ="studentid" value="<%=s.getStudentId() %>" >
	<input type="submit" name="action" value="delete">
	</form>
	</td>
	

<td>
    <a href="update?studentid=<%=s.getStudentid()%>"
       onclick="return confirm('Are you sure you want to delete this Student ?');">
        update
    </a>
</td>
		
	</tr>
	
<%	
}
%>
</table>

<a href="indexpage.jsp">
Add Student
</a>
</body>
</html>