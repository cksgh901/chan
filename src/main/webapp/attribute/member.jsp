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
MemberVO vo = new MemberVO();
// 1.
request.setAttribute("vo", vo);

vo.setName("홍길동");
vo.setAge(30);
vo.setEmail("hong@gmail.com");

// 2.
%>


<%
MemberVO vo2 = (MemberVO)request.getAttribute("vo");
vo.setName("김길동");
%>
<%=vo2.getName() %> <%=vo2.getAge() %> <%=vo2.getEmail() %>


<%
request.setAttribute("vo", "홍길동");
out.print(request.getAttribute("vo"));
%>
</body>
</html>