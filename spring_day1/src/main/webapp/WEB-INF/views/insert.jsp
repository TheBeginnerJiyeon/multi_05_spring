<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%

   	String id = request.getParameter("id");
   	String pw = request.getParameter("pw");
   	String name = request.getParameter("name");
   	String tel = request.getParameter("tel");
   	
  
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가입 id: <%= id %><br>
가입 pw: <%= pw %><br>
가입 name: <%= name %><br>
가입 tel: <%= tel %><br>
</body>
</html>