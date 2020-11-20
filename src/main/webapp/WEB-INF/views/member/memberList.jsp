<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberList</title>

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
	<h1>회원 전체 목록입니다.</h1>
		
	<table>
	
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>ADDRESS</th>
				<th>RDATE</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="member" items="${members}">
				<tr>
					<td>${member.id}</td>
					<td>${member.name}</td>
					<td>${member.email}</td>
					<td>${member.address}</td>
					<td>${member.rdate}</td>
				</tr>
			</c:forEach>
		</tbody>
		
	</table>
	
</body>
</html>