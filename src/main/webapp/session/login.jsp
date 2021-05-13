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
// 파라미터 값 가져오기
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

// 로그인 성공 시(id==admin && pwd == admin)
if ("admin".equals(id) && "admin".equals(pwd)) {
	// 세션에 저장
	MemberVO vo = new MemberVO();
	vo.setName("관리자");
	vo.setAge(30);
	vo.setEmail("admin@gmail.com");
	session.setAttribute("loginInfo", vo);
	
%>
	로그인 성공
<%
} else {
%>
	로그인 실패
<%
}
%>
</body>
</html>