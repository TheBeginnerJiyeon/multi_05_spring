<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
<jsp:include page="common/menubar.jsp"/>
	<div class="content"style="height: 600px" >
		나의 첫 홈페이지.!!!
	<hr color="red">
	<a href="member/member">
		<button  class="btn btn-primary">회원CRUD페이지로</button>
	</a>
	<a href="board/bbs">
		<button  class="btn btn-primary"">게시판CRUD페이지로</button>
	</a>
	
		
	</div>
	<jsp:include page="common/footer.jsp"/>
</body>
</html>