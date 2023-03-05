<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서정보 상세보기</title>
</head>
<body>
	<h1>도서정보 상세보기</h1>
	책제목 : ${vo.title} <br>
	출판사 : ${vo.publisher} <br>
	저자 : ${vo.writer} <br>
	가격 : ${vo.price} <br>
	<h3><a href=".\">홈</a></h3>
	<h3><a href="book_list">도서 목록</a></h3>
	<h3><a href="book_update_form?title=${vo.title}">도서 정보 수정</a></h3>
	<h3><a href="book_delete_action?title=${vo.title}">도서 정보 삭제</a></h3>
</body>
</html>