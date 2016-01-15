/**
 * 
 */
function generate_menu(current_tab) {
	document.writeln("<div id='logo'><h1>TEST</h1></div>");
		document.writeln("<div id='cssmenu'>");
			document.writeln("<ul>");
			document
			.writeln("<li id='_home' class='active has-sub'><a href='home.do'><span>Home</span></a></li>");
			document.writeln("<li id='_student'><a href='student.do'><span>Student</span></a>");
			document.writeln("<li id='_faculty'><a href='faculty.do'><span>Faculty</span></a></li>");
			document.writeln("<li id='_admin'><a href='admin.do'><span>Admin</span></a></li>");
			document
			.writeln("<li id='_contact' class='last'><a href='#'><span>Contact</span></a></li>");
			document.writeln("</ul>");
			document.writeln("</div>");
	document.writeln("</div>");
	
	$('#cssmenu li').removeClass('active has-sub');
	
	if(typeof current_tab === 'undefined'){
		$('#_home').addClass('active has-sub'); 
	}else{
		$('#'+current_tab).addClass('active has-sub');
	}
	
	

}