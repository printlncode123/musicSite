<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歌单详情</title>
</head>
<body bgcolor="#f2f2f2">
	<%@include file="../part/header.jsp" %>
	<div class="smenuDetailContainer">
		<div class="g-mn4">
			<div class="g-mn4c">
				<div class="g-wrap6">
					   <div class="g-wrap6-top">
					   	 <div class="g-wrap6-topleft">
					   	 	<img src="${ctx}/img/songDetail/1.jpg">
					   	 	<span class="msk"></span>
					   	 </div>
					   	 <div class="g-wrap6-topright">
					   	 	<div class="sdnameheader"><div class="sdnameheaderSingle"><div class="sdnameheaderSingle-icon"></div><span>单曲</span></div><em>歌名</em></div>
					   	 	<p class="des s-fc4">歌手:<span><a class="s-fc7" href="">张惠妹</a></span></p>
					   	 	<p class="des s-fc4">所属专辑:<span><a class="s-fc7" href="">AMIT2</a></span></p>
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
</body>
</html>