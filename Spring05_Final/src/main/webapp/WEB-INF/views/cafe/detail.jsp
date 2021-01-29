<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/cafe/detail.jsp</title>
<jsp:include page="../include/resource.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../include/navbar.jsp">
	<jsp:param value="cafe" name="thisPage"/>
</jsp:include>
<div class="container">
	<nav>
		<ul class="breadcrumb">
			<li class="breadcrumb-item">
				<a href="${pageContext.request.contextPath}/">Home</a>
			</li>
			<li class="breadcrumb-item">
				<a href="${pageContext.request.contextPath}/cafe/list.do">글목록</a>
			</li>
			<li class="breadcrumb-item active">상세보기</li>
		</ul>
	</nav>
	<table class="table table-bordered">
		<tr>
			<th>글번호</th>
			<td>${dto.getNum()}</td>			
		</tr>
		<tr>
			<th>작성자</th>
			<td>${dto.getWriter()}</td>			
		</tr>
		<tr>
			<th>제목</th>
			<td>${dto.getTitle()}</td>			
		</tr>
		<tr>
			<th>조회수</th>
			<td>${dto.getViewCount()}</td>			
		</tr>
		<tr>
			<th>등록일</th>
			<td>${dto.getRegdate()}</td>			
		</tr>
		<tr>
			<td colspan="2">
				<div>${dto.getContent()}</div>
			</td>
		</tr>
	</table>
	<%
		//session scope 에서 로그인된 아이디를 읽어와 본다. (null 일수도 있음)
		String id=(String)session.getAttribute("id");
	%>
	<ul>
		<li><a href="list.jsp">목록보기</a></li>
		<c:if test="${dto.writer eq id }">
			<li><a href="private/updateform.do?num=${dto.getNum()}">수정</a></li>			
			<li><a href="javascript:deleteConfirm()">삭제</a></li>			
		</c:if>
	</ul>
</div>
<script>
	function deleteConfirm(){
		let isDelete=confirm("글을 삭제 하시겠습니까?");
		if(isDelete){
			location.href="private/delete.do?num=${dto.getNum()}";
		}
	}
</script>
</body>
</html>