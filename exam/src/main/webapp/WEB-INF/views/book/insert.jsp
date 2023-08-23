<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert</title>
</head>
<body>
	<form name="insertForm" action="bookInsert" method="post">
		<div>
			<h3>도서 등록</h3>
		</div>
		<table>
			<tr>
				<th>도서번호</th>
				<td><input type="text" name="bookNo" value="${bno }" readonly></td>
			</tr>
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<th>도서표지</th>
				<td><input type="text" name="bookCoverimg"></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input type="text" name="bookDate"></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><input type="text" name="bookPrice"></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="text" name="bookPublisher"></td>
			</tr>
			<tr>
				<th>도서소개</th>
				<td><textarea name="bookInfo"></textarea></td>
			</tr>
		</table>
		<button type="submit">등록</button>
		<button type="button" onclick = "location.href='bookList'">조회</button>
	</form>
</body>
</html>