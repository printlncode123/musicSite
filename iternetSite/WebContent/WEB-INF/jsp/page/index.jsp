<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/iconfont.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js"></script>
</head>
<body>
	<%-- <jsp:include page="../part/header.jsp"/>
	<jsp:include page="../part/foot.jsp"/> --%>
	<%@include file="../part/header.jsp" %>
	<div class="indexContainer" id="">
	 <div class="indextop">
	    <div class="lunbo">
			<div class="lunbomain">
			<%@include file="../../../html/before/lunbo.html" %>
			</div>
			<div class="lunbobgcolor"></div>
			<div class="lunboright">
				<img src="${ctx}/img/lunbo/lunbo_3.jpg"/>
			</div>
	    </div>	
	   </div>
	   <div class="indexDown">
		   <div class="indexDownleft bottom">
			<div class="main">
				<div class="mainCat">
					<div class="mainhead">
						<a class="catname sameflo">热门推荐</a>
						<div class="tab sameflo">
							<a>日语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a >欧美</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a >韩语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a >粤语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a >小语种</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
						</div>
						<span class="more sameflo">更多</span>
					</div>
					<div class="mainContent" id="mainContent">
						<ul>
							<c:forEach items="${songList}" var="song" varStatus="status">
								<li class="indexSong">
									<audio class="audio">
									   	 <source src="${ctx}/music/${song.path}" type="audio/mp3">
									</audio>
								<div class="mainConSong">
									  <a href="#">
										<img alt="songID.jpg" src="${ctx}/img/songImg/${song.img}">
									  </a>
										<span class="opatrans">
										  <span class="maincenterLine">
						                	<i class="iconfont icon-kefu" title="试听"></i>
						                	<span title="在线试听人数" style="font-size:12px;">300万</span>
											<!-- <i id="isPlay" class="iconfont icon-bofang play" title="播放" style="cursor:pointer;"></i> -->
										    <i class="iconfont icon-bofang play" title="播放" onclick="play(this,document.getElementsByTagName('audio')[${status.index}]);" style="cursor:pointer;"></i> 
										  </span>
										</span>
								</div>
								<a href="" id="songNameIndex">我们不一样</a>
							</li>
							</c:forEach>
							<%-- <li>
								<div class="mainConSong">
									  <a href="#">
										<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									  </a>
										<span class="opatrans">
										  <span class="maincenterLine">
						                	<i class="iconfont icon-kefu" title="试听"></i>
						                	<span title="在线试听人数" style="font-size:12px;">300万</span>
											<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
										  </span>
										</span>
								</div>
								<p></p><a href="" id="songNameIndex">我们不一样</a>
							</li>
							 --%>
							
							
							<%-- <li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
								<audio id="audio">
								   	 <source src="${pageContext.request.contextPath }/music/I Love You-Stewart Mac-1769374012-0.mp3" type="audio/mp3">
								</audio>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
						</ul>
					</div>
				</div> --%>
				<!-- <div class="">新碟上架</div>-->
				<%-- <div class="mainCat">
					<div class="mainhead">
						<a class="catname sameflo">热门推荐</a>
						<div class="tab sameflo">
							<a >华语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a >华语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a >华语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a >华语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
						</div>
						<span class="more sameflo">更多</span>
					</div>
					<div class="mainContent">
						<ul>
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
						</ul>
					</div>
				</div>
				<!-- <div class="">榜单</div> -->
				<div class="mainCat">
					<div class="mainhead">
						<a class="catname sameflo">热门推荐</a>
						<div class="tab sameflo">
							<a>华语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a>华语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a>华语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
							<a>华语</a>&nbsp;&nbsp;&nbsp;<span>|</span>&nbsp;&nbsp;
						</div>
						<span class="more sameflo">更多</span>
					</div>
					<div class="mainContent">
						<ul>
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
									<a hidefocus title=""></a>
									<div class="mainConSongBottom"></div>
								</div>
								<p>我们不一样</p>
							</li>
							
							<li>
								<div class="mainConSong">
									<img alt="songID.jpg" src="${pageContext.request.contextPath}/img/songImg/songImg_2.jpg">
									<span class="opatrans">
									  <span class="maincenterLine">
					                	<i class="iconfont icon-kefu" title="试听"></i>
					                	<span title="在线试听人数" style="font-size:12px;">300万</span>
										<i id="isPlay" class="iconfont icon-bofang play" title="播放" onclick="play();" style="cursor:pointer;"></i>
									  </span>
									</span>
								</div>
								<p>我们不一样</p>
							</li> --%>
						</ul>
					</div>
				</div>
				<!-- ////////////////// -->
			</div>
		   </div>
		   <div class="indexDownright bottom"></div>
	   </div>
	</div>
	<hr style="color:#ccc;">
	
	<%@include file="../part/foot.jsp" %>
	<%-- <div class="loginbody" style="">
		<%@include file="../part/myMusic.jsp" %>
	</div> --%>
</body>
</html>