<%@ page import="java.util.List" %>
<%@ page import="com.bean.Emp" %>
<%@ page import="com.dao.EmpDao" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
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
    <th>EName</th>
    <th>Email</th>
    <th>Job</th>
    <th>Department</th>
    <th>Salary</th>
    <th>Update</th>
    <th>Delete</th>
    
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

</tr>

<%
    }
%>

</table>

</body>
</html>