<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>College/Student::list</title>
	</head>
	<body>
		<h3>College/Student 목록</h3>
		
		<a href="/ch10">처음으로</a>
		<a href="/ch10/college/student/register.do">등록하기</a>
		
		<table border="1">
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>생년월일</th>
				<th>전공</th>
				<th>입학일</th>
			</tr>		
			<c:forEach var="student" items="${dtoList}">
			<tr>
				<td>${student.STDNO}</td>
				<td>${student.NAME}</td>
				<td>${student.BIRTH}</td>
				<td>${student.MAJOR}</td>
				<td>${student.ENT_DATE}</td>
				<td>					
					<a href="">수정</a>					
					<a href="">삭제</a>
				</td>
			</tr>
			</c:forEach>	
		</table>		
	</body>
</html>