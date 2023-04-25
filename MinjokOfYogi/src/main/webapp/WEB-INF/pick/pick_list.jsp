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
String loginUser = (String) session.getAttribute("loginUser");
%>
<body>
	<h1>${loginUser }님의가게찜리스트</h1>
	<h2>${count }</h2>
	<table class="table table-bordered">
		<tr>
			<th>번호</th>
			<th>유저이름</th>
			<th>가게이름</th>
		</tr>
		<c:forEach var="dto" items="${list }" varStatus="i">
		<tr>
			<td>${i.count }</td>
			<td>${dto.uid.getUid() }</td>
			<td>${dto.rid.getRname() }</td>
			</tr>
		</c:forEach>
	</table>

	<button type="button" onclick="location.href='mypage'">뒤로가기</button>
</body>
</html>