<%@page import="com.bean.Student"%>
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
Student s=(Student)request.getAttribute("s");

%>

<form name="insert" method="post" action="StudentController">
<table>

<tr> 
<td>
<input type="hidden" name="studentid" value="<%=s.getStudentid()%>">
</td>
</tr>

<tr>
<td>name</td>
<td><input type="text" name="name" value="<%=s.getName()%>"></td>
</tr>


<tr>
<td>email</td>
<td><input type="text" name="email" value="<%=s.getEmail()%>" ></td>
</tr>


<tr>
<td>contact</td>
<td><input type="text" name="contact"  value="<%=s.getContact()%>"><td>
</tr>


<tr>
<td>address</td>
<td><input type="text" name="address"  value="<%=s.getAddress()%>"></td>
</tr>



<tr>
<td>password</td>
<td><input type="password" name="password" value="<%=s.getPassword()%>" ></td>
</tr>

<tr>
<td>qualification</td>
<td><input type="text" name="qualification" value="<%=s.getQualification()%>"></td>
</tr>



<tr>
<td><input type="submit" name="action" value="EDIT"></td>
</tr>


</table>
</form>


</body>
</html>