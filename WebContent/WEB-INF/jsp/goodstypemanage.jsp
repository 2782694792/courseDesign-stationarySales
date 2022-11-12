<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itheima" uri="http://itheima.com/common/"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<link rel="shortcut icon" href="/images/郑烁彬公众号：UnseeR.ico" mce_href="/images/郑烁彬公众号：UnseeR.ico" type="image/x-icon">
<!-- <script type="text/javascript">
		alert("登录成功！欢迎进入文具系统管理！");
	</script> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文具系统管理-SSM</title>
<!-- 引入css样式文件 -->
<!-- Bootstrap Core CSS -->
<link href="<%=basePath%>css/bootstrap.min.css" rel="stylesheet" />
<!-- MetisMenu CSS -->
<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet" />
<!-- DataTables CSS -->
<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet" />
<!-- Custom CSS -->
<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet" />
<!-- Custom Fonts -->
<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet"
	type="text/css" />
<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<div id="wrapper">
		<!-- 导航栏部分 -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<a class="navbar-brand" href="<%=basePath%>/togoodstypemanage.action">文具销售系统</a>
			</div>
			<!-- 导航栏右侧图标部分 -->
			<ul class="nav navbar-top-links navbar-right">
				<!-- 邮件通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i
						class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-messages">
						<li><a href="#">
								<div>
									<strong>郑烁彬</strong> <span class="pull-right text-muted">
										<em>实训</em>
									</span>
								</div>
								<div>空指针问题解决了两天，但是彻底搞懂整个程序运行原理</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>查看全部消息</strong>
								<i class="fa fa-angle-right"></i>
						</a></li>
					</ul></li>
				<!-- 邮件通知 end -->
				<!-- 任务通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-tasks">
						<li><a href="#">
								<div>
									<p>
										<strong>文具类型——增</strong> <span class="pull-right text-muted">完成20%</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-success"
											role="progressbar" aria-valuenow="20" aria-valuemin="0"
											aria-valuemax="100" style="width: 20%">
											<span class="sr-only">完成20%</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<p>
										<strong>文具类型——删</strong> <span class="pull-right text-muted">完成40%</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-success"
											role="progressbar" aria-valuenow="40" aria-valuemin="0"
											aria-valuemax="100" style="width: 40%">
											<span class="sr-only">完成40%</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<p>
										<strong>文具类型——改</strong> <span class="pull-right text-muted">完成60%</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="60" aria-valuemin="0" aria-valuemax="60"
											style="width: 60%">
											<span class="sr-only">完成60%</span>
										</div>
									</div>
								</div>
						</a></li>
						<li><a href="#">
								<div>
									<p>
										<strong>文具类型——查</strong> <span class="pull-right text-muted">完成80%</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
											style="width: 80%">
											<span class="sr-only">完成80%</span>
										</div>
									</div>
								</div>
						</a></li>
						<li><a href="#">
								<div>
									<p>
										<strong>文具类型——功能SSM</strong> <span
											class="pull-right text-muted">完成100%</span>
									</p>
									<div class="progress progress-striped active">
										<div class="progress-bar progress-bar-info" role="progressbar"
											aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"
											style="width: 100%">
											<span class="sr-only">完成100%</span>
										</div>
									</div>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>查看所有任务</strong>
								<i class="fa fa-angle-right"></i>
						</a></li>
					</ul></li>
				<!-- 任务通知 end -->
				<!-- 消息通知 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-alerts">
						<li><a href="#">
								<div>
									<i class="fa fa-comment fa-fw"></i> 新回复————计信学院 <span
										class="pull-right text-muted small">2018分钟之前</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-envelope fa-fw"></i> 新消息————计科专业 <span
										class="pull-right text-muted small">350分钟之前</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-tasks fa-fw"></i> 新任务————3班郑烁彬 <span
										class="pull-right text-muted small">10分钟之前</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">
								<div>
									<i class="fa fa-upload fa-fw"></i> 做综合实训 <span
										class="pull-right text-muted small">349分钟之前</span>
								</div>
						</a></li>
						<li class="divider"></li>
						<li><a class="text-center" href="#"> <strong>查看所有提醒</strong>
								<i class="fa fa-angle-right"></i>
						</a></li>
					</ul></li>
				<!-- 消息通知 end -->
				<!-- 信息和系统设置 start -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i>
								&nbsp;ID：<b>${admin_session.admin_id}</b><br>
								&nbsp;&nbsp;&nbsp;用户：<b>${admin_session.admin_name}</b><br>
								&nbsp;&nbsp;&nbsp;账号：<b>${admin_session.admin_account}</b> </a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i>系统设置</a></li>
						<li class="divider"></li>
						<li><a
							href="${pageContext.request.contextPath }/toadminlogout.action">
								<i class="fa fa-sign-out fa-fw"></i>退出登录
						</a></li>
					</ul></li>
				<!-- 信息和系统设置结束 -->
			</ul>
			<!-- 左侧显示列表部分 start-->
			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="查询内容...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
									</button>
								</span>
							</div>
						</li>
						<li><a
							href="${pageContext.request.contextPath }/goodstype/list.action"
							class="active"> <i class="fa fa-edit fa-fw"></i> 文具类型管理
						</a></li>
						<li><a href="${pageContext.request.contextPath }/goods/list.action"
							class="active"> <i class="fa fa-edit fa-fw"></i>
								文具管理
						</a></li>
						<li><a href="#"> <i class="fa fa-dashboard fa-fw"></i>
								积分兑换商城管理
						</a></li>
						<li><a href="#"> <i class="fa fa-dashboard fa-fw"></i>
								订单管理
						</a></li>
						<li><a href="#"> <i class="fa fa-dashboard fa-fw"></i>
								员工管理
						</a></li>
						<li><a href="#"> <i class="fa fa-dashboard fa-fw"></i>
								顾客管理
						</a></li>
						<li><a href="#"> <i class="fa fa-dashboard fa-fw"></i>
								顶层文具类型管理
						</a></li>
						<li><a href="#"> <i class="fa fa-dashboard fa-fw"></i>
								统计分析
						</a></li>
						<li><a href="#"> <i class="fa fa-dashboard fa-fw"></i>
								待开发功能
						</a></li>
					</ul>
				</div>
			</div>
			<!-- 左侧显示列表部分 end-->
		</nav>
		<!-- 顾客列表查询部分  start-->
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">文具类型管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" method="get"
						action="${pageContext.request.contextPath}/goodstype/list.action">
						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label for="gt_id0">文具类型ID:</label>
							<select class="form-control" id="gt_id0" name="gt_id">
								<option value="">--请选择--</option>
								<c:forEach items="${gtidtype}" var="goodstype">
									<option value="${goodstype.gt_id}"
										<c:if test="${goodstype.gt_id == gt_id}">selected</c:if>>
										${goodstype.gt_id}</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label for="gt_about0">文具类型内容简介:</label>
							<input type="text" class="form-control" id="gt_about0"
								value="${gt_about}" name="gt_about" />
						</div>
						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label for="gt_name0">文具类型名称:</label>
							<select class="form-control" id="gt_name0" name="gt_name">
								<option value="">--请选择--</option>
								<c:forEach items="${gtnametype}" var="goodstype">
									<option value="${goodstype.gt_name}"
										<c:if test="${goodstype.gt_name == gt_name}">selected</c:if>>
										${goodstype.gt_name}</option>
								</c:forEach>
							</select>
						</div>
						&nbsp;&nbsp;&nbsp;
						<button type="submit" class="btn btn-primary">查询</button>
					</form>
				</div>
			</div>
			<a href="#" class="btn btn-primary" data-toggle="modal"
				data-target="#newgoodstypeDialog" onclick="clearGoodsType()">新建</a>
			<div class="row" style="padding: 7px 0 0 0;">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">文具类型信息列表</div>
						<!-- 列表头信息 -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>类型ID</th>
									<th>类型名称</th>
									<th>内容简介</th>
									<th width = 102px">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${page.rows}" var="goodstyperow">
									<tr>
										<td>${goodstyperow.gt_id}</td>
										<td>${goodstyperow.gt_name}</td>
										<td>${goodstyperow.gt_about}</td>
										<td><a href="#" class="btn btn-primary btn-xs"
											data-toggle="modal" data-target="#goodstypeEditDialog"
											style="width: 40px; height: 25px; align: center; padding: 2px 0 0 0"
											onclick="updateGoodsType(this)">修改&nbsp;</a> 
											<a href="#"
											class="btn btn-danger btn-xs" onclick="deleteGoodsType(this)"
											style="width: 40px; height: 25px; align: center; padding: 2px 0 0 0">删除&nbsp;</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<%-- <span>共 ${goodstypepage.total} 条数据</span> <span >第 ${goodstypepage.page} 页</span> <span>共 ${goodstypepage.rows} 页</span> 
							<ul class="pagination">
								<li><a href="${pageContext.request.contextPath}/goodstype/list.action?page=1&size=5" aria-label="Previous">首页</a></li>
								<li><a href="${pageContext.request.contextPath}/goodstype/list.action?page=${pageInfoslist.pageNum-1}&size=5">上一页</a></li>
								<c:forEach begin="1" end="${pageInfoslist.pages}" var="pageNum">
									<li><a href="${pageContext.request.contextPath}/goodstype/list.action?page=${pageNum}&size=5">${pageNum}</a></li>
								</c:forEach>
								<li><a href="${pageContext.request.contextPath}/goodstype/list.action?page=${pageInfoslist.pageNum+1}&size=5">下一页</a></li>
								<li><a href="${pageContext.request.contextPath}/goodstype/list.action?page=${pageInfoslist.pages}&size=5" aria-label="Next">尾页</a></li>
							</ul>
							<shuobin:page url="${pageContext.request.contextPath }/goodstype/list.action?custName=${vo.custName }&custSource=${vo.custSource }" bean="goodstypepage" number=""></common:page>
							 --%>
						<div class="col-md-12 text-right">
							<ul class="pagination">
								<span>总记录数：${page.total}</span>&nbsp;&nbsp;&nbsp;
								<span>第 ${page.page}/${page.maxpageNum} 页</span>&nbsp;&nbsp;&nbsp;
								<span>每页显示：${page.size}</span>
								<itheima:page
									url="${pageContext.request.contextPath}/goodstype/list.action" />
							</ul>
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
		</div>
		<!-- 客户列表查询部分  end-->
	</div>
	<!-- 创建    模态框 -->
	<div class="modal fade" id="newgoodstypeDialog" tabindex="-1"
		role="dialog" aria-labelledby="goodstypeModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="goodstypeModalLabel">新建文具类型信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="new_goodstype_form">
						<%-- <div class="form-group">
							<label for="new_gt_id"
								style="float: left; padding: 7px 20px 0 28px;">&nbsp;&nbsp;&nbsp;&nbsp;ID&nbsp;&nbsp;&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<select class="form-control" id="new_gt_id" name="gt_id">
									<option value="">--请选择--</option>
									<c:forEach items="${gtidtype}" var="newgoodstype">
										<option value="${newgoodstype.gt_id}"
											<c:if test="${newgoodstype.gt_id == gt_id}">selected</c:if>>
											${newgoodstype.gt_id}</option>
									</c:forEach>
								</select>
							</div>
						</div> --%>
						<div class="form-group">
							<label for="new_gt_id"
								style="float: left; padding: 7px 20px 0 28px;">&nbsp;&nbsp;&nbsp;&nbsp;ID&nbsp;&nbsp;&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_gt_id"
									placeholder="文具类型编号id" name="gt_id" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_gt_about"
								style="float: left; padding: 7px 20px 0 18px;">内容简介</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_gt_about"
									placeholder="文具类型内容简介about" name="gt_about" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_gt_name"
								style="float: left; padding: 7px 20px 0 16px;">&nbsp;&nbsp;&nbsp;&nbsp;名称&nbsp;&nbsp;&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_gt_name"
									placeholder="文具类型名称name" name="gt_name" />
							</div>
						</div>
						<%-- <div class="form-group">
							<label for="new_gt_name"
								style="float: left; padding: 7px 20px 0 16px;">&nbsp;&nbsp;&nbsp;&nbsp;名称&nbsp;&nbsp;&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<select class="form-control" id="new_gt_name" name="gt_name">
									<option value="">--请选择--</option>
									<c:forEach items="${gtnametype}" var="newgoodstype">
										<option value="${newgoodstype.gt_name}"
											<c:if test="${newgoodstype.gt_name == gt_name}">selected</c:if>>
											${newgoodstype.gt_name}</option>
									</c:forEach>
								</select>
							</div>
						</div> --%>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						onclick="createGoodsType()">创建</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 修改    模态框 -->
	<div class="modal fade" id="goodstypeEditDialog" tabindex="-1"
		role="dialog" aria-labelledby="goodstypeModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="goodstypeModalLabel">修改文具类型信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_goodstype_form">
						<!-- id隐藏或只读----start -->
						<div class="form-group">
							<label for="edit_gt_id" class="col-sm-2 control-label">ID:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_gt_id"
									placeholder="文具类型id-12字符" name="gt_id" readonly/>
							</div>
						</div>
						<!-- <input type="hidden" id="edit_gt_id" name="gt_id" /> -->
						<!-- id隐藏----end -->
						<div class="form-group">
							<label for="edit_gt_name" class="col-sm-2 control-label">名称:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_gt_name"
									placeholder="文具类型名称name-25字符" name="gt_name" />
							</div>
						</div>
						<div class="form-group">
							<label for="edit_gt_about" class="col-sm-2 control-label">内容简介:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_gt_about"
									placeholder="文具类型内容简介about-1000字符" name="gt_about" />
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						onclick="updateGoodsType2(this)">保存修改</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 引入js文件 -->
	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery-1.11.3.min.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>
	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	<!-- 编写js代码 -->
	<script type="text/javascript">
	//清空新建数据
	function clearGoodsType() {
	    $("#new_gt_id").val("");
	    $("#new_gt_name").val("");
	    $("#new_gt_about").val("");
	};
	// 创建
	function createGoodsType() {
		$.post("<%=basePath%>goodstype/create.action",
		$("#new_goodstype_form").serialize(),function(data){
	        if(data =="OK"){
	            alert("文具类型创建成功！");
	            window.location.reload();
	        }else{
	            alert("文具类型创建失败！");
	            window.location.reload();
	        }
	    });
	};
	// 点击事件展示获取的信息
	/* $("#updateGoodsTypeButton").click(function(){
		var id = console.log($(this).attr("gtid")); 
		alert("                     >>数据准备："+id+"<<");
		updateGoodsType(id);
    }); */
	// 通过id获取信息
	function updateGoodsType(e) {
		var id = $(e).parent().parent().find("td").eq(0).text();
	    $.ajax({
	        type:"get",/* 传入的类型 */
	        url:"<%=basePath%>goodstype/selectById.action",
	        data:{"id":id},
	        dataType:"json",
	        contentType:"application/json; charset=utf-8",
	        /* data:JSON.stringify(questionData), */
	        success:function(data) {
	        	alert("                                >>传递数据成功<<");
	            $("#edit_gt_id").val(data.gt_id);
	            $("#edit_gt_name").val(data.gt_name);
	            $("#edit_gt_about").val(data.gt_about);
	        },
	        error:function(data) {      //返回失败时的执行函数
	        	alert("                              传递数据失败!!!——"+id);
	        },
	        beforeSend:function () {  
	            //一般进行表单验证，在发送数据之前执行的函数
	        	alert("                           传递文具类型数据信息>>>>>>");
	        }
	    });
	};
    // 修改
	function updateGoodsType2(e) {
    	var edit_name = $("#edit_gt_id").val();
    	if(edit_name.length > 50){
    		alert("名称长度超过50字节，请重新修改！");
    	}
		$.post("<%=basePath%>goodstype/update.action",
		$("#edit_goodstype_form").serialize(),function(data){
			if(data =="OK"){
				alert("文具类型更新成功！");
				window.location.reload();
			}else if(data == "FAIL"){
				alert("输入不规范，更新失败！");
				window.location.reload();
			}else{
				alert("输入不规范，更新失败！");
				window.location.reload();
			}
		});
	};
	// 删除
	function deleteGoodsType(e) {
		var id = $(e).parent().parent().find("td").eq(0).text();
		var name = $(e).parent().parent().find("td").eq(1).text();
		var about = $(e).parent().parent().find("td").eq(2).text();
	    if(confirm('文具类型：\n'
	    		  +'\t\t\t编号：   '+id+'\n'
	    		  +'\t\t\t名称：   '+name+'\n'
	    		  +'\t\t内容简介： '+about+'\n\n'
	    		  +'确实要删除该文具类型吗?')) {
	    	$.post("<%=basePath%>goodstype/delete.action", {"id":id},
			function(data) {
					if (data == "OK") {
						alert(">>>>>文具类型删除成功");
						window.location.reload();
					} else {
						alert("文具类型删除失败！——"+id+"——"+data);
						window.location.reload();
					}
				});
			}
		}
	</script>
</body>
</html>