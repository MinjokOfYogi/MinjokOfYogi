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
	<h1>${loginUser}님의주문리스트</h1>
	총 주문 ${count}개
	<table class="table table-bordered">
		<tr>
			<th>주문번호</th>
			<th>유저아이디</th>
			<th>카트번호</th>
			<th>주문유형</th>
			<th>요청사항</th>
			<th>결제방식</th>
			<th>주문날짜</th>
			<th>주문상태</th>
			<th>비고</th>
		</tr>
		<c:forEach var="dto" items="${olist }" varStatus="i">
			<tr>
				<td>${dto.oid }</td>
				<td>${dto.uid.getUid()}</td>
				<td>${dto.getCid().iterator().next().getMid().getMname()}</td>
				<td>${dto.omethod }</td>
				<td>${dto.orequest }</td>
				<td>${dto.opayment }</td>
				<td>${dto.oday }</td>
				<td>${dto.ostatus }</td>
				<td><button type="button" onclick="location.href='insertReviewForm?oid=${dto.oid}'">리뷰쓰기</button></td>
			</tr>
		</c:forEach>
	</table>

	<button type="button" onclick="history.back()">뒤로가기</button>
</body>
</html>