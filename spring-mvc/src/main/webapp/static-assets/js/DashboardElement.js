var ModalComponent = ModalComponent || {};

var DashboardElement;
(function() {
	
	defaults = {
		$target: null
	};
	
	 DashboardElement = function (options_in) {
		
		var that = this;
		var options = $.extend({}, defaults, options_in, true);
		
		var $element = $([
          		'<div class="container">',
    			'<div class="row">',
    				'<div class="col-xs-4 search-align">',
    					'<div class="input-group">',
    						'<input type="text" class="form-control" placeholder="Search for..."><span class="input-group-btn">',
    							'<button class="btn btn-default">Go</button>',
    						'</span>',
    					'</div>',
    				'</div>',
    			'</div>',
    			'<div class="row">',
    				'<div class="col-xs-3">',
    					'<div class="nav-content">',
    						'<div class="nav-content">',
    							'<ul class="nav nav-pills nav-stacked">',
    								'<li><a href="#">Snacks</a></li>',
    								'<li class="active"><a href="#">Pastries</a></li>',
    								'<li><a href="#">Sweets</a></li>',
    								'<li><a href="#">Ice Creams</a></li>',
    								'<li><a href="#">Chats</a></li>',
    								'<li><a href="#">Curries</a></li>',
    								'<li><a href="#">Rice</a></li>',
    							'</ul>',
    						'</div>',
    					'</div>',
    				'</div>',
    				'<div class="col-xs-9">',
    						'<div class="page-data" style="background-color: whitesmoke;">',
    							'<div class="row">',
    								'<div class="col-xs-4">',
    									'<div class="thumbnail">',
    										'<img src="'+CONTEXT_ROOT+'/images/cake1.jpg" alt="Yummy Cake">',
    										'<div class="caption">',
    											'<h3>Vanilla Cake</h3>',
    											'<p>Cake is a form of sweet dessert that is typically baked. In its oldest forms,', 
    												'cakes were modifications of breads but now cover a wide range of preparations ',
    												'that can be simple or elaborate and share features with other desserts such as pastries,', 
    												'meringues, custards and pies.</p>',
    											'<p>',
    												'<button type="button" class="btn btn-default show-more">More...</button>',
    												'<a href="#" class="btn btn-default" role="button">Button</a>',
    											'</p>',
    										'</div>',
    									'</div>',
    								'</div>',
    								
    								'<div class="col-xs-4">',
										'<div class="thumbnail">',
											'<img src="'+CONTEXT_ROOT+'/images/cake1.jpg" alt="Yummy Cake">',
											'<div class="caption">',
												'<h3>Vanilla Cake</h3>',
												'<p>Cake is a form of sweet dessert that is typically baked. In its oldest forms,', 
													'cakes were modifications of breads but now cover a wide range of preparations ',
													'that can be simple or elaborate and share features with other desserts such as pastries,', 
													'meringues, custards and pies.</p>',
												'<p>',
													'<a href="#" class="btn btn-primary" class="more-button" role="button">More...</a>',
													'<a href="#" class="btn btn-default" role="button">Button</a>',
												'</p>',
											'</div>',
										'</div>',
									'</div>',
    								
									'<div class="col-xs-4">',
										'<div class="thumbnail">',
											'<img src="'+CONTEXT_ROOT+'/images/cake1.jpg" alt="Yummy Cake">',
											'<div class="caption">',
												'<h3>Vanilla Cake</h3>',
												'<p>Cake is a form of sweet dessert that is typically baked. In its oldest forms,', 
													'cakes were modifications of breads but now cover a wide range of preparations ',
													'that can be simple or elaborate and share features with other desserts such as pastries,', 
													'meringues, custards and pies.</p>',
												'<p>',
													'<a href="#" class="btn btn-primary" class="more-button" role="button">More...</a>',
													'<a href="#" class="btn btn-default" role="button">Button</a>',
												'</p>',
											'</div>',
										'</div>',
									'</div>',
									
									'<div class="col-xs-4">',
										'<div class="thumbnail">',
											'<img src="'+CONTEXT_ROOT+'/images/cake1.jpg" alt="Yummy Cake">',
											'<div class="caption">',
												'<h3>Vanilla Cake</h3>',
												'<p>Cake is a form of sweet dessert that is typically baked. In its oldest forms,', 
													'cakes were modifications of breads but now cover a wide range of preparations ',
													'that can be simple or elaborate and share features with other desserts such as pastries,', 
													'meringues, custards and pies.</p>',
												'<p>',
													'<a href="#" class="btn btn-primary" class="more-button" role="button">More...</a>',
													'<a href="#" class="btn btn-default" role="button">Button</a>',
												'</p>',
											'</div>',
										'</div>',
									'</div>',
									
    								'<div class="col-xs-4">',
    									'<div class="thumbnail">',
    										'<img src="'+CONTEXT_ROOT+'/images/Diwali.jpg" alt="Diwali Snacks">',
    										'<div class="caption">',
    											'<h3>Diwali Snacks</h3>',
    											'<p>Cake is a form of sweet dessert that is typically baked. In its oldest forms,', 
    												'cakes were modifications of breads but now cover a wide range of preparations', 
    												'that can be simple or elaborate and share features with other desserts such as pastries,', 
    												'meringues, custards and pies.</p>',
    											'<p>',
    												'<a href="#" class="btn btn-primary" role="button">Button</a>',
    												'<a href="#" class="btn btn-default" role="button">Button</a>',
    											'</p>',
    										'</div>',
    									'</div>',
    								'</div>',
    								
    								'<div class="col-xs-4">',
										'<div class="thumbnail">',
											'<img src="'+CONTEXT_ROOT+'/images/Diwali.jpg" alt="Diwali Snacks">',
											'<div class="caption">',
												'<h3>Diwali Snacks</h3>',
												'<p>Cake is a form of sweet dessert that is typically baked. In its oldest forms,', 
													'cakes were modifications of breads but now cover a wide range of preparations', 
													'that can be simple or elaborate and share features with other desserts such as pastries,', 
													'meringues, custards and pies.</p>',
												'<p>',
													'<a href="#" class="btn btn-primary" role="button">Button</a>',
													'<a href="#" class="btn btn-default" role="button">Button</a>',
												'</p>',
											'</div>',
										'</div>',
									'</div>',
    				'</div>',
				'</div>',
			'</div>',
		].join(' '));
		
		var $results_layout = $element.find('.result-layout-container');
		var $filter_layout_cont = $element.find('.filter-layout-cont');
		var $search_layout_cont = $element.find('.search-layout-cont');
		
		var $moreButton = $element.find('.show-more');
		
		$moreButton.on('click', function(e) {
			console.log('Click Handler...');
			var modalComponent = new ModalComponent({
				$title: 'Test Modal',
				$modalContent: 'This is first modal testiung....',
				modalId:'myModal'
			});
			
			modalComponent.showModal();
			
		});
		
		//click handlers..
		
		var init = function () {
			//event listeners should go here...
		};
		
/*		$saveBtn.click( function (event) {
			var dialog;
			var userInfo = {
					full_name : $element.find('#full-name').val(),
					date_of_birth : $element.find('#date-of-birth').val()
			};
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
*/		init();
		if(options.$target) {
			options.$target.html('').append($element)
		}	
		
	};
	
})();