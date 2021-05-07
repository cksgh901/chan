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
//파라미터 값 가져오기
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

//로그인 성공시(id==admin&&pwd==admin)
if("admin".equals(id)&&"admin".equals(pwd)){
//쿠키 객체 생성
Cookie cookie = new Cookie("loginId",id);
response.addCookie(cookie);
cookie.setMaxAge(60*60);
//cookie.setDomain("localhost");
%>
로그인 성공
<%
}else{
%>
로그인 실패
<%
} 
%>
</body>
</html>