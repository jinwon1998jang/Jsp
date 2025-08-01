<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Shop/Product::list</title>
	</head>
	<body>
		<h3>Shop/Product 목록</h3>
		
		<a href="/ch10">처음으로</a>
		<a href="/ch10/shop/product/register.do">등록하기</a>
		
		<table border="1">
			<tr>
				<th>상품번호</th>
				<th>상품이름</th>
				<th>수량</th>
				<th>가격</th>
				<th>제조사</th>
			</tr>			
			<c:forEach var="product" items="${dtoList}">
			<tr>
				<td>${product.PNO}</td>
				<td>${product.PNAME}</td>
				<td>${product.STOCK}</td>
				<td>${product.PRICE}</td>
				<td>${product.COMPANY}</td>
				<td>					
					<a href="">수정</a>					
					<a href="">삭제</a>
				</td>
			</tr>
			</c:forEach>
		</table>		
	</body>
</html>