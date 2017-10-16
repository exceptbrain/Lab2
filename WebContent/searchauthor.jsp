<%@ page contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<br>
	<br>
	<br>
    <center>
    <s:form action="Search">
        <s:textfield name="username" label="待查找作者名"/>
        <s:submit value="开始查询"/>
     </s:form>
    </center>
</body>
</html>