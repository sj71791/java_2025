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
		<p style="text-align: center"><img src="images/login.png" alt="login" ></p>
		
		<form action="jsp008_result2.jsp">
			<div class="my-5">
				<label for="email" class="form-label">EMAIL</label>
				<input type="email" class="form-control" id="email" name="email">
			</div>	
			<div class="my-5">
				<label for="pass" class="form-label">PASSWORD</label>
				<input type="password" class="form-control" id="pass" name="pass">
			</div>			
			<div class="my-5">
				<label for="check" class="form-label">REMEMBER</label>
			<input type="checkbox" id="check" name="remember"><br>
			</div>
			<div class="my-5">
				<input type="submit" title="login 하러가기" class="btn btn-danger" id=check name="remember"/>
			</div>
		</form>
	</div>
</body>
</html>