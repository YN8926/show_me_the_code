<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/dwr/engine.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/dwr/util.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/dwr/interface/JDate.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/dwr/interface/messagePush.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>dwr测试</title>
</head>
<body>
	<h1>测试页面</h1>
	<button onclick="hello()">测试dwr</button>
	<ul>
		<li>
			<a href="<%=request.getContextPath()%>/user1.jsp">用户1会接收推送消息</a>
		</li>
		<li>
			<a href="<%=request.getContextPath()%>/user2.jsp">用户2不会接收推送消息</a>
		</li>
	</ul>
</body>
<script type="text/javascript">
	function hello() {
		messagePush.hello("辉辉大侠", function(d){
			alert(d);
		});
	}
</script>
</html>