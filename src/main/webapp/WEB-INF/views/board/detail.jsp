<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 쓰기</title>

<style>
	table {
		width: 30%;
		border-collapse: collapse;
	}
	th {
		width: 50px;
	}
	th, td {
		text-align: center;
		border: 1px solid #444444;
	}
</style>
</head>

<body>
	<h1>글 쓰기</h1>	
	<table>
		<tr>
			<th>글번호</th>
			<td>${board.boardnum}</td>
			<th>글쓴이</th>
			<td>${board.name}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${board.bdate}</td>
			<th>조회수</th>
			<td>${board.hit}</td>
		</tr>
		<tr>
			<th>글제목</th>
			<td colspan="3">${board.title}</td>
		</tr>
		<tr>
			<th>본문</th>
			<td colspan="3">${board.content}</td>
		</tr>
	</table>
	<a href="/board/update/${board.boardnum}">게시물 수정 </a>
</body>
</html>