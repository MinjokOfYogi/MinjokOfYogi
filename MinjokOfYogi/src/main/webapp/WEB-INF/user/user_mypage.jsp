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
String id = (String) session.getAttribute("id");
%>
<body>
	<h1><%=id%>님의 마이페이지
	</h1>
	<table class="table table-bordered" style="width: 500px">
		<tr>
			<th>아이디</th>
			<td>${dto.id }</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>${dto.hp }</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>${dto.addr }</td>
		</tr>
		<tr>
			<th>포인트</th>
			<td>${dto.point }점</td>
		</tr>
		<tr>
			<th>레벨</th>
			<td>${dto.level }</td>
		</tr>
	</table>
	<button type="button" onclick="location.href='pickList'">찜목록</button>
	<button type="button" onclick="location.href='reviewList'">리뷰목록</button>
	<button type="button" onclick="location.href='orderList'">주문목록</button>
	<br>
	<button type="button" onclick="location.href='/'">메인으로</button>
</body>
</html>