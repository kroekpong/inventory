<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

	<%@include file="/WEB-INF/jsp/poc/common.jsp" %>
 
     <link rel="stylesheet" href="${cPath}/resources/css/datepicker.css">
	<script src="${cPath}/resources/js/bootstrap-datepicker.js"></script>
	<script src="${cPath}/resources/js/bootstrap-table.js"></script>
	
	<c:set var="menu_reg"  value="active"/>

</head>

<body>

	<!--  --- MENU --- -->
	<%@include file="/WEB-INF/jsp/poc/menu.jsp" %>
	
	
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">	
		
		<!-- <div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active">ค้นหาเลขทะเบียนสรรพสามิต</li>
			</ol>
		</div>/.row -->
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					 <div class="panel-heading">
					 <i class="fa fa-fw fa-credit-card"></i>
					  ค้นหาเลขทะเบียนสรรพสามิต</div>
				
					<div class="panel-body">
					
					 <form class="form-horizontal">
							
							
						<div class="col-md-12">
									<!-- Name input-->
									<div class="form-group">
<!-- 										<label class="col-md-4 control-label" for="regId">เลขทะเบียนสรรพสามิต</label> -->
										<div class="col-md-6">
											<div class="input-group">
													<span class="input-group-addon" onclick="onSearch('Y')"><i class="fa fa-search fa-lg"></i></span>
													<input id="regId" name="regId" type="number"  class="form-control" placeholder="เลขทะเบียนสรรพสามิต">
											</div>
<!-- 											<input name="regId" type="number"  class="form-control" placeholder="เลขทะเบียนสรรพสามิต"> -->
										</div>
									</div>
									
								</div>
								
							</form>
					
					</div>
					
					
				</div>
			</div><!-- /.col-->
		</div><!-- /.row -->									
	
		<div class="row" id="searchResult" style="display: none;">
			<div class="col-lg-12">
				<div class="panel panel-default chat">
					<div class="panel-heading text-right"><small class="text-muted list-left" id="listAmt"> 0 รายการ</small>
<!-- 					<svg class="glyph stroked clipboard with paper"><use xlink:href="#stroked-clipboard-with-paper"/></svg>  -->
					<a href="javascript:;" onclick="goGraph()"><i class="fa fa-fw fa-bar-chart-o"></i> กราฟ</a>  
					 </div>
					 <div class="panel-body">
					 
						<ul id="resultList" class="list-group">
						</ul>
					</div>
					 
					</div>
				</div>
			</div>
			
		</div><!--/.row-->	
		
		
		
		</div><!--/.main-->


	 <script>
	 
	    var histObj = "HISTORY_DATA_REG_ID";

		var listTemplate = '<li class="right clearfix"> <div class="clearfix">             '
				+'<div class="header">                                              '
				+'<strong class="primary-font">เลขที่ใบเสร็จ : </strong>{{receiptNo}}       '
				+'<small class="text-muted list-right">{{receiptDate}} </small> '
				+'</div>                                                            '
				+'<div class="header">                                              '
				+'<strong class="primary-font">เลขทะเบียนสรรพสามิต : </strong>{{regId}}  '
				+'</div>                                                            '
				+'<div class="header">                                              '
				+'<strong class="primary-font">ชื่อ :</strong> {{customerName}}            '
				+'<strong class="primary-font list-right">{{taxAmount}} บาท</strong> '
				+'</div>                                                            '
				+'</div> </li>  ';
	 	
	 	var dataList = '';
	 	var pageStart = 0;
	 	var ptotal = 0;
	 	var plength = 10;

	 	function buildData(data){
	 		
	 	 	ptotal = data['recordsTotal'];
	 	 	$("#listAmt").html('ทั้งหมด '+ptotal+' รายการ' );
	 	 	
	 	  	$.each(	data['data'] , function(i, item) {
	 	  	console.log(item);
	 	  		var dataTmp = listTemplate;
			    dataTmp = dataTmp.replace("{{receiptNo}}", item['receiptNo']);
			    dataTmp = dataTmp.replace("{{regId}}", item['regId']==''? ' - ' : item['regId']); 
			    dataTmp = dataTmp.replace("{{receiptDate}}", item['receiptDate']);
			    dataTmp = dataTmp.replace("{{customerName}}", item['customerName']);
			    dataTmp = dataTmp.replace("{{taxAmount}}", _NumberFormat(item['taxAmount']));
	 			dataList += dataTmp;
// 	 			$("#resultList").append(dataTmp);
			});
			
	 		$("#resultList").html(dataList);
	 		
// 	 		$('#resultList li').click(function(){ 
// 		        console.log($(this));
// 		    });
		    
		    $('#searchResult').show();
// 		    _loader(false);
		    
		    //***** #### For Offline data ***//
		    localStorage.setItem(histObj , JSON.stringify(data) );
		 		
	 	};
	 	
	 	function buildOfflineHistoryData(){
			var historyData = JSON.parse(localStorage.getItem(histObj)); 
			if(null!=historyData){
				buildData(historyData);
			}else{
				alert("ไม่พบประวิติการค้นหาข้อมูลล่าสุด");
			}
// 			_loader.modal('hide');
		};
	 	
	 	
		function onLineSearch(s){
		
	 	    $.ajaxSetup({
				scriptCharset: "utf-8", //or "ISO-8859-1"
				contentType: "application/json; charset=utf-8"
			});
	
			var param = {
				"start" : pageStart,
				"length" : plength,
				"regId" : $("#regId").val()
			};	
			
// 			var param = {
// 				"start" : pageStart,
// 				"length" : plength,
// 				"receiptDateFrom" : $("#receiptDateFrom").val(),
// 				"receiptDateTo" : $("#receiptDateTo").val()
// 			};	
			
			var url = '${cPath}/mobile/getDataTable.json';

			$.ajax({
			  type: "POST",
			  url: url,
			  async:false,
			  data: JSON.stringify(param),
			  success: function(data){
				  buildData(data);
			  },
			  error: function(XMLHttpRequest, textStatus, errorThrown) {
			     alert(_offlineTxt);
			     buildOfflineHistoryData();
			  }
			});
			
			pageStart+=plength;
			
		};
		
		
		function goGraph(){
			location = cPath+"/poc/report.htm?regId="+$("#regId").val();
		};
		
		function onSearch(s){
		
// 			_loader(true);
					
			if (s=='Y') {
				dataList = ''; 
				pageStart = 0; 
				ptotal = 0;
	 			plength = 10;
			}
			
			if(!_checkOnline()){
				alert(_offlineTxt);
				buildOfflineHistoryData();
			}else{
				onLineSearch();
			}
	 		
	 	};
	 	
	 	
	  	$(function() {
			 $(window).scroll(function () {
			 	console.log($(document).height(),$(window).scrollTop() + $(window).height());
			 	console.log($(document).height() <= $(window).scrollTop() + $(window).height() );
			    if ($(document).height() <= $(window).scrollTop() + $(window).height() 
			    && pageStart != 0 && pageStart<=ptotal && _checkOnline()) {
			         onSearch('N');
			    }
			    
			    if($(window).scrollTop() < 100){
			    	$('#scroll').fadeOut();
			    }else{
			    	$('#scroll').fadeIn();
			    }
			    
			 });
			 
			 $('#scroll').click(function(){ 
			    $("html, body").animate({ scrollTop: 0 }, 600); 
			    return false; 
			});
			 	
			 	
// 		 	if($("#regId").val()!=""){
// 		 	 	onSearch('Y');
//  			}
 	
			
		
		});
	 	
	
	</script> 
	
</body>

</html>