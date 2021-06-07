<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>게시판</title>
</head>
<body>

	

<h2>글 목록</h2>
<table class="table table-hover">
	<thead>
	<tr>
	
		<th>번호</th>
		<th>제목</th>
		<th>날짜</th>
	</tr>
	</thead>
	<%
	BoardDAO dao = new BoardDAO();
	List<BoardVO> list = dao.select();
	for (int i=0; i<list.size(); i++) { 
		BoardVO vo = list.get(i);
		String s = new SimpleDateFormat("MM/dd/yyyy").format(vo.getRegdate());
		String b = new SimpleDateFormat("HH:mm").format(vo.getRegdate());
	%>
	<tbody>
	<tr>

		<td><%=vo.getBoardno() %></td>
		<td><a href="detail.jsp?boardno=<%=vo.getBoardno() %>"><%=vo.getTitle() %></a></td>
		<td><%=s %> </td>
		</tr>
	</tbody>
		<%
	  	 }
		%>
	
</table>



<hr/>
<a class="btn btn-default"href="write.jsp">등록</a>
</body>
</html>