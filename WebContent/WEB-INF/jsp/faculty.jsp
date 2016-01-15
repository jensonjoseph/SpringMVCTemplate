<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="style/css/styles.css">

<script src="script/jquery/jquery-latest.min.js" type="text/javascript"></script>
<script src="script/jquery/jquery.blockUI.js"></script>
<script src="script/js/menu_script.js"></script>
<script src="script/js/generate_main_menu.js"></script>

<script src="script/js/faculty_util.js"></script>


<title>OU Student</title>
<script type="text/javascript">
	generate_menu("_faculty");

	$(document).ready(function() {
			var result = _block_ui();
	});
</script>

</head>
<body>

	<div class="block_me">
		<label id="statusLabel" name="statusLabel">Faculty Info</label>

	</div>
</body>
</html>