<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 등록</title>
</head>
<body>
	<h1>도서 등록</h1>
	<form action="book_insert_action" method="post">
   	책제목 : <input type="text" name="title"> <br>
   	츨판사 : <input type="text" name="publisher"> <br>
   	저자: <input type="text" name="Writer"> <br>
   	가격: <input type="text" name="price"> <br>
   	<input type="submit" value="도 서 등 록">
   	<input type="reset" value="재 작 성">
   	</form>
</body>
</html>