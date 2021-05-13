<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setAttribute("name", "홍길동");
session.setAttribute("id", "hong");
// 객체
member.MemberVO vo = new member.MemberVO();
vo.setName("고길동");
vo.setAge(30);
vo.setEmail("go");
session.setAttribute("loginInfo", vo);
%>
name : ${requestScope.name }, ${name }<br>
id : ${sessionScope.id }<br>
param(email) : ${param.email }<br>
로그인정보(객체) : 이름 : ${sessionScope.loginInfo.name2 }, 나이 : ${sessionScope.loginInfo.age }<br>
로그인정보(객체) : 이름 : ${loginInfo.name2 }, 나이 : ${loginInfo.age }<br>
param(null) : <%=request.getParameter("grade") == null ? "" : request.getParameter("grade") %><br>
param(null) : ${param.grade }

</body>
</html>










