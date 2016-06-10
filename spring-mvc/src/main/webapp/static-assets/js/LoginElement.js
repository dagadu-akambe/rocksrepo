var LoginElement;
(function(){
	
	defaults = {
		$target: null,
		data:[],
		abcd:[]
			
	};
	
	LoginElement = function (options_in) {
		//alias to current object
		var that = this;
		var loginButton;
		var options = $.extend({}, defaults, options_in, null, true);
		console.log(defaults.$target);
		var $element = $([
		'<div class="login">',
			'<div>',
				'<div class="result"></div>',
				'<div><label for="userid">Login Name :</label>',
				'<input type="text" id="username" name="username" placeholder="Enter user id"/></div>',
				'<div><label for="password">Password :</label>',
				'<input type="password" name="password" id="password" placeholder="Enter password"/></dsiv>',
				'<button value="Login" class="loginBtn">Login</button>',
			'</div>',
		'</div>'
		].join(' '));
		
		var $submitBtn = $element.find('.loginBtn');
		var $userName = $element.find('#username');
		var $password = $element.find('#password');
		
		//=================== CLICK HANDLERS ------//
		$($submitBtn).click(function(){
			$.ajax({
				url:'logMeIn',
				method:'post',
				data: {
					username: $userName.val(),
					password: $password.val()
				},
				complete: function(){
					console.log('Complete...')
				},
				success: function(result) {
					console.log('ajax sucess.....');
					$element.find('.result').html('').append(result);
				}
			});
		});
		if(options.$target) {
			options.$target.html('').append($element)
		}
		window.test = options.$target;
	};
})();