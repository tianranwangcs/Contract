<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Administrator Menu Bar</title>
	<link href="css/frame.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
	<div class="menu">
		
		<dl>
			<dt>
				System Management
			</dt>
			<dd>
				<a href="#">User Management</a>
			</dd>
			<dd>
				<a href="roleList.htm" target="main">Role Management</a>
			</dd>		
			<dd>
				<a href="yhqxList.htm" target="main">Configure Permission</a>
			</dd>
			<dd>
				<a href="#">Log Management</a>
			</dd>	
		</dl>
		<dl>
			<dt>
				Contract Management
			</dt>
			<dd>
				<a href="dfphtList.htm" target="main">Process Configuration</a>
			</dd>
			<dd>
				<a href="yfphtList.htm" target="main">Assigned Contract</a>
			</dd>
			<dd>
				<a href="#">Query Process</a>
			</dd>
			<dd>
				<a href="#">Contract Info</a>
			</dd>
			<dd>
				<a href="customerList.htm" target="main">Customer Info</a>
			</dd>
		</dl>
	</div>
  </body>
</html>
