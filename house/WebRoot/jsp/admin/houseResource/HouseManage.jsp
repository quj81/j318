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
    
    <title>My JSP 'HouseManage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentellela Alela! | </title>

    <!-- Bootstrap -->
    <link href="${path }/jsp/admin/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${path }/jsp/admin/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${path }/jsp/admin/css/nprogress.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="${path }/jsp/admin/css/custom.min.css" rel="stylesheet">

    <link href="${path }/jsp/admin/css/select.css" rel="stylesheet" />
    <link href="${path }/jsp/admin/css/jquery.mCustomScrollbar.min.css" rel="stylesheet" />
	<link href="${path }/jsp/admin/css/fileUpload.css" rel="stylesheet" type="text/css">
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
          <div class="">



            <div class="row">

              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                <h2>房源发布</h2>
                    <!-- Tabs -->
                    <div id="wizard_verticle" class="form_wizard wizard_verticle">
                       <!--  <ul class="list-unstyled wizard_steps">
                          <li>
                            <a href="#step-11">
                              <span class="step_no">1</span>
                            </a>
                          </li>
                          <li>
                            <a href="#step-22">
                              <span class="step_no">2</span>
                            </a>
                          </li>
                          <li>
                            <a href="#step-33">
                              <span class="step_no">3</span>
                            </a>
                          </li>
                        </ul> -->

                        <div id="step-11">
                        <h2 class="StepTitle">基本资料</h2>
                        <form class="form-horizontal form-label-left" action="HouseMessageServlet" method="get">
                        <input type="hidden" type="hidden" name="type" value="add">
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3" for="first-name"><span class="required">*</span>楼盘名称
                            </label><span id="checkNamelp"></span>
                            <div class="col-md-6 col-sm-6">
                              <input type="text" name="houseName" id="houseName" required="required" class="form-control col-md-7 col-xs-12">

                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3" for="last-name"><span class="required">*</span>产权性质
                            </label>
                            <div class="vertical" id="chanquanxingzhi">
                              <select id="chanquanxz" name="chanquanxz">
                                <option value="1" selected="selected">请选择</option>
                              </select>
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="middle-name" class="control-label col-md-3 col-sm-3"><span class="required">*</span>类&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别</label>
                            <div class="col-md-6 col-sm-6">
                              <select id="leibie" name="leibie">
                                <option value="1" selected="selected">请选择</option>
                              </select>
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3" for="last-name"><span class="required">*</span>起&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价
                            </label><span id="moneyErr"></span>
                            <div class="col-md-6 col-sm-6">
                              <input type="text" id="money" name="qijia" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3" for="last-name"><span class="required">*</span>均&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;价
                            </label><span id="moneyErrTwo"></span>
                            <div class="col-md-6 col-sm-6">
                              <input type="text" id="moneytwo" name="junjia" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3" ><span class="required">*</span>地理位置
                            </label>
                            <div>
                              <select id="sheng" name="sheng">
                                <option value="0" selected="selected">请选择</option>
                              </select>
                              <select id="shi" name="shi">
                                <option value="0" selected="selected">请选择</option>
                              </select>
                              <select id="qu" name="qu">
                                <option value="0" selected="selected">请选择</option>
                              </select>
                            </div>
                            <div class="form-group" style="margin-top: 10px">
                              <label class="control-label col-md-3 col-sm-3" for="first-name"><span class="required">*</span>详细地址
                              </label><span id="addressErr"></span>
                              <div class="col-md-6 col-sm-6">
                                <input type="text" id="address" required="required" class="form-control col-md-7 col-xs-12" name="xiangxidizhi">
                              </div>
                            </div>

                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3" for="last-name"><span class="required">*</span>建筑面积
                            </label><span id="msg1"></span>
                            <div class="col-md-6 col-sm-6">
                              <input type="text" id="mia" name="mianji" required="required" class="form-control col-md-7 col-xs-12">
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="middle-name" class="control-label col-md-3 col-sm-3">&nbsp;开盘时间</label>
                            <div class="col-md-6 col-sm-6">
                              <input id="middle-name2" class="form-control col-md-7 col-xs-12" type="text" name="kaipan" onclick="laydate()">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3">&nbsp;交房时间
                            </label>
                            <div class="col-md-6 col-sm-6">
                              <input id="birthday2" class="date-picker form-control col-md-7 col-xs-12" name="jiaofang" required="required" type="text" onclick="laydatet()">
                            </div>
                          </div>
                          <div class="form-group">
                            <label for="middle-name" class="control-label col-md-3 col-sm-3"><span class="required">*</span>&nbsp;绿&nbsp;化&nbsp;率</label>%<span id="msg2"></span>
                            <div class="col-md-6 col-sm-6">
                              <input id="luhua" class="form-control col-md-7 col-xs-12" type="text" name="lvhualv">
                            </div>
                          </div>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3"><span class="required">*</span>&nbsp;容&nbsp;积&nbsp;率
                            </label>%<span id="rongmsg"></span>
                            <div class="col-md-6 col-sm-6">
                              <input id="rong" class="date-picker form-control col-md-7 col-xs-12" required="required" type="text" name="rongjilv">
                            </div>
                          </div>
                          <input type="submit" value="提交">
                        </form>
                   </div>
                        <!-- <div id="step-22">
                          <h2 class="StepTitle">图文信息</h2>
                          <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3">房源描述
                            </label>
                            <div class="col-md-6 col-sm-6">
                              <input id="birthday4" class="date-picker form-control col-md-7 col-xs-12 soBig" required="required" type="text">
                            </div>
                          </div>
                        </div>
												<div id="step-33">
                          <h2 class="StepTitle">图片上传</h2>
                          <div id="fileUploadContent" class="fileUploadContent"></div>
                          <br/>
                          <button onclick="testUpload()" style="color:white;font-size: 18px;float: right;background-color: #0099FF">开始上传</button><br/><br/><br/>
                          </div>
                        </div>
                    </div> -->
                    <!-- End SmartWizard Content -->
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
    <script src="${path }/jsp/admin/js/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="${path }/jsp/admin/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="${path }/jsp/admin/js/fastclick.js"></script>
    <!-- NProgress -->
    <script src="${path }/jsp/admin/js/nprogress.js"></script>
    <!-- jQuery Smart Wizard -->
    <script src="${path }/jsp/admin/js/jquery.smartWizard.js"></script>
    <!-- Custom Theme Scripts -->
    <script src="${path }/jsp/admin/js/custom.min.js"></script>
    <!--<script src="js/jquery-1.11.3.min.js"></script>-->
    <script src="${path }/jsp/admin/js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="${path }/jsp/admin/js/jquery.select.js"></script>

	<!-- 自己编写的jQuery -->
	<script type="text/javascript">
		/* 楼盘名称判断 */
		$(function(){
			$("#houseName").blur(function(){
				//读取输入的值
				var houseName=$(this).val();
				
				if(houseName.length == 0){
		            document.getElementById('checkNamelp').innerHTML="不可以为空".fontcolor("red");
		            return false;
	       		 }
				
				//服务端校验该楼盘名称是否存在
				$.post(
					"HouseMessageServlet",/* ${pageContext.request.contextPath}/ */
					{"type":"Checkname","name":houseName},
					function(data){
						var isExist =data.isExist;
						var noinfo="";
						if(isExist){
							noinfo="该楼盘已存在";
							$("#checkNamelp").css("color","red");
						}else{
							noinfo="√";
							$("#checkNamelp").css("color","green");
						}
						$("#checkNamelp").html(noinfo);
					},
					"json"
				);
			});
		/* -End 楼盘名称判断 -End*/
		
		//产权性质遍历 
		$.post(
				"HousePropertyServlet",
				{"type":"get"},
				function(data){
					var pin="";
					for(var i=0;i<data.length;i++){
						pin+="<option value="+data[i].id+">"+data[i].propertyType+"</option>"
					}
					$("#chanquanxz").html(pin);
				},
				"json"
			); 
		//End产权性质遍历End
			
		//房屋类型 
		$.post(
			"HouseTypeServlet",
			{"type":"get"},
			function(data){
				var pin="";
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
				var pin="<option value='0' selected='selected'>请选择</option>";
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
					var pin=" <option value='0' selected='selected'>请选择</option>";;
					for(var i=0;i<data.length;i++){
						pin+="<option value="+data[i].id+">"+data[i].townName+"</option>"
					}
					$("#shi").html(pin);
					var qu="<option value='0' selected='selected'>请选择</option>";
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
						var pin=" <option value='0' selected='selected'>请选择</option>";
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
		
		$("#money").blur(function(){
			var money = document.getElementById('money');
	        var moneyErr = document.getElementById('moneyErr');
	        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
	        if(money.value.length == 0){
	           moneyErr.innerHTML="起价不能为空".fontcolor("red");
	            return false;
	        }
	        if(!pattern.test(money.value)){
	            moneyErr.innerHTML="起价格式不正确".fontcolor("red");
	            return false;
	        } else{
	            moneyErr.innerHTML="√".fontcolor("green");
	            return true;
	        }
		})
        

	$("#moneytwo").blur(function(){
		var moneytwo = document.getElementById('moneytwo');
        var moneyErrTwo = document.getElementById('moneyErrTwo');
        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
        if(moneytwo.value.length == 0){
            moneyErrTwo.innerHTML="均价不能为空".fontcolor("red");
            return false;
        }
        if(!pattern.test(moneytwo.value)){
            moneyErrTwo.innerHTML="均价格式不正确".fontcolor("red");
            return false;
        } else{
            moneyErrTwo.innerHTML="√".fontcolor("green");
            return true;
        }
	})
        



	$("#address").blur(function(){
		var address = document.getElementById('address');
        var addressErr = document.getElementById('addressErr');
        if (address.value.length == 0) {
            addressErr.innerHTML = "地址不能为空".fontcolor("red");
            return false;
        }else{
            addressErr.innerHTML = "√".fontcolor("green");
        }
	})


	$("#mia").blur(function(){
		var mia = document.getElementById('mia');
        var msg1 = document.getElementById('msg1');
        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
        if(mia.value.length == 0){
            msg1.innerHTML="面积不能为空".fontcolor("red");
            return false;
        }
        if(!pattern.test(mia.value)){
            msg1.innerHTML="面积格式不正确".fontcolor("red");
            return false;
        } else{
            msg1.innerHTML="√".fontcolor("green");
            return true;
        }
	})
   
	$("#luhua").blur(function(){
	  	var luhua = document.getElementById('luhua');
        var msg2 = document.getElementById('msg2');
        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
        if(luhua.value.length == 0){
            msg2.innerHTML="绿化率不能为空".fontcolor("red");
            return false;
        }
        if(!pattern.test(mia.value)){
            msg2.innerHTML="绿化率格式不正确".fontcolor("red");
            return false;
        } else{
            msg2.innerHTML="√".fontcolor("green");
            return true;
        }
	})



	$("#rong").blur(function(){
		var rong = document.getElementById('rong');
        var rongmsg = document.getElementById('rongmsg');
        var pattern = /^[0-9]+([.]{1}[0-9]+){0,1}$/;
        if(rong.value.length == 0){
            rongmsg.innerHTML="容积率不能为空".fontcolor("red");
            return false;
        }
        if(!pattern.test(mia.value)){
            rongmsg.innerHTML="容积率格式不正确".fontcolor("red");
            return false;
        } else{
            rongmsg.innerHTML="√".fontcolor("green");
            return true;
        }
	})

		
	</script>

	<!-- 时间插件 -->
	<script src="${path }/jsp/admin/unit/laydate/laydate.js"></script>
	<script>
		;!function () {
			laydate({
				elem : '#birthday2'
			});
		}();
	</script>
	<!-- end时间插件end -->
	
	
	<!-- 自己编写的jQuery End -->



    <script type="text/javascript">
      $(function () {
        $("#mySelect").select({
          width: "200px"
        });
      });
    </script>
    <!-- jQuery Smart Wizard -->
    <script>
      $(document).ready(function() {
        $('#wizard').smartWizard();

        $('#wizard_verticle').smartWizard({
          transitionEffect: 'slide'
        });

        $('.buttonNext').addClass('btn btn-success');
        $('.buttonPrevious').addClass('btn btn-primary');
        $('.buttonFinish').addClass('btn btn-default');
      });
    </script>
    <!-- /jQuery Smart Wizard -->
  </body>
</html>
<script type="text/javascript" src="${path }/jsp/admin/js/fileUpload.js"></script>
<script type="text/javascript">
/* 

    $("#fileUploadContent").initUpload({
        "uploadUrl":"#",//上传文件信息地址
        "progressUrl":"#",//获取进度信息地址，可选，注意需要返回的data格式如下（{bytesRead: 102516060, contentLength: 102516060, items: 1, percent: 100, startTime: 1489223136317, useTime: 2767}）
        "selfUploadBtId":"selfUploadBt",//自定义文件上传按钮id
        "isHiddenUploadBt":false,//是否隐藏上传按钮
        "isHiddenCleanBt":false,//是否隐藏清除按钮
        "isAutoClean":false,//是否上传完成后自动清除
        "velocity":10,//模拟进度上传数据
        //"rememberUpload":true,//记住文件上传
       // "showFileItemProgress":false,
        //"showSummerProgress":false,//总进度条，默认限制
        //"scheduleStandard":true,//模拟进度的方式，设置为true是按总进度，用于控制上传时间，如果设置为false,按照文件数据的总量,默认为false
        //"size":350,//文件大小限制，单位kb,默认不限制
        //"maxFileNumber":3,//文件个数限制，为整数
        //"filelSavePath":"",//文件上传地址，后台设置的根目录
        //"beforeUpload":beforeUploadFun,//在上传前执行的函数
        "onUpload":onUploadFun,//在上传后执行的函数
         //autoCommit:true,//文件是否自动上传
        //"fileType":['png','jpg','docx','doc']，//文件类型限制，默认不限制，注意写的是文件后缀

    });

    function beforeUploadFun(opt){
        opt.otherData =[{"name":"你要上传的参数","value":"你要上传的值"}];
    }
    function onUploadFun(opt,data){
        alert(data);
        uploadTools.uploadError(opt);//显示上传错误
    }
    function testUpload(){
        var opt = uploadTools.getOpt("fileUploadContent");
        uploadEvent.uploadFileEvent(opt);
    }
    function tt() {
        var opt = uploadTools.getOpt("fileUploadContent");
        uploadTools.uploadError(opt);//显示上传错误
    }

    //显示文件，设置删除事件
    uploadTools.showFileResult("fileUploadContent","","1",true,deleteFileByMySelf);
    //如果不需要删除
    uploadTools.showFileResult("fileUploadContent","","1",false);
    //多文件需要自己进行循环
    function deleteFileByMySelf(fileId){
        alert("要删除文件了："+fileId);
    }
 */

</script>