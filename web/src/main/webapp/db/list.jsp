<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="chapter20.*" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
StudentDAO dao = new StudentDAO();
%>
<%for(int i =0; i<dao.select().size();i++){%>
<%=dao.select().get(i).getStudno() %> 
<%=dao.select().get(i).getName() %>
 <%=dao.select().get(i).getId() %><br>
<%} %>
</body>
</html>