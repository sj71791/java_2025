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
	<div class="container card my-5 bg-success">
		<div class="my-5"><%=session.getAttribute("username") %></div>
		<h3 class="card-header bg-success text-white">MY INFO</h3>
		<table class="table table-striped table-bordered">
		<caption>MYINFO</caption>
		<tr><th scope="row">NO</th><td></td></tr>
		<tr><th scope="row">NAME</th><td></td></tr>
		<tr><th scope="row">PASSWORD</th><td></td></tr>
		</table>
	</div>
</body>
</html>