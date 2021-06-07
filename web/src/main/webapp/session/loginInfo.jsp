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
//로그인 여부
// 세션에 로그인 인포가 있으면 로그인상태
%>
<%if(session.getAttribute("loginIfo")!= null){%>
로그인
<%}else{ %>
로그아웃 상태
<%} %>
</body>
</html>