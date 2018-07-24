<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />   
<meta name="viewport" content="width=1024" />
<title>联系我们</title>
<meta name="keywords" content="这里填写关键词" />
<meta name="description" content="这里填写描述" />   
<link rel="stylesheet" href="../css/style.css" type="text/css" media="all" />
<!--[if lt IE 9]><script type="text/javascript" src="../js/html5.js" ></script><![endif]-->
</head>
<body >

<header>
	<div id="navbg"></div>
	<div class="wrapper">
		<h1 class="logo">
			<a href="${pageContext.request.contextPath}/jsp/househome/index.jsp"  title="">
				<img src="../images/logo.png" width="213" height="36" alt="" />
			</a>
		</h1>
		<nav>
			<ul>
				<li class="home"><a href="${pageContext.request.contextPath}/jsp/househome/index.jsp" >首页<span>网站首页！</span></a></li>
				<li class="about"><a href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao"  title="楼盘">楼盘<span>上千选择</span></a></li>
				<li class="service"><a href="${pageContext.request.contextPath}/jsp/househome/news/news_list.jsp"  title="资讯">资讯<span>行业动态</span></a></li>
				<li class="cases"><a href="${pageContext.request.contextPath}/jsp/househome/contact/index.jsp" title="联系我们">联系我们<span>随时联系</span></a></li>
				<li class="cases"><a href="${pageContext.request.contextPath}/jsp/admin/houseResource/HouseManage.jsp" title="登陆">后台管理<span>管理后台</span></a></li>
			</ul>
		</nav>
	</div>
</header>
<!-- 查找最顶级栏目  -->
<section id="single">
	<!-- Ŀ  -->
	<div class="cat_title">
		<div class="wrapper">
			<h2><strong>CONTACT</strong>联系</h2>
			<p></p>
		</div>
	</div>
	<div class="category">
		<div class="wrapper">
			<h1>联系方式</h1>
		</div>
	</div>
	<article>
		<div class="wrapper" id="detailed">
			<span style="font-size:20px;"><span style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; text-align: justify; font-weight: bold;">网络科技有限公司</span></span><br style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;" />
<br style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;" />
<span style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;">电话：0571-88888888</span><br style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;" />
<span style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;">售后：0571-88888888</span><br style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;" />
<span style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;">传真：0571-88888888</span><br style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;" />
<span style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;">电子邮件：admin@admin</span><br style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;" />
<span style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;">地址：浙江省杭州市某某街道某某路88号</span><br style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;" />
<span style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;">邮编：610000</span><br style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;" />
<span style="color: rgb(102, 102, 102); font-family: 'Microsoft YaHei', 'Segoe UI', Tahoma, Arial, Verdana, sans-serif; line-height: 21px; text-align: justify;">网址：http://www</span>.mycodes.net
		</div>
		<div id="case_footer"></div>
	</article>
</section>

<footer>
	<div id="footerlink">
		<nav class="wrapper">
			<a href="${pageContext.request.contextPath}/jsp/househome/index.jsp" >首页</a>
			<a href="${pageContext.request.contextPath}/jsp/househome/case/index.jsp">楼盘</a>
			<a href="${pageContext.request.contextPath}/jsp/househome/news/news_list.jsp">联系</a>
			<a href="${pageContext.request.contextPath}/jsp/househome/contact/index.jsp">资讯</a>
		</nav>
	</div>
	<div id="footerinfo">
		<div class="wrapper">
			<h2>联系我们<strong>Contact</strong></h2>
			<p>
				<a target="_blank" href="javascript:if(confirm('http://wpa.qq.com/msgrd?v=3&uin=429592913&site=qq&menu=yes'))window.location='http://wpa.qq.com/msgrd?v=3&uin=429592913&site=qq&menu=yes'"><img border="0" src="../images/qq.png"  alt="点击这里给我发消息" title="点击这里给我发消息"/></a><br/>
				电话：400 8888 8888<br/>
				传真：400 8888 8888<br/>
				电子邮件：admin@unn114.com<br/>
				公司地址：重庆市某某某某某某某某某<br/>
				备案编号：蜀ICP备000000001<br/>
				Copyright © 2013 - 2014 mycodes.net All rights reserved.
			</p>
		</div>
		<div class="links">
			<h2>友情链接<strong>Links</strong></h2>
			<p>
			<ul>
				<li>
					More Templates <a href="#" target="_blank" title="友情链接">友情链接</a> - Collect from <a href="#" title="友情链接" target="_blank">友情链接</a>
				</li>
				<li>
					More Templates <a href="#" target="_blank" title="友情链接">友情链接</a> - Collect from <a href="#" title="友情链接" target="_blank">网页模板</a>
				</li>
				<li>
					More Templates <a href="#" target="_blank" title="友情链接">友情链接</a> - Collect from <a href="#" title="友情链接" target="_blank">友情链接</a>
				</li>
				<li>
					More Templates <a href="#" target="_blank" title="友情链接">友情链接</a> - Collect from <a href="#" title="友情链接" target="_blank">友情链接</a>
				</li>
			</ul>
			</p>
		</div>
	</div>
</footer>
<script type="text/javascript" src="../js/jquery.1.8.2.min.js" ></script>
<script type="text/javascript" src="../js/jquery.plugin.min.js" ></script>
<!--[if IE 6]>
<script type="text/javascript" src="../js/killie6.js" ></script>
<![endif]-->
</body>
</html>
