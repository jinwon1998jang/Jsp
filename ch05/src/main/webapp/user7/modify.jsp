<%@page import="vo.User7VO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 전송 데이터 수신
	String id = request.getParameter("id");

	String host = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String user = "jinwonj96";
	String pass = "1234";
	
	// 수정할 사용자 객체
	User7VO user7 = null;

	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		String sql = "SELECT * FROM USER7 WHERE ID=?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, id);
		
		ResultSet rs = psmt.executeQuery();
		
		if(rs.next()){
			user7 = new User7VO();
			user7.setID(rs.getString(1));
			user7.setNAME(rs.getString(2));
			user7.setAGE(rs.getInt(3));
			user7.setEMAIL(rs.getString(4));
		}
		
		rs.close();
		psmt.close();
		conn.close();	
		
	}catch(Exception e){
		e.printStackTrace();
	}
	


%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user7::modify</title>
	</head>
	<body>
		<h3>User7 수정</h3>
		
		<a href="../jdbc.jsp">처음으로</a>
		<a href="./list.jsp">목록이동</a>
		
		<form action="./proc/modify.jsp" method="post">
			<table border="1">
			

				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" readonly value="<%= user7.getID() %>"  placeholder="아이디 입력"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="<%= user7.getNAME() %>" placeholder="이름 입력"/></td>
				</tr>
				<tr>
					<td>나이</td>
					<td><input type="number" name="age" value="<%= user7.getAGE() %>" placeholder="숫자 입력"/></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="email" value="<%= user7.getEMAIL() %>" placeholder="이메일 입력"/></td>
				</tr>
				<tr>					
					<td colspan="2" align="right">
						<input type="submit" value="수정하기"/>
					</td>
				</tr>					
			</table>		
		</form>			
	</body>
</html>