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
<meta name="baidu-site-verification" content="3ztG4oI0ku" />
<title>西安看房团,西安免费看房团,西安写字楼盘出售-西安看房团中心</title>
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/househome/css/style.css"  type="text/css" media="all" />
<!--[if lt IE 9]><script type="text/javascript" src="${pageContext.request.contextPath}/jsp/househome/js/html5.js"></script><![endif]-->
</head>
<body id="ruifoxHome">
<header>
	<div id="navbg"></div>
	<div class="wrapper">
		<h1 class="logo">
			<a href="${pageContext.request.contextPath}/jsp/househome/index.jsp"  title="">
				<img src="${pageContext.request.contextPath}/jsp/househome/images/logo.png" width="213" height="36" alt="" />
			</a>
		</h1>
		<nav>
			<ul>
				<li class="home"><a href="${pageContext.request.contextPath}/jsp/househome/index.jsp" >首页<span>网站首页！</span></a></li>
				<li class="about"><a href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao"  title="楼盘">楼盘<span>上千选择</span></a></li>
				<li class="service"><a href="${pageContext.request.contextPath}/jsp/househome/news/news_list.jsp"  title="资讯">资讯<span>行业动态</span></a></li>
				<li class="cases"><a href="${pageContext.request.contextPath}/jsp/househome/contact/index.jsp" title="联系我们">联系我们<span>随时联系</span></a></li>
				<li class="cases"><a href="${pageContext.request.contextPath}/jsp/gentelella-master/production/Login.jsp" title="登陆">后台管理<span>管理后台</span></a></li>
			</ul>
		</nav>
        	</div>
</header>
<!-- 查找最顶级栏目  -->
<section id="banner">
  <ul id="banner_img">
    <li style="background-image:url(${pageContext.request.contextPath}/jsp/househome/images/banner_bg1.jpg);display:block">
      <div class="wrapper">
        <div class="ad_txt">
          <h2>上千合作新楼盘</h2>
          <p>顶级品牌房产公司！<br/>
            满足你的各种购房需求<br/>
            提供多种购房解决方案。</p>
        </div>
        <div class="ad_img"> <img src="${pageContext.request.contextPath}/jsp/househome/images/1.png"  width="506" height="404" alt="" /> </div>
      </div>
    </li>
    <li style="background-image:url(${pageContext.request.contextPath}/jsp/househome/images/banner_bg2.jpg);">
      <div class="wrapper">
        <div class="ad_txt">
          <h2>30分钟内快速响应</h2>
          <p>专业的服务团队<br/>
            快速响应您</p>
        </div>
        <div class="ad_img"> <img src="${pageContext.request.contextPath}/jsp/househome/images/2.png" width="506" height="404" alt="" /> </div>
      </div>
    </li>
    <li style="background-image:url(${pageContext.request.contextPath}/jsp/househome/images/banner_bg4.jpg);">
      <div class="wrapper">
        <div class="ad_txt">
          <h2>专业经济人一对一服务</h2>
          <p>专业强大的经济人服务团队<br/>
           为您提供定制化的服务</p>
        </div>
        <div class="ad_img"> <img src="${pageContext.request.contextPath}/jsp/househome/images/3.png" width="506" height="404" alt="" /> </div>
      </div>
    </li>
    <li style="background-image:url(${pageContext.request.contextPath}/jsp/househome/images/banner_bg3.jpg);">
      <div class="wrapper">
        <div class="ad_txt">
          <h2>最高30%团购返现</h2>
          <p>提供多种团购优惠<br/>
           最高30%团购优惠<br/>
           最大限度为您提供优惠</p>
        </div>
        <div class="ad_img"> <img src="${pageContext.request.contextPath}/jsp/househome/images/4.png"  width="506" height="404" alt="" /> </div>
      </div>
    </li>

  </ul>   
    <div id="banner_ctr">

        <div class="content">
            <select>
                <option>西安</option>
                <option>北京</option>
            </select>
            <span>房产</span>
            <p class="text"><!-- onSubmit="return dosearch();" -->
            <form name="searchform" action="${pageContext.request.contextPath}/indexServlet" method="get">
                <input type="hidden" name="oper" value="search">
                <input type="text" name="searchterms" class="inputform">
                <input type="submit" value="Search" class="button" id="search">
            </form>
            </p>
            <p class="links">
                热词：
                <a id="button" href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao">看房团</a> <a href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao">写字楼</a> <a href="#${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao">商业类楼盘</a><a></a><a></a>
                <!--These are links. You can change it to a page you want to by replacing the '#' with your url.-->
            </p>
        </div>
    </div>
