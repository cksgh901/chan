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
Cookie[] cookies = request.getCookies();
if(cookies != null){
for(int i=0; i<cookies.length;i++){%>
	<%=cookies[i].getName()%> : <%=java.net.URLDecoder.decode(cookies[i].getValue(),"utf-8")%><br>
<% }
}%>

</body>
</html>