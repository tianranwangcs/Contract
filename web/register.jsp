<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Register</title>
		<link href="css/style.css" rel="stylesheet" media="screen"
			type="text/css" />
	</head>

	<body>
		<!-- header start -->
		<div class="header">
			<div class="toplinks">
				<span>[<a href="login.jsp">Login</a>]</span>
			</div>

			<h1>
				<img src="images/logo_title.png" alt="Contract Management System" />
			</h1>
		</div>
		<!-- header end -->

		<!-- main start -->
		<div class="main">
			<form action="register" method="post">
		
				<div class="register_main">
					<table>
						<tr>
							<td class="title" colspan="2">
								User Register
							</td>
						</tr>
						<tr>
							<td width="120" align="center">
								User Name:
							</td>
							<td>
								<input type="text" name="name" id="name" value="" />
							</td>
						</tr>
						<tr>
							<td class="info" colspan="2">
								User name must begin with a letter, at least four words(letters,
								Numbers, underscores).
							</td>
						</tr>

						<tr>
							<td align="center">
								Password:
							</td>
							<td>
								<input type="password" name="password" id="password" value="" />
							</td>
						</tr>
						<tr>
							<td class="info" colspan="2">
								Password can not be too simple, at least contain six words;
								Recommend to use numbers and letters mixed arrangement,
								case-insensitive.
							</td>
						</tr>

						<tr>
							<td align="center">
								Repeat Password:
							</td>
							<td>
								<input type="password" name="password2" id="password2" value="" />
							</td>
						</tr>
						<tr>
							<td class="info" colspan="2">
								Repeat password and password should keep consistent!
							</td>
						</tr>

						<tr>
							<td colspan="2">
								<input type="submit" value="Submit" class="button" />
							</td>	
								<%=request.getAttribute("message") %>				
						</tr>
					
					</table>
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
