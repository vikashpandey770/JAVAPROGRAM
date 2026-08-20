<%@page import="com.bean.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<style type="text/css">
tr,td{
padding: 10px;
}

</style>

<body>

<% 
Emp e=(Emp)request.getAttribute("e");
%>

<form name="insert" method="post" action="EmpController">

<table>
<tr>
<td><input type="hidden" name="eid" value="<%=e.getEid() %>"></td>


</tr>


<tr>
<td> Employee name</td>
<td><input type="text" name="Ename" value="<%=e.getEname()%>">
</tr>

<tr>
<td> Employee email</td>
<td><input type="text" name="email" value="<%=e.getEmail() %>"  > 
</tr>

<tr>
<td> Employee job</td>
<td><input type="text" name="job" value="<%=e.getJob() %>"  >
</tr>

<tr>
<td> Employee Department</td>
<td><input type="text" name="dept"  value="<%=e.getDept() %>" >
</tr>

<tr>
<td> Employee Salary</td>
<td><input type="text" name="salary" value="<%=e.getSalary() %>">
</tr>


<tr>
<td colspan="2" align ="center">
<input type="submit" name="action" value="update">
 
  </td>
</tr>




</table>

<a href="insert.jsp">
INSERT EMP DATA
</a>

</form>

</body>
</html>