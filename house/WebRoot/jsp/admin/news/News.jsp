<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%request.setAttribute("path", path); %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>DataTables | Gentellela</title>

    <!-- Bootstrap -->
    <link href="${path}/jsp/admin/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${path}/jsp/admin/css/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${path}/jsp/admin/css/nprogress.css" rel="stylesheet">
    <!-- iCheck -->
    <link href="${path}/jsp/admin/css/green.css" rel="stylesheet">
    <!-- Datatables -->
    <link href="${path}/jsp/admin/css/dataTables.bootstrap.min.css" rel="stylesheet">
    <link href="${path}/jsp/admin/css/buttons.bootstrap.min.css" rel="stylesheet">
    <link href="${path}/jsp/admin/css/fixedHeader.bootstrap.min.css" rel="stylesheet">
    <link href="${path}/jsp/admin//css/responsive.bootstrap.min.css" rel="stylesheet">
    <link href="${path}/jsp/admin/css/scroller.bootstrap.min.css" rel="stylesheet">

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
 <!-- <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>General</h3>
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> 用户 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="index.html">Dashboard</a></li>
                      <li><a href="index2.html">Dashboard2</a></li>
                      <li><a href="index3.html">Dashboard3</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> 首页 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="form.html">General Form</a></li>
                      <li><a href="form_advanced.html">Advanced Components</a></li>
                      <li><a href="form_validation.html">Form Validation</a></li>
                      <li><a href="form_wizards.html">Form Wizard</a></li>
                      <li><a href="form_upload.html">Form Upload</a></li>
                      <li><a href="form_buttons.html">Form Buttons</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-desktop"></i>楼盘类型 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">

                     <li><a href="楼盘类型.html">楼盘类型</a></li>
                      <li><a href="楼盘类型添加.html">楼盘类型添加</a></li>
                      <li><a href="楼盘类型修改.html">楼盘类型修改</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-bar-chart-o"></i>楼盘资讯 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="HouseNewsServlet?type=get">资讯列表</a></li>
                      <li><a href="HouseNewsServlet?type=add">添加资讯</a></li>
                     
                   
                    </ul>
                  </li>
                </ul>
              </div>

            </div> -->

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
                    <img src="${path}/jsp/admin/images/img.jpg" alt="">John Doe
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
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h4>当前位置:资讯管理 >资讯列表</h4>
                    
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    
                    <table id="datatable" class="table table-striped table-bordered">
                      <thead>
                        <tr>           
                          <th>资讯标题</th>
                          <th>操作</th>                         
                        </tr>
                      </thead>

                      <tbody id="dongcidaci">        
                      </tbody>
                    </table>
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
    <!-- iCheck -->
    <script src="${path}/jsp/admin/js/icheck.min.js"></script>
    <!-- Datatables -->
    <script src="${path}/jsp/admin/js/jquery.dataTables.min.js"></script>
    <script src="${path}/jsp/admin/js/dataTables.bootstrap.min.js"></script>
    <script src="${path}/jsp/admin/js/dataTables.buttons.min.js"></script>
    <script src="${path}/jsp/admin/js/buttons.bootstrap.min.js"></script>
    <script src="${path}/jsp/admin/js/buttons.flash.min.js"></script>
    <script src="${path}/jsp/admin/js/buttons.html5.min.js"></script>
    <script src="${path}/jsp/admin/js/buttons.print.min.js"></script>
    <script src="${path}/jsp/admin/js/dataTables.fixedHeader.min.js"></script>
    <script src="${path}/jsp/admin/js/dataTables.keyTable.min.js"></script>
    <script src="${path}/jsp/admin/js/dataTables.responsive.min.js"></script>
    <script src="${path}/jsp/admin/js/responsive.bootstrap.js"></script>
    <script src="${path}/jsp/admin/js/datatables.scroller.min.js"></script>
    <script src="${path}/jsp/admin/js/jszip.min.js"></script>
    <script src="${path}/jsp/admin/js/pdfmake.min.js"></script>
    <script src="${path}/jsp/admin/js/vfs_fonts.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="${path}/jsp/admin/js/custom.min.js"></script>

	<script type="text/javascript">
	$(function(){
		getttt();	
		
		
	})
		
	function getttt(){
			$.post(
				"${pageContext.request.contextPath}/HouseNewsServlet",
				{"type":"getajax"},
				function(data){
				var str="";
					for(var i=0;i<data.length;i++){
					str+="<tr><input type='hidden' name='tid' value='"+data[i].id+"'><td>"+data[i].title+"</td><td><button onclick='shanchu("+data[i].id+")'>删除</button><a href='${pageContext.request.contextPath}/HouseNewsServlet?type=modifyin&id="+data[i].id+"'>修改</a></td></tr>";
					}
				$("#dongcidaci").html(str);
				},
				"json"
			)
		}	
		
	function shanchu(id){
			$.post(
				"${pageContext.request.contextPath}/HouseNewsServlet",
				{"type":"delete","id":id},
				function(re){
					if(re==1){
					alert("删除成功");
					getttt();
					}else{
					alert("删除失败");
					getttt();
					}
				},
				"text"
			)
			
		}
		
	</script>


    <!-- Datatables -->
    <script>
      $(document).ready(function() {
        var handleDataTableButtons = function() {
          if ($("#datatable-buttons").length) {
            $("#datatable-buttons").DataTable({
              dom: "Bfrtip",
              buttons: [
                {
                  extend: "copy",
                  className: "btn-sm"
                },
                {
                  extend: "csv",
                  className: "btn-sm"
                },
                {
                  extend: "excel",
                  className: "btn-sm"
                },
                {
                  extend: "pdfHtml5",
                  className: "btn-sm"
                },
                {
                  extend: "print",
                  className: "btn-sm"
                },
              ],
              responsive: true
            });
          }
        };

        TableManageButtons = function() {
          "use strict";
          return {
            init: function() {
              handleDataTableButtons();
            }
          };
        }();

        $('#datatable').dataTable();

        $('#datatable-keytable').DataTable({
          keys: true
        });

        $('#datatable-responsive').DataTable();

        $('#datatable-scroller').DataTable({
          ajax: "js/datatables/json/scroller-demo.json",
          deferRender: true,
          scrollY: 380,
          scrollCollapse: true,
          scroller: true
        });

        $('#datatable-fixed-header').DataTable({
          fixedHeader: true
        });

        var $datatable = $('#datatable-checkbox');

        $datatable.dataTable({
          'order': [[ 1, 'asc' ]],
          'columnDefs': [
            { orderable: false, targets: [0] }
          ]
        });
        $datatable.on('draw.dt', function() {
          $('input').iCheck({
            checkboxClass: 'icheckbox_flat-green'
          });
        });

        TableManageButtons.init();
      });
    </script>
    <!-- /Datatables -->
  </body>
</html>