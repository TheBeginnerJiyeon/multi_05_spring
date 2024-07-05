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
				url: "json.jsp",
				dataType: "json",// 데이터타입을 제이슨타입으로 받겠다
				success: function(json) {
					//{id:root, pw:mysql, tel:011}
					$('#result').html(json.tel)
				}//success
			})//ajax
		})//b1
		
		$('#b2').click(function() {
			$.ajax({
				url: "json2.jsp",
				dataType: "json",
				success: function(array) {
					$('#result').html(array[0].tel)
				}//success
			})//ajax
		})//b2
		
	})//$
</script>
</head>
<body>
	<button id="b1">JSON으로 받아와보자.!</button>
	<button id="b2">JSON2으로 받아와보자.!</button>
	<hr color="red">
	<div id="result">ajax통신 결과들어가는 곳.</div>
</body>
</html>