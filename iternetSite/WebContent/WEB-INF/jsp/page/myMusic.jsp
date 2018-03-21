<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的音乐</title>
<link href="${ctx}/css/iconfont.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${ctx}/js/myMusic.js"></script>
<script type="text/javascript" src="${ctx}/js/index.js"></script>
<style type="text/css">
span{display:inline-block;}
.myMusicContainer{width:981px;height:700px;background-color:#fff;border-left:1px solid #d3d3d3;border-right:1px solid #d3d3d3;margin:0px auto;border-bottom:1px solid #d3d3d3}
.myMusicContent{/* display:none; */width:807px;height:268px;margin:0px auto;padding-top:104px;}
.myMusicContent img{display:inline-block;float:left;}
h2{font-family: Arial, Helvetica, sans-serif;}
.logAfterMyLeft{border-right:1px solid #d3d3d3;overflow-x:hidden;overflow-y:auto;/* height:256px; */height:610px;padding-bottom: 50px;padding-top: 40px;float: left;width: 240px;/* position: fixed; */}
.n-minelst-1{margin-top:5px;}
.n-minelst-1 h2 {padding: 0 10px 12px 15px;font-size: 14px;color: #000;}
.f-ff1 {font-family: simsun,\5b8b\4f53;}
.jiamenu{border:1px solid #d3d3d3;border-radius:2px;line-height:22px;width: 52px;height: 22px;display:inline-block;float:right;cursor:pointer;background:rgba(236, 231, 231, 0.42);}
.jiamenu i{text-align:left;display: inline-block;line-height: 22px;overflow: hidden;padding-left:5px;font-size: 12px;font-weight: normal;font-style:normal;}
.jiamenu i.icon-jiajianzujianjiahao{color:red;}
.tri1 {border-color: #ccc transparent transparent;border-style: solid dashed dashed;border-width: 8px 7px 0;}
.tri {display: inline-block;vertical-align: middle;margin: 0 2px 0 5px;cursor: pointer;font-size: 0;height: 0;line-height: 0;}
em, i {font-style: normal;text-align: left;font-size: inherit;}
.n-minelst-1 ul * {cursor: pointer;vertical-align: middle;}
.n-minelst-1 li{position: relative;zoom: 1;height: 42px;padding: 6px 0 6px 20px;}
.n-minelst-1 .item{padding-left:50px;}
.n-minelst-1 .itemleft{padding-right:10px;display: inline;float: left;margin-left: -50px;overflow: hidden;width: 40px;}
.n-minelst-1 .avatar{display: block;position: relative;width: 40px;height: 40px;}
.avatar img {width: 40px;height: 40px;}
.n-minelst-1 .name{width: 150px;overflow: hidden;margin-top: 2px;margin-bottom: 8px;}
.n-minelst-1 .loveup{text-overflow: ellipsis;white-space: nowrap;word-wrap: normal;}
.n-minelst-1 .name a{white-space:nowrap;font-size:12px;}
.n-minelst-1 .num{font-size:12px;width: 130px;color: #999;overflow: hidden;text-overflow: ellipsis;white-space: nowrap;word-wrap: normal;}
.myliStyle span{float:right;margin-top:-22px;padding-right:12px;}
.myliStyle span i{display:none;}
.myliStyle:hover,.myliStyle-active{background:#e6e6e6;}
.logAfterMyRight{height: 100%;float: right;width: 740px;padding-bottom: 50px;}
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
table{width: 100%;border: 1px solid #d9d9d9;border-collapse: collapse;border-spacing: 0;table-layout: fixed;font-size:12px;}
thead{display: table-header-group;vertical-align: middle;border-color: inherit;}
table th{padding:0px 10px;line-height:38px;height: 38px;background-color: #f7f7f7;vertical-align: top;text-align: left;font-weight: normal;color: #666;border:1px solid #e5e5e5;}
.wp{height: 18px;line-height: 18px;padding: 8px 10px;}
table td{background: #f7f7f7;padding: 6px 10px;line-height: 18px;text-align: left;}
.bootmodel{width:530px;border:1px solid #878787;border-radius:2px;background-color: rgb(255, 255, 255);z-index: 9999;position: absolute;top: 180px;left: 418px;box-shadow: 0 5px 16px rgba(0,0,0,0.8);}
.createmenu{height:287px;display:none;}
.editmenu{height:287px;display:none;}
.bootmodelmenu{width: 100%;height: 39px;line-height: 39px;background-color: #000;}
</style>
</head>
<body bgcolor="#f2f2f2">
	<%@include file="../part/header.jsp" %>
	<div class="myMusicContainer">
	    <c:if test="${user==null}">
			<div class="myMusicContent">
				<img id="img1" alt="登录音乐" src="${ctx}/img/my/myBg.png">
				<div class="myRight">
					<h2>网易云音乐</h2>
					<img alt="其他" src="${ctx}/img/my/extra.png">
					<br>
					<a href="javascript:;" class="oncelog">立即登录</a>
				</div>
			</div>
		</c:if>
		<c:if test="${user!=null}">
			<div class="logAfterMy">
				<div class="logAfterMyLeft">
					<div id="logAfterMyLeftContainer">
						<div class="n-minelst-1 createMenu">
							<h2 class="f-ff1">
								<a class="jiamenu"><i class="iconfont icon-jiajianzujianjiahao"></i><i>新建</i></a>
								<span><i class="tri tri1"></i>创建的歌单(<span>3</span>)</span>
							</h2>
							<ul>
								<li>
									<div class="item">
										<div class="itemleft">
											<a class="avatar">
												<img alt="喜欢的音乐" src="${ctx}/icon/love.jpg">
											</a>
										</div>
									</div>
										<p class="name loveup">
											<a>我喜欢的音乐</a>
										</p>
										<p class="num">0首</p>
								</li>
								<c:if test="${songMenus==null}"></c:if>
								<c:if test="${songMenus!=null}">
									<c:forEach items="${songMenus}" var="songMenu" varStatus="status">
										<input type="hidden" id="menulen" value="${fn:length(songMenus) }">
										<li class="myliStyle">
										<div class="item">
											<div class="itemleft">
												<a class="avatar" href="javascript:;">
													<img alt="喜欢的音乐" src="${ctx}/icon/${songMenu.menucover}">
													<input type="hidden" value="${ctx}/myMusic/myMusicData/${status.index}">
												</a>
											</div>
										</div>
											<p class="name loveup">
												<a>${songMenu.menuname }</a>
												<!-- <a>有种爱叫做放手</a> -->
											</p>
											<p class="num">${songMenu.songcount}首</p>
											<span>
												<i class="iconfont icon-shouhuodizhiyebianji edit-menu" title="编辑" style="cursor:pointer"></i>
												<i class="iconfont icon-changyonggoupiaorenshanchu" title="删除" style="cursor:pointer"></i>
											</span>
									</li>
								    </c:forEach>
							    </c:if>
							</ul>
						</div>
						<div class="n-minelst-1 loveMenu"></div>
					</div>
				</div>
				 <%--  <c:if test="${songOrSm==null}"></c:if>
				  <c:if test="${songOrSm!=null}"> --%>
						<div class="logAfterMyRight ftr">
							<div class="ftr"><!-- 默认歌单详细内容 -->
								<div><!-- 歌单头部信息 -->
									<div class="lamfheaderwrap" style="padding:40px;">
										<div>
											<div class="u-cover-dj">
												<img src="${ctx}/img/songMenu/songMenu1.jpg" alt="歌单图">
												<span class="msk"></span>
											</div>
										</div>
											<div class="u-cover-cnt">
												<div class="u-cover-cntc">
												   <div>
												    <span style="width:40px;height:25px;line-height:25px;text-align:center;background:red;color:white;font-size:12px;">歌单</span>
												    <span style="width:0px;height:0px;border-left:12px solid red;border-top:13px solid transparent;border-bottom:12px solid transparent;margin:-8px -5px;"></span>
													<span style="padding:0px 10px;vertical-align:middle;font-size:20px;font-family:serif;">${songOrSm.songmenu.menuname}</span>
													<span class="edit-menu" style="float:right;padding:2px 5px;cursor:pointer"><i class="iconfont icon-shouhuodizhiyebianji" title="编辑"></i><span style="font-size:12px;color:blue;">编辑</span></span>
												   </div>
												   <div style="clear:both;margin-top:10px"></div>
												   <div>
													<img style="display:inline-block;vertical-align:middle" src="${ctx}/img/head/default.jpg" alt="头像">
													<span style="padding:0px 5px;font-size:12px;color:blue">${user.nickname}</span><span style="font-size:12px;padding-left:5px;color:grey"><fmt:formatDate value="${songOrSm.songmenu.createtime }" pattern="yyyy-MM-dd"/>&nbsp;创建</span>
												   </div>
													<div style="font-size:12px;margin-top:15px;">
											   	 		<a class="sdinfo bofang"><i class="iconfont icon-bofang"></i>播放</a><a class="sdinfo"><i class="iconfont icon-jiajianzujianjiahao"></i></a>
											   	 		<a class="sdinfo"><i class="iconfont icon-shoucang1"></i>收藏</a>
											   	 		<a class="sdinfo"><i class="iconfont icon-fenxiang"></i>分享</a>
											   	 		<a class="sdinfo"><i class="iconfont icon-xiazai3"></i>下载</a>
											   	 		<a class="sdinfo"><i class="iconfont icon-xiaoxi"></i>(1657)</a>
											   	 	</div>
											   	 	<div style="margin-top:20px;font-size:12px;">
														<span>标签：</span><span style="height:22px;line-height:22px;padding:0px 3px;border:1px solid #d3d3d3;border-radius:10px;background:#f7f5f5;width:40px;text-align:center;">${songOrSm.songmenu.tag}</span>
													</div>
													<div style="margin-top:20px;font-size:12px;">
														<span>介绍：</span><span style="">${songOrSm.songmenu.menuintroduct}</span>
													</div>
												</div>
											</div>
									</div>
								<div class="" style="width:100%;height:50px;"></div>
								<div style="padding:200px 0px 0px"><!-- 歌单列表 -->
									<div style="padding: 0 10px 0 32px;height:33px;border-bottom:2px solid #c20c0c;">
										<h3 style="float:left;font-size:22px;"><span>歌单列表</span></h3>
										<span style="font-size:12px;float:left;padding:10px 10px">${songOrSm.songmenu.songcount}首歌</span>
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
								    		   <c:forEach items="${songOrSm.sinsonalb}" var="songDetail" varStatus="status">
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
								    								<a href="">${songDetail.song.path}</a>
								    							</span>
								    						</div>
								    					</div>
								    				</td>
								    				<td>
								    					<span>
								    					    <span><a id="favourite"><i class="iconfont icon-shoucang3" style="display:inline-block;font-size:18px;vertical-align:middle;"></i></a></span>
									    					<span><a><i class="iconfont icon-shoucang1"></i></a></span>
									    					<span><a><i class="iconfont icon-fenxiang" style="display:inline-block;font-size:14px;"></i></a></span>
									    					<span><a><i class="iconfont icon-xiazai3" style="display:inline-block;font-size:14px;"></i></a></span>
								    					</span>
								    				</td>
								    				<td>
								    					<span>${songDetail.singer.name}</span>
								    				</td>
								    				<td>
								    					<span>${songDetail.album.name }</span>
								    				</td>
								    			</tr>
								    		   </c:forEach>
								    		</tbody>
								    	</table>
								    </div>
								</div>
							<div><!-- 歌单评论 -->
							</div>	
								</div>
							</div>
						</div>
				<%--   </c:if> --%>
			</div>
	    </c:if>
		
		<!-- 登录界面 -->
		<div class="loginbody" style="display:none;">
			<%@include file="../part/myMusic.jsp" %>
		</div>
		<!-- 模态框：新建歌单 -->
		<div class="bootmodel createmenu">
		  <form action="${ctx}/myMusic/addmenu" method="post">
		    <div class="bootmodelmenu"><!--  style="width:100%;height:39px;background-color:#000;" -->
				<span style="display:inline-block;text-indent:20px;color:#fff">创建歌单</span>
				<span title="关闭窗体" style="display:inline-block;float:right;margin-right:20px;color:#fff;cursor:pointer" onclick="document.getElementsByClassName('createmenu')[0].style.display='none'">×</span>
			</div>
		    <div style="margin: 30px 50px;">
				<label>歌单名</label>
				<input type="text" name="menuname" style="width:250px;height:30px;border:1px solid #cdcdcd;"><br>
				<div style="margin:30px 0px">
					<input type="submit" value="提交" style="background:#2894ff;color:#fff;width:120px;height:40px;">
					<input type="reset" value="重置" style="background:#2894ff;color:#fff;width:120px;height:40px;margin-left:60px;">
				</div>
				<!-- 歌单现有长度大小 -->
				<input type="hidden" name="menulen" id="menusize">
			</div>
		  </form>
		</div>
		<!-- 模态框：编辑 -->
		<div class="bootmodel editmenu">
			<form action="${ctx}/myMusic/editmenu" method="post"  enctype="multipart/form-data">
			<input type="hidden" value="${songOrSm.songmenu.id }" name="id">
			<div><span>${songOrSm.songmenu.menuname }>编辑歌单</span></div>
			<hr width="100%">
			<label><span>*</span><span>歌单名:</span></label>
			<input type="text" name="menuname" value="${songOrSm.songmenu.menuname}">
			<br>
			<label>标签:</label><span>${songOrSm.songmenu.tag}</span>
			<span id="selected"></span>
			<select name="tag" onchange="selectVal(this.value);">
			   <c:forEach items="${menuCatagory }" var="menucat" varStatus="status">
				  <option value="${menucat.name}" id="${status.index}">${menucat.name}
			   </c:forEach>
			</select>
			<br>
			<label>介绍:</label>
			<textarea rows="10" cols="50" name="menuintroduct">${songOrSm.songmenu.menuintroduct }</textarea>
			<br>
			<img alt="" id="originCover" src="${ctx}/icon/${songOrSm.songmenu.menucover }" width="140" height="140"><br>
			<input type="file" id="file" name="file" style="display:none;" onchange="changeCoverFile(this);"><br> 
			<button type="button" id="updateCover" onclick="changeCover()">更换封面</button>
			<input type="submit" value="保存">
			<input type="reset" value="重置">
		  </form>
		</div>
	</div>
	<hr color="#ccc">
	<%@include file="../part/foot.jsp" %>
</body>
<script type="text/javascript">
$(function(){
	$(".myliStyle:first").addClass("myliStyle-active");
	//点击立即登录显示需要登录
	$(".oncelog").click(function(){
		$(".loginbody").show();
	});
	$("#menusize").val($("#menulen").val());
	//遍历做菜单栏歌单列表
	$(".myliStyle").each(function(){
		//选中li背景变色
		$(this).click(function(){
			var link=$(this).find("input[type=hidden]").val();
			window.location.href=link;
			$(this).addClass("myliStyle-active").siblings(".myliStyle").removeClass("myliStyle-active");
		});	
		//悬浮li背景变色
		$(this).hover(function(){
			$(this).find(".iconfont").show();
		},function(){$(this).find(".iconfont").hide();});
	});
	/* 点击创建歌单弹出模态框 */
	$(".jiamenu").click(function(){
		$(".createmenu").show();
	});
	/* 点击编辑歌单，弹出编辑框 */
	$(".edit-menu").click(function(){
		$(".logAfterMyRight").html($(".editmenu").html());
	});
	
	/* 点击更换封面按钮，打开文件选择框 */
	/*  $("#updateCover").click(function(){
		alert("abcd");
		 $("#file").trigger("click");
	}); */ 
});
/* 下拉框选中回显 */
function selectVal(a){
	document.getElementById("selected").innerText=a;
}
/* 点击更换按钮弹出文件选择框*/
function changeCover(){
	var fileLabel=document.getElementById('file');
	fileLabel.click(); 
}
/* 上传图片当时就回显在当前位置 */
function changeCoverFile(a){
	var file=a.files[0];
	var img=document.getElementById("originCover");
	if(window.FileReader){
		var reader=new FileReader();
		reader.readAsDataURL(file);
		//监听文件读取结束后事件
		reader.onloadend=function(e){
			img.src=e.target.result;//e.target.result是最后的路径地址
		}
	}
}
</script>
</html>