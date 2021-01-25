<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/member/insertform.do</title>
</head>
<body>
<div class="container">
	<h1>회원 추가 폼 입니다</h1>
	<form action="insert.do">
		<input type="text" id="name" name="name" placeholder="이름을 적어주세요..." />
		<input type="text" id="addr" name="addr" placeholder="주소를 적어주세요..." />
		<button type="submit">추가</button>
	</form>
</div>
</body>
</html>