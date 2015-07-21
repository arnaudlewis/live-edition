$(document).ready(function(){
 	'use strict';

	$.each($(".slide"), function(index, slide) {
		if(index === 0) $(slide).addClass("active")
		$(slide).css("background-image", "url(" +  $(this).attr('data-image') + ")");
	});
});