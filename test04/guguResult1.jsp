<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������ ���â</title>
</head>
<body>
	<c:set var="dan" value="${param.dan }" />
	
	<table border="1" width="800" align="center">
		<tr align="center" bgcolor="lightgreen">
			<td colspan="2">
				<c:out value="${dan }"	/>�� ���
			</td>
		</tr>
		
		<!-- for(i=1; i<=9; i++ -->
		<c:forEach var="i" bagin="1" end="9" step="1"	>
			<tr align = "center">
				<td width="400">
					<c:out vlaue="${dan }" /> * <c:out value="${i }"
					</c:out>.. �ٽ��ϱ�
					
	</table>
</body>
</html>