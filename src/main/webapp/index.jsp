<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% if (session.getAttribute("n") == null) { %>
�α��� ���ּ���
<% } else { %>
<%=session.getAttribute("n") %>�� �ȳ��ϼ���
<% } %>
<br>
session.getAttribute("n") : <%=session.getAttribute("n") %>
</body>
</html>