<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>영화 장르 선택화면입니다.  </h3>
<hr color="red">
<form action="genre" method="post">
	영화 장르 : <input name="genre" value="드라마"><br>
	<button type="submit">서버로 전송</button>
</form>
<br><br>
<form action="movie.do" method="post">
당신이 좋아하는 영화 제목: <input name="title" value="테넷"><br>
당신이 좋아하는 영화 금액: <input name="price" value="15000"><br>
<button>결제금액 계산하기</button>
</form>

<br><br>

<form action="genre2">
영화장르: <input name="movie"><br>
<button>서버로 전송</button>
</form>
</body>
</html>