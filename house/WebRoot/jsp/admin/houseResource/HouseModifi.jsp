<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("path",path);
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'HouseManage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentellela Alela! | </title>

    <!-- Bootstrap -->
    <link href="${path }/jsp/admin/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    
    <!-- NProgress -->
    <link href="${path }/jsp/admin/css/nprogress.css" rel="stylesheet">
    
    <link href="${path }/jsp/admin/css/fileUpload.css" rel="stylesheet">
    <link href="${path }/jsp/admin/css/iconfont.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${path }/jsp/admin/css/custom.min.css" rel="stylesheet">

    <link href="${path }/jsp/admin/css/select.css" rel="stylesheet" />
    <link href="${path }/jsp/admin/css/jquery.mCustomScrollbar.min.css" rel="stylesheet" />
	<link href="${path }/jsp/admin/css/fileUpload.css" rel="stylesheet" type="text/css">

		<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=4YCE1omHccmroLSrjGUKZT0YLn9zB4LT"></script>
	<!--加载鼠标绘制工具-->
	<script type="text/javascript" src="http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.js"></script>
	<link rel="stylesheet" href="http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.css" />
	<!--加载检索信息窗口-->
	<script type="text/javascript" src="http://api.map.baidu.com/library/SearchInfoWindow/1.4/src/SearchInfoWindow_min.js"></script>
	<link rel="stylesheet" href="http://api.map.baidu.com/library/SearchInfoWindow/1.4/src/SearchInfoWindow_min.css" />
	
	<style type="text/css">
	body, html{width: 100%;height: 100%;margin:0;font-family:"微软雅黑";}
	#allmap {width: 100%; height:500px; overflow: hidden;}
	#result {width:100%;font-size:12px;}
	dl,dt,dd,ul,li{
		margin:0;
		padding:0;
		list-style:none;
	}
	p{font-size:12px;}
	dt{
		font-size:14px;
		font-family:"微软雅黑";
		font-weight:bold;
		border-bottom:1px dotted #000;
		padding:5px 0 5px 5px;
		margin:5px 0;
	}
	dd{
		padding:5px 0 0 5px;
	}
	li{
		line-height:28px;
	}
	#map{
		margin: 0 auto;
	}
	#tititi{
		float:right;
		margin-right: 25%;
	}
	</style>
	
	
  </head>
  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"> <span>Gentellela Alela!</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile">
              <div class="profile_pic">
                <img src="${path }/jsp/admin/images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>John Doe</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
            <jsp:include page="menu.jsp"></jsp:include>
            <!-- /sidebar menu -->

            <!-- /menu footer buttons -->
            
            <!-- /menu footer buttons -->
          </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
          <div class="nav_menu">
            <nav>
              <div class="nav toggle">
                <a id="menu_toggle"><i class="fa fa-bars"></i></a>
              </div>

              <ul class="nav navbar-nav navbar-right">
                <jsp:include page="../houseResource/titleMenu.jsp"></jsp:include>

                <li role="presentation" class="dropdown">
                  <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                    <i class="fa fa-envelope-o"></i>
                    <span class="badge bg-green">6</span>
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="${path }/jsp/admin/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="${path }/jsp/admin/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="${path }/jsp/admin/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <a>
                        <span class="image"><img src="${path }/jsp/admin/images/img.jpg" alt="Profile Image" /></span>
                        <span>
                          <span>John Smith</span>
                          <span class="time">3 mins ago</span>
                        </span>
                        <span class="message">
                          Film festivals used to be do-or-die moments for movie makers. They were where...
                        </span>
                      </a>
                    </li>
                    <li>
                      <div class="text-center">
                        <a>
                          <strong>See All Alerts</strong>
                          <i class="fa fa-angle-right"></i>
                        </a>
                      </div>
                    </li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                <h2>房源查看</h2>
                    <!-- Tabs -->
                    <div id="wizard_verticle" class="form_wizard wizard_verticle">
                        <div id="step-11">
                        <h2 class="StepTitle">详细信息</h2>
                        <form class="form-horizontal form-label-left" action="HouseMessageServlet" method="get">
                         <input type="hidden" name="type" value="modifi">
                         <input type="hidden" name="id" value=${listtttt.id }>
                         <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name"><span class="required">*</span>楼盘名称
                            </label><span id="checkNamelp"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                              <input class="form-control col-md-7 col-xs-12" type="text" name="houseName" id="houseName" value="${listtttt.houseName }">

                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name"><span class="required">*</span>产权性质
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12" id="chanquanxingzhi">
                              <select id="chanquanxz" name="chanquanxz" class="form-control" style="width:120px;display:inline-block">
                                <option value="-1" selected="selected">请选择</option>
                              </select>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="middle-name" class="control-label col-md-3 col-sm-3"><span class="required">*</span>类&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别</label>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                               <select id="leibie" name="leibie" class="form-control" style="width:120px;display:inline-block">
                                <option value="-1" selected="selected">请选择</option>
                              </select>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12" ><span class="required">*</span>装修状况</label>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <select id="zhuangxiu" name="zhuangxiu" class="form-control" style="width:120px;display:inline-block">
                                <option value="-1" selected="selected">请选择</option>
                              </select>
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name"><span class="required">*</span>起&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价
                            </label><span id="moneyErr"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input class="form-control col-md-7 col-xs-12"  type="text" id="money" name="qijia" value="${listtttt.startPrice }" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name"><span class="required">*</span>均&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价
                            </label><span id="moneyErrTwo"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input class="form-control col-md-7 col-xs-12"  type="text" id="moneytwo" name="junjia" value="${listtttt.averagePrice }" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" ><span class="required">*</span>地理位置
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <select id="sheng" name="sheng" class="form-control" style="width:120px;display:inline-block" >
                                <option value="${listtttt.provinceId }" selected="selected">请选择</option>
                              </select>
                              <select id="shi" name="shi" class="form-control" style="width:120px;display:inline-block">
                                <option value="${listtttt.townId} " selected="selected">请选择</option>
                              </select>
                              <select id="qu" name="qu" class="form-control" style="width:120px;display:inline-block">
                                <option value="${listtttt.areaId}" selected="selected">请选择</option>
                              </select>
                            </div>
                          </div>
                          <div class="form-group">
                              <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name"><span class="required">*</span>详细地址
                              </label><span id="addressErr"></span>
                              <div class="col-md-6 col-sm-6 col-xs-12" >
                                <input type="text" id="address" class="form-control col-md-7 col-xs-12" value="${listtttt.address }" name="xiangxidizhi">
                              </div>
                            </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name"><span class="required">*</span>建筑面积
                            </label><span id="msg1"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input type="text" id="mia" name="mianji" value="${listtttt.coveredArea }" class="form-control col-md-7 col-xs-12" >
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12" >&nbsp;开盘时间</label>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="middle-name2" class="form-control col-md-7 col-xs-12" value="${listtttt.openTime1 }" type="text" name="kaipan" onclick="laydate()">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" >&nbsp;交房时间
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="birthday2" class="form-control col-md-7 col-xs-12"  value="${listtttt.checkTime1 }" name="jiaofang" type="text" onclick="laydatet()">
                            </div>
                          </div>
                           <div class="form-group"><span id="wuyeErr"></span>
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" >&nbsp;物业公司
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="wuye" class="form-control col-md-7 col-xs-12" value="${listtttt.realCompany }" name="wuye" type="text" onclick="laydatet()">
                            </div>
                          </div>
                           <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" >&nbsp;物业费
                            </label><span id="wuyefeiErr"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="wuyefei" class="form-control col-md-7 col-xs-12" value="${listtttt.propertyFee }" name="wuyefei" type="text" onclick="laydatet()">
                            </div>
                          </div>
                           <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" >&nbsp;开发商
                            </label><span id="kaifashangErr"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="kaifashang" class="form-control col-md-7 col-xs-12" value="${listtttt.developers }" name="kaifashang" type="text" onclick="laydatet()">
                            </div>
                          </div>
                           <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" >&nbsp;售楼地址
                            </label><span id="shoulouErr"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="shoulou" class="form-control col-md-7 col-xs-12" value="${listtttt.salesAddress }" name="shoulou" type="text" onclick="laydatet()">
                            </div>
                          </div>
                           <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" >&nbsp;楼盘地址
                            </label><span id="loupandizhiErr"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="loupandizhi" class="form-control col-md-7 col-xs-12" value="${listtttt.address }" name="loupandizhi" type="text" onclick="laydatet()">
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="middle-name" class="control-label col-md-3 col-sm-3 col-xs-12" ><span class="required">*</span>&nbsp;绿&nbsp;化&nbsp;率</label>%<span id="msg2"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="luhua" class="form-control col-md-7 col-xs-12" type="text" value="${listtttt.greenRate }" name="lvhualv">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" ><span class="required">*</span>&nbsp;容&nbsp;积&nbsp;率
                            </label>%<span id="rongmsg"></span>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="rong" class="form-control col-md-7 col-xs-12" value="${listtttt.plotRatio }" type="text" name="rongjilv">
                            </div>
                          </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" >&nbsp;房源描述
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="loupandizhi" class="form-control" value="${listtttt.feature }">
                            </div>
                          </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" ><span class="required">*</span>坐标值X
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="zuobiaoX" class="date-picker form-control col-md-7 col-xs-12" value="${listtttt.x }" type="text" name="rongjilv">
                            </div>
                         </div>
                         <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" ><span class="required">*</span>坐标值Y
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12" >
                              <input id="zuobiaoY" class="date-picker form-control col-md-7 col-xs-12" value="${listtttt.y }" type="text" name="rongjilv">
                            </div>
                          </div>
                      <input id="tititi" class="btn btn-success" type="submit" value="提交">
                     </form>
                     
                     <div style="width: 900px;height: 350px;border:1px solid red;margin:auto">
                     	<jsp:include page="../Up/index.jsp"></jsp:include>
                     	<script src="../Up/js/jquery-2.1.3.min.js"></script>
						<script type="text/javascript" src="../Up/js/fileUpload.js"></script>
                     </div>
                     
                     <h4 class="StepTitle">请在地图上点击获取坐标信息</h4>
	<div class="map">
			<div class="input-group">
                <input type="text" class="form-control" id="mapsearch" >
                <span class="input-group-btn">
                	<button type="button" class="btn btn-primary"  id="dongcidaci">搜索</button>
                </span>
            </div>
	<div id="allmap" style="overflow:hidden;zoom:1;position:relative;">	
		<div id="map" style="height:100%;-webkit-transition: all 0.5s ease-in-out;transition: all 0.5s ease-in-out;"></div>
	</div>
	<div id="r-result"></div>
	<div id="result">
		<input class="btn btn-success" type="button" value="获取绘制的覆盖物个数" onclick="alert(overlays.length)"/>
		<input class="btn btn-primary"  type="button" value="清除所有覆盖物" onclick="clearAll()"/>
	</div>
	
	<script type="text/javascript">
		// 百度地图API功能
    var map = new BMap.Map('map');
	map.addEventListener("click",function(e){
	$("#zuobiaoX").val(e.point.lng)
	$("#zuobiaoY").val(e.point.lat)
	});
	
	var point = new BMap.Point(116.404, 39.915);//地图坐标X轴Y轴
	map.centerAndZoom(point, 14);
	map.enableScrollWheelZoom();
	map.enableInertialDragging();
	map.enableContinuousZoom();

	var size = new BMap.Size(10, 20);
		map.addControl(new BMap.CityListControl({
		anchor: BMAP_ANCHOR_TOP_LEFT,
		offset: size,
		// 切换城市之间事件
		// onChangeBefore: function(){
		//    alert('before');
		// },
		// 切换城市之后事件
		// onChangeAfter:function(){
		//   alert('after');
		// }
		
	}));
    map.centerAndZoom(point, 16);
    map.enableScrollWheelZoom();  
    var overlays = [];
	var overlaycomplete = function(e){
        overlays.push(e.overlay);
    };
    var styleOptions = {
        strokeColor:"red",    //边线颜色。
        fillColor:"red",      //填充颜色。当参数为空时，圆形将没有填充效果。
        strokeWeight: 3,       //边线的宽度，以像素为单位。
        strokeOpacity: 0.8,	   //边线透明度，取值范围0 - 1。
        fillOpacity: 0.6,      //填充的透明度，取值范围0 - 1。
        strokeStyle: 'solid' //边线的样式，solid或dashed。
    }
    //实例化鼠标绘制工具
    var drawingManager = new BMapLib.DrawingManager(map, {
        isOpen: false, //是否开启绘制模式
        enableDrawingTool: true, //是否显示工具栏
        drawingToolOptions: {
            anchor: BMAP_ANCHOR_TOP_RIGHT, //位置
            offset: new BMap.Size(5, 5), //偏离值
        },
        circleOptions: styleOptions, //圆的样式
        polylineOptions: styleOptions, //线的样式
        polygonOptions: styleOptions, //多边形的样式
        rectangleOptions: styleOptions //矩形的样式
    });  
	 //添加鼠标绘制工具监听事件，用于获取绘制结果
    drawingManager.addEventListener('overlaycomplete', overlaycomplete);
    map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);
			/* var local = new BMap.LocalSearch(map, {
			renderOptions: {map: map, panel: "r-result"}
			});
			local.search("国贸"); */

	</script>	
	
				</div>
                   </div>
                    </div>
                    <!-- End SmartWizard Content -->
                    
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- /page content -->

        <!-- footer content -->
        <footer>
          <div class="pull-right">
            Gentelella - Bootstrap Admin Template by <a href="https://colorlib.com">Colorlib</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>

	
    <!-- jQuery -->
    <script src="${path }/jsp/admin/js/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="${path }/jsp/admin/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="${path }/jsp/admin/js/fastclick.js"></script>
    <!-- NProgress -->
    <script src="${path }/jsp/admin/js/nprogress.js"></script>
    <!-- jQuery Smart Wizard -->
    <script src="${path }/jsp/admin/js/jquery.smartWizard.js"></script>
    <!-- Custom Theme Scripts -->
    <script src="${path }/jsp/admin/js/custom.min.js"></script>
    <!--<script src="js/jquery-1.11.3.min.js"></script>-->
    <script src="${path }/jsp/admin/js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="${path }/jsp/admin/js/jquery.select.js"></script>

	<!-- 自己编写的jQuery -->
	<script type="text/javascript">
		$("#dongcidaci").click(function(){
			var aa=$("#mapsearch").val();
			var local = new BMap.LocalSearch(map, {
			renderOptions: {map: map, panel: "r-result"}
			});
			local.search(aa);
		});

		/* 楼盘名称判断 */
		$(function(){
			$("#houseName").blur(function(){
				//读取输入的值
				var houseName=$(this).val();
				
				if(houseName.length == 0){
		            document.getElementById('checkNamelp').innerHTML="不可以为空".fontcolor("red");
		            return false;
	       		 }
				
				//服务端校验该楼盘名称是否存在
				$.post(
					"HouseMessageServlet",/* ${pageContext.request.contextPath}/ */
					{"type":"Checkname","name":houseName},
					function(data){
						var isExist =data.isExist;
						var noinfo="";
						if(isExist){
							noinfo="该楼盘已存在";
							$("#checkNamelp").css("color","red");
						}else{
							noinfo="√";
							$("#checkNamelp").css("color","green");
						}
						$("#checkNamelp").html(noinfo);
					},
					"json"
				);
			});
		/* -End 楼盘名称判断 -End*/

		//产权性质遍历 
		$.post(
				"HousePropertyServlet",
				{"type":"get"},
				function(data){
					var pin="";
					for(var i=0;i<data.length;i++){
						if(data[i].id==${listtttt.property }){
							pin+="<option value="+data[i].id+" selected='selected'>"+data[i].propertyType+"</option>"
						}else{
							pin+="<option value="+data[i].id+">"+data[i].propertyType+"</option>"
						}
					}
					$("#chanquanxz").html(pin);
				},
				"json"
			); 
		//End产权性质遍历End
			
		//装修
		$.post(
				"HouseFinishstateServlet",
				{"type":"get"},
				function(data){
					var pin="";
					for(var i=0;i<data.length;i++){
						if(data[i].id==${listtttt.finishState }){
							pin+="<option value="+data[i].id+" selected='selected'>"+data[i].finishState+"</option>"
						}else{
							pin+="<option value="+data[i].id+">"+data[i].finishState+"</option>"
						}
					}
					$("#zhuangxiu").html(pin);
				},
				"json"
			); 
		//End装修End	
		
		//房屋类型 
		$.post(
			"HouseTypeServlet",
			{"type":"get"},
			function(data){
				var pin="";
				for(var i=0;i<data.length;i++){
					if(data[i].id==${listtttt.houseType }){
						pin+="<option value="+data[i].id+" selected='selected'>"+data[i].typeName+"</option>"
					}else{
						pin+="<option value="+data[i].id+">"+data[i].typeName+"</option>"
					}
				}
				$("#leibie").html(pin);
			},
			"json"
		); 
		//End房屋类型End
			
		//省
		function sheng(){
		var sheng=$("#sheng").val();
				$.post(
				"HouseProvinceServlet",
				{"type":"get"},
				function(data){
					var pin="<option value='0' selected='selected'>请选择</option>";
					for(var i=0;i<data.length;i++){
						if(data[i].id==${listtttt.provinceId }){
							pin+="<option value='"+data[i].id+"' selected='selected'>"+data[i].provinceName+"</option>"
						}else{
							pin+="<option value='"+data[i].id+"'>"+data[i].provinceName+"</option>"
						}
					}
					$("#sheng").html(pin);
				},
				"json"
			);
			shi();
		}
		sheng();
		
		
		//End省End
		//市
		function shi(){
			var provinceId=$("#sheng").val();
			$.post(
					"HouseTownServlet",
					{"type":"zcget","provinceId":provinceId},
					function(data){
						var pin="";
						for(var i=0;i<data.length;i++){
							if(data[i].provinceId==${listtttt.townId }){
								pin+="<option value='"+data[i].id+"' selected='selected'>"+data[i].townName+"</option>"
							}else{
								pin+="<option value='"+data[i].id+"'>"+data[i].townName+"</option>"
							}
						}
						$("#shi").html(pin);
					},
					"json"
				);
				qu();
		}
		//End市End
		//区
		function qu(){
			var townId=$("#shi").val();
			$.post(
				"HouseAreaServlet",
				{"type":"zcget","townId":townId},
				function(data){
					var pin="";
					for(var i=0;i<data.length;i++){
						if(data[i].provinceId==${listtttt.areaId }){
								pin+="<option value='"+data[i].id+"' selected='selected'>"+data[i].areaName+"</option>"
							}else{
								pin+="<option value='"+data[i].id+"'>"+data[i].areaName+"</option>";
							}			
					}
					$("#qu").html(pin);
				},
				"json"
			);
		}
		//End区End
		
		
		//市
		$("#sheng").change(function(){
				var idd=$(this).val();
				$.post(
				"HouseTownServlet",
				{"type":"zcget","provinceId":idd},
				function(data){
					var pin=" <option value='0' selected='selected'>请选择</option>";;
					for(var i=0;i<data.length;i++){
						pin+="<option value="+data[i].id+">"+data[i].townName+"</option>"
					}
					$("#shi").html(pin);
					var qu="<option value='0' selected='selected'>请选择</option>";
					$("#qu").html(qu);
				},
				"json"
			)
		})
		//End市
		
		//区
		$("#shi").change(function(){
					var idd=$(this).val();
					$.post(
					"HouseAreaServlet",
					{"type":"zcget","townId":idd},
					function(data){
						var pin=" <option value='0' selected='selected'>请选择</option>";
						for(var i=0;i<data.length;i++){
							pin+="<option value="+data[i].id+">"+data[i].areaName+"</option>"
						}
						$("#qu").html(pin);
					},
					"json"
					)
				})
		//END区END
		});
		var loupan=true;
		var chanquan=true;
		var qijia=true;
		var junjia=true;
		var xiangxi=true;
		var mianji=true;
		var lvhua=true;
		var rongji=true;
		var wuyefei=true;
		
	
	$("#wuyefei").blur(function(){
		var mia = document.getElementById('wuyefei');
        var msg1 = document.getElementById('wuyefeiErr');
        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
        if(!pattern.test(mia.value)){
            msg1.innerHTML="物业费不正确".fontcolor("red");
            wuyefei=false;
            return false;
        } else{
            msg1.innerHTML="√".fontcolor("green");
            wuyefei=true;
            return true;
        }
	})
   
	$("#money").blur(function(){
			var money = document.getElementById('money');
	        var moneyErr = document.getElementById('moneyErr');
	        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
	        if(money.value.length == 0){
	           moneyErr.innerHTML="起价不能为空".fontcolor("red");
	          	qijia=false;
	            return false;
	        }
	        if(!pattern.test(money.value)){
	            moneyErr.innerHTML="起价格式不正确".fontcolor("red");
	            qijia=false;
	            return false;
	        } else{
	            moneyErr.innerHTML="√".fontcolor("green");
	            qijia=true;
	            return true;
	        }
		})
        

	$("#moneytwo").blur(function(){
		var moneytwo = document.getElementById('moneytwo');
        var moneyErrTwo = document.getElementById('moneyErrTwo');
        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
        if(moneytwo.value.length == 0){
            moneyErrTwo.innerHTML="均价不能为空".fontcolor("red");
            junjia=false;
            return false;
        }
        if(!pattern.test(moneytwo.value)){
            moneyErrTwo.innerHTML="均价格式不正确".fontcolor("red");
            junjia=false;
            return false;
        } else{
            moneyErrTwo.innerHTML="√".fontcolor("green");
            junjia=true;
            return true;
        }
	})
        



	$("#address").blur(function(){
		var address = document.getElementById('address');
        var addressErr = document.getElementById('addressErr');
        if (address.value.length == 0) {
            addressErr.innerHTML = "地址不能为空".fontcolor("red");
            xiangxi=false;
            return false;
        }else{
            addressErr.innerHTML = "√".fontcolor("green");
            xiangxi=true;
        }
	})


	$("#mia").blur(function(){
		var mia = document.getElementById('mia');
        var msg1 = document.getElementById('msg1');
        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
        if(mia.value.length == 0){
            msg1.innerHTML="面积不能为空".fontcolor("red");
            mianji=false;
            return false;
        }
        if(!pattern.test(mia.value)){
            msg1.innerHTML="面积格式不正确".fontcolor("red");
            mianji=false;
            return false;
        } else{
            msg1.innerHTML="√".fontcolor("green");
            mianji=true;
            return true;
        }
	})
   
	$("#luhua").blur(function(){
	  	var luhua = document.getElementById('luhua');
        var msg2 = document.getElementById('msg2');
        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
        if(luhua.value.length == 0){
            msg2.innerHTML="绿化率不能为空".fontcolor("red");
            lvhua=false;
            return false;
        }
        if(!pattern.test(luhua.value)){
            msg2.innerHTML="绿化率格式不正确".fontcolor("red");
            lvhua=false;
            return false;
        } else{
            msg2.innerHTML="√".fontcolor("green");
            lvhua=true;
            return true;
        }
	})



	$("#rong").blur(function(){
		var rong = document.getElementById('rong');
        var rongmsg = document.getElementById('rongmsg');
        var pattern =/^[0-9]+([.]{1}[0-9]+){0,1}$/;
        if(rong.value.length == 0){
            rongmsg.innerHTML="容积率不能为空".fontcolor("red");
            rongji=false;
            return false;
        }
        if(!pattern.test(rong.value)){
            rongmsg.innerHTML="容积率格式不正确".fontcolor("red");
            rongji=false;
            return false;
        } else{
            rongmsg.innerHTML="√".fontcolor("green");
            rongji=true;
            return true;
        } 
	})
	
	 $("#tititi").click(function(){
        	if(wuyefei==true&&loupan==true&&qijia==true&&junjia==true&&xiangxi==true&&mianji==true&&lvhua==true&&rongji==true){
				return true;
        	}else{
        		alert("您有选项填写错误,不能提交");
        		return false;
        	}
    })

		
	</script>

	<!-- 时间插件 -->
	<script src="${path }/jsp/admin/unit/laydate/laydate.js"></script>
	<script>
		;!function () {
			laydate({
				elem : '#birthday2'
			});
		}();
	</script>
	<!-- end时间插件end -->
	
	
	<!-- 自己编写的jQuery End -->



    <script type="text/javascript">
      $(function () {
        $("#mySelect").select({
          width: "200px"
        });
      });
    </script>
    <!-- jQuery Smart Wizard -->
    <!-- <script>
      $(document).ready(function() {
        $('#wizard').smartWizard();

        $('#wizard_verticle').smartWizard({
          transitionEffect: 'slide'
        });

        $('.buttonNext').addClass('btn btn-success');
        $('.buttonPrevious').addClass('btn btn-primary');
        $('.buttonFinish').addClass('btn btn-default');
      });
    </script> -->
    <!-- /jQuery Smart Wizard -->
  </body>
</html>
<script type="text/javascript" src="${path }/jsp/admin/js/fileUpload.js"></script>