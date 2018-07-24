<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script src="js/jquery-2.1.3.min.js"></script>
<script type="text/javascript" src="js/fileUpload.js"></script>
</head>

<body>	
	
		<div id="fileUploader" class="fileUploadContent"></div>
	<br>
</body>
<script type="text/javascript">
	$("#fileUploader").initUpload({
		"uploadUrl" : "${pageContext.request.contextPath}/FileUploadServlet?id=${listtttt.id }",//上传文件信息地址
		"progressUrl" : "#",//获取进度信息地址，可选，注意需要返回的data格式如下（{bytesRead: 102516060, contentLength: 102516060, items: 1, percent: 100, startTime: 1489223136317, useTime: 2767}）
		"selfUploadBtId" : "selfUploadBt",//自定义文件上传按钮id
		"isHiddenUploadBt" : false,//是否隐藏上传按钮
		"isHiddenCleanBt" : false,//是否隐藏清除按钮
		"isAutoClean" : true,//是否上传完成后自动清除
		"velocity" : 10,//模拟进度上传数据
		"ismultiple" : true
	//"showSummerProgress":false,//总进度条，默认限制
	//"scheduleStandard":true,//模拟进度的方式，设置为true是按总进度，用于控制上传时间，如果设置为false,按照文件数据的总量,默认为false
	//"size":350,//文件大小限制，单位kb,默认不限制
	//"maxFileNumber":3,//文件个数限制，为整数
	//"filelSavePath":"C:/Users/cc/Workspaces/MyEclipse 2015/.metadata/.me_tcat7/webapps/TestProject/upload",//文件上传地址，后台设置的根目录
	//"beforeUpload":beforeUploadFun,//在上传前执行的函数
	//"onUpload":onUploadFun，//在上传后执行的函数
	// autoCommit:true,//文件是否自动上传
	//"fileType":['png','jpg','docx','doc']，//文件类型限制，默认不限制，注意写的是文件后缀

	});

	function beforeUploadFun(opt) {
		opt.otherData = [ {
			"name" : "你要上传的参数",
			"value" : "你要上传的值"
		} ];
	}
	function onUploadFun(opt, data) {
		uploadTools.uploadError(opt);//显示上传错误
	}
	function testUpload() {
		var opt = uploadTools.getOpt("fileUploader");
		uploadEvent.uploadFileEvent(opt);
	}

	function getFormData1() {
		var formData = formTake.getData("myform");
		alert(JSON.stringify(formData));
	}
	function getFormData2() {
		var formData = formTake.getDataWithUploadFile("myform");
		alert(JSON.stringify(formData));
	}
</script>
</html>
