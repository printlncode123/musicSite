<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>底部</title>
<style type="text/css">
*{margin:0;padding:0;}
.foot{width:100%;height:141px;background:#f2f2f2;}
.footcontainer{width:980px;height:91px;margin:0 auto;background:#f2f2f2;}
.footleft{width:490px;height:83px;}
.footleft .footleftcount{position:relative;bottom:-35px;}
.footleft .footup .footuword{font-size:10px;color:#999;display:inline-block;}
.footleft .footup .footl{font-size:10px;text-align:center;display:inline-block;width:30px;color:#999}
.footleft .footdown{margin-top:8px;}
.footleft .footdown span{font-size:12px;color:#666;}
.footright{margin-top:-70px;margin-left:715px;width:330px;height:70px;}
.footright .footrightcount .same{float:left;margin-right:10px;width:60px;height:70px;}
.footright .footrightcount .same .footrightup{width:60px;height:70px;}
.footright .footrightcount .same img{width:46px;height:45px;padding-left:6px;}
.footright span{font-size:8px;color:#999;display:inline-block;text-align:center;width:60px;height:70px;}
</style>
</head>
<body>
<div class="foot">
	<div class="footcontainer">
		<div class="footleft">
		   <div class="footleftcount">
			<div class="footup">
				<span class="footuword">关于我们</span><span class="footl">|</span>
				<span class="footuword">客服服务</span><span class="footl">|</span>
				<span class="footuword">服务条款</span><span class="footl">|</span>
				<span class="footuword">网站导航</span><span class="footl">|</span>
				<span class="footuword">意见反馈</span>
			</div>
			<div class="footdown"><span>我们公司版权所有©1997-2018杭州乐读科技有限公司运营：浙网文[2015] 0415-135号</span></div>
		   </div>
		</div>
		<div class="footright">
		  <div class="footrightcount">
		   <div class="same">
			<div class="footrigfir">
				<div class="footrigfirup">
					<img src="${pageContext.request.contextPath}/icon/footfir.png"/><br>
				</div>
				<div class="footrigfirdown">
					<span>独立音乐人</span>
				</div>
			</div>
		   </div>
		   <div class="same">
			<div class="footrigsec">
				<div class="footrigsecup">
					<img src="${pageContext.request.contextPath}/icon/footsec.png"/><br>
				</div>
				<div class="footrigsecdown">
					<span>音乐专栏</span>
				</div>
			</div>
		   </div>
		   <div class="same">
		    <div class="footrigthi">
				<div class="footrigthiup">
					<img src="${pageContext.request.contextPath}/icon/footthi.png"/><br>
				</div>
				<div class="footrigthidown">
					<span>自媒体</span>
				</div>
			</div>
		   </div>
		   <div class="same">
			<div class="footrigfou">
				<div class="footrigfouup">
					<img src="${pageContext.request.contextPath}/icon/footfou.png"/><br>
				</div>
				<div class="footrigfoudown">
					<span>赞赏</span>
				</div>
			</div>
		   </div>
		  </div>
		</div>
	</div>
</div>	
</body>
</html>