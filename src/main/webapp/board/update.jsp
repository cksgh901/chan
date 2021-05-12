<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.*"%>
<%
BoardVO vo = new BoardVO();
vo.setTitle(request.getParameter("title"));
vo.setContent(request.getParameter("content"));
vo.setBoardno(Integer.parseInt(request.getParameter("boardno")));

BoardDAO dao = new BoardDAO();
if (dao.update(vo) > 0) {
	response.sendRedirect("index.jsp");
} else {
	out.print("수정 실패");
}
%>