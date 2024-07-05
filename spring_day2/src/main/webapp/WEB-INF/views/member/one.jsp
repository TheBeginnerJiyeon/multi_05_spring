<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
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

			회원검색 처리 요청이 완료되었습니다.<br>
			<br><br>
			아이디 :  ${dto.id} <br>
			<!-- 출력용(expression language-EL)  -->
			패스워드 :  ${dto.pw} <br> 
			이름 : ${dto.name} <br> 
			전화번호 :  ${dto.tel} <br>



		</div>
		<br>
		<br>
	</div>


	<!-- 이쪽에 푸터바 포함할꺼임 -->
	<jsp:include page="../common/footer.jsp" />
</body>
</html>




