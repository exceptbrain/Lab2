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
    <s:form action="Gofasta">
        <s:textfield name="file1" label="文件1的路径"/>
        <s:textfield name="file2" label="文件2的路径"/>
        
        <s:submit value="开始"/>
    </s:form>
    </center>
</body>
</html>