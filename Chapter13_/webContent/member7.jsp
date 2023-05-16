<%@ page language="java" contentType="text/html; charset=EUC-KR"
   import="java.util.*,sec01.ex01.*" pageEncoding="EUC-KR"%>
    
<%
	request.setCharacterEncoding("UTF-8");
%>    

<jsp:useBean id="m" class="sec01.ex01.MemberBean" scope="page" />
<jsp:setProperty name="m" property="*" />

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원 목록창</title>
</head>
<body>
	<table align="center" width="100%">
		<tr align="center" bgcolor="#99ccff">
			<td width="7%">아이디</td>
			<td width="7%">비밀번호</td>
			<td width="5%">이름</td>
			<td width="11%">이메일</td>
			<td width="5%">가입일</td>
		</tr>
		<tr align="center">
			<td>
				<isp:getProperty name="m" property="id" />
			</td>
			<td>
				<isp:getProperty name="m" property="pwd" />
			</td>
			<td>
				<isp:getProperty name="m" property="name" />
			</td>
			<td>
				<isp:getProperty name="m" property="email" />
			</td>
		</tr>
		<tr height="1" bgcolor="#99ccff">
			<td colspan="5"></td>
		</tr>			
	</table>
</body>
</html>