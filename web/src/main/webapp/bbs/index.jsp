<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>글 목록</h2>
<%
BoardDAO dao = new BoardDAO();
List<BoardVO> list = dao.select();
for(int i = 0 ; i<list.size();i++){  %>
<%= list.get(i).getBoardno() %>
<a href="detail.jsp?boardno=<%= list.get(i).getBoardno() %>"><%= list.get(i).getTitle() %></a>
<%= list.get(i).getRegdate() %><br>
<%
} 
%>
<a href="write.jsp">등록</a>

</body>
</html>