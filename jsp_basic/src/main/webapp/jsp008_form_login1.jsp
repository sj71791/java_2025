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
		<h3 class="card-header">LOGIN</h3>
		<div class="my-3">
		<form action="jsp006_form_login_result.jsp" method="get" class="join">
			<label for="query" class="form-label">EMAIL</label>
			<input type="email" class="form-control" id="email" name="email"/>
			<label for="" class="form-label">PASSWORD</label>
			<input type="password" class="form-control" id="pw" name="pw"/>
			<label for="" class="form-label">REMEMBER</label>
			<input type="checkbox" id="rmb" name="rmb"/> <br>
			<button type="submit" class="btn btn-danger">로그인</button>
		</form>
		</div>
	</div>
</body>
</html>