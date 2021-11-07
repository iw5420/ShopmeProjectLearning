$(document).ready(function(){
	$("#logoutLink").on("click", function(e){
		e.preventDefault();
		document.logoutForm.submit();
	});
	
	customizeDropDownMenu();
});

function customizeDropDownMenu(){
	$(".navbar .dropdown").hover(
		function(){
			$(this).find('.dropdown-menu').first().stop(true, true).delay(250).slideDown();
		},
		function(){
			$(this).find('.dropdown-menu').first().stop(true, true).delay(100).slideUp();
		}
	);
	$(".dropdown > a").click(function(){
	location.href = this.href;
	});
}

	
function showModalDoialog(title, message){
	$("#modalTitle").text(title);
	$("#modalBody").text(message);
	$("#modalDialog").modal();
}

function showErrorModal(message){
	showModalDoialog("Error", message);
}

function showWarningModal(message){
	showModalDoialog("Warning", message);
}