</section>
<section id="cases">
  <div class="cat_title wrapper">
    <h2>分类<strong>CLASSIFY</strong></h2>
    <p>我们的产品，满足您所有的需求<br/>
        Our Houses, Meet all your needs </p>
    <a href="#"  class="more">MORE+</a> </div>
  <ul>
  	<li><img src="${pageContext.request.contextPath}/jsp/househome/images/class1.jpg"   width="240" height="152" alt="年度热盘"/>
      <p> <strong>年度热盘</strong>西安看房团为您搜索性能比好的年度热盘供您选择....<br/>
        <a href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao"  class="btn_blue">查看品牌故事</a>
      </p>
    </li>
<li><img src="${pageContext.request.contextPath}/jsp/househome/images/class2.jpg" width="240" height="152" alt="西安看房团"/>
      <p> <strong>西安看房团</strong> 再度出发，寻找属于你的避风港....<br/>
        <a href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao" class="btn_blue">查看品牌故事</a>
      </p>
    </li>
<li><img src="${pageContext.request.contextPath}/jsp/househome/images/class3.jpg"  width="240" height="152" alt="写字楼"/>
      <p> <strong>写字楼</strong>在别致的地方，寻找属于自己的奋斗。....<br/>
        <a href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao"  class="btn_blue">查看品牌故事</a>
      </p>
    </li>
<li><img src="${pageContext.request.contextPath}/jsp/househome/images/class4.jpg"   width="240" height="152" alt="养生度假"/>
      <p> <strong>养生度假</strong>休闲生活配套结合度假功能进行无限延伸....<br/>
        <a href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao"  class="btn_blue">查看品牌故事</a>
      </p>
    </li>
<li><img src="${pageContext.request.contextPath}/jsp/househome/images/class5.jpg"   width="240" height="152" alt="温泉入户"/>
      <p> <strong>温泉入户</strong>在家也可以舒舒服服的泡温泉....<br/>
        <a href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao"  class="btn_blue">查看品牌故事</a>
      </p>
    </li>
<li><img src="${pageContext.request.contextPath}/jsp/househome/images/class6.jpg"   width="240" height="152" alt="看房团独家折扣"/>
      <p> <strong>看房团独家折扣</strong>看房团中心为您独家折扣，值得你一起go!....<br/>
        <a href="${pageContext.request.contextPath}/HouseMessageServlet?type=yumiao" class="btn_blue">查看品牌故事</a>
      </p>
    </li>
  </ul>
