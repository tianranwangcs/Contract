<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Exception</title>
		<link href="css/frame.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript">  
 			// Make the page as the parent window display
 			if(top!=self){
 				top.location.href=self.location.href;
 			}  
  		</script>
	</head>
	<body>
		<div class="header">
			<div class="toplinks">
				Welcome to Contract Management System!
			</div>
			<h1>
				<img src="images/logo_title.png"  alt="Contract Management System" />
			</h1>
		</div>
		
		<div class="error">
			<p>
				System is under maintenance......
			</p>
		</div>

		<div class="footer">
			<ul>		
				<li>
					<a target="_blank" href="#">Contract Management System</a>
				</li>

				<li>
					<a target="_blank" href="#">Help</a>
				</li>
			</ul>
		</div>
	</body>
</html>