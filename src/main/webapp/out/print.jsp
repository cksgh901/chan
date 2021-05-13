<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int score = 50;
String gradeA = "A";
String gradeB = "B";
String gradeC = "C";
String gradeD = "D";
String gradeF = "F";
// score가 90이상이면 A출력, 80이상이면 B, 70이상이면 C, 60이상이면 D
// 그렇지 않으면 F라고 출력
%>
<% if (score >= 90) { %>
<input type="text" name="grade" value="<%=gradeA %>">
<% } else if (score >= 80) { %>
<%=gradeB %>
<% } else if (score >= 70) { %>
<%=gradeC%>
<% } else if (score >= 60) { %>
<%=gradeD%>
<% } else { %>
<%=gradeF%>
<% } %>
<%
if (score >= 90) {
	out.print("<input type=\"text\" name=\"grade\" value=\""+gradeA+"\">");
} else if (score >= 80) {
	out.print(gradeB);
} else if (score >= 70) {
	out.print(gradeC);
} else if (score >= 60) {
	out.print(gradeD);
} else {
	out.print("<script>alert(\"탈락\");</script>");
}
%>