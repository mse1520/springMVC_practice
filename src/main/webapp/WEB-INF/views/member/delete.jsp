<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete member</title>
</head>
<body>
	<h1>${id}게정을 삭제합니다. 비밀번호를 입력해주세요.</h1>
	<form action="/member/delete" method="post">
		<input type="password" name="pw" required>
		<input type="submit" value="제풀">
		<input type="reset" value="초기화">
	</form>
</body>
</html>