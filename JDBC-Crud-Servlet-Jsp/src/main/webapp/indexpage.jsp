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
<form name="insert" method="post" action="StudentController">
<table>

<tr>
<td>name</td>
<td><input type="text" name="name"></td>
</tr>


<tr>
<td>email</td>
<td><input type="text" name="email"></td>
</tr>


<tr>
<td>contact</td>
<td><input type="text" name="contact"></td>
</tr>


<tr>
<td>address</td>
<td><input type="text" name="address"></td>
</tr>



<tr>
<td>password</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td>qualification</td>
<td><input type="text" name="qualification"></td>
</tr>



<tr>
<td><input type="submit" name="action" value="insert"></td>
</tr>


</table>
</form>
</body>
</html>