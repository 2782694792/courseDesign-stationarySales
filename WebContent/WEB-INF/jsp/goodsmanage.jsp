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
<link rel="icon"  href="/images/郑烁彬公众号：UnseeR.ico" type="image/x-ico">     
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
				<a class="navbar-brand" href="<%=basePath%>/goods/list.action">文具销售系统</a>
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
								<div>正在进行————文具管理—————，开发用时半天</div>
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
										<strong>文具——增</strong> <span class="pull-right text-muted">完成20%</span>
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
										<strong>文具——删</strong> <span class="pull-right text-muted">完成40%</span>
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
										<strong>文具——改</strong> <span class="pull-right text-muted">完成60%</span>
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
										<strong>文具——查</strong> <span class="pull-right text-muted">完成80%</span>
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
										<strong>文具——功能SSM</strong> <span class="pull-right text-muted">完成100%</span>
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
						<li><a
							href="${pageContext.request.contextPath }/goods/list.action"
							class="active"> <i class="fa fa-edit fa-fw"></i> 文具管理
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
								顶层文具管理
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
		<!-- 列表查询部分  start-->
		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">文具管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-inline" method="get"
						action="${pageContext.request.contextPath}/goods/list.action">
						<div align="center"><div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label for="g_id0">文具ID</label>
							<select class="form-control" id="g_id0" name="g_id">
								<option value="">--请选择--</option>
								<c:forEach items="${gidtype}" var="goods">
									<option value="${goods.g_id}"
										<c:if test="${goods.g_id == g_id}">selected</c:if>>
										${goods.g_id}</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label for="g_gtid0">文具类型ID:</label>
							<select class="form-control" id="g_gtid0" name="g_gtid">
								<option value="">--请选择--</option>
								<c:forEach items="${ggtidtype}" var="goods"> 
									<option value="${goods.g_gtid}"
										<c:if test="${goods.g_gtid == g_gtid}">selected</c:if>>
										${goods.g_gtid}</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label for="g_name0">文具名称:</label>
							<input type="text" class="form-control" id="g_name0"
								value="${g_name}" name="g_name" />
						</div>
						<!-- 最小 -->
						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label for="minprice0">价格范围:</label>
							<input type="text" class="form-control" id="minprice0" style="width:50px"
								value="${minprice}" name="minprice" />
						</div>
						<!-- 最大 -->
						<div class="form-group">
							<label for="maxprice0">—</label>
							<input type="text" class="form-control" id="maxprice0"
								value="${maxprice}" name="maxprice"  style="width:50px"/>
						</div>
						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label for="g_specification0">规格:</label>
							<input type="text" class="form-control" id="g_specification0"
								value="${g_specification}" name="g_specification" />
						</div>
						</div><div align="center" padding="18px 0 0 18px"><br>
						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label for="g_manufacturers">制造商:</label>
							<select class="form-control" id="g_manufacturers" name="g_manufacturers">
								<option value="">--请选择--</option>
								<c:forEach items="${gmanufacturerstype}" var="goods">
									<option value="${goods.g_manufacturers}"
										<c:if test="${goods.g_manufacturers == g_manufacturers}">selected</c:if>>
										${goods.g_manufacturers}</option>   
								</c:forEach>
							</select> 
						</div>
						<div class="form-group">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label for="g_sno0">服务员ID:</label>
							<select class="form-control" id="g_sno0" name="g_sno">
								<option value="">--请选择--</option>
								<c:forEach items="${gsnotype}" var="goods">
									<option value="${goods.g_sno}"
										<c:if test="${goods.g_sno == g_sno}">selected</c:if>>
										${goods.g_sno}</option>
								</c:forEach>
							</select>
						</div>
						&nbsp;&nbsp;&nbsp;
						<button type="submit" class="btn btn-primary">查询</button>
						</div>
					</form>
				</div>
			</div>
			<a href="#" class="btn btn-primary" data-toggle="modal"
				data-target="#newGoodsDialog" onclick="clearGoods()">新建</a>
			<div class="row" style="padding: 7px 0 0 0;">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">文具信息列表</div>
						<!-- 列表头信息 -->
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>文具ID</th>
									<th>文具类型ID</th>
									<th>名称</th>
									<th>价格</th>
									<th>会员价</th>
									<th>出厂日期</th>
									<th>规格</th>
									<th>制造商</th>
									<th>现有量</th>
									<th width = 102px">服务员编号</th>
									<th width = 60px">图片</th>
									<th width = 102px">操作</th>  
									<th width = 100px">图片名称</th>
								</tr>
							</thead> 
							<tbody>
								<c:forEach items="${page.rows}" var="goodsrow">
									<tr>
										<td>${goodsrow.g_id}</td>
										<td>${goodsrow.g_gtid}</td>
										<td>${goodsrow.g_name}</td>
										<td>${goodsrow.g_price}</td>
										<td>${goodsrow.g_vipprice}</td>
										<td>${goodsrow.g_producttime}</td>
										<td>${goodsrow.g_specification}</td>
										<td>${goodsrow.g_manufacturers}</td>
										<td>${goodsrow.g_quantity}</td>
										<td>${goodsrow.g_sno}</td>
										<td align="center"><a href="#" class="btn btn-primary btn-xs"
											data-toggle="modal" data-target="#"
											style="width: 40px; height: 25px; align: center; padding: 2px 0 0 0"
											onclick="viewGoods(this)">查看</a></td>
										<td align="center">
											<a href="#" class="btn btn-primary btn-xs"
											data-toggle="modal" data-target="#editGoodsDialog"
											style="width: 40px; height: 25px; align: center; padding: 2px 0 0 0"
											onclick="updateGoods(this)">修改&nbsp;</a> 
											<a href="#"
											class="btn btn-danger btn-xs" onclick="deleteGoods(this)"
											style="width: 40px; height: 25px; align: center; padding: 2px 0 0 0">删除&nbsp;</a>
										</td>
										<td>${goodsrow.g_picture}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<div class="col-md-12 text-right">
							<ul class="pagination">
								<span>总记录数：${page.total}</span>&nbsp;&nbsp;&nbsp;
								<span>第 ${page.page}/${page.maxpageNum} 页</span>&nbsp;&nbsp;&nbsp;
								<span>每页显示：${page.size}</span>
								<itheima:page
									url="${pageContext.request.contextPath}/goods/list.action" />
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 客户列表查询部分  end-->
	</div>
	<!-- 创建    模态框 -->
	<div class="modal fade" id="newGoodsDialog" tabindex="-1" role="dialog"
		aria-labelledby="goodsModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="goodsModalLabel">新建文具信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="new_goods_form">
						<div class="form-group">
							<label for="new_g_id"
								style="float: left; padding: 7px 20px 0 28px;">&nbsp;&nbsp;&nbsp;&nbsp;ID&nbsp;&nbsp;&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_g_id"
									placeholder="文具编号id" name="g_id" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_gtid"
								style="float: left; padding: 7px 20px 0 28px;">&nbsp;&nbsp;文具类型ID&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<select class="form-control" id="new_g_gtid" name="g_gtid">
									<option value="">--请选择--</option>
									<c:forEach items="${ggtidtype}" var="newgoods2">
										<option value="${newgoods2.g_gtid}"
											<c:if test="${newgoods2.g_gtid == g_gtid}">selected</c:if>>
											${newgoods2.g_gtid}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_name"
								style="float: left; padding: 7px 20px 0 28px;">&nbsp;&nbsp;文具名称&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_g_name"
									placeholder="文具名称name" name="g_name" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_price"
								style="float: left; padding: 7px 20px 0 18px;">价格</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_g_price"
									placeholder="价格price" name="g_price" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_vipprice"
								style="float: left; padding: 7px 20px 0 18px;">会员价格</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_g_vipprice"
									placeholder="会员价格vip-price" name="g_vipprice" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_producttime"
								style="float: left; padding: 7px 20px 0 18px;">出厂日期</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_g_producttime"
									placeholder="出厂日期product-time" name="g_producttime" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_specification"
								style="float: left; padding: 7px 20px 0 18px;">规格</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_g_specification"
									placeholder="规格specification" name="g_specification" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_manufacturers"
								style="float: left; padding: 7px 20px 0 18px;">制造商</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_g_manufacturers"
									placeholder="制造商manufacturers" name="g_manufacturers" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_quantity"
								style="float: left; padding: 7px 20px 0 18px;">现有量</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_g_quantity"
									placeholder="现有数量quantity" name="g_quantity" />
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_sno"
								style="float: left; padding: 7px 20px 0 28px;">&nbsp;&nbsp;服务员ID&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<select class="form-control" id="new_g_sno" name="g_sno">
									<option value="">--请选择--</option>
									<c:forEach items="${gsnotype}" var="newgoods2">
										<option value="${newgoods2.g_sno}"
											<c:if test="${newgoods2.g_sno == g_sno}">selected</c:if>>
											${newgoods2.g_sno}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="new_g_picture"
								style="float: left; padding: 7px 20px 0 18px;">图片名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="new_g_picture"
									placeholder="图片文件名picture" name="g_picture" />
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						onclick="createGoods()">创建</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 修改    模态框 -->
	<div class="modal fade" id="editGoodsDialog" tabindex="-1"
		role="dialog" aria-labelledby="goodsModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="goodsModalLabel">修改文具信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_goods_form">
						<!-- id隐藏或只读----start -->
						<div class="form-group">
							<label for="edit_g_id" class="col-sm-2 control-label">ID</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_g_id"
									placeholder="文具id" name="g_id" readonly />
							</div>
						</div>
						<!-- id隐藏----end -->
						<div class="form-group">
							<label for="edit_g_gtid"  class="col-sm-2 control-label">&nbsp;&nbsp;文具类型ID&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<select class="form-control" id="edit_g_gtid" name="g_gtid">
									<option value="">--请选择--</option>
									<c:forEach items="${ggtidtype}" var="editgoods">
										<option value="${editgoods.g_gtid}"
											<c:if test="${editgoods.g_gtid == g_gtid}">selected</c:if>>
											${editgoods.g_gtid}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_g_name" class="col-sm-2 control-label">&nbsp;&nbsp;文具名称&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_g_name"
									placeholder="文具名称name" name="g_name" />
							</div>
						</div>
						<div class="form-group">
							<label for="edit_g_price" class="col-sm-2 control-label">价格</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_g_price"
									placeholder="价格price" name="g_price" />
							</div>
						</div>
						<div class="form-group">
							<label for="edit_g_vipprice" class="col-sm-2 control-label">会员价格</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_g_vipprice"
									placeholder="会员价格vip-price" name="g_vipprice" />
							</div>
						</div>
						<div class="form-group">
							<label for="edit_g_producttime" class="col-sm-2 control-label">出厂日期</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_g_producttime"
									placeholder="出厂日期product-time" name="g_producttime" />
							</div>
						</div>
						<div class="form-group">
							<label for="edit_g_specification" class="col-sm-2 control-label">规格</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_g_specification"
									placeholder="规格specification" name="g_specification" />
							</div>
						</div>
						<div class="form-group">
							<label for="edit_g_manufacturers" class="col-sm-2 control-label">制造商</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_g_manufacturers"
									placeholder="制造商manufacturers" name="g_manufacturers" />
							</div>
						</div>
						<div class="form-group">
							<label for="edit_g_quantity" class="col-sm-2 control-label">现有量</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_g_quantity"
									placeholder="现有数量quantity" name="g_quantity" />
							</div>
						</div>
						<div class="form-group">
							<label for="edit_g_sno" class="col-sm-2 control-label">&nbsp;&nbsp;服务员ID&nbsp;&nbsp;</label>
							<div class="col-sm-10">
								<select class="form-control" id="edit_g_sno" name="g_sno">
									<option value="">--请选择--</option>
									<c:forEach items="${gsnotype}" var="editgoods">
										<option value="${editgoods.g_sno}"
											<c:if test="${editgoods.g_sno == g_sno}">selected</c:if>>
											${editgoods.g_sno}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_g_picture" class="col-sm-2 control-label">图片名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="edit_g_picture"
									placeholder="图片文件名picture" name="g_picture" />
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						onclick="updateGoods2()">保存修改</button>
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
	function clearGoods() {
	    $("#new_g_id").val("");
	    $("#new_g_gtid").val("");
	    $("#new_g_name").val("");
	    $("#new_g_price").val("");
	    $("#new_g_vipprice").val("");
	    $("#new_g_producttime").val("");
	    $("#new_g_specification").val("");
	    $("#new_g_manufacturers").val("");
	    $("#new_g_quantity").val("");
	    $("#new_g_sno").val("");
	    $("#new_g_picture").val("");
	};
	// 创建
	function createGoods(){
		$.post("<%=basePath%>goods/create.action",
		$("#new_goods_form").serialize(),function(data){
	        if(data =="OK"){
	            alert("文具创建成功！");
	            window.location.reload();
	        }else{
	            alert("文具创建失败！"+data);
	            window.location.reload();
	        }
	    });
	};
	// 通过id获取信息
	function updateGoods(e) {
		var id = $(e).parent().parent().find("td").eq(0).text();
	    $.ajax({
	        type:"get",/* 传入的类型 */
	        url:"<%=basePath%>goods/selectById.action",
	        data:{"id":id},
	        dataType:"json",
	        contentType:"application/json; charset=utf-8",
	        /* data:JSON.stringify(questionData), */
	        success:function(data) {
	        	alert("                                >>传递数据成功<<");
	            $("#edit_g_id").val(data.g_id);
	    	    $("#edit_g_gtid").val(data.g_gtid);
	    	    $("#edit_g_name").val(data.g_name);
	    	    $("#edit_g_price").val(data.g_price);
	    	    $("#edit_g_vipprice").val(data.g_vipprice);
	    	    $("#edit_g_producttime").val(data.g_producttime);
	    	    $("#edit_g_specification").val(data.g_specification);
	    	    $("#edit_g_manufacturers").val(data.g_manufacturers);
	    	    $("#edit_g_quantity").val(data.g_quantity);
	    	    $("#edit_g_sno").val(data.g_sno);
	    	    $("#edit_g_picture").val(data.g_picture);
	        },
	        error:function(data) {      //返回失败时的执行函数
	        	alert("                              传递数据失败!!!——"+id);
	        },
	        beforeSend:function () {  
	            //一般进行表单验证，在发送数据之前执行的函数
	        	alert("                           传递文具数据信息>>>>>>");
	        }
	    });
	};
    // 修改
	function updateGoods2() {
		$.post("<%=basePath%>goods/update.action",
		$("#edit_goods_form").serialize(),function(data){
			if(data =="OK"){
				alert("文具更新成功！");
				window.location.reload();
			}else{
				alert("文具更新失败！");
				window.location.reload();
			}
		});
	};
	// 删除
	function deleteGoods(e) {
		var id = $(e).parent().parent().find("td").eq(0).text();
		var gtid = $(e).parent().parent().find("td").eq(1).text();
		var name = $(e).parent().parent().find("td").eq(2).text();
		var price = $(e).parent().parent().find("td").eq(3).text();
		var vipprice = $(e).parent().parent().find("td").eq(4).text();
		var producttime = $(e).parent().parent().find("td").eq(5).text();
		var specification = $(e).parent().parent().find("td").eq(6).text();
		var manufacturers = $(e).parent().parent().find("td").eq(7).text();
		var quantity = $(e).parent().parent().find("td").eq(8).text();
		var sno = $(e).parent().parent().find("td").eq(9).text();
		var picture = $(e).parent().parent().find("td").eq(12).text();
	    if(confirm('文具：\n'
	    		  +'\t\t\t编号：   '+id+'\n'
	    		  +'\t\t类型编号：   '+gtid+'\n'
	    		  +'\t\t\t名称：   '+name+'\n'
	    		  +'\t\t\t价格：   '+price+'\n'
	    		  +'\t\t会员价格：   '+vipprice+'\n'
	    		  +'\t\t生产日期：   '+producttime+'\n'
	    		  +'\t\t\t规格：   '+specification+'\n'
	    		  +'\t\t 制造商：   '+manufacturers+'\n'
	    		  +'\t\t 现有量：   '+quantity+'\n'
	    		  +'\t 服务员编号： '+sno+'\n'
	    		  +'\t\t 图片名：   '+picture+'\n\n'
	    		  +'确实要删除该文具吗?')) {
	    	$.post("<%=basePath%>goods/delete.action", {
					"id" : id
				}, function(data) {
					if (data == "OK") {
						alert(">>>>>文具删除成功");
						window.location.reload();
					} else {
						alert("文具删除失败！——" + id + "——" + data);
						window.location.reload();
					}
				});
			}
		};
	</script>
</body>
</html>
