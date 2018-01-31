<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>mybatis</title>
</head>


<body>
	<script type="text/javascript">
		function denglu() {
			var username = $("#username").val();
			var pwd = $("#pwd").val();
			$.post("login?type=login",{
				username : username,
				pwd : pwd
			}, function(data) {
				alert(data);
			});
		}

		function regist() {
			var username = $("#username").val();
			var pwd = $("#pwd").val();
			if (username == null || username.trim().length == 0 || pwd == null
					|| pwd.trim().length == 0) {
				alert("数据不完整！")
			} else {
				$.post("login?type=regist", {
					username : username,
					pwd : pwd
				}, function(data) {
					alert(data);
				});
			}

		}
	</script>
	username:
	<input type="text" name="username" value="" id="username" />
	<br /> password:
	<input type="password" name="pwd" value="" id="pwd" />
	<br />
	<input type="button" value="登录" onclick="denglu()">
	<input type="button" value="注册" onclick="regist()">

</body>
</html>