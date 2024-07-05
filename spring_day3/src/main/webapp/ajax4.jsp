<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				url: "movie",
				data: {
					title : $('#title').val(),
					price : $('#price').val()
				},
				success: function(x) {
					alert(x)
					$("#result").html(x)
				} //success
			}) //ajax
		}) //b1
	}) //$
</script>
</head>
<body>
영화 제목: <input id="title" value="수퍼맨"><br>
영화관람료: <input id="price" value="20000"><br>
	<button id="b1">영화예매 항목 확인</button>
	<hr color="red">
	<div id="result">ajax통신 결과들어가는 곳.</div>
</body>
</html>