<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>상품목록</title>
	</head>
	<body>
		<h3>상품목록</h3>
		
		<a href="/shopApp">처음으로</a>
		<a href="/shopApp/product/register.do">등록하기</a>
		
		<c:if test="${!sessUser}">
			<form action="/shopApp/customer/login.do" method="post">
				<input type="text" name="custid" style="width: 100px"/>
				<input type="submit" value="로그인"/>
			</form>
		</c:if>
		
		<c:if test="${sessUser}">
			<p>
				${sessUser.name}(${sessUser.custid})님 반갑습니다.
				<a href="#">로그아웃</a>
			</p>
		</c:if>
		
		<table border="1">
			<tr>
				<th>상품번호</th>
				<th>상품명</th>
				<th>재고량</th>
				<th>가격</th>
				<th>제조사</th>
				<th>수량</th>
				<th>주문</th>
			</tr>			
			
			<tr>
				<td>100</td>
				<td>초코파이</td>
				<td>121</td>
				<td>2500</td>
				<td>오리온</td>
				<td>					
					<input type="number" name="count" style="width: 40px" />									
				</td>
				<td>
					<a href="#">주문하기</a>	
				</td>
			</tr>
		</table>		
	</body>
</html>