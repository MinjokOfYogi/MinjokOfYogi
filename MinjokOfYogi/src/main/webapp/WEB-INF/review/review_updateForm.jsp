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
	<form action="updateReview" method="post">
		<input type="hidden" value="${dto.rid }" name="rid"> <input
			type="hidden" value="${dto.oid.getOid() }" name="oid"> <input
			type="hidden" value="${dto.uid.getUid() }" name="uid">
		<table class="table table-bordered" style="width: 500px">
			<tr>
				<th>별점</th>
				<td><input type="text" pattern="^[1-5]+$"
					value="${dto.rstars }" name="rstars"></td>
			</tr>
			<tr>
				<th>사진</th>
				<td><input type="text" name="rphoto" value="${dto.rphoto }"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="rcontent">${dto.rcontent }</textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><button type="submit"
						style="margin-right: 10px">리뷰등록</button>
					<button type="button" onclick="history.back()">취소</button></td>
			</tr>
		</table>

	</form>
</body>
</html>