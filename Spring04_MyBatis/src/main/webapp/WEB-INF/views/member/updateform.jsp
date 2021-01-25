<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/member/updateform.do</title>
</head>
<body>
<div class="container">
<form action="update.do" method="post">
	<h1>수정 폼 입니다.</h1>
	<input type="hidden" name="num" value="${requestScope.num}"/>
	<label>
		이름 <input type="text" id="name" name="name" placeholder="이름 입력"/>
	</label>
	<label>
		주소 <input type="text" id="addr" name="addr" placeholder="주소 입력"/>	
	</label>
	<button type="submit">수정</button>
</form>
</div>
</body>
</html>