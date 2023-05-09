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
<title>로그인결과</title>
</head>
<body>
	<%
		if (id==null || id.length() == 0)
		{
	%>		
			아이디를 입력하세요.<br>
			<a href="/Chapter12/Login.html">로그인하기.</a>		
	<%
		} else {
			if(id.equals("admin")){
	%>	
			<h1>관리자로 로그인 했습니다.</h1>
			<form>
				<input type = button value = "회원정보 삭재허가"	/>
				<input type = button value = "회원정보 수정하기"	/>
			</form>
	<%
			}
		}
	%>
</body>
</html>