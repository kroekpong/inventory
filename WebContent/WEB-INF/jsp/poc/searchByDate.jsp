<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

	<%@include file="/WEB-INF/jsp/poc/common.jsp" %>
 
     <link rel="stylesheet" href="${cPath}/resources/css/datepicker.css">
	<script src="${cPath}/resources/js/bootstrap-datepicker.js"></script>
	<script src="${cPath}/resources/js/bootstrap-table.js"></script>
	
	<c:set var="menu_date"  value="active"/>

</head>

<body>

	<!--  --- MENU --- -->
	<%@include file="/WEB-INF/jsp/poc/menu.jsp" %>
	
	
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">	
		

<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading"><i class="fa fa-fw fa-calendar"></i> ค้นหาด้วยวันเดือนปีที่ชำระภาษี</div>
					<div class="panel-body">
					
					 <form class="form-horizontal" action="" method="post">
							
							
						<div class="col-md-12">
						
							<!-- Name input-->
							<div class="form-group">
								<label class="col-md-4 control-label" for="name">จากวันที่ </label>
								<div class="col-md-6 ">
<!-- 								 	<div class='input-group'  > -->
<!-- 								 		<span class="input-group-addon"><i class="fa fa-search fa-lg"></i></span> -->
					                    <input type="date" class="form-control" id="receiptDateFrom"/>
<!-- 					                    <span class="input-group-addon"> <span class="glyphicon glyphicon-calendar"></span> </span> -->

<!-- 					                </div> -->
								</div>
							</div>	

<!-- 						</div> -->
						
<!-- 						<div class="col-md-6"> -->
							<div class="form-group">
								<label class="col-md-4 control-label" for="email">ถึงวันที่ </label>
								<div class="col-md-6">
<!-- 									<div class='input-group' > -->
<!-- 										<span class="input-group-addon"><i class="fa fa-search fa-lg"></i></span> -->
					                    <input type="date" class="form-control" id="receiptDateTo"/>
<!-- 					                    <span class="input-group-addon"> <span class="glyphicon glyphicon-calendar"></span> </span> -->
<!-- 					                </div> -->
								</div>
							</div>
							
					
						
						
						<div class="form-group">
							<div class="col-md-12 widget-center text-center">
								<button type="button" class="btn  btn-primary" onclick="onSearch('Y')"><i class="fa fa-search fa-lg"></i> ค้นหา </button>
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
					<a href="${cPath}/poc/report.htm"><i class="fa fa-fw fa-bar-chart-o"></i> กราฟ</a>  
					 </div>
					 <div class="panel-body">
					 
						<ul id="resultList" class="list-group">
						</ul>
					</div>
					 
					</div>
				</div>
			</div>
		
		</div><!--/.main-->


	 <script>

		var histObj = "HISTORY_DATA_DATE";
		
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
		
		function goGraph(){
			location = cPath+"/poc/report.htm?receiptDateFrom="+$("#receiptDateFrom").val()+"&receiptDateTo="+$("#receiptDateTo").val();
		};
	 	
	 	var dataList = '';
	 	var pageStart = 0;
	 	var ptotal = 0;
	 	var plength = 10;

	 	function buildData(data){
	 		
	 	 	ptotal = data['recordsTotal'];
	 	 	$("#listAmt").html('ทั้งหมด '+ptotal+' รายการ' );
	 	 	
	 	  	$.each(	data['data'] , function(i, item) {
	 	  		var dataTmp = listTemplate;
			    dataTmp = dataTmp.replace("{{receiptNo}}", item['receiptNo']);
			    dataTmp = dataTmp.replace("{{regId}}", item['regId']==''? ' - ' : item['regId']); 
			    dataTmp = dataTmp.replace("{{receiptDate}}", item['receiptDate']);
			    dataTmp = dataTmp.replace("{{customerName}}", item['customerName']);
			    dataTmp = dataTmp.replace("{{taxAmount}}", _NumberFormat(item['taxAmount']));
	 			dataList += dataTmp;
			});
			
	 		$("#resultList").html(dataList);
	 		
// 	 		$('#resultList li').click(function(){ 
// 		        console.log($(this));
// 		    });
		    
		    $('#searchResult').show();
// 		    _loader.modal('hide');
		    
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
	 	
	 	
		function onLineSearch(){
		
	 	    $.ajaxSetup({
				scriptCharset: "utf-8", //or "ISO-8859-1"
				contentType: "application/json; charset=utf-8"
			});
	
			var param = {
				"start" : pageStart,
				"length" : plength,
				"receiptDateFrom" : $("#receiptDateFrom").val(),
				"receiptDateTo" : $("#receiptDateTo").val()
			};	
			
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
		
		function onSearch(s){
		
// 		     _loader = $('<div class="loader"></div>'); 
// 			_loader.modal();
		
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
			
// 			setTimeout(function(){ // Wait 10 secound
// 				_loader.modal('hide');
// 			}, 10000);
	 		
	 	};
	 	
	 	
	  	$(function() {
			 $(window).scroll(function () {
			 
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
		
		});
	 	
	 	
	</script> 
	
</body>

</html>