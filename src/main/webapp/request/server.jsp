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
// name 이름의 파라미터명으로 값을 받아
String name = request.getParameter("name");

// 배열로 처리하는 방법
String[] citys = request.getParameterValues("city");
%>
name : <%=name %><br>
name2 : <%=request.getParameter("name2") %><br>
password : <%=request.getParameter("password") %><br>
contents : <%=request.getParameter("contents").replace("\r\n","<br>") %><br>
city : <% 
if (citys != null) {
	for (int i=0; i<citys.length; i++) { 
		out.println(citys[i]);
	}
}
%>
<% if (citys != null) { %>
<% for (int i=0; i<citys.length; i++) { %>
<%=citys[i] %>
<% } %>
<% } %>
<br>
gender : <%=request.getParameter("gender") %><br>
hobby :
<%
String[] hobbys = request.getParameterValues("hobby");
if (hobbys != null) {
	for (int i=0; i<hobbys.length; i++) {
		out.println(hobbys[i]);
	}
}
%>
</body>
</html>








