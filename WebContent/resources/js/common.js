(function(){
	var context_root;
	function doSameHeight(){
		$("[data-sh]").each(function(index,element){
			$(element).height($('#'+$(element).attr("data-sh")).height());
		});
	}
	function mapLinks(){
		$(".va_menu_row").on('click','[data-link]',function(){
			var currentUrl=window.location.href;
			var forwardUrl=currentUrl.substring(0,currentUrl.lastIndexOf("/"))+"/"+$(this).attr('data-link');
			window.location.href=forwardUrl;
		});
	}
	$(function(){
		doSameHeight();
		mapLinks();
	});
})();