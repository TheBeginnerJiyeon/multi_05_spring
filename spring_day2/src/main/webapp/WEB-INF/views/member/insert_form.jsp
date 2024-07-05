<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//alert('회원가입 페이지입니다. 반갑습니다.!')
</script>
<style type="text/css">
body { /* 컨트롤 + / - 자동주석, 태그선택! */
	background: lightblue;
}

button {
	background: pink;
}

.t1 { /* .은 클래스 선택!, 여러개선택!  */
	background: yellow;
	width: 150px;
	text-align: center;
}

#b1 { /* #은 아이디 선택!, 특정한 것 한 개만 선택! */
	color: red;
}

#b2 {
	color: blue;
}
</style>
</head>
<body>

	<!-- 이쪽에 메뉴바 포함 할꺼임 -->
	<jsp:include page="../common/menubar.jsp" />

	<div class="content">
		<br>
		<br>
		<div class="innerOuter">
			<h3>회원가입 페이지</h3>
			<hr>
			<a href="member">
				<button id="b1">첫페이지로</button>
			</a> <img
				src="${ pageContext.servletContext.contextPath }/resources/img/dog1.png"
				width="200" height="200">
			<form action="insert" method="post">
				<table border="1">
					<tr>
						<td class="t1">아이디 :</td>
						<td><input name="id"></td>
					</tr>
					<tr>
						<td class="t1">비밀번호 :</td>
						<td><input name="pw" value="mysql"></td>
					</tr>
					<tr>
						<td class="t1">회원이름 :</td>
						<td><input name="name" value="a"></td>
					</tr>
					<tr>
						<td class="t1">회원전화 :</td>
						<td><input name="tel" value="011"></td>
					</tr>
					<tr>
						<td colspan="2" class="t1">
							<button id="b2">회원가입 데이터 전송</button>
						</td>
					</tr>
				</table>
		
			</form>




		</div>
		<br>
		<br>
	</div>


	<!-- 이쪽에 푸터바 포함할꺼임 -->
	<jsp:include page="../common/footer.jsp" />



</body>
</html>