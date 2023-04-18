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
메뉴 등록
<div>
<!-- 메뉴 카테고리는 가게의 카테고리를 따라가면 될듯 -->

	<form action="add" method="post">
		메뉴 이름
		<input type="text">
		<br>
		
		메뉴 사진 등록
		<input type="file">
		<br>
	
		메뉴 가격 등록
		<input type="text">
		<br>
		
		<button type="submit">저장</button>
	</form>
</div>
</body>
</html>