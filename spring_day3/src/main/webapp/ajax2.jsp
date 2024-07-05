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
			$('#result').empty()
			$.ajax({
				url: "test",
				success: function(x) { //브라우저가 http통신 결과를 받아온다.
					alert("ajax통신결과>> " + x)
					$('#result').append(x + "<br>")
				} //success
			}) //url, success
		}) //b1
		
		$('#b2').click(function() {
			$.ajax({
				url: "test2",
				success: function(x) { //브라우저가 http통신 결과를 받아온다.
					alert("ajax통신결과>> " + x)
					$('#result').append(x + "<br>")
				} //success
			}) //url, success
		}) //b2
	}) //$
</script>
</head>
<body>
	<button id="b1">컴퓨터 구매 항목 확인(test)</button>
	<button id="b2">컴퓨터 구매 항목 확인(test2)</button>
	<hr color="red">
	<div id="result">ajax통신 결과들어가는 곳.</div>
</body>
</html>