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
<div><h1>사장회원가입</h1>

<form action="addDB" method="post">
	이름
	<input type="text" name="ownName">
	아이디
	<input type="text" name="ownOwnerid">
	비밀번호
	<input type="password" name="ownPass">
	전화번호
	<input type="text" name="ownPhone">
	
	<button type="submit">가입</button>
</form>
</div>
</body>
</html>