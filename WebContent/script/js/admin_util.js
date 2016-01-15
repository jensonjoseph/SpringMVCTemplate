/**
 * 
 */
function _block_ui() {
	var result;

	//$.blockUI();
	$('div.block_me').block({ message: '<h1><img src="style/css/images/spinner.jpeg" /> Just a moment...</h1>' });
	$.ajax({
		type : "POST",
		url : "fetchAdminPageInfo.do",
		timeout : 180000,
		error : function(error) {
			$.unblockUI();
			alert("Session timed out before fetching data through service");
		},
		success : function(responseText) {
			$('div.block_me').unblock();
			//$.unblockUI();
		}

	});
	return result;
}