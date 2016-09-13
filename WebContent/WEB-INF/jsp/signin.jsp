<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title>Inventory Management</title>

	<%@include file="/WEB-INF/jsp/inv/common.jsp" %>

</head>

<style>		
	.signin{ 
		background-color: #fff;
		background-image: url('resources/images/mg6-bg.png');
		background-repeat: no-repeat;
		background-attachment: fixed;
		background-position: center; 

	}
	
	.panel-default {
	    padding: 15px;
	}
		
 </style>
	
	
<body class="signin">
<br>
<br>
<br>
	<div class="row">
		<div class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-body ">
					<div class="text-center sign-box">
						<img class="sign-img" src="resources/images/logo_mg_sm.png" alt="">
					</div>
					<h2 class="text-center">Inventory Management</h2> 
<!-- 					<hr> -->
					<form role="form" class="sign-box" action="welcome.htm" method="post">
						<fieldset>
<!-- 							<div>EXCISE POC</div> -->
<!-- 							<header class="sign-title">DMS Portal</header> -->
							<div class="form-group">
								<input class="form-control" placeholder="Username" name="username" type="text" autofocus="">
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="Password" name="password" type="password" value="">
							</div>
<!-- 							<div class="checkbox"> -->
<!-- 								<label> -->
<!-- 									<input name="remember" type="checkbox" value="Remember Me">Remember Me -->
<!-- 								</label> -->
<!-- 							</div> -->
<!-- 							<a href="welcome.htm" class="btn btn-primary">Login</a> -->
								<div class="form-group text-center"><button type="submit" class="btn btn-primary" onclick="onSubmit()" >&nbsp;&nbsp;Sign-In&nbsp;&nbsp; </button></div>
						</fieldset>
					</form>
				</div>
			</div>
		</div><!-- /.col-->
	</div>
	
	
</body>

</html>