<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
<div class="container my-5">
	<h3>NAVER BOOK</h3>
	<div class="result">
	</div>
	<script>
	//window.onload = function(){};  브라우저 로딩되면 동작
	//el / $() jquery
	$(function(){
		 $.ajax({
	         url:"${pageContext.request.contextPath}/books",
	         dataType:"json", 
	         type:"GET",
	         success:function(json){ //Object
	        	 //1. 데이터 분해
	        	 //console.log(json);
	        	 let items=json.items;
	        	 //console.log(items[0]); // 객체1개 items[0] = {title:"", image:"",,,,};
	        	 
	        	 
	        	 	 
	        	 for(let i=0; i<items.length; i++){
	        		 let div = $('<div class="card my-3">');	//<div></div> 태그만들기
	        		 let p1 = $('<div class="card-body">').html('<img src="'+items[i].image+'"/>');
	        	 	 let p2 = $('<div class="card-body">').html(items[i].title ); //html reset해서 넣기
	        	 	 div.append(p1).append(p2);	 // div태그 안에 p1추가하고 p2추가
	        	 	 $(".result").append(div);
	        	 }
	        	 //2. 보여줄화면에 껴넣기
	        	 
	         },error:function(xhr, textStatus, errorThrown){
	            $(".result").html(textStatus + "(HTTP-" + xhr.status + "/" + errorThrown);
	         } // $(".result")  document.querySelector(".result")
	      });
	}); // 2. jQuery 브라우저 로딩되면 동작
	</script>
</div>
	<div class="container card my-5 text-center">
		<h3 class="card-header">MULTIBOARD</h3>
		<form>
		</form>
		<table class="table table">
		<caption>MULTIBOARD-MVC1</caption>
			<thead>
			<tr>
				<th scope="col">NO</th><th scope="col">TITLE</th><th scope="col">WRITER</th>
					<th scope="col">DATE</th><th scope="col">HIT</th>
			</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="dto" varStatus="status">
					<tr>
						<td>${list.size() - status.index}</td>
						<td><a href="detail.do?bno=${dto.bno }">${dto.btitle}</a></td>
						<td>${dto.bname}</td>
						<td>${dto.bdate}</td>
						<td>${dto.bit}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<p class="text-end"><a class="btn btn-danger" href="write_view.do">글쓰기</a></p>
	</div>
<%@ include file="../inc/footer.jsp"%>