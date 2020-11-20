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
	<h1>회원가입 페이지입니다.</h1>
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
				<th>이름:</th>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<th>이메일:</th>
				<td><input type="email" name="email" required></td>
			</tr>
			<tr>
				<th>주소:</th>
				<td><input type="text" name="address" required></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" name="가입">
					<input type="reset" name="초기화">
				</td>
			</tr>
		</table>
<!-- 	<input type="submit" name="가입">
	<input type="reset" name="초기화"> -->
	</form>
</body>
</html>