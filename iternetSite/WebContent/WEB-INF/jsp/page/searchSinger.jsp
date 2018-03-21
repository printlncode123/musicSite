<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歌手简介</title>
<link rel="stylesheet" type="text/css" href="${ctx}/css/iconfont.css">
<script type="text/javascript" src="${ctx}/js/jquery.js"></script>
<script type="text/javascript" src="${ctx}/js/index.js"></script>
<style>
	*{margin:0px;padding:0px;}
	body{word-break: break-word;font-family: Arial, Helvetica, sans-serif;}
	a{cursor: pointer;text-decoration: none;color: #333;}
	.singerIntroduct{width: 980px;min-height: 700px;height: 700px;margin: 0 auto;background-color: #fff;border: 1px solid #d3d3d3;border-width: 0 1px;}
	.sileft{float: left;width: 100%;margin-right: -270px;}
	.sileft-child{margin-right: 271px;}
	.sileft-childsec{padding: 27px 30px 40px 39px;border-right: 1px solid #d3d3d3;}
	.sileft-topfl{position: relative;zoom: 1;height: 333px;margin-top: -20px;}
	.sname-max{max-width: 75%;}
	.sname {float: left;max-width: 100%;height: 34px;line-height: 24px;font-weight: normal;font-size: 24px;color: #333;}
	.f-thide {overflow: hidden;text-overflow: ellipsis;white-space: nowrap;word-wrap: normal;}
	h2 {display: block;font-size: 1.5em;-webkit-margin-before: 0.83em;-webkit-margin-after: 0.83em;-webkit-margin-start: 0px;-webkit-margin-end: 0px;font-weight: bold;}
	.salias {float: left;max-width: 23%;padding-left: 10px;font-size: 14px;line-height: 44px;color: #999;font-weight: normal;}
	h3 {display: block;font-size: 1.17em;-webkit-margin-before: 1em;-webkit-margin-after: 1em;-webkit-margin-start: 0px;-webkit-margin-end: 0px;font-weight: bold;}
	.sileft-topfl img{display: block;width: 640px;height: 300px;position: relative;top: -18px;}
	.m-tabs{height: 39px;border: 1px solid #ccc;border-width: 0 1px;background: url('${ctx}/icon/ban_mask.png') no-repeat;}
	ul.m-tabs{display: block;list-style-type: none;-webkit-margin-before: 1.5em;-webkit-margin-after: 1em;-webkit-margin-start: 0px;-webkit-margin-end: 0px;-webkit-padding-start: 40px;}
	.m-tabs li.sinav-big{position: relative;left: -1px;float: left;height: 39px;font-size: 14px;display: list-item;text-align: -webkit-match-parent;}
	.m-tabs a.z-slt {background-position: left -90px;float: left;height: 39px;font-size: 14px;background: url('${ctx}/icon/si-tab.png') no-repeat 0 9999px;}
	.m-tabs em {font-style:normal;background-position: right -90px;height: 37px;width: 134px;padding: 2px 2px 0 0;line-height: 37px;cursor: pointer;text-align: center;float: left;font-size: 14px;background:url('${ctx}/icon/si-tab.png') no-repeat 0 9999px;}
	.f-cb:after {clear: both;content: '.';display: block;height: 0;visibility: hidden;}
	.m-table-4, .m-table-5 {border: none;}
	.m-table {width: 100%;border: 1px solid #d9d9d9;}
	table {border-collapse: collapse;border-spacing: 0;table-layout: fixed;font-size:10px;}
	tbody {display: table-row-group;vertical-align: middle;border-color: inherit;}
	tr {display: table-row;vertical-align: inherit;border-color: inherit;}
	.m-table .even td {background-color: #f7f7f7;}
	.m-table .w1 {width: 74px;}
	.m-table td {padding: 6px 10px;line-height: 18px;text-align: left;}
	.m-table .hd {height: 18px;}
	.m-table .ply {float:right;width: 17px;height: 17px;cursor: pointer;}
	.num {width: 25px;margin-left: 5px;color: #999;}
	.m-table .tt {float: left;width: 100%;}
	.m-table .ttc {height: 18px;margin-right: 20px;}
	.m-table .txt {position: relative;display: inline-block;padding-right: 25px;margin-right: -25px;max-width: 99%;height: 20px;overflow: hidden;text-overflow: ellipsis;white-space: nowrap;}
	.m-table-1 .w2-1 {width: 79px;}
	.m-table .text {width: 100%;position: relative;zoom: 1;overflow: hidden;white-space: nowrap;text-overflow: ellipsis;}
	.m-table .text a {white-space: nowrap;}
	.siright{position: relative;float: right;width: 270px;zoom: 1;}
	.g-wrap7 {padding: 20px 40px 40px 30px;}
	.m-sidead {margin-bottom: 40px;}
	.u-hd3 {position: relative;height: 23px;margin-bottom: 20px;border-bottom: 1px solid #ccc;color: #333;}
	.f-fl {float: left;font-size: 14px;}
	.m-hdlist {margin-left: -25px;}
	.m-hdlist li {float: left;width: 50px;height: 92px;padding-left: 25px;}
	.m-hdlist .hd, .m-hdlist .hd img {width: 50px;height: 50px;}
	.m-hdlist p {margin-top: 7px;text-align: center;}
	.m-hdlist .nm {width: 50px;vertical-align: middle;font-size:12px;}
	.f-thide {overflow: hidden;text-overflow: ellipsis;white-space: nowrap;word-wrap: normal;}
	.f-ib {display: inline-block;}
	.m-cvrlst-alb4 {margin: 20px 0 0 -18px;}
	.u-cover-alb3 {width: 120px;height: 120px;}
	.u-cover {position: relative;display: block;}
	.u-cover img {display: block;width: 100%;height: 100%;}
	.u-cover-alb3 .msk {width: 145px;height: 120px;}
	.u-cover .msk {position: absolute;top: 0;left: 0;}
	.u-cover .bottom, .u-cover .msk, .n-musicsd .lst .avatar .msk {background: url('${ctx}/icon/coverall.png') no-repeat;background-position: -170px -850px;}
	.u-cover-alb3 .icon-play {left: 85px;width: 28px;height: 28px;background-position: 0 -140px;position: absolute;right: 10px;bottom: 5px;}
	.u-cover .icon-play {position: absolute;right: 10px;bottom: 5px;}
	.m-cvrlst li .dec-1 {line-height: 19px;max-height: 38px;}
	.m-cvrlst li .dec {margin: 8px 0 3px;font-size: 14px;}
	.m-cvrlst li p {width: 100%;}
	.f-thide2 {-webkit-line-clamp: 2;}
	.f-thide2, .f-thide3 {overflow: hidden;text-overflow: ellipsis;display: -webkit-box;-webkit-box-orient: vertical;-webkit-line-clamp: 2;}
	.f-pre {word-wrap: break-word;word-break: break-all;}
	.m-cvrlst li .dec-1 .tit {display: inline;}
	.m-cvrlst li .tit {display: inline-block;max-width: 100%;_width: 100%;vertical-align: middle;}
	.s-fc0, a.s-fc0:hover {color: #000;}
	.s-fc3, a.s-fc3:hover {color: #666;font-size:12px;}
	.u-cover-alb2 .icon-play, .u-cover-alb3 .icon-play, .u-cover-9 .icon-play {width: 28px;height: 28px;background-position: 0 -140px;}
	.m-cvrlst-alb4 li {width: 145px;height: 175px;}
	.m-cvrlst li {float: left;display: inline-block;overflow: hidden;padding: 0 0 30px 50px;line-height: 1.4;padding-left: 18px;}
	div.u-page {margin: 20px 0;text-align: center;font-size:12px;}
	/* div.u-page a.zprv.js-disabled, div.u-page a.zprv.js-disabled:hover {background-position: 0 -620px;color: #cacaca;cursor: default;} */
	div.u-page .zbtn {height: 24px;line-height: 24px;text-align: left;padding:0px;color: #333;}
	/* div.u-page a.js-selected, div.u-page a.js-selected:hover {background-position: 0 -650px;border-color: #A2161B;color: #fff;cursor: default;} */
	.u-btn, div.u-page a, div.u-page a.js-selected, div.u-page a.znxt.js-disabled, div.u-page a.zprv.js-disabled {background: url('${ctx}/icon/button.png') no-repeat 0 9999px;}
	div.u-page .zpgi {height: 22px;padding: 0 8px;line-height: 22px;background-color: #fff;}
	div.u-page .zbtn, div.u-page .zpgi {margin: 0 1px 0 2px;display: inline-block;border: 1px solid #ccc;border-radius: 2px;vertical-align: middle;}
	div.u-page .znxt {width: 57px;padding-left: 12px;background-position: -75px -560px;}
	.zpgi:hover{border-color: #A2161B;color: #fff;cursor: default;color: #cacaca;background-color:red;}
	.si-detailCon:not(.top50fir){display:none;}
</style>
<script type="text/javascript">
	$(function(){
		$(".sinav-big").click(function(){
			var i=$(this).index();
			/* alert(i); */
			$(".si-detailCon").eq(i).show().siblings(".si-detailCon").hide();
		});
	});
</script>
</head>
<body bgcolor="#f5f5f5">
	<%@include file="../part/header.jsp" %>
	<div class="singerIntroduct f-cb">
		<div class="sileft">
		   <div class="sileft-child">
		    <div class="sileft-childsec">
		       <div class="sileft-topfl f-cb">
				 <div class="sileft-top">
					<h2 class="sname f-thide sname-max">${infoSinger.name}</h2>
					<h3 class="salias f-thide">${infoSinger.smallname}</h3>
				 </div>
				 <%-- <img alt="" src="${ctx}/img/singerImg/big/1.jpg"> --%>
				 <img alt="" src="${ctx}/img/singerImg/big/${infoSinger.bigpic}">
				 <div class="mask f-alpha"></div>
			   </div>
		     <div class="sileft-main">
		   		<ul class="m-tabs f-cb">
		   			<li class="sinav-big active"><a class="z-slt"><em>热门50单曲</em></a></li>
		   			<li class="sinav-big"><a><em>所有专辑</em></a></li>
		   			<li class="sinav-big"><a><em>相关MV</em></a></li>
		   			<li class="sinav-big"><a><em>歌手介绍</em></a></li>
		   			
		   		</ul>
		   		<!--  热门50首-->
		   		<c:forEach items="${infoSongList}" var="is" varStatus="status">
		   		<div class="si-detailCon top50fir">
			   		<div class="n-top50">
			   			<div class="f-cb">
			   					<table class="m-table m-table-1 m-table-4">
			   					  <tbody>
			   						<tr class="even">
			   							<td class="w1">
			   								<div class="hd">
			   									<audio id="audio">
												   	 <%-- <source src="${ctx}/music/I Love You-Stewart Mac-1769374012-0.mp3" type="audio/mp3"> --%>
												   	 <source src="${ctx}/music/${is.song.path}" type="audio/mp3">
												</audio>
			   									<i class="iconfont icon-bofang ply" title="播放"></i>
			   									<span class="num">${status.count}</span>
			   								</div>
			   							</td>
			   							<td>
			   							 <div class="f-cb">
			   							 	<div class="tt">
			   							 		<div class="ttc">
			   							 			<span class="txt">
			   							 				<a href="${ctx}/songDetail/${is.song.id}"><b style="font-weight: normal;">${fn:substringBefore(is.song.path,".")}</b></a>
			   							 			</span>
			   							 		</div>
			   							 	</div>
			   							 </div>
			   							</td>
			   							<td class="w2-1 s-fc3">
			   								<i class="iconfont icon-jiajianzujianjiahao" title="添加到歌单"></i>
			   								<i class="iconfont icon-shoucang" title="加入喜欢"></i>
			   								<i class="iconfont icon-fenxiang" title="分享"></i>
			   								<i class="iconfont icon-xiazai3" title="下载"></i>
			   							</td>
			   							<td class="w4" width="20%">
			   								<div class="text">${is.albumName}</a></div>
			   							</td>
			   						</tr>
			   					  </tbody>
			   					</table>
			   			</div>
			   		</div>
		     	</div>
		     	</c:forEach>
		     	<!-- 所有专辑 -->
		     	<div class="si-detailCon">
			     	<ul class="m-cvrlst m-cvrlst-alb4 f-cb">
			     		<li>
							<div class="u-cover u-cover-alb3" title="偷故事的人 ">
							<img src="${ctx}/img/album/album_zhm1.jpg">
							<a href="" class="msk"></a>
							<a class="icon-play f-alpha" href="javascript:;" title="播放">
								<i class="iconfont icon-bofang" title="播放"></i>
							</a>
							</div>
							<p class="dec dec-1 f-thide2 f-pre" title="偷故事的人 ">
							<a href="" class="tit s-fc0">偷故事的人 </a>
							</p>
							<p><span class="s-fc3">2017.12.12</span></p>
						</li>
						<!-- ////////////////////// -->
						<li>
							<div class="u-cover u-cover-alb3" title="偷故事的人 ">
							<img src="${ctx}/img/album/album_zhm1.jpg">
							<a href="" class="msk"></a>
							<a class="icon-play f-alpha" href="javascript:;" title="播放">
								<i class="iconfont icon-bofang" title="播放"></i>
							</a>
							</div>
							<p class="dec dec-1 f-thide2 f-pre" title="偷故事的人 ">
							<a href="" class="tit s-fc0">偷故事的人 </a>
							</p>
							<p><span class="s-fc3">2017.12.12</span></p>
						</li><!-- /////////////////// -->
						<li>
							<div class="u-cover u-cover-alb3" title="偷故事的人 ">
							<img src="${ctx}/img/album/album_zhm1.jpg">
							<a href="" class="msk"></a>
							<a class="icon-play f-alpha" href="javascript:;" title="播放">
								<i class="iconfont icon-bofang" title="播放"></i>
							</a>
							</div>
							<p class="dec dec-1 f-thide2 f-pre" title="偷故事的人 ">
							<a href="" class="tit s-fc0">偷故事的人 </a>
							</p>
							<p><span class="s-fc3">2017.12.12</span></p>
						</li>
						<li>
							<div class="u-cover u-cover-alb3" title="偷故事的人 ">
							<img src="${ctx}/img/album/album_zhm1.jpg">
							<a href="" class="msk"></a>
							<a class="icon-play f-alpha" href="javascript:;" title="播放">
								<i class="iconfont icon-bofang" title="播放"></i>
							</a>
							</div>
							<p class="dec dec-1 f-thide2 f-pre" title="偷故事的人 ">
							<a href="" class="tit s-fc0">偷故事的人 </a>
							</p>
							<p><span class="s-fc3">2017.12.12</span></p>
						</li>
						<%-- <li>
							<div class="u-cover u-cover-alb3" title="偷故事的人 ">
							<img src="${ctx}/img/album/album_zhm1.jpg">
							<a href="" class="msk"></a>
							<a class="icon-play f-alpha" href="javascript:;" title="播放">
								<i class="iconfont icon-bofang" title="播放"></i>
							</a>
							</div>
							<p class="dec dec-1 f-thide2 f-pre" title="偷故事的人 ">
							<a href="" class="tit s-fc0">偷故事的人 </a>
							</p>
							<p><span class="s-fc3">2017.12.12</span></p>
						</li>
						<li>
							<div class="u-cover u-cover-alb3" title="偷故事的人 ">
							<img src="${ctx}/img/album/album_zhm1.jpg">
							<a href="" class="msk"></a>
							<a class="icon-play f-alpha" href="javascript:;" title="播放">
								<i class="iconfont icon-bofang" title="播放"></i>
							</a>
							</div>
							<p class="dec dec-1 f-thide2 f-pre" title="偷故事的人 ">
							<a href="" class="tit s-fc0">偷故事的人 </a>
							</p>
							<p><span class="s-fc3">2017.12.12</span></p>
						</li>
						<li>
							<div class="u-cover u-cover-alb3" title="偷故事的人 ">
							<img src="${ctx}/img/album/album_zhm1.jpg">
							<a href="" class="msk"></a>
							<a class="icon-play f-alpha" href="javascript:;" title="播放">
								<i class="iconfont icon-bofang" title="播放"></i>
							</a>
							</div>
							<p class="dec dec-1 f-thide2 f-pre" title="偷故事的人 ">
							<a href="" class="tit s-fc0">偷故事的人 </a>
							</p>
							<p><span class="s-fc3">2017.12.12</span></p>
						</li>
						<li>
							<div class="u-cover u-cover-alb3" title="偷故事的人 ">
							<img src="${ctx}/img/album/album_zhm1.jpg">
							<a href="" class="msk"></a>
							<a class="icon-play f-alpha" href="javascript:;" title="播放">
								<i class="iconfont icon-bofang" title="播放"></i>
							</a>
							</div>
							<p class="dec dec-1 f-thide2 f-pre" title="偷故事的人 ">
							<a href="" class="tit s-fc0">偷故事的人 </a>
							</p>
							<p><span class="s-fc3">2017.12.12</span></p>
						</li> --%><!--  //////////////////////////////////-->
			     	</ul>
			     	<!-- 专辑翻页 -->
			     	<div class="u-page">
						<a href="javascript:void(0)" class="zbtn zprv js-disabled" style="width:47px;padding-left:22px;background-position:0px -620px">上一页</a>
						<a href="javascript:void(0)" class="zpgi js-selected">1</a>
						<a href="/artist/album?id=10559&amp;limit=12&amp;offset=12" class="zpgi">2</a>
						<a href="/artist/album?id=10559&amp;limit=12&amp;offset=24" class="zpgi">3</a>
						<a href="/artist/album?id=10559&amp;limit=12&amp;offset=12" class="zbtn znxt">下一页</a>
					</div>
		     	</div>
		     </div>
		    </div>
		   </div>
		</div>
		<div class="siright">
		  <div class="g-wrap7">
		   <div class="m-sidead">
			<div class="siright-top">
				<img alt="" src="${ctx}/img/singerImg/ad_bid.jpg">
			</div>
		   </div>
			<div class="siright-middle">
				<h3 class="u-hd3">
					<span class="f-fl">热门歌手</span>
				</h3>
				<ul class="m-hdlist f-cb" id="rec-similar-artists">
					<li>
						<div class="hd">
							<a href="/artist?id=9621" title="王菲">
							<img src="${ctx}/img/singerImg/mini/1.jpg">
							</a>
						</div>
						<p>
							<a href="/artist?id=9621" title="王菲" class="nm nm-icn f-ib f-thide">王菲</a>
						</p>
					<%-- <a><img alt="" src="${ctx}/img/singerImg/mini/1.jpg"></a><p>歌手名</p> --%>
					</li>
				</ul>
			</div>
			<div class="siright-bottom"></div>
		  </div>
		</div>
	</div>
	<hr color="#d3d3d3">
	<%@include file="../part/foot.jsp" %>
</body>
</html>