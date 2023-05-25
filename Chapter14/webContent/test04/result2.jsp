<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty param.userID }">
		아이디를 입력하세요.<br>
		<a href="login.jsp">로그인창</a>
		</c:if>
	<!-- 아이디를 입력했을 때 -->
	<c:if test="${not empty param.userID }">
		<!-- 관리자로 로그인 했을 때 -->
		<c:if test="${param.userID == 'admin' }">
			<h1>관리자로 로그인 하였습니다.</h1>
			<form>
				<input type=button value="회원정보 삭제하기" />
				<input type=button value="회원정보 수정하기" />
			</form>
			
		<!-- 관리자가 아닐때 -->
		<c:if test="${param.userID != 'admin'}">
			<h1>환영합니다.
			 <c:out value="${param.userID}" />님!!!</h1>
		</c:if>
	</c:if>
</c:if>
</body>
</html>