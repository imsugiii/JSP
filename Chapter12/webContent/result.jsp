<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("user_id");
	String pw = request.getParameter("user_pw");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>로그인 결과</title>
</head>
<body>
	<h1>로그인 결과출력</h1>
	<h2>아이디: <%= id %></h2>
	<h3>비밀번호: <%= pw %></h3>
</body>
</html>