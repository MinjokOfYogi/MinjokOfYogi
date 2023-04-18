<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>

</head>
<body>
	
	<form action="join/action" method="post">
	<table>
	<tr>
	<td>id</td><td><input type="text" name="OWN_id"></td>
	</tr>
	<tr>
	<td>pass</td><td><input type="text" name="OWN_pass"></td>
	</tr>
	<tr>
	<td>이름</td><td><input type="text" name="OWN_name"></td>
	</tr>
	<tr>
	<td>hp</td><td><input type="text" name="OWN_hp"></td>
	</tr>
	
	<tr>
	<td colspan="2" align="center">
	<button type="submit">가입하기</button>
	</td>
	</tr>

	</table>
	</form>
</body>
</html>