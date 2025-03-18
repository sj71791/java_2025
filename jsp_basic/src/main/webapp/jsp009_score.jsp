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
		<h3 class="card-header" style="text-align: center">SCORE</h3>
		<form action="jsp009_score_result.jsp" method="get">
			<div class="my-3">
				<label for="kor" class="form-label">KOR: </label>
				<input type="number" class="form-control" id="kor" name="kor"
						min="0" max="100">
			</div>
			<div class="my-3">
				<label for="eng" class="form-label">ENG: </label>
				<input type="number" class="form-control" id="eng" name="eng"
						min="0" max="100">
			</div>
			<div class="my-3">
				<label for="ma" class="form-label">MATH: </label>
				<input type="number" class="form-control" id="ma" name="ma"
						min="0" max="100">
			</div>
			<div class="my-3 text-end" >
				<input type="submit" class="btn btn-success" title="성적처리하기" value="성적처리"/>
				<!-- <button type="submit" class="btn btn-success">성적처리 프로그램입니다.</button> -->
			</div>
		</form>
	</div>
</body>
</html>