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
	<div>
		가게이름 : ${dto.RST_name }<br>
		
		영업중 : MNG_state가져오기
		
		영업시간 : MNG_time 가져오기
		
		<a href="menu?RST_id=${dto.RST_id }">메뉴 등록</a>
		
		<a>주문 확인</a>
	
	</div>
</body>
</html>