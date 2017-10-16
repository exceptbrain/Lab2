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
    <s:form action="Gok">
        <s:textfield name="filek" label="文件的路径"/>
        <s:textfield name="svalue" label="s值"/>
        <s:textfield name="tvalue" label="t值"/>
        <s:submit value="开始"/>
    </s:form>
    
    
    
    </center>
</body>
</html>