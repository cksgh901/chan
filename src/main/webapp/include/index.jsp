<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 세션에서 로그인 객체를 가지고 오는 소스

// 세션(request)에 저장, 인크루프 파일에서 불러오려고
session.setAttribute("id", "hong");
request.setAttribute("grade", 3);

// 세션에 있는 값을 변수에 저장
String id = (String)session.getAttribute("id");

// grade가 1이면 header.jsp, 2이면 header2.jsp, 3이면 header3.jsp
int grade = (Integer)request.getAttribute("grade");
String pageName = "header.jsp";
if (grade == 1) {
	pageName = "header.jsp";
} else if (grade == 2){
	pageName = "header2.jsp";
} else if (grade == 3) {
	pageName = "header3.jsp";
} 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<jsp:include page="<%=pageName %>">
			<jsp:param name="lan" value="eng"/>
		</jsp:include>
	</div>
	<%//=email %>
	<div>본문</div>
	<div>
	<% if (grade > 0) { %>
		<%@ include file="footer.jsp" %>
	<% } else { %>
		<%@ include file="footer.jsp" %>
	<% } %>
	</div>
	<%//=name %>
	<%
	//String name="";
	%>
</body>
</html>