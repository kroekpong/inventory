<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

	<%@include file="/WEB-INF/jsp/inv/common.jsp" %>
 
     <link rel="stylesheet" href="${cPath}/resources/css/datepicker.css">
	<script src="${cPath}/resources/js/bootstrap-datepicker.js"></script>
	<script src="${cPath}/resources/js/bootstrap-table.js"></script>
	
<%-- 	<c:set var="menu_reg"  value="active"/> --%>

</head>

<body>

	<!--  --- MENU --- -->
	<%@include file="/WEB-INF/jsp/inv/menu.jsp" %>



	<div class="container">

		<div class="page-header">
			<div class="row">
				<br>
				<div class="col-lg-12">
					<h3><i class="fa fa-history"></i>  Asset/Owner  </h3>
				</div>
			</div>
		</div>
		
		<div class="row">
		
		  <fieldset><div class="well">
		   <form class="form-horizontal">  
          
	          <div class="col-lg-6">
	                  <div class="form-group">
	                    <label for="name" class="col-lg-4 control-label">Host ID</label>
	                    <div class="col-lg-6">
	                      <input type="text" class="form-control" id="name"  >
	                    </div>
	                  </div>
	                  <div class="form-group">
	                    <label for="" class="col-lg-4 control-label">Owner Name</label>
	                    <div class="col-lg-6">
	                      <input type="text" class="form-control" id=""  >
	                    </div>
	                  </div>
	                   <div class="form-group">
	                    <label for="" class="col-lg-4 control-label">Owner Type</label>
	                    <div class="col-lg-6">
	                       <select class="form-control" id="select">
	                       	<option value="">All</option>
	                        <option value="MJV">MJV</option>
	                        <option value="SVR">Service Room</option>
	                      </select>
	                    </div>
	                  </div>
	             <div class="form-group">
	                    <label for="" class="col-lg-4 control-label">Assigned Date Start</label>
	                    <div class="col-lg-6">
	                      <input type="date" class="form-control" id=""  >
	                    </div>
	                  </div>
	          </div>
	          <div class="col-lg-6">
	                  <div class="form-group">
	                    <label for="select" class="col-lg-4 control-label">Asset Type</label>
	                    <div class="col-lg-6">
	                      <select class="form-control" id="select">
	                      	<option value="">All</option>
	                        <option value="001">Desktop</option>
	                        <option value="002">Notebook/Labtop</option>
	                      </select>
	                    </div>
	                  </div>
	                 <div class="form-group">
	                    <label for="" class="col-lg-4 control-label">Mobile No.</label>
	                    <div class="col-lg-6">
	                      <input type="number" class="form-control" id=""  >
	                    </div>
	                  </div>
	                  <div class="form-group">
	                    <label for="" class="col-lg-4 control-label">Gender</label>
	                    <div class="col-lg-6">
	                       <select class="form-control" id="select">
	                        <option value="">All</option>
	                        <option value="M">Male</option>
	                        <option value="F">Female</option>
	                      </select>
	                    </div>
	                  </div>
	                   <div class="form-group">
	                    <label for="" class="col-lg-4 control-label">Assigned Date End</label>
	                    <div class="col-lg-6">
	                      <input type="date" class="form-control" id=""  >
	                    </div>
	                  </div>
	                
	          </div>


				<div class="row">
					<div class="col-lg-12">
						<div class="form-group "> 
							<div class="col-lg-12 text-center">
								<button type="reset" class="btn btn-default"> &nbsp;Clear <i class="fa fa-refresh"></i></button>&nbsp;&nbsp;
								<button type="button" class="btn btn-primary">Search <i class="fa fa-search"></i></button>&nbsp;&nbsp;
								<button type="button" class="btn btn-warning" disabled>Export <i class="fa fa-file-excel-o"></i></button>
							</div>
						</div>
					</div>
				</div>

				</form></div>
            </fieldset>
            
        </div>
		
		
		<div class="bs-docs-section">

        <div class="row">
          <div class="col-lg-12">
            <div class="page-header"> 
              <h3 id="tables"><i class="fa fa-list"></i> Result</h3>
            </div>

            <div class="bs-component">
              <table class="table table-striped table-hover ">
                <thead>
                  <tr>
                    <th>#</th>
                    <th>Column heading</th>
                    <th>Column heading</th>
                    <th>Column heading</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td>1</td>
                    <td>Column content</td>
                    <td>Column content</td>
                    <td>Column content</td>
                  </tr>
                  <tr>
                    <td>2</td>
                    <td>Column content</td>
                    <td>Column content</td>
                    <td>Column content</td>
                  </tr>
                  <tr>
                    <td>1</td>
                    <td>Column content</td>
                    <td>Column content</td>
                    <td>Column content</td>
                  </tr>
                  <tr>
                    <td>2</td>
                    <td>Column content</td>
                    <td>Column content</td>
                    <td>Column content</td>
                  </tr>
                  <tr>
                    <td>1</td>
                    <td>Column content</td>
                    <td>Column content</td>
                    <td>Column content</td>
                  </tr>
                  <tr>
                    <td>2</td>
                    <td>Column content</td>
                    <td>Column content</td>
                    <td>Column content</td>
                  </tr>
                </tbody>
              </table> 
            </div><!-- /example -->
          </div>
        </div>
      </div>
		
		

	</div>
	
	
<%-- 	<%@include file="/WEB-INF/jsp/inv/footer.jsp" %> --%>

</body>

</html>