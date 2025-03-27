<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
	<div class="container card my-5 text-center">
		<h3 class="card-header">MULTIBOARD</h3>
		<form>
		</form>
		<table class="table table">
		<caption>MULIBOARD-MVC1</caption>
			<thead>
			<tr>
				<th scope="col">NO</th><th scope="col">TITLE</th><th scope="col">WRITER</th>
					<th scope="col">DATE</th><th scope="col">HIT</th>
			</tr>
			</thead>
			<tbody>
			<tr><td>1</td><td><a href="detail.jsp">첫번째 글쓰기입니다.</a></td>
				  <td>ADMIN</td><td>2020-01-02 13:14:30</td><td>1</td></tr>  
			</tbody>
		</table>
	</div>
<%@ include file="../inc/footer.jsp"%>