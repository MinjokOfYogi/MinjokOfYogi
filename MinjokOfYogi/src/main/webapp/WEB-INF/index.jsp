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
<%
String loginUser = (String) session.getAttribute("id");
%>
<body>
	<c:if test="<%=loginUser != null%>">
		<b><%=loginUser%>님 환영합니다.</b>
		<button onclick="location.href='logout'">로그아웃</button><br>
		<button onclick="location.href='cartList'">장바구니</button>
		<button onclick="location.href='mypage'">마이페이지</button>
	</c:if>
	<c:if test="<%=loginUser == null%>">
		<div style="border: 1px solid red; width: 500px">
			<b>일반회원 로그인</b>
			<jsp:include page="user/user_login.jsp"></jsp:include>
		</div>
		<button onclick="location.href='join'">회원가입</button>
	</c:if>
	<br>
	<br>

	<!-- 권한은 나중에 -->
	
	<button onclick="location.href='ownerpage'">사장님페이지</button>
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