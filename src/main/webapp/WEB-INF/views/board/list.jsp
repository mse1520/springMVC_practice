<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
<style>
	table {
		text-align: center;
    	width: 100%;
    	border-top: 1px solid #444444;
    	border-collapse: collapse;
  	}
  	th, td {
    	border-bottom: 1px solid #444444;
    	padding: 10px;
  	}
</style>
</head>

<body>
	<h1>게시판 목록</h1>
	<table>
	
		<thead>
			<tr>
				<th>BOARDNUM</th>
				<th>NAME</th>
				<th>TITLE</th>
				<th>BDATE</th>
				<th>HIT</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="board" items="${boards}">
				<tr>
					<td>${board.boardnum}</td>
					<td>${board.name}</td>
					<td><a href="/board/detail/${board.boardnum}">${board.title}</a></td>
					<td>${board.bdate}</td>
					<td>${board.hit}</td>
				</tr>
			</c:forEach>
		</tbody>
		
	</table>
	<a href="/board/insert">게시물 등록 </a>
</body>
</html>