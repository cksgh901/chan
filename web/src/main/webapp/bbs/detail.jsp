<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="board.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>글 상세</h2>
<%
BoardDAO dao = new BoardDAO();
//BoardVO vo = dao.selectOne(Integer.parseInt(request.getParameter("boardno")));
String boardno = request.getParameter("boardno");
int boardnoInt = Integer.parseInt(boardno);
BoardVO vo = dao.selectOne(boardnoInt);
%>
제목 : <%=vo.getTitle() %><br>
내용 : <%=vo.getContent() %><br>
작성일 : <%=vo.getRegdate() %>
</body>
</html>