</section>
<section id="loupan">
    <div class="cat_title wrapper">
        <h2>热门楼盘<strong>Hot</strong></h2>
        <p>
            优质楼盘供你选择<br/>
            High quality real estate for your choice
        </p>
        <a href="${pageContext.request.contextPath}/jsp/househome/case/index.jsp"  class="more">MORE+</a>
    </div>
    <div class="loudata">
    <div class="louad" id="louad"> <img src="${pageContext.request.contextPath}/jsp/househome/images/news.png"  alt="html5" width="320" height="450" /><p>[西安-雁塔]品牌底商<span>[楼盘]</span></p><p>起价：<span>20000元/㎡</span>  均价：<span>20000元/㎡</span></p></div>
        <ul id="louf">
            <li> <a href="${pageContext.request.contextPath}/jsp/househome/news/hynews/23.html"><img src="uploads/131102/1-131102210K4H1.jpg"   width="290" height="180" alt="网络营销最重要的一步，你做到了吗？"/></a>
                <div class="loulist"><span>[西安-雁塔]商业类楼盘</span>
                    <p>起价：<span>21000元/平元/㎡</span>  [楼盘]</p>
                </div>
            </li>
            <li> <a href="news/hynews/23.html"><img src="uploads/131102/1-131102210K4H1.jpg"   width="290" height="180" alt="网络营销最重要的一步，你做到了吗？"/></a>
                <div class="loulist"><span>[西安-雁塔]商业类楼盘</span>
                    <p>起价：<span>21000元/平元/㎡</span>  [楼盘]</p>
                </div>
            </li>
            <li> <a href="news/hynews/23.html"><img src="uploads/131102/1-131102210K4H1.jpg"   width="290" height="180" alt="网络营销最重要的一步，你做到了吗？"/></a>
                <div class="loulist"><span>[西安-雁塔]商业类楼盘</span>
                    <p>起价：<span>21000元/平元/㎡</span>  [楼盘]</p>
                </div>
            </li>
            <li> <a href="news/hynews/23.html"><img src="uploads/131102/1-131102210K4H1.jpg"   width="290" height="180" alt="网络营销最重要的一步，你做到了吗？"/></a>
                <div class="loulist"><span>[西安-雁塔]商业类楼盘</span>
                    <p>起价：<span>21000元/平元/㎡</span>  [楼盘]</p>
                </div>
            </li>
        </ul>
    </div>
    </section>
<section id="news">
  <div class="cat_title wrapper">
    <h2>新闻<strong>News</strong></h2>
    <p>关注我们、关注前沿<br/>
      Recently is to do ...</p>
    <a href="${pageContext.request.contextPath}/jsp/househome/news/news_list.jsp"  class="more">MORE+</a> </div>
  <div class="newsdata">
    <div class="newsad"> <img src="images/news.png"  alt="html5" width="320" height="450" /></div>
    <ul id="newsf">
       <li> <a href="news/hynews/23.html"><img src="uploads/131102/1-131102210K4H1.jpg"   width="90" height="90" alt="网络营销最重要的一步，你做到了吗？"/></a>
        <div class="newslist"> <a href="news/hynews/23.html" title="网络营销最重要的一步，你做到了吗？">网络营销最重要的一步，你做到了吗？</a> <span>UPTATED:2013/11/02</span>
          <p>很多人总是会问，为什么我的网站转化率总是居高不下？也许你的网站很美观大气，功能很完善，入口非常便捷丰富，但是就是转化不好！原因只在于，你....</p>
        </div>
      </li>
<li> <a href="news/hynews/9.html" ><img src="uploads/131031/1-1310312352421V.jpg"  width="90" height="90" alt="百度免费＂发武器＂ 布局移动互联网"/></a>
        <div class="newslist"> <a href="news/hynews/9.html" title="百度免费＂发武器＂ 布局移动互联网">百度免费＂发武器＂ 布局移动互联网</a> <span>UPTATED:2013/11/01</span>
          <p>中广网北京9月3日消息 据经济之声《天下公司》报道，说起百度，恐怕听众朋友们都不会陌生。这家创办于2001年1月1日的中文互联网搜索公司，经过十余年....</p>
        </div>
      </li>
<li> <a href="news/hynews/8.html" ><img src="uploads/131102/1-131102210K4H1.jpg"  width="90" height="90" alt="企业网站已经悄悄的转变成了一种网络营销应用"/></a>
        <div class="newslist"> <a href="news/hynews/8.html" title="企业网站已经悄悄的转变成了一种网络营销应用">企业网站已经悄悄的转变成了一种网络营销应用</a> <span>UPTATED:2013/11/01</span>
          <p>当是你最后一次使用的电话簿找到的产品或服务？如果你有一台电脑，平板电脑或智能手机的技术和访问，甚至有基本的了解，这可能是很难记住，当你拖....</p>
        </div>
      </li>
