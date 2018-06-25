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
    <script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="js/jquery.bxslider_e88acd1b.js"></script>
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
	<script src="js/jquery.validate.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
	<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
	<!-- 表单验证 -->
<title>注册页面</title>
</head>
<body>  

<div class="log_bg">	
    <div class="top">
        
    </div>
	<div class="regist">
    	
		<div class="reg_c">
        	<form id="myform1" action=Regist method="post">
            <table border="0" style="width:420px; font-size:14px; margin-top:20px;" cellspacing="0" cellpadding="0">
              <tr height="50" valign="top">
              	<td width="95">&nbsp;</td>
                <td>
                	<span class="fl" style="font-size:24px;">注册</span>
                    <span class="fr">已经有需要登录账号，<a href="Login.jsp" style="color:#ff4e00;">我要马上登录</a></span>
                </td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;用户名 &nbsp;</td>
                <td><input type="text" value="" class="l_user" name="uname" placeholder="用户名大于4位字符" required pattern ="[a-zA-Z0-9]{3,15}"/></td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;密码 &nbsp;</td>
                <td><input type="password" value="" class="l_pwd" name="pwd"  required pattern ="[a-zA-Z0-9]{4,16}" placeholder="密码大于4位小于16位"/></td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;确认密码 &nbsp;</td>
                <td><input type="password" value="" class="l_pwd" id="qpwd" name="qpwd" placeholder="请再次输入密码"/></td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;邮箱 &nbsp;</td>
                <td><input type="email" value="" class="l_email" name="email" required pattern ="/[a-zA-Z_]{1,}[0-9]{0,}@([a-zA-z0-9]){1,}\.)[a-zA-z\-]{1,}" placeholder="以任意字符开头含有@和.以2到3位字符结尾"/></td>
              </tr>
              <tr height="50">
                <td align="right"><font color="#ff4e00">*</font>&nbsp;手机 &nbsp;</td>
                <td><input type="text" value="" class="l_tel" name="phone" required pattern ="1\d{10}" placeholder="以1开头的11位电话号码"/></td>
              </tr>
              <tr height="50">
                <td align="right">您的真实姓名 &nbsp;</td>
                <td><input type="text" value="" class="l_mem" name="hname" placeholder="请输入您的真实姓名"/></td>
              </tr>
              <tr height="50">
                <td align="right">邀请人ID号 &nbsp;</td>
                <td><input type="text" value="" class="l_num" name="hid" placeholder="请输入邀请人ID号"/></td>
              </tr>
              <!-- <tr height="50">
                <td align="right"> <font color="#ff4e00">*</font>&nbsp;验证码 &nbsp;</td>
                <td>
               		<input type="text" value="" class="l_ipt" />
                    <a href="#" style="font-size:12px; font-family:'宋体';">换一张</a>
                	<img alt="验证码丢失了" src="check" onclick="huan(this)">
                </td>
              </tr> -->
              <tr>
              	<td>&nbsp;</td>
                <td style="font-size:12px; padding-top:20px;">
                	<span style="font-family:'宋体';" class="fl">
                    	<label class="r_rad"><input type="checkbox" /></label><label class="r_txt">我已阅读并接受《用户协议》</label>
                    </span>
                </td>
              </tr>
              <tr height="60">
              	<td>&nbsp;</td>
                <td><input type="submit" value="立即注册" class="log_btn" class="btn"/></td>
              </tr>
            </table>
            </form>
        </div>
    </div>
</div>

<script>

	//alert("${checkcode_session}");
	window.onload=function(){
		
	
	}
	
	
	function huan(obj){
		obj.src="check?time="+new Date().getTime();
	}

</script>

</body>
<script>
	$(function() {
		$(".btn").click(function () {
			var u = document.getElementById("uname");
			if (u.validity.valueMissing == true) {
				u.setCustomValidity("注册用户不能为空");
			} else if(u.validity.patternMismatch==true){
				u.setCustomValidity("昵称是4-16位字符");
			}else{
				u.setCustomValidity("");
			}
		});
		$(".btn").click(function () {
			var p = document.getElementById("pwd");
			if (p.validity.valueMissing == true) {
				p.setCustomValidity("密码不能为空");
			} else if(p.validity.patternMismatch==true){
				p.setCustomValidity("密码长度为4-14字符");
			}else{
				p.setCustomValidity("");
			}
		});
		$("#password1").click(function () {
			pas1=document.getElementById("pwd").value;
			pas2=document.getElementById("qpwd").value;
			if(!(pas1==pas2)&&pas2==""){
				$(this).css("border","1px solid red");
			}else{
						$(this).css("border","1px solid green");
				}
		});

		$(".btn").click(function () {
			var m = document.getElementById("phone");
			if (m.validity.valueMissing == true) {
				m.setCustomValidity("手机号为空");
			} else if(m.validity.patternMismatch==true){
				m.setCustomValidity("手机号号码是以1开头的11位数号码");
			}else{
				m.setCustomValidity("");
			}
		});
		$(".btn").click(function () {
			var e = document.getElementById("email");
			if (e.validity.valueMissing == true) {
				e.setCustomValidity("邮箱号为空");
			} else if(e.validity.patternMismatch==true){
				e.setCustomValidity("以任意字符开头含有@和.以2到3位字符结尾");
			}else{
				e.setCustomValidity("");
			}
		});
	});
	
</script>



</html>

