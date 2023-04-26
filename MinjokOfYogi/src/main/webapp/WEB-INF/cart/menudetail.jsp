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
	
	<h3>장바구니에 담기</h3>
	<form action="insert" method="post">
	<table class="table table-bordered" style="width: 500px;">
	<tr>
	<td rowspan="10">
	[사진생략] | ${dto.mdesc }
	</td>
	</tr>
	<tr>
	<input type="text" id="mid" value="${dto.mid }">
	<input type="hidden" id="name" value="${dto.mname }">
	<input type="hidden" name="uid" value="${sessionScope.loginUser }">
	<td> 분류 | ${dto.mcategory }<br>음식명</td><td><span>${dto.mname }</span></td>
	</tr>
	<tr>
	<td>가격</td><td>${dto.mprice }</td>
	</tr>
	<tr>
	<td>수량선택</td>
	<td>
	<input type="number" value="1" id="mcount" name="mcount" min="1">
	<br>
	총액 :${mcount*dto.mprice }원
	</td>
	</tr>
	<tr>
	<td colspan="2" align="center">
	<button type="submit">장바구니에 담기</button>
	</td>
	</tr>
	</table>
	</form>

<script type="text/javascript">

	const count=$("#mcount").val();
	const name=$("#name").val();
	
	/* function btnclick(){
		
		alert("dd")
		
		const answer=confirm(name+" "+count+"개를 장바구니에 담았습니다. \n장바구니로 이동하시겠습니까?");
		
		if(answer){
			
			location.href="cartList";
			
		}else{
			history.back();
		}
	} */
	
</script>

</body>
</html>