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
	<h1>${loginUser }님의리뷰리스트</h1>
	<button type="button" onclick="location.href='insertReview'">리뷰쓰기</button>
	<table class="table table-bordered" style="width: 800px">
		<tr>
			<th>리뷰번호</th>
			<th>주문번호</th>
			<th>메뉴명</th>
			<th>주문자 아이디</th>
			<th>별점</th>
			<th>리뷰내용</th>
			<th>사진</th>
			<th>편집</th>
		</tr>
		<c:forEach var="dto" items="${list }" varStatus="i">
			<tr>
				<td>${dto.rid }</td>
				<td>${dto.oid.getOid() }</td>
				<td>${dto.oid.getCid().iterator().next().getMid().getMname() }</td>
				<td>${dto.uid.getUid() }</td>
				<td>${dto.rstars }</td>
				<td>${dto.rcontent }</td>
				<td>${dto.rphoto }</td>
				<td>
					<button type="button" onclick="location.href='getReview?rid=${dto.rid}'">수정</button>
					<button type="button" onclick="location.href='deleteReview?rid=${dto.rid}'">삭제</button>
				</td>
			</tr>
		</c:forEach>
	</table>
	<button type="button" onclick="history.back()">뒤로가기</button>
</body>
</html>