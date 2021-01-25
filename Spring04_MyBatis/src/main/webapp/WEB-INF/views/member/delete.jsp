<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/member/delete.do</title>
</head>
<body>
<p>
	<strong>${num }</strong>
	번 회원의 정보를 삭제 했습니다.
	<a href="${pageContext.request.contextPath}/member/list.do">리스트로 가기</a>
</p>
</body>
</html>