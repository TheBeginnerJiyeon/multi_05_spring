<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONObject json = new JSONObject();
	json.put("id", "root"); //map --> HashMap put(key, value)
	json.put("pw", "mysql");
	json.put("tel", "010");
	
	JSONObject json2 = new JSONObject();
	json2.put("id", "root2");
	json2.put("pw", "mysql2");
	json2.put("tel", "0112");
	
	JSONArray array = new JSONArray();
	array.add(json); //list --> 순서! ArrayList, LinkedList add(data)
	array.add(json2);
	
	out.print(array.toJSONString()); 
	//[{id:root, pw:mysql, tel:011},{id:root, pw:mysql, tel:011}]
%>