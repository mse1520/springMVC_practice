<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 쓰기</title>

<style>
	input[type=text] {
		width: 100%;
	}
	td {
		text-align: right;
	}
</style>
</head>

<body>
	<h1>글 쓰기</h1>
	<form action="/board/insert" method="post">
	
		<table>
			<tr>
				<th>글쓴이</th>
				<td><input type="text" name="name" value="${name}" readonly></td>
			</tr>
			<tr>
				<th>글제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>본문</th>
				<td>
					<textarea rows="30" cols="50" name="content"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="글쓰기">
					<input type="reset" value="초기화">
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>