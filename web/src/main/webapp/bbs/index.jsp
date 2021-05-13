<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />


</head>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class ="container">
		<div class= "navbar-head">
			<button type="button" class="navbar-toggle xollapsed"data-toggle="collapse"
			data-target="#navbar" aria-expanded="false" aria-controls="navbar">메뉴
			<span class="sr-only">Toggle navigation</span>
			<span class ="icon-bar"></span>
			<span class ="icon-bar"></span>
			<span class ="icon-bar"></span>
			</button>
		
	</div>
</div>
</nav>
<div style="text-align:center;"> <h2>글 목록</h2> </div>
<hr/>
<body>

<div class ="container">
 <table class="table table-hover">
 
 
 <thead>
 <tr>
 		<th>번호</th>
 		<th>제목</th>
 		<th>날짜</th>
 </tr>
 </thead>
 

 <tbody>
 <tr>
  <%
 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
 Calendar c1 = Calendar.getInstance();
String b = sdf.format(c1.getTime());
BoardDAO dao = new BoardDAO();
List<BoardVO> list = dao.select();
dao.close();
for(int i = 0 ; i<list.size();i++){
	String s = new SimpleDateFormat("MM/dd").format(list.get(i).getRegdate());
	// 오늘 글이면 시간만 아니면 날짜만
	if(s.equals(b)){
		s=new SimpleDateFormat("HH:mm").format(list.get(i).getRegdate());
	}
	%>
	
 			<td><%= list.get(i).getBoardno() %></td>
 			<td><b><a href="detail.jsp?boardno=<%= list.get(i).getBoardno() %>"><%= list.get(i).getTitle() %></a></b></td>
 			<td><%= s%></td>
</tr>
</tbody>
<%
} 
%>
</table>
<a href="write.jsp"style="color: #ffffff;
background: #3379FE;
font-size: 1em;
padding: 0.3em 0.5em;
margin-right: 0.1em ">등록</a>
<hr/>
 
</div>

</body>
</html>