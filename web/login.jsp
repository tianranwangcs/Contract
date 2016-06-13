<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Login</title>
		<link href="css/style.css" rel="stylesheet" media="screen"
			type="text/css" />
		<script type="text/javascript">  
 			// Make the page as the parent window display
 			if(top!=self){
 				top.location.href=self.location.href;
 			}  
  		</script>
	</head>

	<body>
		<!-- header start -->
		<div class="header">
			<div class="toplinks">
				<span> [<a href="register.jsp">Register</a>] </span>
			</div>

			<h1>
				<img src="images/logo_title.png" alt="Contract Management System" />
			</h1>
		</div>
		<!-- header end -->

		<!-- main start -->
		<div class="main">
			<form action="Login" method="post">

				<div class="register_main">
					<table>
						<tr>
							<td class="title" colspan="3">
								User Login
							</td>
						</tr>
						<tr>
							<td width="80">
								User Name:
							</td>
							<td width="200">
								<input type="text" name="name" id="name" value="" height="40" />
							</td>
							<td width="200"></td>
						</tr>

						<tr>
							<td>
								Password:
							</td>
							<td>
								<input type="password" name="password" id="password"/>
							</td>
							<td></td>
						</tr>
						<tr>
							<td colspan="3">
								<input type="submit" value="Login" class="button" />
							</td>
						
						</tr>
					</table>
						<%=request.getAttribute("message") %>
				</div>
			</form>
		</div>
		<!-- main end -->

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