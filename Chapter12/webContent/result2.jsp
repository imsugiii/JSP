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
	<%
		if (id==null || id.length() == 0)
		{
	%>		
			아이디를 입력 하세요. <br>
			<a href="/Chapter12/Login.html">로그인하기</a>		
	<%
		} else {
	%>	
			<h2><%= id %>님 환영합니다.</h2>
	<%
		}
	%>
</body>
</html>