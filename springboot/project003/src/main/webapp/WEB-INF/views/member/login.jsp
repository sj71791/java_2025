<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib  prefix="form"   uri="http://www.springframework.org/tags/form"  %>
<%@ include  file="../inc/header.jsp" %>
<!--  header -->
<!--  header -->
   <div class="container  my-5  w-50">
      <h3 class="card-header"> WELCOME 로그인 </h3>
      <form:form   method="post"   action="${pageContext.request.contextPath}/member/login"    modelAttribute="memberLoginForm">
         <%-- <form:errors  path="*"  cssClass="text-primary text-center"/>    --%>
         <div class="my-3">
            <label for="username">사용자ID</label>
            <form:input  path="username"   cssClass="form-control"/>
            <form:errors  path="username"  cssClass="text-primary"/>
         </div>    
         <div class="my-3">
            <label for="password">비밀번호</label>
            <form:input   path="password"   cssClass="form-control"/>
            <form:errors  path="password"  cssClass="text-primary"/>
         </div>     
         <div class="my-3 text-center  "> 
            <button  type="submit"  class="btn btn-primary form-control">로그인</button>
         </div>   
         <hr/>
         <div class="container my-5 social text-center">
         	<div class="row">
         		<div class="col-sm-4">
         			<a href="${pageContext.request.contextPath}/oauth2/authorization/kakao" class="w-auto p3">
         				<img alt="kakao Login" src="${pageContext.request.contextPath}/images/kakao.png" />
         			</a>
         		</div>
         		<div class="col-sm-4">
         			<a href="${pageContext.request.contextPath}/oauth2/authorization/naver" class="w-auto p3">
         				<img alt="naver Login" src="${pageContext.request.contextPath}/images/naver.png" />
         			</a>
         		</div>
         		<div class="col-sm-4">
         			<a href="${pageContext.request.contextPath}/oauth2/authorization/google" class="w-auto p3">
         				<img alt="google Login" src="${pageContext.request.contextPath}/images/google.png" />
         			</a>
         		</div>
         	</div>
         </div>
      </form:form>
   </div>
<!--  footer -->
<!--  footer --> 
<%@ include  file="../inc/footer.jsp" %>