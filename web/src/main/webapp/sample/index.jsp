<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${result }
<form  action="/web/sample.do?type=2"  method="post"">
<input type="submit" name="log" >b
<a href="/web/sample.do?type=1">a</a>
</form>
</body>
</html>