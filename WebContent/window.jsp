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
    <s:form action="Gowindow">
        <s:textfield name="filew1" label="文件1的路径"/>
        <s:textfield name="filew2" label="文件2的路径"/>
        <s:textfield name="wvalue" label="窗口大小"/>
        <s:textfield name="t2value" label="相似度"/>
        
        <s:submit value="开始"/>
    </s:form>
    </center>
</body>
</html>