<%@page import = "java.sql.*" %>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	String name=request.getParameter("name");
	String pw=request.getParameter("pw");
	
	Connection conn=null; PreparedStatement pstmt=null; ResultSet rset=null;
	String sql="select count(*) `cnt` from member where name=? and pass=?";
	int result=-1;
	try{
		Class.forName("com.sql.cj.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:sql://localhost:3306/mbasic","root","1234");
		//if(conn!=null){out.println("db 성공!");}
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, pw);
		rset=pstmt.executeQuery();
		if(rset.next()){result=rset.getInt("cnt");} //줄,칸
		
		if(result==1){ //아이디와 비밀번호가 같은사람 1명
			request.getRequestDispatcher("jsp022_my.jsp").forward(request, response);
			session.setAttribute("username", name); // 세션정보유지하기 #
		}else{
			out.println("<script>alert('정보를 확인해주세요'); history.go(-1); </script>");
		}
	}catch(Exception e){e.printStackTrace();}
	finally{
		if(pstmt != null){pstmt.close();}
		if(rset != null){rset.close();}
		if(conn != null){conn.close();}
	}
%>
<!-- - 데이터값 넘겨받기
          - 드라이버연동 / db연동 / sql처리 / 결과값 확인
          - 아이디와 비밀번호가 같은지 userinfo 에서 검색
          - 찾았으면 [경로안바뀌게] , 보이는 화면은 jsp022_login_my.jsp 페이지로 넘어가기 / 
            못찾았으면 정보를 확인해주세요~ 알림창띄우고 로그인페이지로 jsp022_login.jsp 페이지로
          
          select count(*) from member where name=? and pass=? -->