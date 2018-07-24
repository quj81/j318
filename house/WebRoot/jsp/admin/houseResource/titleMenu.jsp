<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- sidebar menu -->
                  <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="${path }/jsp/admin/images/img.jpg" alt="">${adminUser.userName}
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">
                    <li><a href="${pageContext.request.contextPath}">返回主頁</a></li>
                    <li><a href="${pageContext.request.contextPath}/HouseMessageServlet?type=zhuxiao"><i class="fa fa-sign-out pull-right"></i>注销登录</a></li>
                  </ul>
                </li>

