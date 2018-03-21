<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歌手</title>
<script type="text/javascript" src="${ctx}/js/jquery.js"></script>
<link rel="stylesheet" href="${ctx}/css/iconfont.css" type="text/css">
<link type="text/css" rel="stylesheet" href="${ctx }/css/singer.css"/>
<script type="text/javascript" src="${ctx}/js/index.js"></script>
<style type="text/css">
</style>
</head>
<body bgcolor="#f2f2f2">
	<%@include file="../part/header.jsp" %>
	<div class="singerContainer"><!-- 985*1253 -->
		<div class="singerLeft singerMiddle"><!-- 180*878 -->
			<div class="singerLeftContent"><!-- 180*827 padding:0 10 40,margin-top:51 -->
			   <c:forEach items="${catagorys}" var="cago">	
					<div class="singerCat">
						<h2>
							${cago.sc.name}
						</h2>
						<ul>
							<c:forEach items="${cago.children}" var="scChild">
								<li>
									<a href="javascript:;">${scChild.name}</a>
									<input type="hidden" value="${scChild.id}">
								</li>
							</c:forEach>
						</ul>
					</div>
			   </c:forEach>
			</div>
		</div>
		<div class="singerRightGlobal">
				<div class="singerRight singerMiddle"><!--799*1493  padding:40-->
					<div class="singerRightRuzhuTop"><!-- 719*42 -->
							<h3><span>新锐歌手</span></h3> 
							<a class="singerRightMore" href="" style="float:right;margin-top:14px;display:inline-block;font-family: Arial, Helvetica, sans-serif;font-size:12px;">更多</a>
					</div>
					<div class="singRightMainRuzhu"><!-- 719*368 margin:20 0 0 -17 -->
						<div class="singerRightRuzhuContent">
							<ul>
							    <c:forEach items="${newSingersLimit}" var="newSinger">
									<li><!-- 147*184 padding-left:17 -->
										<div class="ruzhuContentTop"><!-- 130*130 -->
										  <a href="javascript:;" onclick="window.location='${ctx}/singer/sitro/${newSinger.id}';">
											<%-- <img src="${ctx}/img/singerImg/603631883675241.jpg"> --%>
											<img src="${ctx}/img/singerImg/${newSinger.headimg}">
										  </a>
										</div>
										<p><!-- 100%,margin-top:8px -->
											<a href="" style="font-size:12px;">${newSinger.name}</a>
											<a href="">
												<img alt="" src="${ctx}/icon/singerHome.png">
											</a>
										</p>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
					<div class="singerRightRuzhuTop"><!-- 719*42 -->
							<h3><span>热门歌手</span></h3> 
							<a class="singerRightMore" href="" style="float:right;margin-top:14px;display:inline-block;font-family: Arial, Helvetica, sans-serif;font-size:12px;">更多</a>
					</div>
					<div class="RenMenMainAll"><!-- 719*921 -->
						<div class="singRightMainRuzhu"><!-- 719*368 margin:20 0 0 -17 -->
						<div class="singerRightRuzhuContent">
							<ul>
							 <c:forEach items="${hotupSingers}" var="hotupSinger">
								<li><!-- 147*184 padding-left:17 -->
									<div class="ruzhuContentTop"><!-- 130*130 -->
									  <a href="">
										<img src="${ctx}/img/singerImg/${hotupSinger.headimg}">
									  </a>
									</div>
									<p><!-- 100%,margin-top:8px -->
										<a href="" style="font-size:12px;">${hotupSinger.name}</a>
										<a href="">
											<img alt="" src="${ctx}/icon/singerHome.png">
										</a>
									</p>
								</li>
							  </c:forEach>
							</ul>
						</div>
					</div>
					<hr color="#ccc" width="729px" style="display:inline-block;margin:0px -5px">
						<!-- 分割下也是 热门歌手-->
						<ul id="restHotSinger"><!-- 18*42个歌手 -->
						  <c:forEach items="${hotdownSingers}" var="hotdownSinger">
							<li>
								<a href="">${hotdownSinger.name}<img style="vertical-align:middle;" src="${ctx}/icon/singerHome.png"></a>
							</li><!-- 147*30 -->
						  </c:forEach>	
						</ul>
					</div>
				</div>
		</div>
		
	</div>
	<hr color="#ccc">
	<%@include file="../part/foot.jsp" %>
</body>
<script type="text/javascript">
	$(function(){
		 $(".singerCat ul:first").children().first().click(function(){
			window.location="${ctx}/singer/singerData";
		});
		$(".singerCat ul li").each(function(){
			var sincatid=$(this).children().last().val();
			$(this).click(function(){
				 $.ajax({
				   type: "GET",
				   url: "${ctx}/singer/singerCid",
				   data: {"sincatid":sincatid},
				   success: function(msg){
					    var sinBycatid=JSON.parse(msg);
					    var sbcName=sinBycatid.singercatagory.name;
					    var arr=sinBycatid.singer;
					    $(".singerRightRuzhuTop:last,.RenMenMainAll").hide();
					    $(".singerRightGlobal .singerRight .singerRightRuzhuTop h3 span").html(sbcName);
					    /* alert(arr.length); */
					    var sclis=$(".singerRightGlobal .singerRightRuzhuContent ul li");
					    if(sclis.length!=arr.length){
						    sclis.each(function(n,ob){
						    	if(sclis.length>arr.length){
						    		if(n>arr.length-1){
						    			$(this).remove();
						    		}
							    }else{
							    while(sclis.length<arr.length){
								    var addContent="<li><div class='ruzhuContentTop'><a href='javascript:;'><img src=''></a></div><p><a href='' style='font-size:12px;'></a><a href=''><img alt='' src='${ctx}/icon/singerHome.png'></a></p></li>";						    	
									$(".singerRightGlobal .singerRightRuzhuContent ul").append(addContent);
									sclis.length++;
							    }
							    }
						    });
					    }
					    for(var n=0;n<arr.length;n++){
					    	var scid=arr[n].id;
							var schead=arr[n].headimg;
							var scname=arr[n].name;
							/* alert(scname); */
						    sclis.each(function(m,mo){
						    	if(n==m){
							    	$(this).find(".ruzhuContentTop a").attr("href","${ctx}/singer/sitro/"+scid);
							    	$(this).find(".ruzhuContentTop a img").attr("src","${ctx}/img/singerImg/"+schead);
							    	$(this).find("p a:first").text(scname);
						    	}
						    });
					    } 
				   }
				 });
				});
			});
	});
</script>
</html>