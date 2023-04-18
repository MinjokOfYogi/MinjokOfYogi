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
			<th>주문자명</th>
			<th>별점</th>
			<th>리뷰내용</th>
			<th>사진</th>
		</tr>
		<%-- <c:forEach>
			<tr>

			</tr>
		</c:forEach> --%>
	</table>
	<button type="button" onclick="history.back()">뒤로가기</button>
</body>
</html>