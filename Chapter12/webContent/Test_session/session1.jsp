<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	String name=(String)session.getAttribute("name");
 	session.setAttribute("address","부산시 사상구");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>session 내장 객체 테스트1</title>
</head>
<body>
	이름은 <%= name %>입니다. <br>
	<a href=session3.jsp>두 번째 페이지로 이동</a>
</body>
</html>