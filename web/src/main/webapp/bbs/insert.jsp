<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="board.*" %>
<%
BoardVO vo = new BoardVO();
vo.setTitle(request.getParameter("title"));
vo.setContent(request.getParameter("content"));

BoardDAO dao = new BoardDAO();
 if(dao.insert(vo)>0){
	 out.print("등록 성공");
 }else{
	 out.print("등록 실패");
 }
 %>