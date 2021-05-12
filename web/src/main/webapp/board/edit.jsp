<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
<%
BoardDAO dao = new BoardDAO();
//BoardVO vo = dao.selectOne(Integer.parseInt(request.getParameter("boardno")));
String boardno = request.getParameter("boardno");
int boardnoInt = Integer.parseInt(boardno);
BoardVO vo = dao.selectOne(boardnoInt);
%>
<h2>글수정</h2>
<form action="update.jsp" method="post">
<input type="text" name="title"value="<%=vo.getTitle()%>"><br>
<textarea name="content"><%=vo.getContent() %></textarea><br>
<input type="submit" value="수정">
<input type="hidden" name=boardno value="<%=vo.getBoardno() %>">
</form>
</body>
</html>