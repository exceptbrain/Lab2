<%@ page contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<center>
    <h1>增加新作者</h1>
    <center>
    <center>
    <s:form action="Addauthorfirst">
        <s:textfield name="name" label="作家名" />
        <s:textfield name="age" label="年龄"/>
        <s:textfield name="country" label="国籍"/>
        <s:submit value="添加"/>
    </s:form>
    </center>
</body>
</html>