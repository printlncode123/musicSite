var lis=document.getElementsByClassName("indexSong");
function playSet(){
	var audio,isPlay;
	for(var k=0;k<lis.length;k++){
		audio=lis[k].getElementsByTagName("audio")[0];//初始audio
		isPlay=lis[k].getElementsByClassName("iconfont")[1];//初始播放暂停图标
        audio.id="audio_"+k;
		isPlay.id="isPlay_"+k;
	}
}
function play(i,aud){
	if(aud.paused){
		 aud.play();
		 i.className="iconfont icon-zanting play";
	 }else{
		 aud.pause();
		 i.className="iconfont icon-bofang play";
	 }
}
$(function(){
	//设置每个li下audio和播放暂停图标的id
	playSet();
	//给导航第一个链接加默认背景
	$(".navheader:eq(0)").addClass("liaborder");
	/*$(".navheader").hover(function(){$(this).addClass("liaborder")},function(){$(this).removeClass("liaborder")});*/
	//点击导航链接背景变色
	var windowUrl=location.pathname;//当前url的路径不包括协议://主机名：端口
	$(".navheader").each(function(){
			//var windowUrl=window.location.href;//获取当前url链接[相当于location.protocol+"//"+location.hostname+":"+location.port+"/"+location.pathname]
			var href=$(this).attr("href");//导航a标签的href属性
			if(href!="/iternetSite/recommend"){
			if(href==windowUrl){
				$(this).addClass("liaborder").siblings().removeClass("liaborder");
				$(".navheader:eq(0)").removeClass("liaborder");
			}
			}
		});
	//设置第一页默认色
	$(".songMenupageNum:eq(0)").addClass("pageNumColor");
	//指针进入页码显示手形
	$(".songMenupageNum").mouseenter(function(){
		$(this).addClass("pageNumBorder");
	});
	//翻页换色
	$(".songMenupageNum").each(function(){
		$(this).bind("click",function(){
			$(this).addClass("pageNumColor").siblings(".songMenupageNum").removeClass("pageNumColor");
		});
	});
	//鼠标悬浮登录，显示登录方式
	$(".headerlogin").hover(function(){
		$("#ul3,.navpoint").show();
	});
	//鼠标悬浮登录方式
	$("#ul3").hover(
			function(){$("#ul3 .loginenter").each(function(){$("#ul3 .loginenter").css({'background':'#333','cursor':'pointer'});});},
			function(){$("#ul3,.navpoint").hide();}
					  );
	$("#topheader ul#ul1 li.active sub").show();
	//
	/*$(".loginbody").css("display","none");*/
	/*$(".headerlogin").click(function(){
		$(".loginbody").css({"display":"block"});
	});*/
	/*$("#topheader ul#ul1 .navlitophead").each(function(i,obj){
		$(this).addClass("navlitopheadClass").siblings().removeClass("navlitopheadClass");
		$(this).children().last().show().siblings().hide();
	});*/
});