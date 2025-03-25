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
	
		<div class="my-5"><%=session.getAttribute("username") %></div>
		
		<h3 class="card-header mb-3">FORM-LOGIN</h3>
		<pre class="bg-success text-white py-3">
		Q1. 아이디와 비밀번호 빈칸검사
      	Q2. 처리경로 : jsp022_login_action.jsp  / 아이디와 비밀번호 데이터값 노출안됨.
      	Q3. jsp022_login_action.jsp 
          - 데이터값 넘겨받기
          - 드라이버연동 / db연동 / sql처리 / 결과값 확인
          - 아이디와 비밀번호가 같은지 userinfo 에서 검색
          - 찾았으면 [경로안바뀌게] , 보이는 화면은 jsp022_login_my.jsp 페이지로 넘어가기 / 
            못찾았으면 정보를 확인해주세요~ 알림창띄우고 로그인페이지로 jsp022_login.jsp 페이지로
          
          select count(*) from member where name=? and pass=?
          
         mysql> desc member;
         +-------+--------------+------+-----+---------+----------------+
         | Field | Type         | Null | Key | Default | Extra          |
         +-------+--------------+------+-----+---------+----------------+
         | no    | int          | NO   | PRI | NULL    | auto_increment |
         | name  | varchar(100) | NO   |     | NULL    |                |
         | pass  | varchar(50)  | NO   |     | NULL    |                |
         +-------+--------------+------+-----+---------+----------------+
         3 rows in set (0.00 sec)
         
         mysql> select * from member;
         +----+--------+------+
         | no | name   | pass |
         +----+--------+------+
         |  1 | first  | 11   |
         |  2 | second | 22   |
         |  3 | third  | 33   |
         |  4 | fourth | 44   |
         +----+--------+------+
         4 rows in set (0.00 sec)
		</pre>
		<p class="text-center"><img alt="" src="images/login.png"></p>
		
		<form action="jsp022_login_action.jsp" method="post" onsubmit="return login()">
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
</body>
</html>