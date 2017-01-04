<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="common.jsp"/>
<title>Insert title here</title>
</head>
<body>
	<hr />
	<a href="user/create?page">创建用户-1</a>
	<a href='<s:url value="/excel/"/>'>Excel导出</a>
</body>
</html>