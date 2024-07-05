<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/out.css">

<title>Insert title here</title>
</head>
<body>

	welcome!! spring world!!!
	<a href="hi">hi call 한글한글</a>

	<hr color="red">
	<img src="resources/img/ok.jpg">

	<br>
	<br>

	<!-- <a href="WEB-INF/views/member.jsp">
		<button id="b1">첫페이지로</button>
	</a>  
	WEB-INF 내부 뷰는 보안때문에 접근 불가!!
 -->
 
 	 <jsp:forward page="WEB-INF/views/member.jsp"/>
 	 <!-- 바로 전환 -->


</body>
</html>