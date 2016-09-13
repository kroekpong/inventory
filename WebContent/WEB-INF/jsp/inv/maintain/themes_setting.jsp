<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

	<%@include file="/WEB-INF/jsp/inv/common.jsp" %>
 
     <link rel="stylesheet" href="${cPath}/resources/css/datepicker.css">
	<script src="${cPath}/resources/js/bootstrap-datepicker.js"></script>
	<script src="${cPath}/resources/js/bootstrap-table.js"></script>
	
</head>

<body>

	<!--  --- MENU --- -->
	<%@include file="/WEB-INF/jsp/inv/menu.jsp" %>



	<div class="container">

		<div class="page-header">
			<div class="row">
				<br>
				<div class="col-lg-8 col-md-7 col-sm-6">
					<h2>Themes Setting </h2>
				</div>
			</div>
		</div>
		
		<div class="section-preview">
	      <div class="container">
	        <div class="row" id="pre-themes"> 
	
	        </div>
	      </div>
	    </div>

	</div>
	
	<script>
   
		var pret = '  <div class="col-lg-4 col-sm-6"><div class="preview">  '
        +'  <div class="image text-center"><a href="#">               '
		+'  <img src="'+cPath+'/resources/themes/{{img}}"  class="img-responsive" >    '
		//+'<h2 class="hid-txt center">A Movie in the Park:</h2>  '
		+'</a></div>            '
        +'  <div class="options">'
//         +'  <h3>{{name}}</h3>          '
        +'  <h4>{{desc}}</h4><div class="btn-group" >         '
		+'  <a id="btn-{{id}}"  class="btn btn-danger" href="#" >Used Theme</a>  '
		+'  </div></div></div></div> 	';
		
		function loadTheme(theme){
// 		   window.location.href = "themes?"+theme;  
		}
		
		$.getJSON(cPath+"/resources/json/themes.json", function (data) {
		  var themes = data.themes; 
		  
// 		  var select = $("#select-themes"); 
		  var preTheme = $("#pre-themes"); 
		  themes.forEach(function(value, index){
			//console.log(value.name);
// 			select.append('<li><a href="javascript:;" onclick="loadTheme(\''+value.css+'\')" >{{tname}}</a></li>'
// 			.replace("{{url}}", value.thumbnail).replace("{{tname}}", value.name));
			
			var tx = pret.replace("{{url}}",value.css).replace("{{id}}", value.css);
			tx = tx.replace("{{img}}",value.thumbnail).replace("{{theme}}", value.css);
			tx = tx.replace("{{desc}}",value.description);
			preTheme.append(tx);
			
		  });
		  
		  
		  $('#btn-'+cTheme).hide();
		   
// 		   pleaseWaitDiv.modal('hide');
//
		}, "json").fail(function(){
			$(".alert").toggleClass("alert-info alert-danger");
			$(".alert h4").text("Failure!");
// 			pleaseWaitDiv.modal('hide');
		});

   </script>

</body>

</html>