<%@page import="java.util.Arrays"%>
<%@page import="java.sql.*" %>
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
		<h3 class="card-header">RADIO - 단일선택</h3>
		<%
		String username=request.getParameter("username");
		String radiobutton=request.getParameter("optradio");
		
		%>
		<table>
			<caption>radio 데이터 확인</caption>
			<tbody>
				<tr><th scope="row">NAME</th><td><%=username %></td></tr>
				<tr><th scope="row">RADIO</th><td><%=radiobutton %></td></tr>
			</tbody>
		</table>
	</div>
</body>
</html>