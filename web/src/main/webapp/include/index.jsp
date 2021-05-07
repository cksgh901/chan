<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // 세션에서 로그인 객체를 가지고 오는소스
    // 세션(request)에 저장 인크루프 파일에서 불러오려고
    session.setAttribute("id", "hong");
    request.setAttribute("grade", 1);
    
    // 세션에 있는값을 변수에 저장
    String id = (String)session.getAttribute("id");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<jsp:include page="header.jsp">
		<jsp:param value="eng" name="lan"/>
		</jsp:include>
	
	</div>
	
	<div>본문</div>
	<div>
		<%@ include file = "footer.jsp" %>
	</div>
	<%= name %>
</body>
</html>