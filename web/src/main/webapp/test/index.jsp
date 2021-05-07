<%@page import="java.util.Date"%>
<%@page import="web.Calculator"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String name = "홍길동";
System.out.println(name);

for(int i = 0; i<15; i++){
	out.print(name+"<br>");
}

Calculator cal = new Calculator();

%>
<%=new java.util.Date()%>
<%=cal.puls(10, 20) %>
</body>
</html>