<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h3>도서별 대여매출현황</h3>
		<table>
			<thead>
				<tr>
					<th>도서번호</th>
					<th>도서명</th>
					<th>대여총합계</th>
					<th>대여횟수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${rentList }" var="info">
					<tr>
						<td style="text-align : center">${info.bookNo }</td>
						<td style="text-align : left">${info.bookName }</td>
						<td style="text-align : right">${info.totalPrice }</td>
						<td style="text-align : right">${info.rentCount }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>