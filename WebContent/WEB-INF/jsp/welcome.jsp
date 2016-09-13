<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title>Inventory Management</title>

	<%@include file="/WEB-INF/jsp/inv/common.jsp" %>

</head>

<style>

body {
/* 	background: #f1f4f7; */
	padding-top: 50px;
	margin-top: 0;
	color: #5f6468;
	height: 100%;
	width: 100%;
 	background-image: url(${cPath}/resources/images/bg.png);  
	background-repeat: no-repeat;
	background-position: center center;
	background-size: 80%;
	background-attachment: fixed;
}

</style>

<!-- <body> -->
<body class="with-side-menu" id="body"> 

	<!--  --- MENU --- -->
	<%@include file="/WEB-INF/jsp/inv/menu.jsp" %>
	
</body>

</html>