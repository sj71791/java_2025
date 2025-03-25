<%@page import = "java.sql.*" %>
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
	<div class="container card my-5">
		<h3 class="card-header">좋아하는 과일 정보</h3>
		<%
		String username=request.getParameter("username");
		String fruit=request.getParameter("fruit");
		String btn = fruit.equals("apple") ? "btn-danger"
					:fruit.equals("banana")? "btn-warning"
					:"btn-success";
		%>
		<p>
		유저정보 : <%=username %></br>
		<img alt="" src="images/<%=fruit%>.jpg">
		</p>
		<a href="javascript:history.go(-1)" class="btn <%=btn %> text-white">BACK</a>
	</div>
</body>
</html>