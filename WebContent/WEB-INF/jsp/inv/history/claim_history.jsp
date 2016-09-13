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
				<div class="col-lg-8 col-md-7 col-sm-6">
					<h2>Claim History </h2>
				</div>
<!-- 				<hr> -->
			</div>
		</div>
		
		<div class="row">
		
		  <fieldset><div class="well">
		   <form class="form-horizontal">  
          
	          <div class="col-lg-6">
	                  <div class="form-group">
	                    <label for="inputEmail" class="col-lg-4 control-label">Email</label>
	                    <div class="col-lg-6">
	                      <input type="text" class="form-control" id="inputEmail" placeholder="Email">
	                    </div>
	                  </div>
	                  <div class="form-group">
	                    <label for="select" class="col-lg-4 control-label">Selects</label>
	                    <div class="col-lg-6">
	                      <select class="form-control" id="select">
	                        <option>1</option>
	                        <option>2</option>
	                        <option>3</option>
	                        <option>4</option>
	                        <option>5</option>
	                      </select>
	                    </div>
	                  </div>
	<!--                   <div class="form-group"> -->
	<!--                     <div class="col-lg-10 col-lg-offset-2"> -->
	<!--                       <button type="reset" class="btn btn-default">Cancel</button> -->
	<!--                       <button type="submit" class="btn btn-primary">Submit</button> -->
	<!--                     </div> -->
	<!--                   </div> -->
	                
	            
	          </div>
	          <div class="col-lg-6">
	                  <div class="form-group">
	                    <label for="inputEmail" class="col-lg-4 control-label">Email</label>
	                    <div class="col-lg-6">
	                      <input type="text" class="form-control" id="inputEmail" placeholder="Email">
	                    </div>
	                  </div>
	                  <div class="form-group">
	                    <label for="select" class="col-lg-4 control-label">Selects</label>
	                    <div class="col-lg-6">
	                      <select class="form-control" id="select">
	                        <option>1</option>
	                        <option>2</option>
	                        <option>3</option>
	                        <option>4</option>
	                        <option>5</option>
	                      </select>
	                    </div>
	                  </div>
	<!--                   <div class="form-group"> -->
	<!--                     <div class="col-lg-10 col-lg-offset-2"> -->
	<!--                       <button type="reset" class="btn btn-default">Cancel</button> -->
	<!--                       <button type="submit" class="btn btn-primary">Submit</button> -->
	<!--                     </div> -->
	<!--                   </div> -->
	                
	          </div>


				<div class="row">
					<div class="col-lg-12">
						<div class="form-group ">
							<div class="col-lg-12 text-center">
								<button type="reset" class="btn btn-default">Cancel</button>
								<button type="submit" class="btn btn-primary">Submit</button>
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
              <h2 id="tables">Tables</h2>
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