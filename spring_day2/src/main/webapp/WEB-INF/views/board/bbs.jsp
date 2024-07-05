<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//alert('게시판정보 페이지입니다. 반갑습니다.!')
</script>
<style type="text/css">
body { /* 컨트롤 + / - 자동주석, 태그선택! */
	background: lightyellow;
}

button {
	background: #18DE02;
}

.t1 { /* .은 클래스 선택!, 여러개선택!  */
	background: yellow;
	width: 150px;
	text-align: center;
}
</style>
</head>
<body>

   <jsp:include page="../common/menubar.jsp"/>
    
    <div class="content">
        <br><br>
        <div class="innerOuter">
	<h3>게시판정보 페이지</h3>
	<hr>
	<a href="main">
		<button id="b1">목차 페이지로</button>
	</a>
	<table border="1">
		<tr>
			<td class="t1">게시판 글쓰기 </td>
			<td><a href="bbs_insert_form">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">게시판 글삭제</td>
			<td><a href="bbs_delete_form">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">게시판 글수정</td>
			<td><a href="bbs_update_form">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">게시판글 검색(상세페이지)</td>
			<td><a href="bbs_one_form">
					<button>GO!!</button>
			</a></td>
		</tr>
		<tr>
			<td class="t1">게시판글 전체목록<br>(여러개)
			</td>
			<td><a href="bbs_list">
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