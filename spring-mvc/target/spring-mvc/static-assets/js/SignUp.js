/**
 * 
 */
console.log('Welcome to Sign Up...');
$.ajax({
	url:'/ajaxTest',
	complete: function() {
		console.log('Call completed...');
	},
	success : function(data) {
		console.log(data.message);
	}
})