<li> <a href="news/gsnews/7.html" ><img src="uploads/131031/1-1310312352421V.jpg"  width="90" height="90" alt="html5+js技术网站应用案例：三盛·都会城网站建设"/></a>
        <div class="newslist"> <a href="news/gsnews/7.html"  title="html5+js技术网站应用案例：三盛·都会城网站建设">html5+js技术网站应用案例：三盛·都会城网站建设</a> <span>UPTATED:2013/11/01</span>
          <p>三盛·都会城作为三盛地产在成都的全资开发项目，入主龙泉经开区，承载三盛地产在成都建立品牌的任务，三盛·都会城总投入近40亿元，前期将投入3亿重....</p>
        </div>
      </li>
    </ul>
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
                                        <a target="_blank" href="javascript:if(confirm('http://wpa.qq.com/msgrd?v=3&uin=429592913&site=qq&menu=yes'))window.location='http://wpa.qq.com/msgrd?v=3&uin=429592913&site=qq&menu=yes'"><img border="0" src="${pageContext.request.contextPath}/jsp/househome/images/qq.png"  alt="点击这里给我发消息" title="点击这里给我发消息"/></a><br/>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/househome/js/jquery.1.8.2.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/househome/js/jquery.plugin.min.js"></script>
<!--[if IE 6]>
<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/househome/js/killie6.js"></script>
<![endif]-->
<script type="text/javascript">
//<![CDATA[
	$("header>div>nav>ul>li>a").hover(function(){
		$(this).parent().stop(false,true).animate({"background-position-x":"6px",opacity:"0.7"},{duration:"normal", easing: "easeOutElastic"});
	},function(){
		$(this).parent().stop(false,true).animate({"background-position-x":"10px",opacity:"1"},{duration:"normal", easing: "easeOutElastic"});
	});
	$('.ad_img,#banner_ctr,#client').pngFix();
	$(window).scroll(function(){
		$(this).scrollTop()>80?$("#navbg").stop(false,true).animate({opacity:"1"},"normal"):$("#navbg").stop(false,true).animate({opacity:"0.8"},"normal");
	});
	//Banner Start
	var curIndex=0;
	var time=800;
	var slideTime=5000;
	var adTxt=$("#banner_img>li>div>.ad_txt");
	var adImg=$("#banner_img>li>div>.ad_img");
	var int=setInterval("autoSlide()",slideTime);
	
	function autoSlide(){
		curIndex+1>=$("#banner_img>li").size()?curIndex=-1:false;
		show(curIndex+1);
	}
	function show(index){
		$.easing.def="easeOutQuad";
//		$("#drag_ctr,#drag_arrow").stop(false,true).animate({left:index*115+20},300);
		$("#banner_img>li").eq(curIndex).stop(false,true).fadeOut(time);
		adTxt.eq(curIndex).stop(false,true).animate({top:"340px"},time);
		adImg.eq(curIndex).stop(false,true).animate({right:"120px"},time);
		setTimeout(function(){
			$("#banner_img>li").eq(index).stop(false,true).fadeIn(time);
			adTxt.eq(index).children("p").css({paddingTop:"50px",paddingBottom:"50px"}).stop(false,true).animate({paddingTop:"0",paddingBottom:"0"},time);
			adTxt.eq(index).css({top:"0",opacity:"0"}).stop(false,true).animate({top:"170px",opacity:"1"},time);
			adImg.eq(index).css({right:"-50px",opacity:"0"}).stop(false,true).animate({right:"10px",opacity:"1"},time);
		},200)
		curIndex=index;
	}
	//Banner End
	//Cases Start
	if($.support.transition){
		$("#cases>ul>li").hover(function(){
			$("img",this).stop(false,true).transition({
				perspective: '300px',
				rotateY: '180deg',
				opacity: '0'
			});
			$("p",this).css({display:'block',opacity:'0',rotateY: '-180deg'}).stop(false,true).transition({
				perspective: '300px',
				rotateY: '0deg',
				opacity: '1'
			});
		},function(){
			$("img",this).show().stop(false,true).transition({
				perspective: '300px',
				rotateY: '0deg',
				opacity: '1'
			});
			$("p",this).stop(false,true).transition({
				perspective: '300px',
				rotateY: '180deg',
				opacity: '0'
			});
		});
	}else{
		$("#cases>ul>li").hover(function(){
			$("img",this).stop(false,true).slideUp("fast");
			$("p",this).stop(false,true).slideDown("fast");
		},function(){
			$("img",this).stop(false,true).slideDown("fast");
			$("p",this).stop(false,true).slideUp("fast");
		});
	}
	$("#cases>ul>li>img").lazyload({effect:"fadeIn",failurelimit:10});
						$("#gotop").click(function(){$('body,html').animate({scrollTop:0},500);})						
