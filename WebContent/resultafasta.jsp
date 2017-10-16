<%@ page contentType="text/html; charset=UTF-8" import="java.util.LinkedList,java.util.List"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>

    <h2>查找表</h2>
	<% 
	int[][] findtable = (int[][])session.getAttribute("findtable");
	char[] Alphabet = (char[])session.getAttribute("Alphabet");
	%>
	
	
	<div id = "nav"> 
	<table width="100%"  border="0" cellpadding="0" cellspacing="0" >
	<tr>
	<% 
	for(int i = 0; i <Alphabet.length; i++)
	{
	if(Alphabet[i]=='*')
		break;
	if(findtable[i][0]==0)
	{
		continue;
	}
	char tp = Alphabet[i];
	%>
			
	<td width = "3%"><%=tp %></td>
	<%
		}
	%>
	</tr>
	
	<tr>
	<%for(int j=0;j<Alphabet.length;j++)
	{
		for(int i=0;i<20;i++)
		{
			if(findtable[i][j]!=0)
			{
				int loc = findtable[i][j];
			
			     %>
				<td width = 3%> <%=loc %></td>
	<%	} } %>
	</tr>
	<% 
	}
	%>
	</table>
	</div>
	
	
	<h2>位移</h2>
    <% 
    char[] t3 = (char[])session.getAttribute("t3");
	int[][] weiyi = (int[][])session.getAttribute("weiyi");
	int[] flag2 = (int[])session.getAttribute("flag2");
	%>
	
	<div id = "nav"> 
	<table width="100%"  border="0" cellpadding="0" cellspacing="0" >
	<tr>
	<% 
	for(int i = 0; i <t3.length; i++)
	{
	if(t3[i]=='*')
		break;
	char tp2 = t3[i];
	%>
			
	<td width = "3%"><%=tp2 %></td>
	<%
		}
	%>
	</tr>
	
	<tr>
	<%for(int j=0;j<500;j++)
	{
		for(int i=0;i<t3.length;i++)
		{
			String xx = "";
			
			if(j<flag2[i])
			{
				int loc = weiyi[i][j];
				xx = String.valueOf(loc);
			  }
			 %>
				<td width = 3%> <%=xx %></td>
	<%
			} %>
	</tr>
	<% 
	}
	%>
	</table>
	</div>
	
	<h2>结果</h2>
	 <% 
	 Integer re = (Integer)session.getAttribute("re");
	 Integer max = (Integer)session.getAttribute("max");
	 %>
	 <%="最大匹配位移是：" %>
	 <%=re %>
	 <br>
	 <%="匹配数是：" %>
	 <%=max %>
<br>
<br>
<a href=Login><button type="button">返回主页</button></a>
</body>
</html>