$(function(){
	//获取内容的高度
	var content=$(".phoneInfoContent");
	//最外边框的高度
	var box=$("#phoneInfo");
	//自定义的滚动条
	var scrollbar=$(".scrollDiv");
	var scroll=function(content,box,scrollbar){
		var bigHeight=content.height();
		var smallHeight=box.height();
		var rate=smallHeigth/bigHeight;
		var h=Math.floor(rate*smallHeight);
		var offset=box.offset();
		var offsetT=offset.top+1;
		scrollbar.mousedown(function(e){
			var divoffsetT=scrollbar.offset().top;
			var tempT=e.pageY-divoffsetT;
			function move(e){
				var newH=e.pageY-tempT-offsetT;
				if(newH<0){
					newH=0;
				}else if(newH>(smallHeight-h)){
					newH=smallHeight-h;
				}
				var rate2=(newH+h)/smallHeight;
				var contentH=Math.floor(bigHeight*rate2-smallHeight);
				content.css("top",-contentH+"px");
				scrollbar.css("top",newH+"px");
			}
			$("body").on("mousemove",move);
			$("body").mouseup(function(){
				$(this).off("mousemoce",move);
			});
		});
	}
	scroll(content,box,scrollbar);
});