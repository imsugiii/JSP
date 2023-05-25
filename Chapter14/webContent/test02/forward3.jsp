<%@ page language="java" contentType="text/html; charset=UTF-8"
   	import="java.util.*, sec01.ex01.*" pageEncoding="UTF-8"
   	isELIgnored="false" %>
<%
	request.setCharacterEncoding("utf-8");
  // ArrayList 객체 생성
  List memberList = new ArrayList();
  // MemberBean 객체 생성 후 회원 정보 저장
  MemberBean m1 = new MemberBean("lee","1234","이순신","lee@test.com");
  MemberBean m2 = new MemberBean("son","1234","손흥민","son@test.com");
  // ArrayList에 2명의 정보 저장
  memberList.add(m1);
  memberList.add(m2);
  request.setAttribute("membersList",memberList);
%>
    
<html>
	<head>
	   <meta charset=”UTF-8">
	   <title>forward3</title>
	</head>
	<body>
		<jsp:forward page="member3.jsp" />
</html>
