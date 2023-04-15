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
<script>
	$(function() {
		//alert("hi");
		$("#pwCheckBtn").click(function() {
			var pw = $("#pw").val();
			var pwCheck = $("#pwCheck").val();
			if(pw==pwCheck){
				$("#checkStr").text("일치");
			}else{
				$("#checkStr").text("불일치");
				$("#pwCheck").val("");
			}
		})
	})
</script>
</head>
<body>
	<form action="user_insert" method="post">
		<table class="table table-bordered" style="width: 500px">
			<caption>
				<b>회원가입_일반회원</b>
			</caption>
			<tr>
				<th width="200">아이디</th>
				<td><input type="text" style="width: 200px" name="id"
					required="required"></td>
			</tr>
			<tr>
				<th width="200">비밀번호</th>
				<td><input type="password" style="width: 200px" id="pw"
					name="pw" required="required"></td>
			</tr>
			<tr>
				<th width="200">비밀번호 확인</th>
				<td><input type="password" style="width: 200px" id="pwCheck"
					required="required"><span id="checkStr" style="color: red"></span></td>
			</tr>
			<tr>
				<th width="200">핸드폰 번호</th>
				<td><input type="text" style="width: 200px" name="hp"
					required="required"></td>
			</tr>
			<tr>
				<th width="200">주소</th>
				<td><input type="text" style="width: 200px" name="addr"
					required="required"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="button" class="btn btn-default" id="pwCheckBtn">비밀번호
						확인</button>
					<button type="submit" class="btn btn-info">회원가입</button>
					<button type="button" onclick="location.href='../'"
						class="btn btn-default">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>