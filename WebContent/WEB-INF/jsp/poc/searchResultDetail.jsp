<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

	<%@include file="/WEB-INF/jsp/poc/common.jsp" %>
 
     <link rel="stylesheet" href="${cPath}/resources/css/datepicker.css">
	<script src="${cPath}/resources/js/bootstrap-datepicker.js"></script>
	<script src="${cPath}/resources/js/bootstrap-table.js"></script>
	
	<c:set var="menu1"  value="active"/>

</head>

<body>

	<!--  --- MENU --- -->
	<%@include file="/WEB-INF/jsp/poc/menu.jsp" %>
	
	
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">	
		
<br>
									

<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					 <div class="panel-heading"><svg class="glyph stroked dashboard dial"><use xlink:href="#stroked-dashboard-dial"/></svg> ค้นหาเลขทะเบียนสรรพสามิต</div>
				
					<div class="panel-body">
					
					 <form class="form-horizontal" action="" method="post">
							
							
						<div class="col-md-12">
									<!-- Name input-->
									<div class="form-group">
										<label class="col-md-4 control-label" for="regId">เลขทะเบียนสรรพสามิต</label>
										<div class="col-md-6">
											<input name="regId" type="number"  class="form-control" placeholder="เลขทะเบียนสรรพสามิต">
										</div>
									</div>
									
									<div class="form-group">
										<div class="col-md-12 widget-center text-center">
											<button type="button" class="btn  btn-primary"><i class="fa fa-search fa-lg"></i> ค้นหา </button>
										</div>
									</div>
								</div>
								
							</form>
					
					</div>
					
					
				</div>
			</div><!-- /.col-->
		</div><!-- /.row -->									
	
		<div class="row hidden" id="searchResult">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">ผลการค้นหา</div>
					<%-- <div class="panel-body">
						<table data-toggle="table"
							data-url="${cPath}/resources/json/data.json"
							data-select-item-name="toolbar1"  
							data-sort-name="name" data-sort-order="desc">
							<thead>
								<tr>
									<th data-field="id" >Item ID</th>
									<th data-field="id" >Item ID</th>
									<th data-field="id" >Item ID</th>
									<th data-field="name" data-sortable="true">Item Name</th>
									<th data-field="name" data-sortable="true">Item Name</th>
									<th data-field="price" data-sortable="true">Item Price</th>
								</tr>
							</thead>
						</table>
					</div> --%>
				</div>
			</div>
		</div><!--/.row-->	
		
		
		
		</div><!--/.main-->


	 <script>
		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script> 
	
</body>

</html>