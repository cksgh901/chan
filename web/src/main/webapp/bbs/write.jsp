<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body>
<h2>글쓰기</h2>
<form action="insert.jsp"method="post">
<input type="text"  name="title"><br>
<textarea  name="content"></textarea><br>
<input type="submit" value="등록">
</form>
</body>
</html>