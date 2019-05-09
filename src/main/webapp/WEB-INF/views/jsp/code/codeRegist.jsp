<jsp:include page="../header/header.jsp" />
<%@ page pageEncoding="utf-8" %>

<! DOCTYPE html>
<html lang="ko">
<head>
	<title>코드입력</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script>
		$(document).ready( function(){
			
		});
	</script>
</head>	
<body>
	
	<form class="form-inline" >
	<h4 align="left"><span>코드등록</span></h4>
		<input  type="text" class="input-meidum search-query" name="codeName" placeholder="코드명">
		<button type="button" class="btn btn-success">검색</button>
		<br>
		<input type="text" class="input-small" name="cate" placeholder="code category">
		<input type="text" class="input-small" name="code" placeholder="code">
		<input type="text" class="input-small" name="codeName" placeholder="code name">
		<button type="button" class="btn btn-primary">코드등록</button>
		<button class="btn btn-warning" type="button">수정</button>	
	    <button class="btn btn-danger" type="button">삭제</button>	   
	</form>
	
	
</body>
</html>
	 
