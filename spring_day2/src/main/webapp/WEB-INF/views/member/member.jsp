<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
</style>
</head>
<body>

 <!-- 이쪽에 메뉴바 포함 할꺼임 -->
    <jsp:include page="../common/menubar.jsp"/>
    
    <div class="content">
        <br><br>
        <div class="innerOuter">
	<h3>회원정보 페이지</h3>
	<hr>
	<a href="main">
		<button id="b1">메인 페이지로</button>
	</a>
	<table border="1">
		<tr>
			<td class="t1">회원가입</td>
			<td><a href="insert_form">
					<button>GO!!</button>
			</a></td>
		</tr>
						<tr>
			<td class="t1">회원탈퇴</td>
			<td><a href="delete_form">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">회원수정</td>
			<td><a href="update_form">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">회원검색(한명)</td>
			<td><a href="one_form">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">회원전체목록<br>(여러명)
			</td>
			<td><a href="list">
					<button>GO!!</button>
			</a></td>
		</tr>
	</table>
	
	        </div>
        <br><br>
    </div>
    
    
    <!-- 이쪽에 푸터바 포함할꺼임 -->
    <jsp:include page="../common/footer.jsp"/>
</body>
</html>