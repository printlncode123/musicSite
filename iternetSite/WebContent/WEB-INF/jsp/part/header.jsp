<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导航</title>
<script type="text/javascript" src="${ctx}/js/jquery.js"></script>
<script type="text/javascript" src="${ctx}/js/index.js"></script>
<script type="text/javascript" src="${ctx}/js/myMusic.js"></script>
<style type="text/css">
 *{margin:0;padding:0;}
 #topfoot ul li{list-style:none;}
 #topfoot ul li a{color:white;display:inline-block;}
 #topfoot ul li a:visited{color:white;}
 #topheader ul#ul1 li a{color:white;}
 #topheader ul#ul1 li a:visited{color:white;opacity:1;}
 #topheader{background:#242424;}
 #topheader ul#ul1{width:850px;height:70px;margin:0px auto;}
 #topheader ul#ul1 li.navlitophead{display:inline-block;width:110px;height:66px;
 			color:white;line-height:66px;opacity:0.8;font-size:14px;
 			margin:0px 10px;text-align:center;}
 #topheader ul#ul1 li.navlitophead:hover{background:black;opacity:1;}
 .navlitopheadClass{background:black;opacity:1;}
 #topheader ul#ul1 li.logo{margin-left:-70px;padding-right:40px;opacity:1;width:150px;}
 #topheader ul#ul1 li.logo img{width:40px;height:60px;vertical-align:middle;}/* vertical-align:middle;使图片与文字居中对齐 */
 #topheader ul#ul1 li.logo span{display:inline-block;font-size:20px;font-family:"微软雅黑";}
 #topheader ul#ul1 li.active {background:black;opacity:1;}
 #topheader ul#ul1 li.active a{width:100%;height:100%;position:relative;left:10px;}
 #topheader ul#ul1 sub{display:none;width:0px;height:0px;position:relative;left:-31px;top:14px;border-left:6px solid transparent;border-right:6px solid transparent;border-bottom:10px solid #c20c0c;}
/*  #topheader ul#ul1 li.active sub{display:block;} */
 #topheader ul#ul1 .search{opacity:1;}
 #topheader ul#ul1 .search #search{background-image: url("${ctx}/icon/search.png");background-repeat:no-repeat;background-position-x: 8px;
    background-position-y:3px;border-radius:32px;display:inline-block;width:145px;height:25px;text-indent:35px;font-size:10px;}
 #topheader ul#ul1 li.login{position:absolute;right:20px;}
 #topfoot{background:#c20c0c;}
 #topfoot ul#ul2{width:850px;height:30px;margin-left:385px;}
 #topfoot ul#ul2 li{display:inline-block;width:90px;height:30px;margin:0px 20px;
 			color:white;line-height:30px;font-size:12px;text-align: center;}
.liaborder{border-radius:20px;border:1px solid #c20c0c;background:#9B0909;padding:0px 13px;line-height:22px;}
#ul3 {display:none;background:#0e0c0c;margin-top:-10px;z-index:9999;box-shadow: 0 5px 16px rgba(0,0,0,0.8);}
#ul3 .loginenter{opacity:0.8;width: 100%;height: 40px;line-height: 40px;}
.navpoint{display:none;border-left: 20px solid transparent;border-right: 20px solid transparent;border-bottom: 20px solid #0e0c0c;width: 0px;height: 0px;margin: -20px 35px 0px 35px;box-shadow: 0 5px 16px rgba(0,0,0,0.8);}
</style>
</head>
<body>

<div class="" id="topContainer">
	<div class="" id="topheader">
		<ul id="ul1">
			<li class="logo navlitophead">
				<img src="${ctx}/img/logo.png">
				<span><b>网易云音乐</b></span>
			</li>
			<li class="active navlitophead"><a href="${ctx}">发现音乐</a>
			<sub class="cor">&nbsp;</sub>
			</li>
			<li class="navlitophead"><a href="${ctx}/myMusic">我的音乐</a><sub class="cor">&nbsp;</sub></li>
			<li class="navlitophead"><a>商城</a><sub class="cor">&nbsp;</sub></li>
			<li class="navlitophead"><a>下载客户端</a><sub class="cor">&nbsp;</sub></li>
			<li class="search navlitophead">
				<input id="search" type="text" placeholder="歌手/音乐">
			</li>
			<li class="login navlitophead">
			<c:if test="${usernick!=''&&usernick!=null}">
				<%-- <img alt="default.jpg" src="${ctx}/img/head/default.jpg" style="display:inline-block;vertical-align:middle;"> --%>
				<a class="headerlogin" href="javascript:;">${usernick}</a><!-- href="${ctx}/index2#modelDivAll_phone" -->
			</c:if>
			<c:if test="${usernick==''||usernick==null}">
				<a class="headerlogin" href="javascript:;" style="display:inline-block">登录</a>
			</c:if>
				<div class="navpoint"></div>
				<ul id="ul3">
					<li class="loginenter"><a>手机号登录</a></li>
  					<!-- <li class="loginenter"><a>QQ登录</a></li>
					<li class="loginenter"><a>微信登录</a></li>
					<li class="loginenter"><a>新浪微博登录</a></li> -->
					<li class="loginenter"><a href="javascript:;" class="logout">退出登录</a></li>
				</ul>
			</li>
		</ul>
	<div class="" id="topfoot">
		<ul id="ul2">
			<li><a class="navheader" href="${ctx}">推荐</a></li>
			<li><a class="navheader">排行榜</a></li>
			<li><a class="navheader" href="${ctx}/songMenu/sm/6/0">歌单</a></li>
			<li><a class="navheader" href="${ctx}/singer/singerData">歌手</a></li>
			<li><a class="navheader">新碟上架</a></li>
		</ul>
	</div>
</div>
	</div> 
	<div class="loginbody" style="display:none;">
		<%@include file="myMusic.jsp" %>
	</div>
</body>
<script type="text/javascript">
	/* function enter(){
		if(event.keyCode==13){
			alert("回车键");
		}
	} */
	$(function(){
		//回车搜索
		$("#search").keydown(function(event){
			var key=$(this).val();
			if(event.keyCode==13){
				/* $.get("${ctx}/search/singer",{"key":key},function(data){
				}); */
					/* alert(key); */
					window.location="${ctx}/search/singer?key="+key;
			}
		});
		//点击登录
		$(".headerlogin").click(function(){
			$(".loginbody").css("display","block");
		});
		//退出登录
		$(".logout").click(function(){
			$("#ul3,.navpoint").hide();
			$.ajax({
				type:'GET',
				url:'${ctx}/user/logout',
				success:function(data){
					location.reload();
				}
			});
		});
	}); 
</script>
</html>