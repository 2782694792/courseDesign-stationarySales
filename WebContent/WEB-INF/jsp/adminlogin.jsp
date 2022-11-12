<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="/images/郑烁彬公众号：UnseeR.ico" type="image/x-ico">
<title>登录页面</title>
<meta http-equiv=Content-Type content="text/html;charset=UTF-8">
<meta content="MSHTML 6.00.2600.0" name=GENERATOR>
<link href="${pageContext.request.contextPath}/css/style.css"
	type=text/css rel=stylesheet />
<link href="${pageContext.request.contextPath}/css/boot-crm.css"
	type=text/css rel=stylesheet />
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>

<!-- bootstrap按钮button -->
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- 判断登录手机号和密码是否为空 -->
<script>
	function check() {
		var admin_account = $("#admin_account").val();
		var admin_password = $("#admin_password").val();
		if (admin_account == "" || admin_password == "") {
			return false
		}
		return true
	}
</script>
</head>
<body leftmargin=0 topmargin=0 marginwidth="0" marginheight="0"
	background="${pageContext.request.contextPath}/images/rightbg.jpg">
	<div align="center">
		<table border="0" width="1140px" cellspacing="0" cellpadding="0" id="tabel1">
			<tr>
				<td height="93px"></td>
				<td></td>
				<div hidden>
					<span id="message">${msg}</span>							
				</div>
			</tr>
			<tr>
				<td background="${pageContext.request.contextPath}/images/rights.jpg"
					width="740" height="412"></td>
				<td class="login_msg" width="400" align="center">
					<!-- margin:0px auto; 控制当前标签居中 -->
					<fieldset style="width: auto; margin: 0px auto;">
						<legend>
							<font style="font-size: 22px" face="微软雅黑"> 欢迎使用SSM文具销售系统 </font>
						</legend>
						<font color="red"> 
							<%-- 提示信息--%> 
							<div class="alert alert-danger">${msg}</div>
						</font>
						<%-- 提交后的位置：/WEB-INF/jsp/customer.jsp--%>
						<form action="${pageContext.request.contextPath }/adminlogin.action"
							method="post" onsubmit="return check()">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
							<center>
							<br /><font size="3" color=white>账&nbsp;号：</font><input id="admin_account" type="text" name="admin_account" />
							<br />
							<br /><font size="3" color=white>密&nbsp;码：</font><input id="admin_password" type="password"
								name="admin_password" value="5436......."/> <br />
							<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							</center>
							<div class="container">
							<center>
								<button type="reset" class="btn btn-danger">重置</button>
								<!-- <input type="submit" value="登录" /> -->
							</center>
							<br>
							<center>
								<button type="reset" class="btn btn-info">注册</button>
								<button type="submit" class="btn btn-success">登录</button>
							</center>
							</div>
						</form>
					</fieldset>
				</td>
			</tr>
		</table>
	</div>

</body>
</html>