</script>
<script type="text/javascript">
$(function(){
$("#louad").html("");
$("#louf").html("");
$(".newsad").html("");
$("#newsf").html(""); 
/*  $.post(
"${pageContext.request.contextPath}/indexServlet",
{"oper":"type"},
function(data){
	$(data).each(function(){	
	});
},"json"
); */
$.post(
"${pageContext.request.contextPath}/indexServlet",
{"oper":"housea"},
function(data){	
	$(data).each(function(){
	$(".louad").html($(".louad").html()+"<a href='${pageContext.request.contextPath}/MessageConServlet?oper=conin&hid="+this.id+"'><img src='jsp/househome/images/"+this.pictureURL+"' alt='html5' width='320' height='450'/></a><p>["+this.town+"-"+this.area+"]<span>"+this.houseName+"[楼盘]</span></p><p>起价：<span>"+data.startPrice+"元/㎡</span>均价：<span>"+data.averagePrice+"元/㎡</span></p>");
	}); 
},"json"
); 
$.post(
"${pageContext.request.contextPath}/indexServlet",
{"oper":"house"},
function(data){
	$(data).each(function(){
	$("#louf").html($("#louf").html()+"<li><a href='${pageContext.request.contextPath}/MessageConServlet?oper=conin&hid="+this.id+"'><img src='"+this.pictureURL+"' width='290' height='180'></a><div class='loulist'><span>["+this.town+"-"+this.area+"]</span><p>起价：<span>"+this.startPrice+"</span>"+this.houseName+"[楼盘]</p></div></li>");
	});
},"json"
);
$.post(
"${pageContext.request.contextPath}/indexServlet",
{"oper":"newsa"},
function(data){
	$(data).each(function(){
	 $(".newsad").html( $(".newsad").html()+"<a href='${pageContext.request.contextPath}/news/news_con.jsp'><img src='images/"+this.pictureURL+"' alt='html5' width='320' height='450'/></a>");
	});
},"json"
);
$.post(
"${pageContext.request.contextPath}/indexServlet",
{"oper":"news"},
function(data){
	$(data).each(function(){
      $("#newsf").html( $("#newsf").html()+"<li><a href='${pageContext.request.contextPath}/news/news_con.jsp'><img src='"+this.pictureURL+"' width='90' height='90'></a><div class='newslist'><a href='news/news_con.jsp'>"+this.title+"</a><span>时间："+this.dateTime+"</span><p>"+this.content+"...</p></div></li>");
	});
},"json"
); 
/* $("#search").click(function(){
	var str=$('#form1').serialize();
	$.post(
	"${pageContext.request.contextPath}/indexServlet?oper=search"+str);
}); */
})
</script>
</body>
</html>
