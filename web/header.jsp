<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Head</title>
		<link href="css/frame.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<div class="header">
			<div class="toplinks">
				<span>Hello:Welcome to Contract Management System [<a href="login.jsp"
					target="_top">Logout</a>]</span>
			</div>
			<h1>
				<img src="images/logo_title.png" alt="Contract Management System" />
			</h1>
		</div>
	</body>
</html>
