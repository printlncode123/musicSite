<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>    
<c:set var="songName" value="${fn:substringBefore(song.path,'.')}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歌曲详情</title>
<link rel="stylesheet" type="text/css" href="${ctx}/css/iconfont.css">
<script type="text/javascript" src="${ctx}/js/jquery.js"></script>
<style>
*{margin:0;padding:0;}
body{font-family: "Microsoft Yahei", Arial, Helvetica, sans-serif;}
.songDetail{background-color: #fff;width: 980px;min-height: 700px;margin: 0 auto;border: 1px solid #d3d3d3;border-width: 0 1px;}
.g-mn4 {float: left;width: 100%;margin-right: -270px;}
.g-sd4 {position: relative;float: right;width: 270px;zoom: 1;}
.g-mn4c {margin-right: 271px;}
.g-wrap6 {padding: 47px 30px 40px 39px;}
.g-wrap6-topleft{float: left;width: 206px;margin-right: -226px;position: relative;zoom: 1;}
.g-wrap6-topleft img{display:block;height: 130px;padding:32px;}
.msk {position: absolute;display: block;width: 206px;height: 205px;background: url(/iternetSite/icon/coverall.png) no-repeat -140px -580px;margin: -200px -6px;z-index: 1;}
.g-wrap6-topright{float: right;width: 414px;}
.icon-jiajianzujianjiahao:before,.icon-fenxiang:before,.icon-xiazai3:before{font-size:14px;}
.sdinfo{cursor:default;padding:5px 8px 5px 8px;display:inline-block;border-radius:3px;border:1px solid #d3d3d3;}
.sdinfo i{display: inline-block;vertical-align: middle;padding: 0px 4px 0px 0px}
.sdinfo:first-child,.sdinfo:nth-child(2){color:#fff;background:blue;}
.sdinfo:nth-child(2){padding:7px 8px 6px 8px;border-left:0px;}
.sdinfo:nth-child(2) i{padding-right:0px;}
.sdnameheader{font-size:24px;padding-bottom: 35px;}
.sdnameheader em{font-style: normal;font-style: normal;display: block;margin: -30px 65px;}
.des{margin: 10px 0;font-size:12px;}
.des span{color: #333;}
.s-fc4{color:#999;}
.s-fc7, a.s-fc7:hover {color: #0c73c2;}
.sdnameheaderSingle{width: 40px;height: 25px;background: red;}
.sdnameheaderSingle-icon{border-left: 12px solid red;border-top: 13px solid transparent;border-bottom: 12px solid transparent;width: 0px;height: 0px;border-radius: 2px;position: relative;left: 40px;}
.sdnameheaderSingle span{display: inline-block;margin: -23px 6px;font-size: 14px;color: #fff;}
	#lyricContainer{font-size:14px;width:500px;height:210px;overflow:hidden;margin-top:30px;}
	ul,li{list-style-type:none;}
	.lrcAddClass{color:red;font-weight:bold;text-shadow:1px 1px 2px lime;}
	audio{background:#333;width:100%;height:50px;}
</style>
</head>
<body bgcolor="#f2f2f2">
	<%@include file="../part/header.jsp" %>
	<div class="songDetail">
		<div class="g-mn4">
			<div class="g-mn4c">
				<div class="g-wrap6">
					   <div class="g-wrap6-top">
					   	 <div class="g-wrap6-topleft">
					   	 	<img src="${ctx}/img/songDetail/${singer.bigpic}">
					   	 	<%-- <img src="${ctx}/img/songDetail/${infoSong.img}"> --%>
					   	 	<span class="msk"></span>
					   	 </div>
					   	 <div class="g-wrap6-topright">
					   	 	<div class="sdnameheader"><div class="sdnameheaderSingle"><div class="sdnameheaderSingle-icon"></div><span>单曲</span></div><em>${fn:substringBefore(song.path,".")}</em></div>
					   	 	<p class="des s-fc4">歌手:<span><a class="s-fc7" href="">${singer.name}</a></span></p>
					   	 	<p class="des s-fc4">所属专辑:<span><a class="s-fc7" href="">${album.name}</a></span></p>
					   	 	<div style="font-size:12px;">
					   	 		<a class="sdinfo bofang"><i class="iconfont icon-bofang"></i>播放</a><a class="sdinfo"><i class="iconfont icon-jiajianzujianjiahao"></i></a>
					   	 		<a class="sdinfo"><i class="iconfont icon-shoucang1"></i>收藏</a>
					   	 		<a class="sdinfo"><i class="iconfont icon-fenxiang"></i>分享</a>
					   	 		<a class="sdinfo"><i class="iconfont icon-xiazai3"></i>下载</a>
					   	 		<a class="sdinfo"><i class="iconfont icon-xiaoxi"></i>(1657)</a>
					   	 	</div>
					   	 	<div id="lyricContainer">
					   	 		<ul></ul>
					   	 	</div>
					   	 </div>
					   </div>
					   <div class="g-wrap6-bottom"></div>
				</div>
			</div>
		</div>
		<div class="g-sd4"></div>
	</div>
	<hr color="#ccc">
	<%@include file="../part/foot.jsp" %>
	<audio controls="controls">
		<source src="${ctx}/music/${songName}.mp3">
	</audio>
</body>
<script type="text/javascript">
	$(function(){
		var lyric;
		var lines;
		$.get("${ctx}/music/${songName}.lrc", function(data){
			var lrcContent;
			var r=parseList(data);
			var audio=$("audio");
			var lyricContainer=$("#lyricContainer ul");
			$.each(r,function(i,obj){
					  lyricContainer.append("<li class=lrcClass-"+obj[0]+">"+obj[1]+"</li>");
			}); 
			  audio.bind('timeupdate',function(){//播放器时间触发
				var t=this.currentTime;
				$("#lyricContainer ul li").each(function(i,o){//遍历歌词
					var lc=$(this).attr("class");	
					var lct=parseFloat(lc.replace("lrcClass-",""));
					//获取该行歌词距离上部的偏移量
					var offTop=$(this).offset().top;
					if(t>=lct){//当每行歌词的样式与当前播放器时间相等时将该行歌词做特殊处理
						$(this).addClass("lrcAddClass").siblings().removeClass("lrcAddClass");
						 if(offTop>=400){
							//当偏移为大于等于180时获取该行歌词的时间与下行歌词的时间差，如果差等于0，将歌词每行向上移
							var lrcNextC=$(this).next().attr("class");//下一行歌词的class
							var lrcNextT=parseFloat(lrcNextC.replace("lrcClass-",""));//下一行歌词的开始时间
							var terminal=lrcNextT-t;//时间间隔
							if(terminal<=0){//当时间间隔为0时将歌词上移
								$("#lyricContainer ul li").each(function(i,o){var offTop2=$(this).offset().top;$(this).offset({top:offTop2-20});});
							}
						}
						
					}
				});
			});
		});
		//点击播放按钮播放音乐
		$(".bofang").click(function(){var aud=$("audio")[0];if(aud.paused){aud.play();$(".bofang i").attr("class","iconfont icon-zanting");}else{aud.pause();$(".bofang i").attr("class","iconfont icon-bofang");}});
		
	});	
function parseList(text){
	lines=text.split("\n");
	var result=[];//保存最终结果的数组
	var pattern=/(\[\d{2}:\d{2}.\d{2,3}\])/g;
	for(i=0;i<lines.length;i++){
		if(pattern.test(lines[i])){
			//var pattern=/(\[\d{2}:\d{2}.\d{2,3}\]).*/g; 
			//var line=lines[i].replace(pattern,'$1');//$1表示正则分组中的第一组
			var line=lines[i];
			line[line.length-1]===0&&line.pop();//去掉换行符\n
			var time=line.match(pattern),//匹配字符串
			value=line.replace(pattern,'');//提取歌词
			 //因为一行里面可能有多个时间，所以time有可能是[xx:xx.xx][xx:xx.xx][xx:xx.xx]的形式，需要进一步分隔
			time.forEach(function(v1,i1,a1){//v1数组中元素，i1索引，a1数组本身
			var t=v1.slice(1,-1).split(":");//注：slice()只针对真正的数组起作用
			result.push([parseInt(t[0],10)*60+parseFloat(t[1]),value]);//将每行的时间和歌词压入结果数组中
				});
		}
	}
	//将结果数组中的元素按时间大小进行排序
	result.sort(function(a,b){
		return a[0]-b[0];
	}); 
	return result;
}

</script>
</html>