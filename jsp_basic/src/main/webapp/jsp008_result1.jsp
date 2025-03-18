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
		<h3 class="card-header">LOGIN RESULT</h3>
		<div class=my-3>
		<form action="jsp006_form_login.jsp" method="get">
			<p>
			EMAIL : <%=request.getParameter("email") %> </br>
			PASSWORD : <%=request.getParameter("pw") %> <br>
			remember : <%=request.getParameter("rmb") %> <br></p>
			<button type="submit" class="btn btn-danger">처음으로</button>
		</form>
		</div>
	</div>
</body>
</html>