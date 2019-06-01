<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
	<header>ログインページ</header>
	<section>
		<form action="Add" method="get">
			<div class="input">
				<div class="inputHeader">
					氏名：
				</div>
				<div class="inputLine">
					<input type="text" name="name">
				</div>
			</div>
			<div class="input">
				<div class="inputHeader">
					パスワード：
				</div>
				<div class="inputLine">
					<input type="password" name="pas">
				</div>
			</div>
			<div class="input">
				<div class="inputLine">
					<input type="radio" value="0" name="radio">男
					<input type="radio" value="1" name="radio">女
				</div>
			</div>
			<div class="inputLine">
				<input type="submit" value="送信">
			</div>
		</form>
		<footer>
			<a href="index.jsp">トップページへ</a>
		</footer>
	</section>
</body>
</html>