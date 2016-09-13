var _itemLength = 10;
var _isOnline = false;
var _offlineTxt = 'ระบบออฟไลน์ : ใช้ประวัติการค้นหาข้อมูลล่าสุด';

function _loader(x) {
	console.log('loader !!', x);
	if(x){
		$('#loader').modal('show');
	}else{
		$('#loader').modal('hide');
	}
	
//	setTimeout(function(){ // Wait 10 secound
//		$('#loader').modal('hide');
//	}, 500);
}

function _NumberFormat(x) {
	return (!isNaN(x)&&x!=null)?  x.replace(/\B(?=(\d{3})+(?!\d))/g, ","): "0.00";
}

function _checkOnline() {
	_isOnline = false;
	var url = cPath+'/resources/json/online_service.json?'+new Date().getTime();
	$.ajax({
	  type: "GET",
	  url: url,
	  async:false,
	  success: function(data){
		  _isOnline = data['status']==0? true:false;
	  },
	  error: function(XMLHttpRequest, textStatus, errorThrown) {
	  }
	});
	console.log(_isOnline? 'Online -->>': '<<-- Offline');
	if(_isOnline){
		$('#offline-status').hide();
    }else{
    	$('#offline-status').show();
    }
	return _isOnline;
}


$(document).ready(function(){
	console.log('#### Application Start !!! ####');
	
//	localStorage.clear();
	
//	_checkOnline();
//    var refreshId = setInterval( function(){
//    	_checkOnline();
//    }, 10000);
});