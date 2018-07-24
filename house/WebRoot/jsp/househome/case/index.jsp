<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%request.setAttribute("path", path); %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />   
<meta name="viewport" content="width=1024" />
<title>新闻_我的网站</title>
<meta name="keywords" content="" />
<meta name="description" content="" />      
<link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/househome/css/style.css" type="text/css" media="all" />
<!--[if lt IE 9]><script type="text/javascript" src="${pageContext.request.contextPath}/jsp/househome/js/html5.js" ></script><![endif]-->
<style>
	*{magin:0;padding:0;list-style:none;}
</style>
</head>
<body>
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
				<li class="cases"><a href="${pageContext.request.contextPath}/jsp/admin/houseResource/HouseManage.jsp" title="登陆">后台管理<span>管理后台</span></a></li>
			</ul>
		</nav>
	</div>
</header>

<section id="newslist">
	<div class="cat_title">
		<div class="wrapper">
			<h2><strong>NEWS</strong>楼盘</h2>
			<p>热门楼盘<br/>就找看房网</p>
		</div>
	</div>
	<form action="">
		<div class="category">
		<div class="wrapper " id="lie_shadow">
			<ul>
				<li>
					<select id="sheng" name="sheng" class="form-control" style="width:120px;display:inline-block;magin-right:20px">
	                <option value="-1" selected="selected">请选择省</option>
	              	</select>
              	</li>
              	<li>
              		<select id="shi" name="shi" class="form-control" style="width:120px;display:inline-block;magin-right:20px">
	                <option value="-1" selected="selected">请选择市</option>
	              	</select>
              	</li>
              	<li>
              		 <select id="qu" name="qu" class="form-control" style="width:120px;display:inline-block;magin-right:20px">
	                 <option value="-1" selected="selected">请选择区</option>
	                 </select>
              	</li>
              	<li>
              		<select id="leibie" name="leibie" class="form-control" style="width:120px;display:inline-block;magin-right:20px">
	                <option value="-1" selected="selected">请选择类型</option>
	              	</select>
              	</li>
              	<li>
              		<select id="qujian" name="qujian" class="form-control" style="width:120px;display:inline-block;magin-right:20px">
	                <option value="-1" selected="selected">请选择价格</option>
	                <option value="0">0-10000</option>
	                <option value="10000">10000-20000</option>
	                <option value="30000">30000-40000</option>
	                <option value="50000">50000-60000</option>
	                <option value="70000">70000-80000</option>
	                <option value="90000">90000-100000</option>
	                <option value="100000">100000以上</option>
	              	</select>
              	</li>
			</ul>
		</div>
	</div>
	</form>
	<ul class="news wrapper bor_red" id="dongcidaci">
		
			
				
					<c:forEach items="${list}" var="list">
					<li id="tabl_pad">
					<table class="tab_lieb">
					<tr>
					<td><img alt="" src="${pageContext.request.contextPath}/upload/${list.pictureURL }" width='200px' height='120px'><a href=""><img src="" alt=""/></a></td>
					<td><p><a href="${pageContext.request.contextPath}/MessageConServlet?oper=conin&hid=${list.id}">[${list.townName}-${list.areaName}]${list.houseName}</a></p><p> ${list.salesAddress}</p></td>
					<td><span>${list.averagePrice}元/平</span><span> 元/㎡</span></td>
					</tr>
					</table>
					</li>
					</c:forEach>
				
			
		
				</ul>
	 
	 <ol class="bor_red2">
		<li>最新楼盘</li>
		<c:forEach items="${news}" var="news">
		<li>
			<p>[${news.townName}-${news.areaName}]${news.houseName}</p>
			<br/>
			<p>${news.averagePrice}/平元/㎡</p>
		</li>
		</c:forEach>
	</ol> 
		

		 <!-- <div class="dede_pages">
			<ul class="pagelist">
             <li><span class="pageinfo">共 <strong>1</strong>页<strong>4</strong>条记录</span></li>

			</ul> -->
		</div><!-- /pages -->
	<br/>

            
	
</section>
<footer>
	<!-- <div class="botm">
		<div>你可能感兴趣的楼盘</div>
		<ul>
			<li>
				<img src="" alt=""/>
				<p><span>[西安-雁塔]底商</span><span>35000元/平元/m²</span></p>
			</li>
			<li>
				<img src="" alt=""/>
				<p><span>[西安-雁塔]底商</span><span>35000元/平元/m²</span></p>
			</li>
			<li>
				<img src="" alt=""/>
				<p><span>[西安-雁塔]底商</span><span>35000元/平元/m²</span></p>
			</li>
		</ul>
	</div> -->
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
<script type="text/javascript" src="${path}/jsp/househome/js/jquery.1.8.2.min.js" ></script>
<script type="text/javascript" src="${path}/jsp/househome/js/jquery.plugin.min.js" ></script>
<!--[if IE 6]>
<script type="text/javascript" src="../js/killie6.js" ></script>
<![endif]-->


