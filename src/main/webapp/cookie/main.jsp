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
// 로그인 여부 확인
// loginId가 존재하면 로그인상태, 존재하지 않으면 로그아웃 상태
boolean isLogin = false;
Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for (int i=0; i<cookies.length; i++) {
		// loginId가 존재 -> getName() == loginId
		if ("loginId".equals(cookies[i].getName())) {
			isLogin = true;
			break;
		}
	}
}

%>
<% if (isLogin) { %>
로그인 상태
<% } else { %>
로그아웃 상태
<% } %>
</body>
</html>