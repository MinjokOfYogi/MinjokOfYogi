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
<table class="table table-bordered" style="width: 500px;">
<c:forEach var="dto" items="${list }">

<tr><td rowspan="4">이미지</td><td>${dto.mid}> ${dto.mname}</td></tr>
<tr><td>${dto.mprice }</td></tr>
<tr><td>${dto.mdesc }</td></tr>
<tr><td>${dto.mcategory }</td></tr>
<tr><td>
<!-- 장바구니에 넣기 + 로그인한사람 id + dto.mid -->
<button type="button" onclick="location.href='menu/cart?num=${dto.mid}&id=#'"></button>
</td></tr>

</c:forEach>
</table>

</body>
</html>