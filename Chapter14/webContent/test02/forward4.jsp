<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
    
<%
  request.setCharacterEncoding("utf-8");
  // 주소 정보 바인딩
  // request 내장 객체에 바인딩
  request.setAttribute("id","hong");
  request.setAttribute("pwd","1234");
  session.setAttribute("name","홍길동");
  application.setAttribute("email","hong@test.com");
  // 주소 정보 추가
  request.setAttribute("address","서울시 강남구");
%>
    
<html>
	<head>
	   <meta charset=”UTF-8">
	   <title>forward</title>
	</head>
	<body>
		<jsp:forward page="member4.jsp" />
</html>
