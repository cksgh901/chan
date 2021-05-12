<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 파라미터(id)가 admin이고 pwd 가 1234이면 success.jsp로 이동
// 그렇지 않으면 로그인 실패라고 출력되는 현재 페이지
if ("admin".equals(request.getParameter("id")) && "1234".equals(request.getParameter("pwd"))) {
	//response.sendRedirect("success.jsp"); // 상대경로
	response.sendRedirect("/web/response/success.jsp?id="+request.getParameter("id")); // 절대경로
} else {
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 실패
</body>
</html>
<% } %>