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
<%=session.getAttribute("n") %>�� �ȳ��ϼ���
<% } else { %>
�α��� ���ּ���
<% } %>
<br>
session.getAttribute("n") : <%=session.getAttribute("n") %>
</body>
</html>