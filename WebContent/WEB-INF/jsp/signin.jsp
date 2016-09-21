<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title>Excise Mobile POC</title>

	<%@include file="/WEB-INF/jsp/poc/common.jsp" %>

	<link href="${cPath}/resources/css/sign-styles.css" rel="stylesheet" type="text/css" />

</head>

<body>

	<div class="row">
		<div class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<div class="panel-body">
					<div class="text-center sign-box">
						<img class="sign-img" src="resources/images/excise-logo.png" alt="">
					</div>
					<form role="form" class="sign-box" action="welcome.htm">
						<fieldset>
<!-- 							<div>EXCISE POC</div> -->
							<div class="form-group">
								<input class="form-control" placeholder="ชื่อผู้ใช้งาน" name="username" type="text" autofocus="">
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="รหัสผ่าน" name="password" type="password" value="">
							</div>
<!-- 							<div class="checkbox"> -->
<!-- 								<label> -->
<!-- 									<input name="remember" type="checkbox" value="Remember Me">Remember Me -->
<!-- 								</label> -->
<!-- 							</div> -->
<!-- 							<a href="welcome.htm" class="btn btn-primary">Login</a> -->
								<div class="form-group text-center"><button type="button" class="btn btn-primary" onclick="onSubmit()" >เข้าสู่ระบบ</button></div>
						</fieldset>
					</form>
				</div>
			</div>
		</div><!-- /.col-->
	</div>
	
	
	<script type="text/javascript">
	
	var isMobile = false;
	if( /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)) {
		isMobile = true;	 
	}
	
	console.log(navigator.userAgent);
	console.log(isMobile);
	function onSubmit() {
		if(!isMobile){
			alert("อุปกรณ์ไม่รองรับการทำงาน");
			return false;
		}
		location = "welcome.htm";
	}

	
	</script>
</body>

</html>