<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<%@ page import = "web.*" %>
<%!
// 선언부
public int minus(int x, int y) {
	return x-y;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// 한줄주석
/*
여러줄주석
여러줄주석
*/
String name = "홍길동";
System.out.println(name);

for (int i=0; i<10; i++) {
	out.println(name+"<br>");
}

Calculator calc = new Calculator();
%>
<%=new Date() %> <!-- 한줄 주석 -->
<%=calc.plus(10, 20) %>
<%=minus(20,10) %>
</body>
</html>