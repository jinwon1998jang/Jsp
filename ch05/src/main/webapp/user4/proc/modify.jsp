<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 전송 데이터 수신
	String name = request.getParameter("name");	
	String age = request.getParameter("age");	
	String gender = request.getParameter("gender");
	String addr = request.getParameter("addr");

	String host = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String user = "jinwonj96";
	String pass = "1234";
	
	try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(host, user, pass);
				
		Statement stmt = conn.createStatement();
		
		String sql = "UPDATE USER4 SET " +
	             "age=" + age + ", " +
	             "gender='" + gender + "', " +
	             "addr='" + addr + "' " +
	             "WHERE name='" + name + "'";

		
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	response.sendRedirect("../list.jsp");
%>