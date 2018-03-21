<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的音乐</title>
<link href="${pageContext.request.contextPath}/css/iconlogin.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/css/myMusic-log.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/myMusic.js"></script>
<style type="text/css">
</style>
</head>
<body>
	<div class="myContainer">
		<div id="modelDivAll_phone" class="modelDiv" style="display:block;width:530px;height:287px;border:1px solid #878787;border-radius:2px;background-color: rgb(255, 255, 255);">
			<div class="modelDivTop"> <!-- style="width:100%;height:39px;background-color:#000;" -->
				<span style="display:inline-block;text-indent:20px;color:#fff">登录</span>
				<span title="关闭窗体" style="display:inline-block;float:right;margin-right:20px;color:#fff;cursor:pointer" onclick="document.getElementById('modelDivAll_phone').style.display='none'">×</span>
			</div>
			<div class="modelDivCenter">
				<div class="modelDivbefore">
					<div class="modelDivCenterLeft">
						<img src="${pageContext.request.contextPath}/img/my/platformphone.png"/><br><br>
						<a href="javascript:;" style="background:#2894ff;color:#fff">手机号登录</a><br><!--  onclick="phoneLogin();" -->
						<a href="javascript:;" style="background:#f0f0f0;color:#000;margin-top:5px;">注册</a>
					</div>
					<div class="modelDivCenterRight" style="height:216px;width:148px;float:left;padding:3px 0px 3px 39px;margin:-200px 270px;">
						<ul style="list-style-type:none;">
							<li><i class="logicon icon iconfont icon-weixindenglu"></i><a href="http://music.163.com/api/sns/authorize?snsType=10&clientType=web2&callbackType=Login&forcelogin=true">微信登录</a></li>
							<li><i class="logicon icon iconfont icon-qqdenglu"></i><a href="http://music.163.com/api/sns/authorize?snsType=5&clientType=web2&callbackType=Login&forcelogin=true">QQ登录</a></li>
							<li><i class="logicon icon iconfont icon-weibodenglu"></i><a href="http://music.163.com/api/sns/authorize?snsType=2&clientType=web2&callbackType=Login&forcelogin=true">微博登录</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="modelDivAll_phoneoper" class="modelDiv" style="width:530px;height:287px;border:1px solid #878787;border-radius:2px;background-color: rgb(255, 255, 255);">
			<div class="modelDivTop"><!--  style="width:100%;height:39px;background-color:#000;" -->
				<span style="display:inline-block;text-indent:20px;color:#fff">登录</span>
				<span title="关闭窗体" style="display:inline-block;float:right;margin-right:20px;color:#fff;cursor:pointer" onclick="document.getElementById('modelDivAll_phoneoper').style.display='none'">×</span>
			</div>
			<div class="modelDivCenter2">
				<div class="modelDivafter" style="width:220px;height:151px;margin:0px auto;padding:30px 0px 43px;">
					<div>
						<div style="float:left;width:45px;height:30px;position:relative;border:1px solid #cdcdcd;border-radius:2px;z-index:10">
							<a class="phoneNoSelect" href="javascript:;" style="padding:0px 180px 0px 5px;height:30px;line-height:30px;font-size:12px;">
								<span class="telprefix">+86</span><span style="vertical-align:middle;display:inline-block;width:0px;height:0px;border:4px solid grey;border-top-color:grey;border-left-color:transparent;border-right-color:transparent;border-bottom-color:transparent;margin:0px 2px"></span>
							</a>
						</div>
						<div class="modelteltext" style="float:left;margin:-30px 46px;height:30px;width:180px;">
							<input type="text" placeholder="请输入手机号" style="width:170px;height:28px;margin-top:-2px;display:inline-block;">
						</div>
						<div class="phoneInfo" style="width:100%;height:128px;overflow:hidden;border:1px solid #cdcdcd;">
						  <div class="phoneInfoClass" style="width:100%;height:128px;overflow-x:hidden;overflow-y:auto;">
							<ul style="list-style-type:none;height:800px;">
							
							</ul>
						  </div>
						</div>
					</div>
					<div class="select-hide">
						<div style="clear:both;width:218px;height:28px;border-radius:2px;margin-top:40px;">
							<input class="passedtext" type="text" placeholder="请输入密码" style="width:100%;height:100%;border:1px solid #cdcdcd;">
						</div>
						
						<div style="padding:15px 0px;">
							<div style="float:left;font-size:12px;">
								<input type="checkbox"><label>自动登录</label>
							</div>
							<div style="float:right;font-size:12px;"><a>忘记密码?</a></div>
						</div>
						<div class="btnmy log" style="font-size:12px;background-color:#2894ff; width:220px; height:30px;display:inline-block;line-height:30px;text-align:center;color:#fff;border-radius:2px;border:1px solid #ccc;margin-top:15px;">
							<a href="javascript:;" onclick="">登录</a>
						</div>
					</div>
				</div>
			</div>
			<div class="modelDivafterBottom" style="margin-top:-25px;background:#f7f7f7;line-height:48px;height:48px;padding:0px 19px;border-top:1px solid #c6c6c6;font-size:14px;">
				<a href="javascript:;" style="color:#0c72c3;display:inline-block;text-indent:15px;">其他登录方式</a>
				<a href="javascript:;" style="display:inline-block;margin-right:15px;float:right;">没有账号?免费注册</a>
			</div>
		</div>
		
		<div id="modelDivAll_phoneregist" class="modelDiv" style="width:530px;height:287px;border:1px solid #878787;border-radius:2px;background-color: rgb(255, 255, 255);">
			<div class="modelDivTop"><!--  style="width:100%;height:39px;background-color:#000;" -->
				<span style="display:inline-block;text-indent:20px;color:#fff">注册</span>
				<span title="关闭窗体" style="display:inline-block;float:right;margin-right:20px;color:#fff;cursor:pointer" onclick="document.getElementById('modelDivAll_phoneregist').style.display='none'">×</span>
			</div>
			<div class="modelDivCenter2">
				<div class="modelDivafter" style="width:220px;height:151px;margin:0px auto;padding:15px 0px 58px;">
					<div>
					    <label style="margin-left:-47px;font-size:12px;display:inline-block">手机号：</label>
						<div style="top:30px;float:left;width:45px;height:30px;position:relative;border:1px solid #cdcdcd;border-radius:2px;z-index:10">
							<a class="phoneNoSelect" href="javascript:;" style="padding:0px 180px 0px 5px;height:30px;line-height:30px;font-size:12px;">
								<span class="telprefix">+86</span><span style="vertical-align:middle;display:inline-block;width:0px;height:0px;border:4px solid grey;border-top-color:grey;border-left-color:transparent;border-right-color:transparent;border-bottom-color:transparent;margin:0px 2px"></span>
							</a>
						</div>
						<div class="modelteltext" style="float:left;margin:0px 46px;height:30px;width:180px;">
							<input type="text" placeholder="请输入手机号" style="width:170px;height:28px;margin-top:-2px;display:inline-block;">
						</div>
						<div class="phoneInfo" style="width:100%;height:128px;overflow:hidden;border:1px solid #cdcdcd;">
						  <div class="phoneInfoClass" style="width:100%;height:128px;overflow-x:hidden;overflow-y:auto;">
							<ul style="list-style-type:none;height:800px;">
							
							</ul>
						  </div>
						</div>
					</div>
					<div class="select-hide">
						<div style="clear:both;width:218px;height:28px;border-radius:2px;margin-top:40px;">
							<label style="font-size:12px;display:inline-block;padding:10px 0px;">密码：</label>
							<input class="passedtext" type="text" placeholder="设置登录密码,不少于6位" style="width:100%;height:100%;border:1px solid #cdcdcd;">
						</div>
						
						<div class="btnmy regnext" style="font-size:12px;background-color:#2894ff; width:220px; height:30px;display:inline-block;line-height:30px;text-align:center;color:#fff;border-radius:2px;border:1px solid #ccc;margin-top:50px;">
							<a href="javascript:;">下一步</a> <!-- onclick="toNickName(); -->
						</div>
					</div>
				</div>
			</div>
			<div class="modelregistbottom" style="margin-top:-25px;background:#f7f7f7;line-height:48px;height:48px;padding:0px 19px;border-top:1px solid #c6c6c6;font-size:14px;">
				<a href="javascript:;" style="color:#0c72c3;display:inline-block;text-indent:15px;">返回登录</a>
			</div>
		</div>
		
		<div id="modelDivAll_regnext" class="modelDiv" style="width:530px;height:287px;border:1px solid #878787;border-radius:2px;background-color: rgb(255, 255, 255);">
			<div class="modelDivTop"><!--  style="width:100%;height:39px;background-color:#000;" -->
				<span style="display:inline-block;text-indent:20px;color:#fff">注册</span>
				<span title="关闭窗体" style="display:inline-block;float:right;margin-right:20px;color:#fff;cursor:pointer" onclick="document.getElementById('modelDivAll_regnext').style.display='none'">×</span>
			</div>
			<div class="modelDivCenter2">
				<div class="modelDivafter" style="width:220px;height:151px;margin:0px auto;padding:30px 0px 43px;">
					<div class="select-hide">
						<div style="clear:both;width:218px;height:28px;border-radius:2px;margin-top:40px;">
							<label>昵称：</label><input type="text" placeholder="请输入昵称" style="width:100%;height:100%;border:1px solid #cdcdcd;">
						</div>
						<div class="btnmy regok" style="font-size:12px;background-color:#2894ff; width:220px; height:30px;display:inline-block;line-height:30px;text-align:center;color:#fff;border-radius:2px;border:1px solid #ccc;margin-top:15px;">
							<a href="javascript:;">提交</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
$(".modelDivCenterLeft a:eq(0)").click(function(){
	$("#modelDivAll_phone").hide();
	$("#modelDivAll_phoneoper").show();
});
</script>
</html>