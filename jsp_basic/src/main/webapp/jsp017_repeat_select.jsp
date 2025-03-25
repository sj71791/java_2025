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
		<h3 class="card-header">Select Box</h3>
		<form action="jsp017_result.jsp" method="get" onsubmit="return form()">
		<div class="mb-3 mt-3">
			<label for="username" class="form-label">사용자이름: </label>
			<input class="form-control" type="text" id="username" 
			name="username" placeholder="사용자이름을 적어주세요!">
		</div>
		<div class="mb-3">
			<label for="fruit" class="form-label">좋아하는 과일선택</label>
			<select class="form-select" id="fruit" name="fruit">
			<option value="">--선택--</option>
			<option value="apple">APPLE</option>
			<option value="banana">BANANA</option>
			<option value="coconut">COCONUT</option>
			</select>
		</div>
		<div class="mb-3">
		<button type="submit" class="btn btn-danger text-white">전송</button>
		</div>
		</form>
		<script>
		function form(){
			let username=document.querySelector("#username");
			let fruit=document.querySelector("#fruit option:checked");
			
			if(username.value==""){alert("이름을 입력해주세요."); username.focus(); return false;}
			if(fruit.value==""){alert("과일을 선택해주세요"); fruit.focus(); return false;}
		}
		</script>
	</div>
</body>
</html>