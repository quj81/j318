<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />   
<meta name="viewport" content="width=1024" />
<title>新闻资讯</title>
<meta name="keywords" content="" />
<meta name="description" content="" />     
<link rel="stylesheet" href=" ../css/style.css" type="text/css" media="all" />
<!--[if lt IE 9]><script type="text/javascript" src=" ../js/html5.js" ></script><![endif]-->
<script type="text/javascript" src=" ../js/jquery.1.8.2.min.js" ></script>
<script type="text/javascript" src=" ../js/jquery.plugin.min.js" ></script>
<style>
	*{list-style:none;}
	.demon_ani{
		line-height: 35px;
		height:35px;
		background-repeat:no-repeat;
		background-position:10px center;

	}
	#right_list_123 li a{
		margin-left: 30px;
		text-decoration: none;
		color:black;
		display:inline-block;
		overflow: hidden;
	}
	#right_list_123 li{
		background-color: #ffffff;
	
	}
	.demon_anim{
		display:none;
		height:185px;
		
	}
	.demon_anim_li_img{
		width:150px;
		height:130px;
		margin-left: 25px;

	}
	#list_li>li{
	}
	.abcdefg12345{
		width:220px;
		height:16px;
		overflow:hidden;
	}
	#right_list_123 li:nth-of-type(1){
		background-image:url('../images/right_list_pic1.png');
	}
	#right_list_123 li:nth-of-type(3){
		 background-image:url('../images/right_list_pic2.png');
	}
	#right_list_123 li:nth-of-type(5){
		background-image:url('../images/right_list_pic3.png');
	}
	#right_list_123 li:nth-of-type(7){
	 	background-image:url('../images/right_list_pic4.png');
	}
	#right_list_123 li:nth-of-type(9){
		background-image:url('../images/right_list_pic5.png');
	}

</style>
</head>
<body>



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
<body>

<section id="newslist">
	<div class="cat_title">
		<div class="wrapper">
			<h2><strong>NEWS</strong>新闻资讯</h2>
			<p>观看房网<br/>知天下事</p>
			
		</div>
	</div>
	<div class="category">
		<div class="wrapper">
			<ul id="list_type">
			<!-- 分类标题 -->
				
				
        

			</ul>
		</div>
	</div>
				<ul class="news wrapper" id="list_li" style="margin-left:400px;">
			<!-- 新闻列表 -->
			
                
				
				
				<!-- 新闻列表 -->		
				</ul>
		 <div class="dede_pages">
			<ul class="pagelist">
			<!-- 分页 -->
             

			</ul>
		</div><!-- /pages --> 
            
            
	
</section>
<div style="width:280px;position:fixed;left:1050px;top:200px;z-index:99;opacity:0.8;"><ul id="right_list_123" style="color:black;"></ul></div>
<script type="text/javascript">
	function paixuchaxun(){
		$("#right_list_123").html("");
		$.get(
			"${pageContext.request.contextPath}/HouseNewsServlet",
			{"type":"timeget",},
			function(data){
				var str="<div style='font-weight:bold;font-size:20px;background-color:#F7F7F7;height:46px;text-align:center;line-height:46px;'>推荐资讯</div>";
				for(var i=0;i<data.length;i++){
					str+="<li  class='demon_ani' onmouseover='block1()' onmouseout='none1()'><a href='${pageContext.request.contextPath}/news_conServlet?news_ID_="+data[i].id+"'>"+data[i].title+"</a></li><li class='demon_anim' onmouseover='block2()' onmouseout='none2()'><a href='${pageContext.request.contextPath}/news_conServlet?news_ID_="+data[i].id+"'><img src='${pageContext.request.contextPath}/upload/"+data[i].pictureURL+"' class='demon_anim_li_img'></a><br><a href='${pageContext.request.contextPath}/news_conServlet?news_ID_="+data[i].id+"' style='color:gray ;width:200px;height:30px;'>"+data[i].content+"</a></li>"
				}
				$("#right_list_123").html(str);
			},
			"json"
		)
	}
	paixuchaxun();
</script>
<script type="text/javascript">
		function newlist(){
			$("#list_li").html("");
				$.get(
					"${pageContext.request.contextPath}/HouseNewsServlet",
					{"type":"get"},
					function(data){
						var str="";
						for(var i=0;i<data.length;i++){
							str+="<li style='border-bottom:1px solid white'><a href='${pageContext.request.contextPath}/news_conServlet?news_ID_="+data[i].id+"'><img src='${pageContext.request.contextPath}/upload/"+data[i].pictureURL+"' data-original='' /></a><div class='newslist'><a href='${pageContext.request.contextPath}/news_conServlet?news_ID_="+data[i].id+"'>"+data[i].title+"</a><span>编辑:"+data[i].author+"</span><span>发布时间:"+data[i].time+"</span><p class='abcdefg12345'>"+data[i].content+"</p></div></li>";
						}
					$("#list_li").html(str);
					},
					"json"
				);
				
		}
		
		function refertyp(){
			$("#list_type").html("");
			var str="<li><a href='news_list.jsp' class='cur'>全部</a></li>";
			$.get("${pageContext.request.contextPath}/HouseRefertypeServlet",{"type":"get"},function(data){
					for(var i=0;i<data.length;i++){
							str+="<li><a  onclick='chaxun("+data[i].id+")' class='cur'>"+data[i].referType+"</a></li>";
						}
						$("#list_type").html(str);
			},"json");
		}
		
		function chaxun(id){
		$("#list_li").html("");
		$.get(
			"${pageContext.request.contextPath}/HouseNewsServlet",
			{"type":"idget","id":id},
			function(data){
				var str="";
				for(var i=0;i<data.length;i++){
							str+="<li style='border-bottom:1px solid white'><a href='${pageContext.request.contextPath}/news_conServlet?news_ID_="+data[i].id+"'><img src='${pageContext.request.contextPath}/upload/"+data[i].pictureURL+"' data-original='' /></a><div class='newslist'><a href='${pageContext.request.contextPath}/news_conServlet?news_ID_="+data[i].id+"'>"+data[i].title+"</a><span>编辑:"+data[i].author+"</span><span>发布时间:"+data[i].time+"</span><p class='abcdefg12345'>"+data[i].content+"</p></div></li>";
				}
				$("#list_li").html(str);
			},
			"json"
		)
	}
	
		refertyp();
		newlist();
		function block1(){
		$(".demon_ani").mouseover(function(){
				$($(this).next()).show();
			});
		}
		function none1(){
	$(".demon_ani").mouseout(function(){
				$($(this).next()).hide();
			});
		}
		function block2(){
	$(".demon_anim").mouseover(function(){
		$(this).toggle();
	});
	}
	 function none2(){
	$(".demon_anim").mouseout(function(){
		$(this).toggle();
	});
	}
</script>
</body>
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
	<!---- 新闻首页 ----->
		//Nav End
$("#gotop").click(function(){$('body,html').animate({scrollTop:0},500);})
	var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
	
	var bds_config = {"bdTop":203};
	$("#bdshell_js").attr("src","http://share.baidu.com/static/js/shell_v2.js?cdnversion=" + new Date().getHours());
//]]>
	
	

</script></body>
</html>
