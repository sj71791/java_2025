<%@page import="org.apache.commons.collections4.bag.SynchronizedSortedBag"%>
<%@page import="com.company.domain.BoardVO"%>
<%@page import="com.company.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file = "inc/header.jsp" %>

<div class="container card my-5">
	<%-- <h4>error</h4>
	<a href="no">없는페이지</a>
	<%=null %> --%>
	
	<h4>DBCP</h4>
	<%@page import = "java.sql.Connection"%>
	<%@page import = "javax.naming.*"%>
	<%@page import = "javax.sql.*"%>
	<%-- <%
		Context initContext = new InitialContext(); // Context 찾겠다- Resource
	    Context envContext  = (Context)initContext.lookup("java:/comp/env"); // 환경Context
	    DataSource ds         = (DataSource)envContext.lookup("jdbc/mbasic"); // pool 이름
	    Connection conn = ds.getConnection();//db연동
	    out.println("db연동");
	%> --%>
</div>
<div class="container card my-5">
	<h3 class="card header">PROJECT (2) MODEL</h3>
	<pre>
		1. DB  :
		2. Dto :
		3. Dao : 
	</pre>
	<%
	BoardDao dao = new BoardDao();
	BoardVO vo = new BoardVO();
	//6. 
	//System.out.println(dao.delete(3));
	
	//5. update 기능
	/* 
	vo.setBtitle("제목-new");
	vo.setBcontent("내용-new");
	vo.setBno(2);
	System.out.println(dao.update(vo));  */
	
	//4. updateHit
	//System.out.println(dao.updateHit(1));
	
	//3. selectAll
	//System.out.println(dao.select(1));
	
	//2. insert(BoardVO vo)
	/*
	vo.setBtitle("첫번째 문의드려요!");
	vo.setBcontent("내용");
	vo.setBname("first");
	System.out.println(dao.insert(vo)); //1
	*/
	
	//1. selectAll
	//System.out.println(dao.selectAll()); 
	%>
</div> 
<div class="container card my-5">
	<h3 class="card header">PROJECT (2) MODEL</h3>
	<pre>
	[webapp] - [board]
				ㄴ list.jsp
				ㄴ write.jsp
				ㄴ detail.jsp
				ㄴ update.jsp
				
	1. markup
	2. vaildator - 오류검삭
	3. 빈칸검사
	</pre>
</div>
<%@include file = "inc/footer.jsp"%>