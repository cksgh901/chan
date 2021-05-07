<%@page import="java.net.URLEncoder"%>
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
//쿠키객체생성
Cookie cookie = new Cookie("id","hong");
response.addCookie(cookie);
response.addCookie(new Cookie("name", java.net.URLEncoder.encode("홍길동","utf-8")));
%>

쿠키 이름 : <%=cookie.getName() %><br>
값    : <%=cookie.getValue() %><br>
</body>
</html>