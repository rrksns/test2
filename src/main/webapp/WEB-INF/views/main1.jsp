<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container" align="center">
	<h2 class="text-primaty">테스트</h2>
	<table class="table table-hover">
		<tr><th>a</th><th>b</th><th>c</th></tr>
<c:if test="${empty list }">
		<tr><td colspan="3">데이터가 없습니다</td></tr>
</c:if>
<c:if test="${not empty list }">
	<c:forEach var="test2" items="${list}">
		<tr><td>${test2.a }</td><td>${test2.b }</td><td>${test2.c }</td></tr>		
	
	</c:forEach>
		</c:if>
	</table>
	
	</div>
	
</body>
</html>