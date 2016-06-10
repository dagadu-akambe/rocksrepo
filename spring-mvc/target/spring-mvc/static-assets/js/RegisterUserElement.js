var RegisterUserElement;
(function(){
	
	defaults = {
		$target:null
	}
	 RegisterUserElement = function(options_in) {
		
		var that = this;
		var options = $.extend({}, defaults, options_in, true);

		var $element = $([
			'<div class="container">',
				'<form id="user-form" action="">',
				'<div class="form-group">',
					'<div class="row">',
						'<div class="col-xs-5">',
						'<label for="full-name">Full Name</label>',
							'<input type="text" class="form-control" id="full-name" placeholder="Full Name">',
						'</div>',
					'</div>',	
				'</div>',
				
					'<div class="form-group">',
					'<div class="row">',
						'<div class="col-xs-3">',
					'<label for="date-of-birth">Date of Birth</label>', 
					'<input type="date" class="form-control" id="date-of-birth" placeholder="Date of Birth">',
					'</div>',
					'</div>',	
				'</div>',
				'<div class="form-group">',
					'<div class="row">',
						'<div class="col-xs-3">',
					'<label for="adhar-number"> Aadhar Number</label>', 
					'<input type="text" class="form-control" id="adhar-number" placeholder="Adhar Card Number">',
					'</div>',
					'</div>',	
				'</div>',
					'<div class="form-group">',
					'<div class="row">',
						'<div class="col-xs-4">',
					'<label for="address"> Address</label>', 
					'<textarea class="form-control" id="address" placeholder="Address">','</textarea>',
					'</div>',
					'</div>',	
				'</div>',
					'<div class="form-group">',
					'<div class="row">',
						'<div class="col-xs-3">',
					'<label for="house-number"> House Number</label>', 
					'<input type="text" class="form-control" id="house-number" placeholder="house-number">',
					'</div>',
					'</div>',	
				'</div>',
					'<div class="form-group">',
					'<div class="row">',
						'<div class="col-xs-3">',
					'<label for="telephone"> Telephone </label>', 
					'<input type="text" class="form-control" id="telephone" placeholder="telephone">',
					'</div>',
					'</div>',	
					'</div>',	
				'<button type="submit"> Save </button>',
				'</form>',
			'</div>'
		].join(' '));
		
		var $fullName = $element.find('#full-name');
		var $saveBtn = $element.find('button');
		
		//click handlers..
		
		$saveBtn.click( function (event) {
			var dialog;
			/*var userInfo = {
					full_name : $element.find('#full-name').val(),
					date_of_birth : $element.find('#date-of-birth').val()
			};*/
			var user = {
					firstName: 'Dagadu',
					lastName: 'Akambe'
			}
			
			console.log('Making Ajax Call.....');
			$.ajax({
				type: "json",
				url:'addUser',
				method:'post',
				data: {
					user: JSON.stringify(user)
				},
				complete: function(){
					console.log('Complete...')
				},
				success: function(result) {
					console.log('ajax sucess.....'+result);
					var $wind = $element.find("#dialog");
					$wind.dialog();					
					$wind.dialog( "open" );
					    
				}
			});
			
		    event.preventDefault();
		});
		
		if(options.$target) {
			options.$target.html('').append($element)
		}	
		
	};
	
})();