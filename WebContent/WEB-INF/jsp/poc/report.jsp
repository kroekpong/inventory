<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

	<%@include file="/WEB-INF/jsp/poc/common.jsp" %>
 
     <link rel="stylesheet" href="${cPath}/resources/css/datepicker.css">
	<script src="${cPath}/resources/js/bootstrap-datepicker.js"></script>
	<script src="${cPath}/resources/js/bootstrap-table.js"></script>
	<script src="${cPath}/resources/js/chart.min.js"></script>
	
	<c:set var="menu_report"  value="active"/>
	
	<% 
		String lang = request.getParameter("lang")!=null? request.getParameter("lang"):"";
		String regId = request.getParameter("regId")!=null? request.getParameter("regId"):"";
		String receiptDateFrom = request.getParameter("receiptDateFrom")!=null? request.getParameter("receiptDateFrom"):"";
		String receiptDateTo = request.getParameter("receiptDateTo")!=null? request.getParameter("receiptDateTo"):"";
	%>
	
	<c:set var="menu_report"  scope="request" value="active"/>
	
</head>

<body>

	<!--  --- MENU --- -->
	<%@include file="/WEB-INF/jsp/poc/menu.jsp" %>
	
	<c:set var="menu_back"  value=""/>
	
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">	
		
	 	<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading"><i class="fa fa-bar-chart-o"></i> กราฟแท่ง</div>
					<div class="panel-body">
						<div class="canvas-wrapper">
							<canvas class="main-chart" id="bar-chart" height="180"></canvas>
						</div>
					</div>
				</div>
			</div>
		</div><!--/.row-->		
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading"><i class="fa fa-line-chart"></i> กราฟเส้น</div>
					<div class="panel-body">
						<div class="canvas-wrapper">
							<canvas class="main-chart" id="line-chart" height="180"></canvas>
						</div>
					</div>
				</div>
			</div>
		</div><!--/.row-->
		
		</div><!--/.main-->


	 <script>
		 $(function() {
		 
		 	$("#backmenu").removeClass('hidden');
		 	 
		 	var pleaseWaitDiv = $('<div class="loader"></div>'); 
			pleaseWaitDiv.modal();
			
			$.ajaxSetup({
				scriptCharset: "utf-8", //or "ISO-8859-1"
				contentType: "application/json; charset=utf-8"
			});
	
// 			var param = '{  "regId": "0366",'
// 			  +' "receiptDateFrom":"10-10-2010", '
// 			  +' "receiptDateTo":"01-12-2015" } ' ;
			  
			var param = {
			 	"regId" : '<%=regId%>' ,
				"receiptDateFrom" : '<%=receiptDateFrom%>' ,
				"receiptDateTo" : '<%=receiptDateTo%>'
			};	
			
			console.log(param);
			
			
			var url = cPath+"/mobile/getDataGraph.json";
			$.post(url, JSON.stringify(param) , function( data ) {
				
				// BAR CHART
				 var barChartData = {
					labels :  data['monthTH'],
					datasets : [{
						fillColor : "rgba(48, 164, 255, 0.2)",
						strokeColor : "rgba(48, 164, 255, 0.8)",
						highlightFill : "rgba(48, 164, 255, 0.75)",
						highlightStroke : "rgba(48, 164, 255, 1)",
						data : data['sumAmount']
					}]
				}
		 
				var chart = document.getElementById("bar-chart").getContext("2d");
				window.myBar = new Chart(chart).Bar(barChartData, {
					responsive : true
				});
		
				// LINE CHART
				var lineChartData = {
					labels :  data['monthTH'],
					datasets : [
						{
// 							label: "My Second dataset",
							fillColor : "rgba(48, 164, 255, 0.2)",
							strokeColor : "rgba(48, 164, 255, 1)",
							pointColor : "rgba(48, 164, 255, 1)",
							pointStrokeColor : "#fff",
							pointHighlightFill : "#fff",
							pointHighlightStroke : "rgba(48, 164, 255, 1)",
							data : data['sumAmount']
						}
					]
	
				}
		
				var lineChart = document.getElementById("line-chart").getContext("2d");
				window.myLine = new Chart(lineChart).Line(lineChartData, {
					responsive: true
				});
		
				pleaseWaitDiv.modal('hide');
		
			}, "json");
			
			
			setTimeout(function(){ // Wait 10 secound
				pleaseWaitDiv.modal('hide');
			}, 10000)
		
		});
		
	</script> 
	
</body>

</html>