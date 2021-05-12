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
// 로그아웃 -> 해당 세션(loginInfo)을 삭제
// 1. remove
//session.removeAttribute("loginInfo");

// 2. 세션을 초기화
session.invalidate();
%>
</body>
</html>