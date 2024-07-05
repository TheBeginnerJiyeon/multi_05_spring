
<%@page import="com.multi.spring.model.dto.BbsDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
//컨트롤러에서 모델로 지정한 것 request.getAttribute("모델이름");
	BbsDTO bag = (BbsDTO)request.getAttribute("bag"); 
	//작 = (작)큰;
%>
<% 
	session.setAttribute("user", "3131");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">

	$(function() { 
		$('#b1').click(function() {
			$.ajax({
				url: "insert4",
				data: {
					oriid : '<%= bag.getNo() %>',
					content : $('#reply').val(),
					writer : '${user}'
				},
				success: function(response) {
					alert('ajax호출 성공' + response)
					$('#result').append(response)
				}//success
			})//ajax
		})//b1
	})//$
</script>
<style>
body {
background: yellow;
}
</style>
</head>
<body>
<a href="index.jsp">처음페이지로</a>
<a href="list">게시물 전체 목록페이지</a>
<hr color="red">

게시물검색 처리 요청이 완료되었습니다.
<br>
${bag.no}, ${bag.title}, 
${bag.content}, ${bag.writer}
<hr color="red">
댓글달기 <input id="reply"> <button id="b1">댓글달기</button><br>

<hr color="blue">
<div id="result">
	<!-- for-each를 이용해 댓글 목록을 프린트!! -->
	<c:forEach items="${list}" var="re"> 
	- ${re.id}, ${re.content}, ${re.writer} <br>
	</c:forEach>
</div>
</body>
</html>