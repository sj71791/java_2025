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
		<h3 class="card-header">REQUEST-요청</h3>
		<!-- action, method, name -->
		<!-- action="처리", method=데이터넘기는방법, name=데이터보관이름 -->
		<p  class="alert alert-warning">
         https://www.google.com/search?q=apple  <br/>
         1. 처리컨테이너 :  https://www.google.com/search  <br/>
         2. 처리방식    :  get <br>
         3. 보관용기    :  q 	</br>
      	</p>
		<form action="https://www.google.com/search" method="get">
	  		<div class="mb-3 mt-3">
	   	 		<label for="query" class="form-label">검색어</label>
	    		<input type="text" class="form-control" id="q" 
	    			placeholder="구글에게 물어봐!" name="q">
	  		</div>
	  		<button type="submit" class="btn btn-primary btn-danger">Submit</button>
		</form>
	</div>
</body>
</html>

<!-- jsp004_request -->