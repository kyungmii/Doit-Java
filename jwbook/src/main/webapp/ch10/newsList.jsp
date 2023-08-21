<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width , initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
<title>뉴스관리앱</title>
</head>
<body>
	<div class = "container w-75 mt-5 mx-auto">
	<h2>뉴스 목록</h2>
	<hr> 
	<ul class = "list-group">
	<c:forEach var="news" items="${newslist}" varStatus="status">
	<li class="list-group-item list-group-item-action d-flex justify-content-betweenalign-items-center">
	<a href="/news/${news.aid}" class ="text-decoration-none">
		[${status.count}] ${news.title}, ${news.date}
		</a>
	<a href="/news/delete/${news.aid}"><span class="badge bg-secondary"> &times;</span></a>
</li>
	</c:forEach>
	</ul>
	
	<hr>
	<c:if test= "${error !=null}">
	<div class = "alert alert-danger alert-dismissible fade show me-3">
	에러발생 : ${error}
	<button type= "button" class ="btn-close" data-bs-dismiss="alert"></button>
	</div>
	</c:if>
	<hr>
	<button class= "btn btn-outline-info mb-3" type="button" data-bs-toggle="collapse" data-bs-target="#addForm" aria-expanded="false" aria-controls="addForm">뉴스등록 </button>
	
	<div class="collapse" id="addForm">
	<div class="card card-body">
		<form method="post" action="/news/add" enctype="multipart/form-data">
		<label class = "form-lavel"> 제목</label>
		<input type="text" name="title" class= "form-control">
		<label class= "form-label">이미지</label>
		<input type="file" name="file" class ="form-control">
		<label class= "form-label">기사내용 </label>
		<textarea cols="50" rows="5" name="content" class="form-control"></textarea>
		<button type="submit" class = "btn btn-success mt-3">저장</button>
		</form>
	</div>
	</div>
	
</div>
</body>
</html>