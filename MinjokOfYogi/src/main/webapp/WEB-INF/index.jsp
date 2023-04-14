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
	<form action="login" method="post">
		아이디: <input type="text" name="USER_id" size="5"><br>
		비밀번호: <input type="text" name="USER_pass" size="5">
		<button type="submit">로그인</button>
	</form>
	
	<button onclick="location.href='join'">회원가입</button>
	<button onclick="location.href='ownerjoin'">사장회원가입</button>
	<br>
	<br>

	<!-- 권한은 나중에 -->
	<button onclick="location.href='mypage'">마이페이지</button>
	<button onclick="location.href='ownerlogin'">사장님페이지</button>
	<button onclick="location.href='adminpage'">관리자페이지</button>
	<br>

	<h1>메뉴 카테고리</h1>
	<button type="button" onclick="location.href='#'">한식</button>
	<button type="button" onclick="location.href='#'">중식</button>
	<button type="button" onclick="location.href='#'">양식</button>
	<button type="button" onclick="location.href='#'">분식</button>
	<button type="button" onclick="location.href='#'">피자/치킨</button>
	<button type="button" onclick="location.href='#'">디저트</button>

</body>
</html>