<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection conn=null;
	PreparedStatement stmt=null;
	String sql="delete from milk_order where ono=?";
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
		stmt=conn.prepareStatement(sql);
				
	}catch(Exception e){e.printStackTrace();}
%>