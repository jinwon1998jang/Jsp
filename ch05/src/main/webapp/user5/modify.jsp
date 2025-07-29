<%@page import="vo.User5VO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 전송 데이터 수신
	String name = request.getParameter("name");

	String host = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String user = "jinwonj96";
	String pass = "1234";
	
	// 수정할 사용자 객체
	User5VO user5 = null;

	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		String sql = "SELECT * FROM USER5 WHERE NAME=?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, name);
		
		ResultSet rs = psmt.executeQuery();
		
		if(rs.next()){
			user5 = new User5VO();
			user5.setNAME(rs.getString(1));
			user5.setGENDER(rs.getString(2));
			user5.setAGE(rs.getInt(3));
			user5.setADDR(rs.getString(4));

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
		<title>user5::modify</title>
	</head>
	<body>
		<h3>User5 수정</h3>
		
		<a href="../jdbc.jsp">처음으로</a>
		<a href="./list.jsp">목록이동</a>
		
		<form action="./proc/modify.jsp" method="post">
			<table border="1">
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" readonly value="<%= user5.getNAME() %>" placeholder="이름 입력"/></td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<label>
							<input type="radio" name="gender" value="M" <%= (user5 != null && "M".equals(user5.getGENDER())) ? "checked" : "" %> /> 남자
						</label>
						<label>
							<input type="radio" name="gender" value="F" <%= (user5 != null && "F".equals(user5.getGENDER())) ? "checked" : "" %> /> 여자
						</label>
					</td>
				</tr>

				<tr>
					<td>나이</td>
					<td><input type="number" name="age" value="<%= user5.getAGE() %>" placeholder="숫자 입력"/></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="addr" value="<%= user5.getADDR() %>" placeholder="주소 입력"/></td>
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