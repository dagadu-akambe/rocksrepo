var ModalComponent;
(function() {
	
	defaults = {
		modalId:'myModal',	
		$target: null,
		$modalContent: null,
		$title: '',
		$buttons: []
	};
	
	ModalComponent = function (options_in) {
		
		var that = this;
		var options = $.extend({}, defaults, options_in, true);
		
		that.$modalElement = $([
		   '<div class="modal-window">',                     
	           '<div class="modal fade" id="'+options.modalId+'" role="dialog">',
		           '<div class="modal-dialog">',
		             '<!-- Modal content-->',
		             '<div class="modal-content">',
		               '<div class="modal-header">',
		                 '<button type="button" class="close" data-dismiss="modal">&times;</button>',
		                 '<h4 class="modal-title">'+options.$title+'</h4>',
		               '</div>',
		               '<div class="modal-body">',
		                 '<p>'+options.$modalContent+'</p>',
		               '</div>',
		               '<div class="modal-footer">',
		                 '<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>',
		               '</div>',
		             '</div>',
		           '</div>',
	         '</div>',
	       '</div>' 
		].join(' '));
		
		var $modalDialog = that.$modalElement.find('#'+options.modalId);
		
		that.showModal = function () {
			$modalDialog.modal('show');
		};
		
		//click handlers..
		/*$moreButton.on('click', function(e){
			$smallModal.modal('show');
		});*/
		
		return that;
	};
})();