<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
th, td {
	text-align: center;
}
</style>
<link href="../css/bootstrap.min.css" rel="stylesheet"></link>
<title>Insert title here</title>
</head>
<body>

	<table class="table">
		<tr>
			<th style="text-align: center" width="50%">제목</th>
			<th style="text-align: center" width="25%">작성자</th>
			<th style="text-align: center" width="25%">등록일</th>
		</tr>
		<c:forEach var="boardList" items="${list}">
			<tr>
				<td>${boardList.title}</td>
				<td>${boardList.id}</td>
				<td>${boardList.reg_date}</td>
			</tr>
		</c:forEach>
	</table>

	<div class="pull-right">
		<!-- Standard button -->
		<button type="button" class="btn btn-default">Default</button>

		<!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
		<button type="button" class="btn btn-primary">Primary</button>

		<!-- Indicates a successful or positive action -->
		<button type="button" class="btn btn-success">Success</button>

		<!-- Contextual button for informational alert messages -->
		<button type="button" class="btn btn-info">Info</button>

		<!-- Indicates caution should be taken with this action -->
		<button type="button" class="btn btn-warning">Warning</button>

		<!-- Indicates a dangerous or potentially negative action -->
		<button type="button" class="btn btn-danger">Danger</button>

	</div>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>

</body>
</html>