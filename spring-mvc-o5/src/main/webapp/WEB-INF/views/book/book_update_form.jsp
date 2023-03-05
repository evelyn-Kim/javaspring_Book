<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 수정</title>
</head>
<body>
	<h1>도서 정보 수정</h1>
	<form action="book_update_action" method="post">
   	책제목 : <input type="text" name="title" value="${vo.title}"> <br>
   	츨판사 : <input type="text" name="publisher" value="${vo.publisher}"> <br>
   	저자: <input type="text" name="Writer" value="${vo.writer}"> <br>
   	가격: <input type="text" name="price" value="${vo.price}"> <br>
   	<input type="submit" value="도 서 수 정">
   	<input type="reset" value="재 작 성">
   	</form>
</body>
</html>