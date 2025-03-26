<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- login.jsp -->
<!-- login.jsp -->
<%@ include file="jsp025_header.jsp" %>


	<div class="container card my-5">
		<h3 class="card-header mb-3">FORM-LOGIN</h3>
		<p class="text-center"><img alt="login" src="images/login.png"></p>
		
		<form action="<%=request.getContextPath()%>/user_join" method="post" onsubmit="return login()">
			<div class="my-3">
				<label class="form-label" for="name">Id:</label>
				<input type="text" name="name" id="name" 
				placeholder="" class="form-control">
			</div>
			<div class="my-3">
				<label class="form-label" for="pw">Password:</label>
				<input type="password" name="pw" id="pw"
				placeholder="" class="form-control">
			</div>
			<div class="my-5">
				<label for="check" class="form-label">REMEMBER</label>
				<input type="checkbox" id="check" name="remember"><br>
			</div>
			<div class="my-3 text-end">
				<input type="submit" title="login하러가기" class="btn btn-danger" value="login">
			</div>
		</form>
		
		<script>
			function login(){
				let name=document.querySelector("#name");
				let pw=document.querySelector("#pw");
				
				if(name.value==""){alert("아이디를 입력해주세요."); name.focus(); return false;}
				if(pw.value==""){alert("비밀번호를 입력해주세요"); pw.focus(); return false;}
			}
		</script>
	</div>
<!-- login.jsp -->
<!-- login.jsp -->	

<!-- footer.jsp -->
<!-- footer.jsp -->
<!-- 파일분리 : jsp022_footer.jsp -->
<%@ include file="jsp025_footer.jsp" %>