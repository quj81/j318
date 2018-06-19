<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
  <script type="text/javascript">
  window.onload=function(){
  	var time=4;
  	var secondEle=document.getElementById("second");
  	var inter=setInterval(function(){
  		secondEle.innerHTML=time;
  		time--;
  		if(time==0){
  			location.href="Index"
  			clearInterval(inter);
  		}
  	},1000);
  }
  </script>
    <base href="<%=basePath%>">
    
    <title>注册成功</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
    	恭喜您注册成功!<span style="color:red" id="second">5</span>如不跳转请点击<a href="Index">这里</a>
  </body>
</html>
