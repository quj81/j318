<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=1024" />
<title>新闻详情页</title>
<link rel="stylesheet" href="../css/style.css" type="text/css" media="all" />
<style>
	.demon_ani{
		line-height: 35px;
		height:35px;
		background-repeat:no-repeat;
		background-position:10px center;

	}
	#right_list_123 li a{
		color:gray;
	}
	.qwerty12346{
		display:inline-block;
		width:250px;
		height:30px;
		overflow: hidden;
	}
	.demon_anim{
		height:50px;
		border-bottom: 1px dotted gray;
		
	}
	.demon_anim_li_img{
		width:150px;
		height:130px;
		margin-left: 25px;
	}
</style>
<!--[if lt IE 9]><script type="text/javascript" src=" ../js/html5.js" ></script><![endif]-->
</head>
<body >
<header>
	<div id="navbg"></div>
	<div class="wrapper">
		<h1 class="logo">
			<a href="${pageContext.request.contextPath}/jsp/househome/index.jsp"  >
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
<section id="shownews">
  <div class="cat_title">
    <div class="wrapper">
      <h2><strong>NEWS</strong>新闻资讯</h2>
      <p>观看房网<br/>
        知天下事</p>
    </div>
  </div>
  <div class="category" >
    <div class="wrapper" style="width:600px;margin-left:320px;">
      <h1 style="font-size:20px;;">${news1234.title}</h1>
    
      <span>发布时间:${news1234.time}| 编辑:${news1234.author}</span></div>
  </div>
  <article style="float:left;">
  	<!-- 内容 -->
  	<!-- 图片 -->
   <div class="wrapper" id="detailed"> <img src="${pageContext.request.contextPath}/upload/${news1234.pictureURL}" style="width:620px; height: 350px; margin-left:230px" /><br />
   	<!-- 图片 -->
   	<!-- 文字 -->
	<div style="width:700px;margin-left:230px;margin-top:60px;">
		 ${news1234.content}
	</div>
	<!-- 文字 -->
	<!-- 内容 -->
 </div>
    
    <div id="case_footer" style="background-color:white;">
      <div class="wrapper showother" style="margin-left:85%;"> <a href="news_list.jsp">返回新闻列表</a> </div>
    </div>
  </article>
 	<div style="width:280px;position:fixed;left:950px;top:300px;background-color: white;z-index:99;opacity:0.8;">
	<ul id="right_list_123" style="color:black;list-style-position:inside;padding-left:4px;"></ul>
	
	</div>
</section>
<footer>
	<div id="footerlink">
		<nav class="wrapper">
			<a href="${pageContext.request.contextPath}/jsp/househome/index.jsp" >首页</a>
			<a href="${pageContext.request.contextPath}/jsp/househome/case/index.jsp">楼盘</a>
			<a href="${pageContext.request.contextPath}/jsp/househome/contact/index.jsp">联系</a>
			<a href="${pageContext.request.contextPath}/jsp/househome/news/news_list.jsp">资讯</a>
			<a id="gotop" href="javascript:void(0)">top</a>
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
<script type="text/javascript" src=" ../js/jquery.1.8.2.min.js" ></script>
<script type="text/javascript" src=" ../js/jquery.plugin.min.js" ></script>
<!--[if IE 6]>
<script type="text/javascript" src=" ../js/killie6.js" ></script>
<![endif]-->
<script type="text/javascript">
//<![CDATA[
	//Nav Start
	$("header>div>nav>ul>li>a").hover(function(){
		$(this).parent().stop(false,true).animate({"background-position-x":"6px",opacity:"0.7"},{duration:"normal", easing: "easeOutElastic"});
	},function(){
		$(this).parent().stop(false,true).animate({"background-position-x":"10px",opacity:"1"},{duration:"normal", easing: "easeOutElastic"});
	});
			<!----新闻---->
	<!---- 详细页 ----->
		//Show News Start
		$("#case_footer>.showother>.previous,#case_footer>.showother>.next").hover(function(){
			$("span>img",this).stop(false,true).animate({"left":"-20px"},{duration:"fast", easing: "easeOutQuad"});
			$("#show_thumb>img").hide().eq($(this).index($("#case_footer>.showother>.previous,#case_footer>.showother>.next"))).show();
		},function(){
			$("span>img",this).stop(false,true).animate({"left":"0"},{duration:"fast", easing: "easeOutQuad"});
		});
		//Show News End
					$("#gotop").click(function(){$('body,html').animate({scrollTop:0},500);})
	var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
	document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F3fe5b2b119b5fc4931e9c73e7071b0c6' type='text/javascript'%3E%3C/script%3E"));
	var bds_config = {"bdTop":203};
	$("#bdshell_js").attr("src","http://share.baidu.com/static/js/shell_v2.js?cdnversion=" + new Date().getHours());
//]]>
</script>
<script type="text/javascript">
	function paixuchaxun(){
		$("#right_list_123").html("");
		$.get(
			"${pageContext.request.contextPath}/HouseNewsServlet",
			{"type":"timeget",},
			function(data){
				var str="<div style='font-weight:bold;font-size:20px;background-color:#F7F7F7;height:46px;text-align:center;line-height:46px;'>最新资讯</div>";
				for(var i=0;i<data.length;i++){
					str+="<li class='demon_ani'><a href='${pageContext.request.contextPath}/news_conServlet?news_ID_="+data[i].id+"'>"+data[i].time+"</a></li><li class='demon_anim'><a href='${pageContext.request.contextPath}/news_conServlet?news_ID_="+data[i].id+"' style='color:black;' class='qwerty12346'>"+data[i].content+"</a></li>"
				}
				$("#right_list_123").html(str);
			},
			"json"
		)
	}
	paixuchaxun();
</script>
</body>
</html>
