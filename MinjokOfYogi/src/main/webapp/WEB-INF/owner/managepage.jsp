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

내 가게 수 : ${dto.count }개<br>
가게목록
<table>

	<c:forEach var="dto" varStatus="i" items="${list }">
		<tr>
			<td><a href="detail?RST_id=${dto.RST_id }">${i.count }. ${dto.RST_name }</a></td>
			<!-- 클릭하면 해당 가게의 id에 해당하는 번호로 이동 -->
		</tr>
	</c:forEach>

</table>
</body>
</html>