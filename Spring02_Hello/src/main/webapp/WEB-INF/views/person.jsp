<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>오늘의 인물 페이지</h1>
<p>오늘의 인물 : ${requestScope.Todayperson }</p>
<a href="home.do">인덱스로 가기</a>
</body>
</html>