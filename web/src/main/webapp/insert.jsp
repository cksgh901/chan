<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
아이디 : <%=request.getParameter("id")%><br>
비밀번호 : <%=request.getParameter("pwd")%><br>
이름 : <%=request.getParameter("name")%><br>
성별 : <%="1".equals(request.getParameter("gender")) ? "남" : "여"%><br>
코로나 접종여부 : <%="1".equals(request.getParameter("vac")) ? "접종" : "미접종"%><br>
메모 : <%=request.getParameter("memo")%>
<%
// id와 비밀번호를 가지고 db에서 조회 (select)
//(select한 결과가 있으면) 해당하는 회원을 객체로 저장
//(select한 결과가 없으면) "아이디와 비밀번호를 확인해 주세요"
session.setAttribute("n", request.getParameter("name"));
%>