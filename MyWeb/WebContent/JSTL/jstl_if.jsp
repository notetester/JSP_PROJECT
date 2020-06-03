<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- test에는 조건식이 들어갑니다 -->
	<c:if test="true">
		<b>무조건 실행되는 문장</b>
	</c:if>
	<br>
	<%-- 
	<%if(request.getParameter("name").equals("이순신")){ %>
		<b>이름이 이순신입니다</b>
	<%} %> 
	--%>
	<br>
	<c:if test="${param.name=='이순신' }">
		<b>이름이 이순신입니다</b>
	</c:if>
	<br>
	<c:if test="${param.name eq '홍길동' }">
		<b>이름이 홍길동입니다</b>
	</c:if>
	<hr>
	<!-- 
	age의 파라미터 값이 20이상이면 "성인입니다" 출력
	20 미만이면 "미성년자입니다" 출력
	 -->
	 <c:if test="${param.age >= 20 }">
	 	<b>성인입니다</b>
	 </c:if>
	 <c:if test="${param.age < 20 }">
	 	<b>미성년자입니다</b>
	 </c:if>
</body>
</html>