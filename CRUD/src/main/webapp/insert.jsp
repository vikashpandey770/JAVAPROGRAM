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

<form name="insert" method="post" action="EmpController">

<table>

<tr>
<td> Employee name</td>
<td><input type="text" name="Ename">
</tr>

<tr>
<td> Employee email</td>
<td><input type="text" name="email">
</tr>

<tr>
<td> Employee job</td>
<td><input type="text" name="job">
</tr>

<tr>
<td> Employee Department</td>
<td><input type="text" name="dept">
</tr>

<tr>
<td> Employee Salary</td>
<td><input type="text" name="salary">
</tr>


<tr>
<td colspan="2" align ="center">
<input type="submit" name="action" value="insert">
 
  </td>
</tr>




</table>

</form>

</body>
</html>