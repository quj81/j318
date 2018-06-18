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
    
    <title>My JSP 'HouseShow.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentellela Alela! | </title>

    <!-- Bootstrap -->
    <link href="${path }/jsp/admin/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${path }/jsp/admin/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${path }/jsp/admin/css/nprogress.css" rel="stylesheet">
    <!-- Dropzone.js -->
    <link href="${path }/jsp/admin/css/dropzone.min.css" rel="stylesheet">

    <link href="${path }/jsp/admin/css/select.css" rel="stylesheet" />
    <!-- Custom Theme Style -->
    <link href="${path }/jsp/admin/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Gentellela Alela!</span></a>
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
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
              </a>
            </div>
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
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="${path }/jsp/admin/images/img.jpg" alt="">John Doe
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="javascript:;"> Profile</a></li>
                    <li>
                      <a href="javascript:;">
                        <span class="badge bg-red pull-right">50%</span>
                        <span>Settings</span>
                      </a>
                    </li>
                    <li><a href="javascript:;">Help</a></li>
                    <li><a href="login.html"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                  </ul>
                </li>

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
          <div class="souSuo">
            <div class="souSuo1">
             <form action="HouseMessageServlet">
             <input type="hidden" name="type" value="getcha">
             	<select id="sheng" name="sheng">
                <option value="-1" selected="selected">请选择省</option>
              </select>
              <select id="shi" name="shi">
                <option value="-1" selected="selected">请选择市</option>
              </select>
              <select id="qu" name="qu">
                <option value="-1" selected="selected">请选择区</option>
              </select>
              <select id="leibie" name="leibie">
                <option value="-1" selected="selected">请选择类型</option>
              </select>
              <select id="qujian" name="qujian">
                <option value="-1" selected="selected">请选择价格</option>
                <option value="0">0-10000</option>
                <option value="10000">10000-20000</option>
                <option value="30000">30000-40000</option>
                <option value="50000">50000-60000</option>
                <option value="70000">70000-80000</option>
                <option value="90000">90000-100000</option>
                <option value="100000">100000以上</option>
              </select>
              <input type="submit" value="确认">
             </form>
            </div>
            <div class="souSuo2">
              <input type="text"/><button>搜索</button>
            </div>
          </div>
          <div class="info">
            <table>
              <tr>
                <td class="fr_info">房源基本信息</td>
                <td class="last_info">房源状态</td>
                <td class="last_info">房源管理</td>
              </tr>
              <c:forEach items="${requestScope.list }" var="list">
              
	              <tr>
	                <td class="fr_show">
	                  <ul>
	                    <li><img src="" alt="图片飞丢了" width="" height=""/></br>图片修改</li>
	                    <li>
	                      <p><a href="form_buttons.html"> ${list.houseName }</a></p>
	                      <p>
	                        	面积:${list.coveredArea }
	                        	均价:${list.averagePrice }
	                      </p>
	                    </li>
	                  </ul>
	                </td>
	                <td class="last_show">
	                  <p>
	                  <c:if test="${list.state==1}">
	                  	发布
	                  </c:if>
	                  <c:if test="${list.state==2}">
	                  	审核
	                  </c:if>
	                  <c:if test="${list.state==3}">
	                  	删除
	                  </c:if>
	                  </p>
	                </td>
	                <td class="last_show">
	                  <a href="#" onclikc="">删除</a></p>
	                </td>
	              </tr>
	              
              </c:forEach>

            </table>
          </div>
         <div>
			上一页  下一页
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
    <!-- Dropzone.js -->
    <script src="${path }/jsp/admin/js/dropzone.min.js"></script>
	
	
	<!-- 自己写的script代码 -->
	<script type="text/javascript">
		$(function(){
		//房屋类型 
		$.post(
			"HouseTypeServlet",
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
			"HouseProvinceServlet",
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
				"HouseTownServlet",
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
		})
		//End市
		
		//区
		$("#shi").change(function(){
					var idd=$(this).val();
					$.post(
					"HouseAreaServlet",
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
					})
		//END区END
		
		
		
		
		
		
		});
	</script>
	<!-- end自己写的script代码end -->


    <!-- Custom Theme Scripts -->
    <script src="${path }/jsp/admin/js/custom.min.js"></script>
  </body>
</html>