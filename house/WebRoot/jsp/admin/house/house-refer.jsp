<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%request.setAttribute("path", path); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
   <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Moris JS Chart Examples | Gentellela Alela! by Colorlib</title>

    <!-- Bootstrap -->
    <link href="${path}/jsp/admin/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->

    <!-- NProgress -->
    <link href="${path}/jsp/admin/css/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="${path}/jsp/admin/css/flat/green.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${path}/jsp/admin/css/custom.min.css" rel="stylesheet">
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
                <img src="${path}/jsp/admin/images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>Welcome,</span>
                <h2>John Doe</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

           <!-- sidebar menu -->
            <jsp:include page="../houseResource/menu.jsp"></jsp:include>
            <!-- /sidebar menu -->

           
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
                    
                  </a>
                  <ul id="menu1" class="dropdown-menu list-unstyled msg_list" role="menu">
                    <li>
                      <a>
                        <span class="image"><img src="${path}/jsp/admin/images/img.jpg" alt="Profile Image" /></span>
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
                        <span class="image"><img src="${path}/jsp/admin/images/img.jpg" alt="Profile Image" /></span>
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
                        <span class="image"><img src="${path}/jsp/admin/images/img.jpg" alt="Profile Image" /></span>
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
                        <span class="image"><img src="${path}/jsp/admin/images/img.jpg" alt="Profile Image" /></span>
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
            <div class="page-title">
              <div class="title_left">
                <h3>首页资讯展示选择</h3>
              </div>

              <div class="title_right">
                <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                  
                </div> 
              </div>
            </div>

            <div class="clearfix"></div>  
            <div class="row"> 
              <!-- bar chart -->   
              <div class="col-md-6 col-sm-6 col-xs-12">
                <div class="x_panel" style="width:1300px;height:600px">
                  <div class="x_title"> 
                    <h2>资讯</h2>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <div id="" style="width:100%; height:80px;">
                    <form action="HouseIndextypeServlet?indextype=3&showtype=1" method="post">
                    		主显示: <input type="hidden" name="type" value="add2">
               		  <c:forEach items="${list}" var="list">          	
                     	 <input type="radio" value="${list.id}" name="housetype" id="housetype">${list.title}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      </c:forEach>
                      
                      	 <input type="submit" value="主显示" style="border-radius: 50%;background-color: white;color:#D59354;font-weight:bold;"id="dongdongdong">
                    </form>
          
                      <form action="HouseIndextypeServlet?indextype=3&showtype=2" method="post" id="dongcidaci">
                     	副显示： <input type="hidden" name="type" value="add2">
                      <c:forEach items="${list}" var="list">      	
                     	<input type="checkbox" value="${list.id}" name="housetype" id="housetype" class="duoxuan">${list.title}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     </c:forEach>
                      	<input type="submit" value="副显示" style="border-radius: 50%;background-color: white;color:#D59354;font-weight:bold;" id="dongdongdong1">
                      </form>

                    </div>
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
    <script src="${path}/jsp/admin/js/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="${path}/jsp/admin/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="${path}/jsp/admin/js/fastclick.js"></script>
    <!-- NProgress -->
    <script src="${path}/jsp/admin/js/nprogress.js"></script>
    <!-- morris.js -->
    <script src="${path}/jsp/admin/js/raphael.min.js"></script>
    <script src="${path}/jsp/admin/js/morris.min.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="${path}/jsp/admin/js/custom.min.js"></script>
	  <script type="text/javascript">
  	$(function(){
		$(".duoxuan").click(function duoxuan(){
  		  var str=4-$("input[name='housetype']:checked").length;
  		  if(str<0){
  		    alert("资讯不能选超过4个"); 
  			return false; 
  		  } 
		 });
		 
  	$("#dongdongdong").click(function(){
  		var str=$("input[name='housetype']:checked").length;
  		if(str==0){
  			alert("你倒是选一个啊？难道没有你喜欢的？")
  			return false;
  		}
  	  	})
  	  	
  	 	$("#dongdongdong1").click(function(){
  		var str=$("input[name='housetype']:checked").length;
  		if(str==0){
  			alert("你倒是选一个啊？难道没有你喜欢的？")
  			return false;
  		}
  	  	})
  	})
  	
    
 
    </script>
    <!-- morris.js -->
    <script>
      $(document).ready(function() {
        Morris.Bar({
          element: 'graph_bar',
          data: [
            {device: 'iPhone 4', geekbench: 380},
            {device: 'iPhone 4S', geekbench: 655},
            {device: 'iPhone 3GS', geekbench: 275},
            {device: 'iPhone 5', geekbench: 1571},
            {device: 'iPhone 5S', geekbench: 655},
            {device: 'iPhone 6', geekbench: 2154},
            {device: 'iPhone 6 Plus', geekbench: 1144},
            {device: 'iPhone 6S', geekbench: 2371},
            {device: 'iPhone 6S Plus', geekbench: 1471},
            {device: 'Other', geekbench: 1371}
          ],
          xkey: 'device',
          ykeys: ['geekbench'],
          labels: ['Geekbench'],
          barRatio: 0.4,
          barColors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
          xLabelAngle: 35,
          hideHover: 'auto',
          resize: true
        });

        Morris.Bar({
          element: 'graph_bar_group',
          data: [
            {"period": "2016-10-01", "licensed": 807, "sorned": 660},
            {"period": "2016-09-30", "licensed": 1251, "sorned": 729},
            {"period": "2016-09-29", "licensed": 1769, "sorned": 1018},
            {"period": "2016-09-20", "licensed": 2246, "sorned": 1461},
            {"period": "2016-09-19", "licensed": 2657, "sorned": 1967},
            {"period": "2016-09-18", "licensed": 3148, "sorned": 2627},
            {"period": "2016-09-17", "licensed": 3471, "sorned": 3740},
            {"period": "2016-09-16", "licensed": 2871, "sorned": 2216},
            {"period": "2016-09-15", "licensed": 2401, "sorned": 1656},
            {"period": "2016-09-10", "licensed": 2115, "sorned": 1022}
          ],
          xkey: 'period',
          barColors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
          ykeys: ['licensed', 'sorned'],
          labels: ['Licensed', 'SORN'],
          hideHover: 'auto',
          xLabelAngle: 60,
          resize: true
        });

        Morris.Bar({
          element: 'graphx',
          data: [
            {x: '2015 Q1', y: 2, z: 3, a: 4},
            {x: '2015 Q2', y: 3, z: 5, a: 6},
            {x: '2015 Q3', y: 4, z: 3, a: 2},
            {x: '2015 Q4', y: 2, z: 4, a: 5}
          ],
          xkey: 'x',
          ykeys: ['y', 'z', 'a'],
          barColors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
          hideHover: 'auto',
          labels: ['Y', 'Z', 'A'],
          resize: true
        }).on('click', function (i, row) {
            console.log(i, row);
        });

        Morris.Area({
          element: 'graph_area',
          data: [
            {period: '2014 Q1', iphone: 2666, ipad: null, itouch: 2647},
            {period: '2014 Q2', iphone: 2778, ipad: 2294, itouch: 2441},
            {period: '2014 Q3', iphone: 4912, ipad: 1969, itouch: 2501},
            {period: '2014 Q4', iphone: 3767, ipad: 3597, itouch: 5689},
            {period: '2015 Q1', iphone: 6810, ipad: 1914, itouch: 2293},
            {period: '2015 Q2', iphone: 5670, ipad: 4293, itouch: 1881},
            {period: '2015 Q3', iphone: 4820, ipad: 3795, itouch: 1588},
            {period: '2015 Q4', iphone: 15073, ipad: 5967, itouch: 5175},
            {period: '2016 Q1', iphone: 10687, ipad: 4460, itouch: 2028},
            {period: '2016 Q2', iphone: 8432, ipad: 5713, itouch: 1791}
          ],
          xkey: 'period',
          ykeys: ['iphone', 'ipad', 'itouch'],
          lineColors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
          labels: ['iPhone', 'iPad', 'iPod Touch'],
          pointSize: 2,
          hideHover: 'auto',
          resize: true
        });

        Morris.Donut({
          element: 'graph_donut',
          data: [
            {label: 'Jam', value: 25},
            {label: 'Frosted', value: 40},
            {label: 'Custard', value: 25},
            {label: 'Sugar', value: 10}
          ],
          colors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
          formatter: function (y) {
            return y + "%";
          },
          resize: true
        });

        Morris.Line({
          element: 'graph_line',
          xkey: 'year',
          ykeys: ['value'],
          labels: ['Value'],
          hideHover: 'auto',
          lineColors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
          data: [
            {year: '2012', value: 20},
            {year: '2013', value: 10},
            {year: '2014', value: 5},
            {year: '2015', value: 5},
            {year: '2016', value: 20}
          ],
          resize: true
        });

        $MENU_TOGGLE.on('click', function() {
          $(window).resize();
        });
      });
    </script>
    <!-- /morris.js -->
  </body>
</html>
