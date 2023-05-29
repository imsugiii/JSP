<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="member_action.jsp">
		<h1 style="test-align:center">회원 가입창</h1>
		<table align="center">
			<tr>
				<td width="200">
					<p align="right"> 아이디
				</td>
				<td width="400"><input type="text" name="id"></td>
			</tr>
			<tr>
				<td width="200">
					<p align="right"> 비밀번호
				</td>
				<td width="400"><input type="password" name="pwd"></td>
			</tr>		
		</table>
	</form>
</body>
</html>