<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<%@page import="java.sql.Connection"%>
<%@page import="jsp_servlet.DBManager"%>
<%
	Connection conn=null;
	DBManager db = new DBManager();
	conn = db.getConnection();
	
	if(conn!=null){out.println("db연동");}
%>
</body>
</html>