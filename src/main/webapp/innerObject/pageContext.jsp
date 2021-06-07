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
HttpServletRequest request2 = (HttpServletRequest)pageContext.getRequest();
out.print(request == request2);
%>
</body>
</html>