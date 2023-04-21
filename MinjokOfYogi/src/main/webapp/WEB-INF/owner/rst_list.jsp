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

<c:forEach var="dto" items="${list }">
<table class="table table-bordered" style="width: 500px;">
<caption>식당목록</caption>
<tr>
<td>식당 seq: ${dto.rid }</td><td><a href="list/menu?num=${dto.rid}"> ${dto.rname }</a></td>
</tr>
<tr>
<td> 주인 seq: ${dto.rcategory }</td>
</tr>
</table>
</c:forEach>

</body>
</html>