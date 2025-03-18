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
		<h3 class="card-header">FORM-SCORE</h3>
		<%
			int kor = Integer.parseInt(request.getParameter("kor"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			int ma  = Integer.parseInt(request.getParameter("ma"));
			int total=kor+eng+ma;
			double avg=total/3.0;
			char lv;
			if(avg>=90){lv='A';}
			else if(avg>=80){lv='B';}
			else if(avg>=70){lv='C';}
			else{lv='D';}
			String pass;
			if(avg>=60 && eng>=40 && kor>=40 && ma>=40){pass="합격";}
			else{pass="불합격";}		
		%>
		<table class="table table-bordered table-striped table-hover my-5">
		  <caption>성적처리</caption>
          <thead>
            <tr>
              <th scope="col">KOR</th>
              <th scope="col">ENG</th>
              <th scope="col">MATH</th>
              <th scope="col">TOTAL</th>
              <th scope="col">AVG</th>
              <th scope="col">PASS</th>
              <th scope="col">LEVEL</th>
            </tr>
          </thead>
          <tbody>
          	<tr>
	          	<td><%=kor %></td>
	          	<td><%=eng %></td>
	          	<td><%=ma %></td>
	          	<td><%=total %></td>
	          	<td><%=String.format("%.2f",avg) %></td>
	          	<td><%=pass %></td>
	          	<td><%=lv%></td>
          	</tr>
          </tbody>
        </table>
		<p><a href="jsp009_score.jsp" class="btn btn-danger">HOME</a></p>
	</div>
</body>
</html>