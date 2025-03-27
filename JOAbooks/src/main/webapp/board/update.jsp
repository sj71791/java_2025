<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
	<div class="container card my-5">
		<h3 class="card-header">MULTIBOARD - 글쓰기</h3>
		<form action=".java" method="post" onsubmit="return form()">
		<div class="my-5">
			<label for="bname" class="form-label">이름</label>
			<input type="text" id="bname" name="bname" class="form-control">
		</div>
		<div class="my-5">
			<label for="btitle" class="form-label">제목</label>
			<input type="text" id="btitle" name="btitle" class="form-control">
		</div>
		<div class="my-5">
			<label for="bcontent" class="form-label">내용</label>
			<textarea cols="60" rows="10" id="bcontent" name="bcontent" class="form-control">
			</textarea>
		</div>
		<div class="d-grid gap-2">
		  <input type="submit" value="수정" class="btn btn-danger btn-block my-3">
		  
		</div>
		</form>
		<input type="submit" value="취소" class="btn btn-block btn-outline-primary">
		<button type="list.jsp" class="btn btn-block btn-outline-primary my-3">목록보기</button>
	</div>
	<script>
	function form(){
		let bname=document.querySelector("#bname");
		let btitle=document.querySelector("#btitle");
		let bcontent=document.querySelector("#bcontent");
		
		if(bname.value==""){alert("이름을 작성해주세요."); bname.focus(); return false;}
		if(btitle.value==""){alert("제목을 작성해주세요."); btitle.focus(); return false;}
		if(bcontent.value==""){alert("내용을 작성해주세요."); bcontent.focus(); return false;}
	}
	</script>
<%@ include file="../inc/footer.jsp"%>