<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../common.jsp"></jsp:include>
<title>Insert title here</title>
</head>
<body>
	<h1>创建用户页面</h1>
	<div class="container">
		<div class="row">
			<sf:form method="POST" servletRelativeAction="/user/create" cssClass="form-inline">
				<div class="form-group">
					<label for="username">Name:</label> <input type="text"
						class="form-control" name="username" />
				</div>
				<div class="form-group">
					<label for="passowrd">Password:</label> <input type="text"
						class="form-control" name="password" />
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</sf:form>
		</div>
	</div>
</body>
</html>j