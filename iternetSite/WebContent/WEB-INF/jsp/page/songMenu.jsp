<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歌单</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/common.css"/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/songMenu.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/iconfont.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
</head>
<body>
<%@include file="../part/header.jsp" %>
<div class="songMenu">
	<div class="songMenuheader">
		<div class="allCat">
		   <c:forEach items="${songcatmore}" var="songCat">	
			<div class="perCat">
				<div class="bigCata catflo">
					<%-- <img src="${pageContext.request.contextPath}/icon/bigCata/yuzhong.png">
					<span>语种</span> --%>
					<img src="${ctx}/icon/bigCata/${songCat.songcatagory.icon}" style="display:inline-block;width:29px;height:27px;margin-right:5px;">
					<span>${songCat.songcatagory.name}</span>
				</div>
				<div class="smallCata catflo">
					<ul>
					   <c:forEach items="${songCat.children}" var="scpid">
						<li><a href="${ctx}/songMenu/sm/${scpid.id}/0">${scpid.name}</a></li>
					   </c:forEach>
					</ul>
				</div>
			</div><!-- 语种 -->
		   </c:forEach>
		</div>
	</div>
	<hr color="#c20c0c" size="2px">
	<div class="songMenuMain">
		<ul><!-- 950*1526 margin:30 0 0 -50-->
		   <c:forEach items="${page.list}" var="songMenu"> 
			<li><!--140*188  padding:0 0 30 50 -->
				<div class="songPercover"><!--140*140  -->
					<a href="${ctx}/songMenuDetail/${songMenu.songmenu.id}">
					<img src="${pageContext.request.contextPath}/img/songImg/songImg_1.jpg">
					</a>
					<div class="songPercoverBottom"><!--140*27  -->
						<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
						</span>
						<audio id="audio">
					   	 <source src="${pageContext.request.contextPath }/music/I Love You-Stewart Mac-1769374012-0.mp3" type="audio/mp3">
					   </audio>
					</div>
				</div>
				<p><a id="songNameIndex" href="#">${songMenu.songmenu.menuname}</a></p><!-- 140*20 -->
				<p>
					<span class="listener">by</span>
					<a class="listener">${songMenu.user.nickname}</a><!-- 谁创建了歌单 -->
					<!-- <sup>小图标</sup> -->
				</p>
			</li> 
		  </c:forEach> 
		</ul>
		
		<div class="songMenuBottom">
			<div class="pageCenter">
			<div class="songMenuBottomPager"><!-- 900*26 -->
			   	<c:if test="${page.currentPage>1}">
					<a href="${ctx}/songMenu/sm/${songmcid}/${(page.currentPage-2)*(page.perCount)}" class="pageBA"><i class="iconfont icon-fanhui"></i>上一页</a>
				</c:if>
				<c:if test="${page.currentPage<=1}">
					<a href="${ctx}/songMenu/sm/${songmcid}/0" class="pageBA"><i class="iconfont icon-fanhui"></i>上一页</a>
				</c:if>
				<c:forEach var="i" begin="1" end="${page.totalPage}" varStatus="status">
					<a class="songMenupageNum" href="${ctx}/songMenu/sm/${songmcid}/${(status.count-1)*(page.perCount)}">${status.count}</a>
				</c:forEach>
				<a>共${page.totalPage}页</a>
				<c:if test="${page.currentPage<page.totalPage}">
					<a href="${ctx}/songMenu/sm/${songmcid}/${(page.currentPage)*(page.perCount)}" class="pageBA">下一页<i class="iconfont icon-gengduo"></i></a>
				</c:if>
				<c:if test="${page.currentPage>=page.totalPage}">
					<a href="${ctx}/songMenu/sm/${songmcid}/${(page.totalPage-1)*(page.perCount)}" class="pageBA">下一页<i class="iconfont icon-gengduo"></i></a>
				</c:if>
			</div>
			</div>
		</div>
	</div>
	
</div>
<hr style="color:#ccc">
<%@include file="../part/foot.jsp" %>
</body>
</html>