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
<form action="addRst" method="post">
	주인번호
	<input type="text" name="id" value="${num}">
	가게이름
	<input type="text" name="name">
	가게전화번호
	<input type="text" name="tel">
	가게위치
	<input type="text" name="location">
	카테고리
	<select name = "category">
		<option value="1">한식</option>
		<option value="2">중식</option>
	</select>
	라이선스
	<input type="text" name="license">
	
	<button type="submit">저장</button>
</form>
</body>
</html>