<%--로그인 시도를 하는 페이지--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width", initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>JSP 게시판 웹 사이트</title>
</head>
<body>
	<% 
		session.invalidate();
		
	%>
	<script>
		location.href = 'main.jsp'
	</script>
	<%-- history.back()은 login.jsp 페이지로 다시 돌려보내는 것 --%>
</body>
</html>