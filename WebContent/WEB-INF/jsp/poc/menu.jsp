<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="${cPath}/resources/js/common.js"></script> 

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	 <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
    	<button id="backmenu" type="button" class="navbar-toggle navbar-left hidden" onclick="history.back()"><span class="glyphicon glyphicon-chevron-left"></span></button>
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="${cPath}/welcome.htm">EXCISE POC</a>
    </div>
    
    <!-- Top Menu Items -->
    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav side-nav">
            <li class="${menu_reg}">
                <a href="${cPath}/poc/searchByRegId.htm"><i class="fa fa-fw fa-credit-card"></i> ค้นหาเลขทะเบียนสรรพสามิต</a>
            </li>
            <li class="${menu_date}">
                <a href="${cPath}/poc/searchByDate.htm"><i class="fa fa-fw fa-calendar"></i> ค้นหาด้วยวันเดือนปีที่ชำระภาษี</a>
            </li>
            <li class="divider"></li>
            <li>
                <a href="${cPath}/signout.htm"><i class="fa fa-fw fa-sign-out"></i> ออกจากระบบ</a>
            </li>

        </ul>
    </div>
    
        <!-- /.navbar-collapse -->
</nav>

<div class="alert alert-warning online-status animate-flicker text-center" id="offline-status" style="display: none;">
    <strong>ระบบออฟไลน์</strong> :  โปรดตรวจสอบการเชื่อมต่ออินเตอร์เน็ท
</div>

<a href="javascript:void(0);" id="scroll" title="Scroll to Top" style="display: none;">กลับด้านบน<span></span></a>
