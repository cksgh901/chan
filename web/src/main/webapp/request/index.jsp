<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 클라이언트 IP : <%=request.getRemoteAddr()%><br>
 캐릭터 인코딩 : <%=request.getCharacterEncoding()%><br> 
 포로토콜 : <%=request.getProtocol() %><br>
 서버명  : <%=request.getServerName() %><br>
 포트번호 : <%=request.getServerPort() %><br>
 전송방식 : <%=request.getMethod() %> <br>
 URI : <%=request.getRequestURI() %><br>
 URL : <%=request.getRequestURL() %><br>
 Context Path : <%=request.getContextPath() %><br>
 
 
</body>
</html>