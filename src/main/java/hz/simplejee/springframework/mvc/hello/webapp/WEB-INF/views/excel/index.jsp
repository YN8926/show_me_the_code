<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <jsp:include page="../common.jsp"></jsp:include>
    <title>测试Excel导出</title>
</head>
<body>
<h1>测试Excel导出</h1>
<div class="container">
    <div class="row">
		<div class="col-sm-4">
			AbstractExcelView
			<a href='<s:url value="/excel/download1"></s:url>' class="btn btn-default btn-primary">下载</a>
		</div>
    </div>
</div>
</body>
</html>