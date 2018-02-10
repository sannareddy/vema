(function(){
	function doSameHeight(){
		$("[data-sh]").each(function(index,element){
			$(element).height($('#'+$(element).attr("data-sh")).height());
		});
	}
	$(function(){
		doSameHeight();
	});
})();