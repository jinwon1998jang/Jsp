<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 전송 데이터 수신
	String id = request.getParameter("id");	
	String name = request.getParameter("name");	
	String ageStr = request.getParameter("age");	
	String email = request.getParameter("email");	

	int age = Integer.parseInt(ageStr);  // 숫자형으로 변환

	String host = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String user = "jinwonj96";
	String pass = "1234";
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		String sql = "UPDATE USER7 SET name = ?, age = ?, email = ? WHERE id = ?";
		PreparedStatement psmt = conn.prepareStatement(sql);
		
		psmt.setString(1, name);
		psmt.setInt(2, age);
		psmt.setString(3, email);
		psmt.setInt(4, Integer.parseInt(id));  // ID는 NUMBER형

		psmt.executeUpdate();
		
		psmt.close();
		conn.close();
		
	} catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("../list.jsp");
%>
