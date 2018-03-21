<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歌单详情</title>
<link rel="stylesheet" type="text/css" href="${ctx}/css/iconfont.css">
<script type="text/javascript" src="${ctx}/js/jquery.js"></script>
<style>
*{margin:0;padding:0;}
body{font-family: "Microsoft Yahei", Arial, Helvetica, sans-serif;}
.songDetail{background-color: #fff;width: 980px;min-height: 800px;margin: 0 auto;border: 1px solid #d3d3d3;border-width: 0 1px;}
 .logAfterMyRight{height:750px;float: right;width:680px;padding-bottom: 50px;margin:0px 260px;border-right:1px solid #d3d3d3}
.ftr{position: relative;zoom: 1;}
.u-cover-dj{width: 200px;height: 200px;float: left;position: relative;display: inline;margin: 0 -220px 0 0;}
.u-cover-dj img{display: block;width: 100%;height: 100%;}
.u-cover-dj .msk{width: 208px;height: 208px;top: -4px;left: -4px;position:absolute;background:url("${ctx}/icon/coverall.png") no-repeat;background-position: 0px -1285px;}
.u-cover-cnt{float: right;width: 100%;}
.u-cover-cntc{margin-left:230px;}
.sdinfo{cursor:default;padding:5px 8px 5px 8px;display:inline-block;border-radius:3px;border:1px solid #d3d3d3;}
.sdinfo i{display: inline-block;vertical-align: middle;padding: 0px 4px 0px 0px}
.sdinfo:first-child,.sdinfo:nth-child(2){color:#fff;background:blue;}
.sdinfo:nth-child(2){padding:6px 8px 5px 8px;border-left:0px;}
.sdinfo:nth-child(2) i{padding-right:0px;}
table{width: 90%;border: 1px solid #d9d9d9;border-collapse: collapse;border-spacing: 0;table-layout: fixed;font-size:12px;}
thead{display: table-header-group;vertical-align: middle;border-color: inherit;}
table th{padding:0px 10px;line-height:38px;height: 38px;background-color: #f7f7f7;vertical-align: top;text-align: left;font-weight: normal;color: #666;border:1px solid #e5e5e5;}
.wp{height: 18px;line-height: 18px;padding: 8px 10px;}
table td{background: #f7f7f7;padding: 6px 10px;line-height: 18px;text-align: left;}
audio{width:100%;}
.addilove{background:red;}
.siright{position: absolute;float: right;width: 260px;zoom: 1;right: 185px;top: 120px}
.g-wrap7 {padding: 20px 40px 40px 30px;}
.m-sidead {margin-bottom: 40px;}
.u-hd3 {position: relative;height: 23px;margin-bottom: 20px;border-bottom: 1px solid #ccc;color: #333;}
.f-fl {float: left;font-size: 14px;}
.m-hdlist {margin-left: -25px;}
.m-hdlist li {float: left;width: 50px;height: 92px;padding-left: 21px;}
.m-hdlist .hd, .m-hdlist .hd img {width: 50px;height: 50px;}
.m-hdlist p {margin-top: 7px;text-align: center;}
.m-hdlist .nm {width: 50px;vertical-align: middle;font-size:12px;}
 </style>
</head>
<body bgcolor="#f2f2f2">
	<%@include file="../part/header.jsp" %>
	<div class="songDetail">
	<div class="logAfterMyRight ftr">
				<div class="ftr"><!-- 默认歌单详细内容 -->
					<div><!-- 歌单头部信息 -->
						<div class="lamfheaderwrap" style="padding:40px;margin-left:-35px;">
							<div>
								<div class="u-cover-dj">
									<img src="${ctx}/img/songMenu/songMenu1.jpg" alt="歌单图">
									<span class="msk"></span>
								</div>
							</div>
								<div class="u-cover-cnt">
									<div class="u-cover-cntc">
									   <div>
									    <span style="width:40px;height:25px;line-height:25px;text-align:center;background:red;color:white;font-size:12px;display:inline-block;">歌单</span>
									    <span style="width:0px;height:0px;border-left:12px solid red;border-top:13px solid transparent;border-bottom:12px solid transparent;margin:-8px -5px;display:inline-block;"></span>
										<span style="padding:0px 10px;vertical-align:middle;font-size:20px;font-family:serif;">${songMenuinfo.menuname }</span>
									   </div>
									   <div style="clear:both;margin-top:10px"></div>
									   <div>
										<img style="display:inline-block;vertical-align:middle" src="${ctx}/img/head/${userinfo.headimg}" alt="头像">
										<span style="padding:0px 5px;font-size:12px;color:blue">${userinfo.nickname}</span><span style="font-size:12px;padding-left:5px;color:#333"><fmt:formatDate value="${songMenuinfo.createtime }" pattern="yyyy-MM-dd hh:mm"/></span>
									   </div>
										<div style="font-size:12px;margin-top:15px;">
								   	 		<a class="sdinfo bofang"><i class="iconfont icon-bofang"></i>播放</a><a class="sdinfo"><i class="iconfont icon-jiajianzujianjiahao"></i></a>
								   	 		<a class="sdinfo"><i class="iconfont icon-shoucang1"></i>收藏</a>
								   	 		<a class="sdinfo"><i class="iconfont icon-fenxiang"></i>分享</a>
								   	 		<a class="sdinfo" id="download"><i class="iconfont icon-xiazai3"></i>下载</a>
								   	 		<a class="sdinfo"><i class="iconfont icon-xiaoxi"></i>(1657)</a>
								   	 	</div>
								   	 	<div style="margin-top:20px;font-size:12px;">
											<span>标签：</span><span style="height:22px;line-height:22px;padding:0px 3px;border:1px solid #d3d3d3;border-radius:10px;background:#f7f5f5;width:40px;text-align:center;">${songMenuinfo.tag}</span>
										</div>
										<div style="margin-top:20px;font-size:12px;">
											<!-- <span>介绍：</span><span style="">测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试</span> -->
											<span>介绍：</span><span style="">${songMenuinfo.menuintroduct }</span>
										</div>
										<!-- <div style="width:100%;height:200px;"></div> -->
									</div>
								</div>
						</div>
					<div class="" style="width:100%;height:50px;"></div>
					<div style="padding:200px 0px 0px"><!-- 歌单列表 -->
						<div style="height:33px;border-bottom:2px solid #c20c0c;width:90%;">
							<h3 style="float:left;font-size:22px;"><span>歌单列表</span></h3>
							<!-- <span style="font-size:12px;float:left;padding:10px 10px">1首歌</span> -->
					    </div>
					    <div>
					    	<table>
					    		<thead>
					    			<tr>
					    				<th style="width:74px;">
					    					<div class="wp">&nbsp;</div>
					    				</th>
					    				<th>歌曲标题</th>
					    				<th>时长</th>
					    				<th>歌手</th>
					    				<th>专辑</th>
					    			</tr>
					    		</thead>
					    		<tbody>
					    		  <c:forEach items="${sinsonal}" var="ssa" varStatus="status">
					    			<tr>
					    				<td>
					    					<div style="height: 18px;">
					    						<span style="float:right;width:17px;height: 17px;cursor: pointer;"><i class="iconfont icon-bofang"></i></span>
					    						<span style="width: 25px;margin-left: 5px;color: #999;">${status.count}</span>
					    					</div>
					    				</td>
					    				<td>
					    					<div style="float: left;width: 100%;">
					    						<div style="height: 18px;margin-right: 20px;">
					    							<span style="font-size:12px;position: relative;display: inline-block;padding-right: 25px;margin-right: -25px;max-width: 99%;height: 20px;overflow: hidden;text-overflow: ellipsis;white-space: nowrap;">
					    								<input type="hidden" value="${ssa.song.path}">
					    								<a href="">${fn:substringBefore(ssa.song.path,".")}</a>
					    							</span>
					    						</div>
					    					</div>
					    				</td>
					    				<td>
					    					<!-- <span>04:13</span> -->
					    					<span><a id="favourite"><i class="iconfont icon-shoucang3" style="display:inline-block;font-size:18px;vertical-align:top;"></i></a></span>
					    					<span><a><i class="iconfont icon-shoucang1"></i></a></span>
					    					<span><a><i class="iconfont icon-fenxiang" style="display:inline-block;font-size:14px;"></i></a></span>
					    					<span><a href="${ctx}/songMenu/download?filename=${ssa.song.path}"><i class="iconfont icon-xiazai3" style="display:inline-block;font-size:14px;"></i></a></span>
					    				</td>
					    				<td>
					    					<span>${ssa.singer.name}</span>
					    				</td>
					    				<td>
					    					<span>${ssa.album.name}</span>
					    				</td>
					    			</tr>
					    	      </c:forEach>
					    		</tbody>
					    	</table>
					    </div>
					</div>
				    </div>
				<div><!-- 歌单评论 -->
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
					<span class="f-fl">推荐歌单</span>
				</h3>
				<ul class="m-hdlist f-cb" id="rec-similar-artists">
				  <c:forEach items="${historys}" var="historyMenu">
					<li>
						<div class="hd">
							<a href="/artist?id=9621" title="王菲">
							<img src="${ctx}/img/singerImg/mini/1.jpg">
							</a>
						</div>
						<p>
							<a href="/artist?id=9621" title="王菲" class="nm nm-icn f-ib f-thide" style="display:inline-block;font-size:px;">${historyMenu.menuname}</a>
						</p>
					<%-- <a><img alt="" src="${ctx}/img/singerImg/mini/1.jpg"></a><p>歌手名</p> --%>
					</li>
				   </c:forEach>
				</ul>
			</div>
			<div class="siright-bottom"></div>
		  </div>
		</div>
	</div>
	<hr color="#ccc" style="width:100%;">
	<%@include file="../part/foot.jsp" %>
	<audio controls="controls">
		<source src="">
	</audio>
</body>
<script type="text/javascript">
	$(function(){
		//歌单详情页的默认歌曲为歌单列表第一首歌手
		$("audio").eq(0).attr("src","${ctx}/music/"+$("table tbody tr:eq(0)").children().find(":eq(1)").find("input").val());
		//点击最上面的播放按钮
		$("a.bofang").hover(function(){$(this).css("cursor","pointer");}).click(function(){
			var aud=$("audio")[0];
			if(aud.paused){
				aud.play();
				$(this).find("i").attr("class","iconfont icon-zanting");
			}else{
				aud.pause();
				$(this).find("i").attr("class","iconfont icon-bofang");
			}
		});
		var a=$("audio").eq(0).attr("src").replace("${ctx}/music/","");
		//点击下载按钮
		$("#download").hover(function(){$(this).css("cursor","pointer");}).click(function(){
			window.location.href="${ctx}/songMenu/download?filename="+a;
		});
		//遍历歌单列表
		$("table tbody tr").each(function(){
			var songname=$(this).children().find(":eq(1)").find("input").val();
			var songnamenosuffix=$(this).children().find(":eq(1)").find("a").text();
			var bofangbtn=$(this).children().first().find("span:first").find("i");
			$(".icon-shoucang3").hover(function(){$(this).css("cursor","pointer")});
			var aud=$("audio")[0];
			bofangbtn.click(function(){
				if(aud.paused){
				aud.src="${ctx}/music/"+songname;
					aud.play();
					/* bofangbtn.attr("class","iconfont icon-zanting"); */
				}else{
				aud.src="";
					aud.pause();
					/* bofangbtn.attr("class","iconfont icon-bofang"); */
				}
			});
		});
	});	
</script>
</html>