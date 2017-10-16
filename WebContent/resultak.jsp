<%@ page contentType="text/html; charset=UTF-8" import="java.util.LinkedList,java.util.List"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>

    <h2>第一段</h2>
	<% 
	char[] str1 = (char[])session.getAttribute("str1");
	%>
	<%=str1 %>
	
	
	<h2>第二段</h2>
    <% 
    char[] str2 = (char[])session.getAttribute("str2");
	%>
	<%=str2 %>
	
	<h2>第三段</h2>
	 <% 
	 char[] str3 = (char[])session.getAttribute("str3");
	 %>
	 <%=str3 %>
<br>
<br>
<a href=Login><button type="button">返回主页</button></a>
</body>
</html>