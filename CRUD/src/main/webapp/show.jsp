<%@ page import="java.util.List" %>
<%@ page import="com.bean.Emp" %>
<%@ page import="com.dao.EmpDao" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Employee List</title>


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

</head>

<body>
<table>

<tr>
    <th>EId</th>
    <th>ENAME</th>
    <th>EMAIL</th>
    <th>JOB</th>
    <th>DEPARTMENT</th>
    <th>SALARY</th>
    <th>EDIT</th>
    <th>DELETE</th>
</tr>
<%
    List<Emp> list = EmpDao.getallEmployee();
    for(Emp e : list) {
%>
<tr>

    <td><%=e.getEid()%></td>
    <td><%=e.getEname()%></td>
    <td><%=e.getEmail()%></td>
    <td><%=e.getJob()%></td>
    <td><%=e.getDept()%></td>
    <td><%=e.getSalary()%></td>

	<td>
	<form name="edit" method="post" action="EmpController">
	<input type="hidden" name="eid" value="<%=e.getEid() %>">
	<input type="submit" name="action" value="EDIT"class ="btn btn-primary">
	</form>
	</td>

	<td>
	<form name="delete" method="post" action="EmpController">
	<input type="hidden" name="eid" value="<%=e.getEid() %>">
	<input type="submit" name="action" value="Delete"class ="btn btn-danger">
	</form>
	</td>

</tr>
<%
    }
%>
</table>

</body>
</html>