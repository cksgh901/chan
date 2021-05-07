<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%if("kor".equals(request.getParameter("lan"))){%>
헤더
    <%}else{ %>
    HEADER
    <%} %>
    <br>
    session: <%=session.getAttribute("id") %><br>
	request : <%=request.getAttribute("grade") %><br>
