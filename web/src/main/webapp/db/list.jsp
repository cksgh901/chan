<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="chapter20.*" %>
<<<<<<< HEAD
  
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
=======
  <%@page import= "java.util.*" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
//1. StudentDAO 객체 생성 (db연결 ,statement생성)
StudentDAO dao = new StudentDAO();
List<StudentVo> list =dao.select();
request.setAttribute("list", list);
int count = 0;
List<StudentVo> list2 = (List<StudentVo>)request.getAttribute("list");

%>

<%
//2. select 메소드 불러오기
for(int i =0; i<list.size();i++){count++;%>
No.<%= count %>
<%= dao.select().get(i).getStudno() %> 
<%=dao.select().get(i).getName() %>
 <%=dao.select().get(i).getId() %>
 <%=dao.select().get(i).getJumin() %><br>
>>>>>>> refs/remotes/origin/master
<%} %>
</body>
</html>