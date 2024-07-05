<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
button {
	width: 200px;
	height: 150px;
}
</style>
</head>
<body>


<!-- use scott;       
         
 CREATE TABLE REPLY (
    ID int auto_increment primary key,
    ORIID int,
    CONTENT VARCHAR(500),
    WRITER VARCHAR (10) NOT NULL,
     FOREIGN KEY (ORIID) REFERENCES BOARD(NO),
     FOREIGN KEY (WRITER) REFERENCES MEMBER(ID)
);        
      -->    
         
	<a href="bbs_mvc2.jsp">
		bbs_mvc2
	</a>
	<br>
		<a href="ajax2.jsp">
		 컴퓨터구매1
	</a>
	<br>
	<a href="ajax3.jsp">
		컴퓨터구매2
	</a>
	<br>
	<a href="ajax4.jsp">
		영화예메
	</a>
	<br>
	<a href="callJson_mvc1.jsp">
		callJson_mvc1
	</a>
	<br>
	<a href="callJson_mvc2.jsp">
		callJson_mvc2
	</a>
	<br>
	<a href="callJson_mvc2_db.jsp">
		callJson_mvc2_db.jsp
	</a>
		<br>
	<a href="kakao_map_one.jsp">
		kakao_map_one
	</a>
	<br>
	
	<!--  CREATE TABLE mymap (
    location VARCHAR(100),
    lat VARCHAR (100),
    lon VARCHAR (100)
);         -->
	<a href="kakao_map_one2_db.jsp">
		kakao_map_one2_db
	</a>
	<br>
	<a href="kakao_map_multi.jsp">
		kakao_map_multi
	</a>
	<br>
	
	

	

	<br>
	<a href=" weather.jsp">
		날씨테스트
	</a>	
	<br>	
	<br>
	
	

	<br>
	<a href=" cat_gangwon.jsp">
		강원도 강릉시_길고양이중성화사업관리현황
	</a>
	<a href="https://www.data.go.kr/data/15093766/fileData.do#layer-api-guide">URL</a>	
	<br>	
	<br>
	
	
	
	
	
	
	
	
</body>
</html>