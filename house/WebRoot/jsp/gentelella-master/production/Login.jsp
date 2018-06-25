<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登录 </title>

    <!-- Bootstrap -->
    <link href="../vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="../vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="../vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
 

    <!-- Custom Theme Style -->
    <link href="../build/css/custom.min.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jsp/househome/js/jquery.1.8.2.min.js"></script>
  </head>

  <body class="login">
    <div>
      <a class="hiddenanchor" id="signup"></a>
      <a class="hiddenanchor" id="signin"></a>

      <div class="login_wrapper">
        <div class="animate form login_form">
          <section class="login_content">
            <form action="#"  method="post" id="forms" >
              <h1>登录</h1>
              <div>
               <span id="unstate">UserName.请输入用户名:</span>
               <input type="text" class="form-control" value=""  required="" id="un" name="uname"/>
               
              </div>
              <div>
               <span id="pwdstate">PassWord.请输入密码:</span>
                <input type="password" class="form-control" value=""  required=""  id="pwd" name="pwd"/>
                
              </div>
              <div>
                <a class="btn btn-default submit" id="sub" >登录</a>
              </div>

              <div class="clearfix"></div>

              <div class="separator">

                <div class="clearfix"></div>
                <br />

                <div>
                  <h1><i class="fa fa-paw"></i> J318</h1>
                  <p>©2018 All Rights Reserved. login is a J318 template. Privacy and Terms</p>
                </div>
              </div>
            </form>
 <script type="text/javascript">
	$(document).ready(function(){
		
		$("#un").blur(function(){
		var a=$("#un").val()
			if(a==null||a==undefined||a==""){
				$("#unstate").html("<span style='color:red;'>用户名不能为空!</span>");
			}else{
				$("#unstate").html("正常");
			}
		});
		
		$("#pwd").blur(function(){
		var b=$("#pwd").val()
			if(b==null||b==undefined||b==""){
				$("#pwdstate").html("<span style='color:red;'>密码不能为空!</span>");
			}else{
				$("#pwdstate").html("正常");
			}
		});
		
		$("#sub").click(function(){
	
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
          </section>
        </div>
      </div>
    </div>
  </body>
</html>
