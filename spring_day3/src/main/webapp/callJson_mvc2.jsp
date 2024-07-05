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
		$('#b3').click(function() {
			$.ajax({
				url: "jsonbbs",
				success: function(array) {
					console.log(array) //
					
					header = "<table><tr><td width=200>아이디</td><td width=200>제목</td><td width=200>내용</td><td  width=200>작성자</td></tr>"
					$('#result').append(header)
					
					$(array).each(function(i, json) { 
						//function(인덱스저장변수, 하나씩꺼내서넣어줄변수) 순서대로 써주어야함.
						id_value = json.no
						title_value = json.title
						content_value = json.content
						writer_value = json.writer
						
						mid = "<tr><td width=200>" + id_value + "</td><td width=200>" + title_value + "</td><td width=200>" + content_value + "</td><td width=200>" + writer_value + "</td></tr>"
						$('#result').append(mid) 
					}) //for
					
					under = "</table>"
					$('#result').append(under)
				}//success
			})//ajax
		})//b3
	})//$
</script>
</head>
<body>
	<button id="b3">JSON으로 받아와보자(list)</button>
	<hr color="red">
	<div id="result" style="background: yellow; width:800px; hegith:800px;">ajax통신 결과들어가는 곳.<hr></div>
</body>
</html>