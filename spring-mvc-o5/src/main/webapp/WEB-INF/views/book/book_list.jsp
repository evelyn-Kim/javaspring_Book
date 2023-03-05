<%@page import="java.util.List" %>
<%@page import="com.hwkim.mvc05.vo.BookVo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 목록</title>
</head>
<body>
	<h1>도서 목록</h1>
	<h3>도서수 : ${bookList.size()}</h3>
	<ul>
	<c:forEach items="${bookList}" var="vo">
		<li><a href="book_detail?title=${vo.title}">${vo.title}(${vo.publisher})</a></li>
	</c:forEach>
	</ul>
	
	<h3><a href=".\">홈</a></h3>
</body>
</html>