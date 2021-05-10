<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="member.MemberVO" %>
    <%@ page import="java.util.*" %>
    <%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="홍길동" />
${name }<br>
<c:remove var="name"/>
${name }<br>

<!--  파라미터 id가 hong이면 출력 -->
<c:if test="${param.id ==' hong '}" >
id : ${param.id}
</c:if>
<c:if test="${param.id != 'hong' }">
홍길동이 아닙니다.
</c:if>


<c:if test="${!empty sessionScope.loginInfo }">
${sessionScope.loginInfo.name}님 안녕하세요
</c:if><br>
<c:if test="${empty sessionScope.loginInfo }">
로그인해주세요
</c:if><br>
<!--  나이가 50> 50대 ... 40대 ,30대,20대 -->
<c:choose>
	<c:when test="${sessionScope.loginInfo.age >=50 && sessionScope.loginInfo.age < 60 }>50대"></c:when>
	<c:when test="${sessionScope.loginInfo.age >=40 }">40대</c:when>
	<c:when test="${sessionScope.loginInfo.age >=30}">30대</c:when>
	<c:when test="${sessionScope.loginInfo.age >=20 }">20대</c:when>
	<c:otherwise>기타</c:otherwise>
</c:choose>
<c:if test="${sessionScope.loginInfo.age >=20 && sessionScope.loginInfo.age < 30}>20대"></c:if>
<br>
<!--  1~10까지 출력 -->
<c:forEach var="i" begin="1" end="10">
${i }
</c:forEach>
<br>
<%
List<MemberVO>list = new ArrayList<MemberVO>();
MemberVO vo = new MemberVO();
vo.setName("홍길동");
vo.setAge(30);
list.add(vo);

vo = new MemberVO();
vo.setName("고길동");
vo.setAge(40);
list.add(vo);

vo = new MemberVO();
vo.setName("최길동");
vo.setAge(50);
list.add(vo);

request.setAttribute("memberlist",list);
%>
<!--  java 코드 출력 -->
<%
List<MemberVO> memberlist = (List<MemberVO>)request.getAttribute("memberlist");
for(int i =0; i<memberlist.size();i++){
%>	
	이름 : <%=memberlist.get(i).getName() %> 나이 : <%= memberlist.get(i).getAge() %><br>
<%
}
%>
<!--  jstl로 출력 -->
<c:forEach var="member"  items="${memberlist }" varStatus="idx">
	번호 :${idx.index+1} , 이름:${member.name } 나이 : ${member.age }<br>
</c:forEach><br>
<%
String name = "김길동";
%>
<c:out value="<%=name %>"/>

</body>
</html>