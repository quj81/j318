<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <h3>&nbsp;Old Dog</h3>
                <ul class="nav side-menu">
                  <!-- <li><a><i class="fa fa-home"></i> 用户 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="index.html">Dashboard</a></li>
                      <li><a href="index2.html">Dashboard2</a></li>
                      <li><a href="index3.html">Dashboard3</a></li>
                    </ul>
                  </li> -->

                  <li><a><i class="fa fa-desktop"></i> 首页管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="${pageContext.request.contextPath}/HouseIndextypeServlet?type=get">楼盘类型显示</a></li>
                      <li><a href="${pageContext.request.contextPath}/HouseIndextypeServlet?type=get1">楼盘热门显示</a></li>
                      <li><a href="${pageContext.request.contextPath}/HouseIndextypeServlet?type=get2">资讯显示</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> 房屋管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                       	<li><a href="${pageContext.request.contextPath}/HouseMessageServlet?type=allget">房源查看</a></li>
                        <li><a href="${pageContext.request.contextPath}/jsp/admin/houseResource/HouseManage.jsp">房源发布</a></li>
                        <li><a href="tables_dynamic.html">楼盘类型管理</a></li>
                        <li><a href="tables_dynamic1.html">装修状态管理</a></li>
                        <li><a href="tables_dynamic2.html">楼盘状态管理</a></li>
                        <li><a href="tables_dynamic3.html">产权类型管理</a></li>
                        <li><a href="tables_dynamic4.html">省级列表管理</a></li>
                        <li><a href="tables_dynamic5.html">市级列表管理</a></li>
                        <li><a href="tables_dynamic6.html">区域列表管理</a></li>
                      </li>
                    </ul>
                    <li><a><i class="fa fa-desktop"></i> 资讯管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="${pageContext.request.contextPath}/jsp/admin/news/News.jsp">资讯列表</a></li>
                      <li><a href="${pageContext.request.contextPath}/jsp/admin/news/AddNews.jsp">添加资讯</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
            </div>
<!-- /sidebar menu -->
