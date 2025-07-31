<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vo.User6VO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String host = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String user = "jinwonj96";
	String pass = "1234";	
	
	List<User6VO> users = new ArrayList<>();

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		Statement stmt = conn.createStatement();
		
		String sql = "SELECT * FROM USER6";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			
			User6VO vo = new User6VO();
			vo.setSEQ(rs.getInt(1));
			vo.setNAME(rs.getString(2));
			vo.setGENDER(rs.getString(3));
			vo.setAGE(rs.getInt(4));
			vo.setADDR(rs.getString(5));
						
			users.add(vo);
		}
		
		rs.close();
		stmt.close();
		conn.close();		
		
	}catch(Exception e){
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user6::list</title>
	</head>
	<body>
		<h3>User6 목록</h3>
		
		<a href="../jdbc.jsp">처음으로</a>
		<a href="./register.jsp">등록하기</a>
		
		<table border="1">
			<tr>
				<th>SEQ</th>
				<th>이름</th>
				<th>성별</th>
				<th>나이</th>
				<th>주소</th>
			</tr>
			
			<% for(User6VO user6VO : users){ %>
			<tr>
				<td><%= user6VO.getSEQ() %></td>
				<td><%= user6VO.getNAME() %></td>
				<td><%= user6VO.getGENDER() %></td>
				<td><%= user6VO.getAGE() %></td>
				<td><%= user6VO.getADDR() %></td>
				<td>
					<!-- 수정하고자 하는 사용자 아이디를 modify.jsp로 전송 -->
					<a href="./modify.jsp?name=<%= user6VO.getNAME() %>">수정</a>
					<a href="./delete.jsp?name=<%= user6VO.getNAME() %>">삭제</a>
				</td>
			</tr>
			<% } %>
		</table>		
	</body>
</html>