<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONObject json = new JSONObject();
	json.put("id", "root");
	json.put("pw", "mysql");
	json.put("tel", "011");
	out.print(json.toJSONString()); 
	//{id:root, pw:mysql, tel:011}
%>