<%@ page contentType="text/html; charset=UTF-8" import="java.util.LinkedList,java.util.List"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head></head>
<body>
    <h1>该作家作品</h1>

    <h2>
        <s:property value="username" />作品：
    </h2>
    <center>书籍名称</center>
<table border="1" align="center">
    <%
    //System.out.println(session);
    List<String> list = (List<String>)session.getAttribute("list");
    List<String> list5 = (List<String>)session.getAttribute("list5");
    //System.out.println(list);
    String username = (String)session.getAttribute("username");
    String authorid = (String)session.getAttribute("authorid");
    //System.out.println(list);
    if(list==null)
    {
    	out.print("<td align=\"center\"><a href=Detail?title="+"nothing"+"&username="+username+">"+"nothing"+"</td>");
    }
    else
    {
    	for (int i = 0; i < list.size(); i++) 
        {
           out.print("<td align=\"center\"><a href=Detail?isbn="+list5.get(i)+"&authorid="+authorid+">"+list.get(i)+"</td>");
        }
    }
     %>
</tr>
</table>
<a href=Login><button type="button">返回主页</button></a>
</body>

</html>