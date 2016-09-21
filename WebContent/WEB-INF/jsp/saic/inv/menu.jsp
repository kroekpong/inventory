<!DOCTYPE html>
<%@page import="th.co.baiwa.common.bean.UserBean"%>
<%@page import="th.co.baiwa.common.util.UserLoginUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="${cPath}/resources/js/common.js"></script> 
 
 <style>

.navbar-brand>img {
	display: inline;
	margin: 0 10px;
	height: 100%;
}

.navbar-brand {
    padding: 10px 0;
/*     margin-left: -85px !important; */
}

.navbar-brand {
    padding-right: 20px;
}

</style>
 
 
  	<div id="navbar-main">
      <!-- Fixed navbar -->
		<div class="navbar navbar-default navbar-fixed-top ">
		  <div class="container">
		  
			<div class="navbar-header"> 
			 <a href="${cPath}/inv/home.htm" class="navbar-brand"><img src="${cPath}/resources/images/logo_mg_sm.png" >Inventory  Management</a>
			</div>
			
			<div class="navbar-collapse collapse">
			
			  <ul class="nav navbar-nav" id="nav-menu">
		          <li class="dropdown">
		            <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="themes"><i class="fa fa-history"></i> History <span class="caret"></span></a>
		            <ul class="dropdown-menu" aria-labelledby="themes" id="select-themes">
			             <li><a href="${cPath}/history/asset.htm" class="smoothScroll">  Asset/Owner  History</a></li>
			             <li class="divider"></li>
						<li><a href="${cPath}/history/claim.htm" class="smoothScroll line-txt"> Claim History</a></li>
<!-- 						<li class="divider"></li> -->
		            </ul>
		          </li>
		           
		          <li class="dropdown">
		            <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="themes"><i class="fa fa-cubes"></i> Management <span class="caret"></span></a>
		            <ul class="dropdown-menu" aria-labelledby="themes" id="select-themes">
			             <li><a href="#" class="smoothScroll line-txt"> Asset Management</a></li>
			             <li class="divider"></li>
						 <li><a href="#" class="smoothScroll line-txt"> Budget Management</a></li>
<!-- 						 <li class="divider"></li> -->
		            </ul>
		          </li>
		          
		          <li class="dropdown">
		            <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="themes"><i class="fa fa-gears"></i> Maintenance <span class="caret"></span></a>
		            <ul class="dropdown-menu" aria-labelledby="themes" id="select-themes">
			             <li><a href="#" class="smoothScroll line-txt"> Asset Maintenance</a></li>
			             <li class="divider"></li>
			             <li><a href="#" class="smoothScroll line-txt"> Department Maintenance</a></li>
			             <li class="divider"></li>
			             <li><a href="#" class="smoothScroll line-txt"> Supplier Maintenance</a></li>
			             <li class="divider"></li>
			             <li><a href="#" class="smoothScroll line-txt"> Owner Maintenance</a></li>
			             <li class="divider"></li>
			             <li><a href="#" class="smoothScroll line-txt"> Parameter Maintenance</a></li>
			             <li class="divider"></li>
			             <li><a href="${cPath}/admin/user/home.htm" class="smoothScroll "> User Maintenance</a></li>
			             <li class="divider"></li>
			             <li><a href="${cPath}/maintain/themes_setting.htm" class="smoothScroll"> Themes Setting </a></li>
<!-- 			             <li class="divider"></li> -->
		            </ul>
		          </li>
		           
		        </ul>


				<ul class="nav navbar-nav navbar-right">

					<li class="dropdown user-dropdown"><a
						href="javascript:void(0);" class="dropdown-toggle ng-binding"
						data-toggle="dropdown"><i class="fa fa-user"></i>
							${username} <b class="caret"></b></a>
						<ul class="dropdown-menu">
<!-- 							<li><a href="#/profile"><i class="fa fa-user"></i>Profile</a></li> -->
<!-- 							<li class="divider"></li> -->
							<li><a href="${cPath}/logout.htm"><i class="fa fa-sign-out"></i> Sign Out</a></li>
						</ul></li>
				</ul>

			</div><!--/.nav-collapse -->
			
			
		  </div>
		</div>
    </div>
 
 
 
 
