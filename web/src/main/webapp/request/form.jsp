<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // DB에서 데이터터를 조회했다고 가정하고
    String name = "김길동";
    String contents = "안녕하세요";
    int city = 1;
    int gender = 2;
    int studno = 999999;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function cheak() {
	if(document.getElementByid("pwb").va;ue !=""){
	alert('전송');
	}else{
		
	}
}
</script>
</head>
<body>
<form action="server.jsp" method="get" > 
<input type="text" name="name" value="<%=name%>"readonly><br>
<input type="text" name="name2" value="<%=name%>"disabled><br>
<input type="password" name="password" id="pwb"><br>
<textarea name="contents" row ="5" cols="20">안녕하세요</textarea>
<select name ="city" >
	<option value="0"<%if(city==0) out.print("selected"); %>>서울</option>
	<option value="1"<%if(city==1) out.print("selected"); %>>경기</option>
	<option value="2"<%if(city==2) out.print("selected"); %>>인천</option>
	<option value="3"<%if(city==3) out.print("selected"); %>>부산</option>
	<option value="4"<%if(city==4) out.print("selected"); %>>제주</option>
 </select>
 <input type="radio"name="gender" value="1">남
 <input type="radio"name="gender" value="2" checked>여<br>
 <input type= "checkbox" name = hobby value="1">영화 
 <input type= "checkbox" name = hobby value="2" checked>게임
 <input type= "checkbox" name = hobby value="3">독서 
 <input type= "checkbox" name = hobby value="4">등산 <br>
 <input type = "file"> <br>
 <input type = "button" value="버튼"onclick="cheak();">
 <button>버튼</button>
<input type="submit" value="전송"><br>
<input type="date"><br>
<input type = "number"><br>
<input type = "hidden" name="studno" value="999999"><br>
<input type= "image" src="/web/img/google.jpg">
</form>
</body>
</html>