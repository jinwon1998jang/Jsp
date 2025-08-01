<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Shop/Product::register</title>
	</head>
	<body>
		<h3>Shop/Product 등록</h3>
		
		<a href="/ch10">처음으로</a>
		<a href="/ch10/shop/product/list.do">목록이동</a>
		
		<form action="/ch10/shop/product/register.do" method="post">
			<table border="1">
				<tr>
					<td>제품번호</td>
					<td><input type="number" name="PNO" placeholder="제품번호"/></td>
				</tr>
				<tr>
					<td>제품명</td>
					<td><input type="text" name="PNAME" placeholder="제품명"/></td>
				</tr>
				<tr>
					<td>수량</td>
					<td><input type="number" name="STOCK" placeholder="수량"/></td>
				</tr>
				<tr>
					<td>가격</td>
					<td><input type="number" name="PRICE" placeholder="가격"/></td>
				</tr>
				<tr>
					<td>제조사</td>
					<td><input type="text" name="COMPANY"/></td>
				</tr>
				<tr>					
					<td colspan="2" align="right">
						<input type="submit" value="등록하기"/>
					</td>
				</tr>			
			</table>		
		</form>
	</body>
</html>