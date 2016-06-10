$(document).ready(function(){
	$('.login').click(function(){
		var loginElement = new LoginElement({
			$target: $('.data-container')
		});
	});	
	
	$('.signUp').click(function(){
		var registerUserElement = new RegisterUserElement({
			$target: $('.data-container')
		});
	});
	
	$('.reports').click(function () {
		console.log('Instantiating Data Table');
		var $table = $('#example').DataTable();
		$table.columns = ['Name', 'Address', 'City'];
		$table.data = ['Dagadu','2929 W Yorkshire Dr', 'Phoenix']
		console.log('Table is :', $table);
	});
	
});