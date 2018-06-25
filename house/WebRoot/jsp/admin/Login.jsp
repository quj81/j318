<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
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
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
        <script type="text/javascript">
           EvPNG.fix('div, ul, img, li, input, a'); 
        </script>
    <![endif]-->    
<title>登录</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/jsp/househome/js/jquery.1.8.2.min.js"></script>
</head>
<body> 
   <div id="box" style="width:100%;height:100%;border:1px solid white;background-image: url('${pageContext.request.contextPath}/jsp/househome/images/loginbackground.jpg')">
					        	<form >
					            <table border="0" style="width:370px; font-size:14px; margin-top:30px;" cellspacing="0" cellpadding="0">
					              <tr height="50" valign="top">
					              	<td width="55">&nbsp;</td>
					                <td>
					                	<span class="fl" style="font-size:24px;margin-left:75px;">登录</span>
					        
					                </td>
					              </tr>
					              <tr height="60">
					                <td>用户名</td>
					                <td><input type="text" value="" /></td>
					              </tr>
					              <tr height="70">
					                <td>密&nbsp; &nbsp; 码</td>
					                <td><input type="password" value="" /></td>
					              </tr>
					              <tr>
					              	<td>&nbsp;</td>
					                <td style="font-size:12px; padding-top:20px;">
					                	<span style="font-family:'宋体';" class="fl">
					                    	
					                    </span>
					                   
					                </td>
					              </tr>
					              <tr height="60">
					              	<td>&nbsp;</td>
					                <td><input type="submit" value="登录"  id="sub" style="margin-left:60px"/></td>
					              </tr>
					            </table>
					            </form>
</div>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#un").blur(function(){
		var a=$("#un").val()
			if(a==null||a==undefined||a==""){
				$("#unstate").html("<span style='color:red;'>用户名不能为空!</span>");
			}else{
				$("#unstate").html(" ");
			}
		});
		
		$("#pwd").blur(function(){
		var b=$("#pwd").val()
			if(b==null||b==undefined||b==""){
				$("#pwdstate").html("<span style='color:red;'>密码不能为空!</span>");
			}else{
				$("#pwdstate").html(" ");
			}
		});
		
		$("#forms").submit(function(){
	
			$.get(
				"${pageContext.request.contextPath}/LoginServlet",
				{"username":($("#un").val()),"password":($("#pwd").val())},
				function(data){
			if(data=="true"){
					window.location.href="${pageContext.request.contextPath}/jsp/admin/houseResource/HouseManage.jsp";
			}else if(data=="pwdfalse"){
					$("#pwdstate").html("<span style='color:red;'>密码错误!</span>");
			}else if(data=="unfalse"){
					$("#unstate").html("<span style='color:red;'>没有这个用户!</span>");
			}},
			"text"
			);
			return false;
		});
		
		
	});
	
	
</script>

</body>
</html>
