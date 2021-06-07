<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="student.*" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// 1. StudentDAO 객체 생성 (db연결, statement객체 생성)
StudentDAO dao = new StudentDAO();
// 2. select() 호출
List<StudentVO> list = dao.select();
request.setAttribute("list", list);
// 3. 리턴값(리스트) 출력
%>
<c:forEach var="vo" items="${list }">
	${vo.studno } ${vo.name } ${vo.id } ${vo.jumin }<br>
</c:forEach>
</body>
</html>