<!-- 自己写的JavaScript -->
<script type="text/javascript">
var sheng=$("#sheng").val();
var shi=$("#shi").val();
var qu=$("#qu").val();
var leibie=$("#leibie").val();
var qujian=$("#qujian").val();
	
	function duqu(){
		sheng=$("#sheng").val();
		shi=$("#shi").val();
		qu=$("#qu").val();
		leibie=$("#leibie").val();
		qujian=$("#qujian").val();
	}
	
	function chaxun(){
		$.post(
			"${pageContext.request.contextPath}/HouseMessageServlet",
			{"type":"indexcz","sheng":sheng,"shi":shi,"qu":qu,"leibie":leibie,"qujian":qujian},
			function(data){
				var pin="";
				for(var i=0;i<data.length;i++){
					pin+="<li><table class='tab_lieb'><tr><td><a href=''><img src='${pageContext.request.contextPath}/upload/"+data[i].pictureURL+"' width='200px' height='120px' alt=''/></a></td><td><p><a href='${pageContext.request.contextPath}/HouseMessageServlet?type=liebiaoget&tid="+data[i].id+"'>["+data[i].townName+"-"+data[i].areaName+"]"+data[i].houseName+"</a></p><p>"+data[i].salesAddress+"</p></td><td><span>"+data[i].averagePrice+"元/平</span><span> 元/㎡</span></td></tr></table></li>";
				}
				$("#dongcidaci").html(pin);
			},
			"json"
			); 
		}
	
	$("#leibie").change(function(){
			duqu();
			chaxun();
	});

	$("#qujian").change(function(){
			duqu();
			chaxun();
	})
			
		//房屋类型 
		$.post(
			"${pageContext.request.contextPath}/HouseTypeServlet",
			{"type":"get"},
			function(data){
				var pin="<option value='-1' selected='selected'>请选择类型</option>";
				for(var i=0;i<data.length;i++){
					pin+="<option value="+data[i].id+">"+data[i].typeName+"</option>"
				}
				$("#leibie").html(pin);
			},
			"json"
		); 
		
		
		//End房屋类型End
			
		//省
		$.post(
			"${pageContext.request.contextPath}/HouseProvinceServlet",
			{"type":"get"},
			function(data){
				var pin="<option value='-1' selected='selected'>请选择省</option>";
				for(var i=0;i<data.length;i++){
					pin+="<option value="+data[i].id+">"+data[i].provinceName+"</option>"
				}
				$("#sheng").html(pin);
			},
			"json"
		);
		//End省End
		
		//市
		$("#sheng").change(function(){
				var idd=$(this).val();
				$.post(
				"${pageContext.request.contextPath}/HouseTownServlet",
				{"type":"zcget","provinceId":idd},
				function(data){
					var pin=" <option value='-1' selected='selected'>请选择市</option>";
					for(var i=0;i<data.length;i++){
						pin+="<option value="+data[i].id+">"+data[i].townName+"</option>"
					}
					$("#shi").html(pin);
					var qu="<option value='-1' selected='selected'>请选择区</option>";
					$("#qu").html(qu);
				},
				"json"
			)
			duqu();
			chaxun();
		})
		//End市
		
		//区
		$("#shi").change(function(){
			var idd=$(this).val();
			$.post(
			"${pageContext.request.contextPath}/HouseAreaServlet",
			{"type":"zcget","townId":idd},
			function(data){
				var pin=" <option value='-1' selected='selected'>请选择区</option>";
				for(var i=0;i<data.length;i++){
					pin+="<option value="+data[i].id+">"+data[i].areaName+"</option>"
				}
				$("#qu").html(pin);
			},
			"json"
			)
			duqu();
			chaxun();
			})
		//END区END

		
</script>
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
	document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F3fe5b2b119b5fc4931e9c73e7071b0c6' type='text/javascript'%3E%3C/script%3E"));
	var bds_config = {"bdTop":203};
	$("#bdshell_js").attr("src","http://share.baidu.com/static/js/shell_v2.js?cdnversion=" + new Date().getHours());
//]]>
</script></body>
</html>
