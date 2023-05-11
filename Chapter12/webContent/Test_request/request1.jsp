<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// session과 application 내장 객체에 바인딩
	session.setAttribute("name","정수현");
	application.setAttribute("address","부산시 사상구");
%>    

<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>첫 번째 JSP</title>
	</head>
	<body>
		<%
			//request 객체를 다른 JSP파일로 포워딩
			RequestDispatcher dispatch = request.getRequestDispatcher("request2.jsp");
			dispatch.forward(request,response);
		%>
	</body>
</html>