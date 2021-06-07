<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.MemberVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// 로그인 여부
// 세션에 loginInfo 있으면 로그인 상태
// 세션에 loginInfo 없으면 로그아웃 상태
%>
<% if (session.getAttribute("loginInfo") != null) { %>
로그인 상태<br>
<%
// 세션에서 MemberVO 객체 가져오기
MemberVO vo = (MemberVO)session.getAttribute("loginInfo");
%>
이름 : <%=vo.getName() %>, 나이 : <%=vo.getAge() %>, 이메일 : <%=vo.getEmail() %>
<% } else { %>
로그아웃 상태
<% } %>
</body>
</html>