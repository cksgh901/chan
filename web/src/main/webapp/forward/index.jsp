<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setAttribute("name", "홍길동");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
안녕하세요
<%
// 파라미터 type이 1이면 forward.jsp, 2이면 /include/index.jsp가 포워딩 되도록
String url = "forward.jsp";
if ("2".equals(request.getParameter("type"))) url = "/include/index.jsp";
%>
<jsp:forward page="<%=url %>"/>
</body>
</html>