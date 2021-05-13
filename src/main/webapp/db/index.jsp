<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// 객체 선언
Connection conn = null; // 디비연결
Statement stmt = null; // sql실행
ResultSet rs = null; // 실행결과

// 1. 드라이버클래스 로드
Class.forName("org.mariadb.jdbc.Driver");
// 2. DB 연결
conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/javadb", "javadb", "javadb1234");
// 3. statement객체 생성
stmt = conn.createStatement();
// 4. sql 실행
rs = stmt.executeQuery("select * from student");
// 5. 실행결과 출력
while (rs.next()) {
%>
	<%=rs.getInt("studno") %> <%=rs.getString("name") %> <%=rs.getString("id") %><br>
<%
}
rs.close();
stmt.close();
conn.close();
%>
</body>
</html>








