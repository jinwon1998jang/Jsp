<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		</head>
	<body>
		<h3>redirect1 페이지</h3>
		<%
			//request.jsp 페이지로 리다이렉트(다시 요청)
			response.sendRedirect("../1_request.jsp");
		%>
	</body>
</html>