<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Enumeration<String> headerEnum = request.getHeaderNames();

while(headerEnum.hasMoreElements()) {
	//out.print(headerEnum.nextElement());
	out.print(request.getHeader(headerEnum.nextElement()));
	out.print("<br>");
}
%>
</body>
</html>