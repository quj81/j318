<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'Login.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="css/style.css" />
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
        <script type="text/javascript">
           EvPNG.fix('div, ul, img, li, input, a'); 
        </script>
    <![endif]-->    
    <script type="text/javascript" src="js/jquery-1.11.1.min_044d0927.js"></script>
	<script type="text/javascript" src="js/jquery.bxslider_e88acd1b.js"></script>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>    
	<script type="text/javascript" src="js/select.js"></script>
	<script type="text/javascript" src="js/lrscroll.js"></script>
    <script type="text/javascript" src="js/iban.js"></script>
    <script type="text/javascript" src="js/fban.js"></script>
    <script type="text/javascript" src="js/f_ban.js"></script>
    <script type="text/javascript" src="js/mban.js"></script>
    <script type="text/javascript" src="js/bban.js"></script>
    <script type="text/javascript" src="js/hban.js"></script>
    <script type="text/javascript" src="js/tban.js"></script>
	<script type="text/javascript" src="js/lrscroll_1.js"></script>
    
    
<title>登录</title>
</head>
<body>  

    	<c:choose>
		      	<c:when test="${empty sessionScope.user}">
		      		<div class="log_bg">	
					    <div class="top">
					     
					    </div>
						<div class="login">
					    	
							<div class="log_c">
					        	<form action=Login method="post">
					            <table border="0" style="width:370px; font-size:14px; margin-top:30px;" cellspacing="0" cellpadding="0">
					              <tr height="50" valign="top">
					              	<td width="55">&nbsp;</td>
					                <td>
					                	<span class="fl" style="font-size:24px;">登录</span>
					                    <span class="fr">还没有所登录的账号，<a href="Regist.jsp" style="color:#ff4e00;">立即注册</a></span>
					                </td>
					              </tr>
					              <tr height="70">
					                <td>用户名</td>
					                <td><input type="text" value="" class="l_user" name="uname"/></td>
					              </tr>
					              <tr height="70">
					                <td>密&nbsp; &nbsp; 码</td>
					                <td><input type="password" value="" class="l_pwd" name="pwd"/></td>
					              </tr>
					              <tr>
					              	<td>&nbsp;</td>
					                <td style="font-size:12px; padding-top:20px;">
					                	<span style="font-family:'宋体';" class="fl">
					                    	<label class="r_rad"><input type="checkbox" /></label><label class="r_txt">请保存我这次的登录信息</label>
					                    </span>
					                    <span class="fr"><a href="#" style="color:#ff4e00;">忘记密码</a></span>
					                </td>
					              </tr>
					              <tr height="60">
					              	<td>&nbsp;</td>
					                <td><input type="submit" value="登录" class="log_btn" /></td>
					              </tr>
					            </table>
					            </form>
					        </div>
					    </div>
					</div>
			
		      	</c:when>
     		<c:otherwise>
     			<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
				<script type="text/javascript">
					  window.onload=function(){
					  			location.href="LoginSucceed.jsp"
					  }
				  </script>
     		</c:otherwise>
     	</c:choose>


</body>

</html>
