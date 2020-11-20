<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원제 게시판 메인화면</title>
</head>
<body>
	<h1>회원제 게시판 메인화면</h1>
	<h2>${id}님 로그인을 환영합니다.</h2>
	<a href="/board/list">게시물 조회</a>
	<a href="/member/list">회원조회</a>
	<a href="/logout">로그아웃</a>
	<a href="/member/delete">회원탈퇴</a>
</body>
</html>