<!DOCTYPE html>
<%@page import="th.co.baiwa.common.util.UserLoginUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
    
<title>Inventory Management</title>


 <%
		String username = UserLoginUtils.getCurrentUser().getUsername();
 		session.setAttribute("userProfile", UserLoginUtils.getCurrentUser().getUserProfile());
 		session.setAttribute("username", username);
 		session.setAttribute("authorities",  UserLoginUtils.getCurrentUser().getAuthorities());
 
  %>


<c:set var="ver" scope="session" value="?v=1.2.0"/>

<c:set var="cTheme" scope="session" value="cerulean"/>

<c:set var="cPath" scope="session" value="<%=request.getContextPath()%>"/>

<link href="${cPath}/resources/images/mg-fav.ico" rel="shortcut icon">

<!-- /**--- THEME ----**/  -->
<c:if test="${empty userProfile}">
	<link id="link-theme" href="${cPath}/resources/themes/${cTheme}/bootstrap.min.css${ver}" rel="stylesheet"> 
	<script>
		var cTheme = "${cTheme}"; 
	</script>
</c:if>
<c:if test="${not empty userProfile}">
	<link  id="link-theme" href="${cPath}/resources/themes/${userProfile.userTheme}/bootstrap.min.css${ver}" rel="stylesheet"> 
	<script>
		var cTheme = "${userProfile.userTheme}"; 
	</script>
</c:if>

<link href="${cPath}/resources/css/font-awesome.min.css" rel="stylesheet"> 
<%-- <link href="${cPath}/resources/css/custom.min.css" rel="stylesheet"> --%>
<%-- <link href="${cPath}/resources/css/sb-admin.css" rel="stylesheet"> --%>

<link href="${cPath}/resources/css/inven-style.css${ver}" rel="stylesheet">


<!--Icons-->
<script src="${cPath}/resources/js/lumino.glyphs.js"></script>

<script src="${cPath}/resources/js/jquery-1.11.1.min.js"></script>
<script src="${cPath}/resources/js/bootstrap.min.js"></script> 
<script src="${cPath}/resources/js/common.js${ver}"></script> 

<script>
	var cPath = "${cPath}"; 
</script>
