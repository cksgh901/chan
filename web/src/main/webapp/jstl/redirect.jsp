<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  <!-- redirect로 접속하면 index로 이동 -->
<c:redirect url="/jstl/index.jsp"/>
<%response.sendRedirect("/web/jstl/index.jsp"); %>
