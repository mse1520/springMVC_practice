<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
	th, td {
		text-align: right;
	}
</style>
</head>

<body>
	<h1>로그인 페이지입니다.</h1>
	<form action="" method="post"><br>
		<table>
			<tr>
				<th>아이디:</th>
				<td><input type="text" name="id" required></td>
			</tr>
			<tr>
				<th>비밀번호:</th>
				<td><input type="password" name="pw" required></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" name="가입">
					<input type="reset" name="초기화">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>