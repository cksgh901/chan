<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
BoardDAO dao = new BoardDAO();
BoardVO vo = dao.selectOne(Integer.parseInt(request.getParameter("boardno")));

%>
<h2>글읽기</h2>
제목: <%=vo.getTitle() %> <br>
내용: <%=vo.getContent() %><br>
작성일 : <%=vo.getRegdate() %><br>

<a href="edit.jsp?boardno=<%=vo.getBoardno()%>">수정</a>
<a href="delete.jsp?boardno=<%=vo.getBoardno()%>">삭제</a>
</body>
</html>