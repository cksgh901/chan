<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setAttribute("name", "홍길동");
String contents = request.getParameter("contents").replace("\r\n", "<br>");
%>
</body>
</html>