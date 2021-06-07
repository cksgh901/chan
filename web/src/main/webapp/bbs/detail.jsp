<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="board.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body>
<h2>글 상세 </h2>
<%
BoardDAO dao = new BoardDAO();
//BoardVO vo = dao.selectOne(Integer.parseInt(request.getParameter("boardno")));
String boardno = request.getParameter("boardno");
int boardnoInt = Integer.parseInt(boardno);
BoardVO vo = dao.selectOne(boardnoInt);
%>
<div id="title"style="background-color:#373131;height:30px;widthl:100px">제목 : <%=vo.getTitle() %><br></div>
내용 : <%=vo.getContent() %><br>
작성일 : <%=vo.getRegdate() %><br>
<a href ="fix.jsp?boardno=<%=boardno%>">수정</a>
<a href ="delete.jsp?boardno=<%=boardno%>">삭제</a>
</body>
</html>