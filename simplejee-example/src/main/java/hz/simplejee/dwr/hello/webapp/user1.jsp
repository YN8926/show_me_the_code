<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/engine.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/util.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/interface/messagePush.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body onload="onPageLoad()">
	<h1>User 1 online. receive message!!!</h1>
	<button onclick="aysnc()">测试消息推送</button>
</body>
<script type="text/javascript">
	function onPageLoad(){
		dwr.engine.setActiveReverseAjax(true);//启动该页面的ReverseAjax功能
		dwr.engine.setNotifyServerOnPageUnload(true, true);//这个就是当页面加载时，后台listen监听器去除失效的scriptSession，再创建新的scriptSession
		dwr.engine.setErrorHandler(function(){
			console.log("ERROR....");
		});// 这个方法 防止项目已经关闭，客户页面还未关闭，页面会谈Error的问题
		messagePush.hello("测试...",function(dd){console.log(dd)});
		messagePush.onPageLoad('11111');
	}
	function aysnc(){
		messagePush.async('11111', function(dd){console.log(dd+"<---------------")});
	}
</script>
</html>