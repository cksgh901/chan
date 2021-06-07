<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원가입</h2>
<form action="insert.jsp" >
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="password" name="pwd"><br>
이름 : <input type="text" name="name"><br>
성별 : <input type="radio" name="gender" value="1" id="g1" checked><label for="g1">남</label> 
<input type="radio" name="gender" value="2" id="g2"><label for="g2">여</label> <br>
코로나 접종여부 : <input type="checkbox" name="vac" value="1"> 접종 <br>
메모 : <textarea name="memo"></textarea><br>
<input type="submit" value="전송">
</form>
</body>
</html>