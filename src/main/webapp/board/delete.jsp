<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.*"%>
<%
BoardDAO dao = new BoardDAO();
int r = dao.delete(Integer.parseInt(request.getParameter("boardno")));
if (r > 0) {
	response.sendRedirect("index.jsp");
} else {
	out.print("삭제 실패");
}
%>