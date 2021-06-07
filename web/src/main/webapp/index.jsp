<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% if (session.getAttribute("n") != null) { %>
<%=session.getAttribute("n") %>님 안녕하세요
<% } else { %>
로그인 해주세요
<% } %>
<br>
session.getAttribute("n") : <%=session.getAttribute("n") %>
</body>
</html>