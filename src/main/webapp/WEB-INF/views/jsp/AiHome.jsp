<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<! DOCTYPE html>
<html lang="ko">
<head>
	<title>A Home</title>	
	<meta charset="utf-8">
	<meta name="viewport" content="width = device-width, initial-scale=1" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<style>
		.navbar{
			margin-bottom: 0;
			border-radius: 0;
		}
		.row.content {height:450px}
		.sidenav{
			padding-top: 20px;
			background-color:#f1f1f1;
			height:100%;
		}
		.footer{
			background-color :#555;
			color : white;
			padding : 15px;
		}
		@media screen and (max-width :767px){
			.sidenav {
				height :auto;
				padding :15px;
			}
			.row.content{height:auto;}
		}
	</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Logo</a>
			</div>
			<div class="collpase navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">About</a></li>
					<li><a href="#">Project</a></li>
					<li><a href="#">Contact</a></li>
					
					<li><a href="#">코드입력</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><span class="glyphicon glyphicon-log-in">Login</span></a></li>
				</ul>				
			</div>	
		</div>
	</nav>
	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">	
					
				<div class="tabbable  tabs-left"> <!-- Only required for left/right tabs -->
				  <ul class="nav nav-tabs">
				    <li class="active"><a href="#tab1" data-toggle="tab">Section 1</a></li>
				    <li><a href="#tab2" data-toggle="tab">Section 2</a></li>
				    <li><a href="#tab2" data-toggle="tab">Section 3</a></li>
				    <li><a href="#tab2" data-toggle="tab">Section 4</a></li>
				    <li><a href="#tab2" data-toggle="tab">Section 5</a></li>
				  </ul>
				  <div class="tab-content">
				    <div class="tab-pane active" id="tab1">
				      <p>I'm in Section 1.</p>
				    </div>
				    <div class="tab-pane" id="tab2">
				      <p>Howdy, I'm in Section 2.</p>
				    </div>
				  </div>
				</div>
			
			</div>
			
			
			<div class="col-sm-8 text-left">			
<!-- 화면중앙 메인컨텐츠 iFrame 부분  ------------------->
				<div class= "embed-responsive embed-responsive-16by9" > 
				  <iframe class= "embed-responsive-item" src= "/innerContents" allowfullscreen ></iframe> 
				</div>
<!-- 화면중앙 메인컨텐츠 iFrame 부분  ------------------->
				<!-- h1>welcome</h1>
				<p> content </p>
				<hr>
				<h3>test</h3>
				<p>Lorem ipsum...</p>
				<hr>
				<h3>test</h3>
				<p>Lorem ipsum...</p>
				<hr -->
			</div>
			<div class="col-sm-2 sidenav">
				<div class="well">
					<p>ads1</p>
				</div>
				<div class="well">
					<p>ads2</p>
				</div>
			</div>
		</div>
	</div>
	
	
	<footer class="container-fluid text-center">
		<p>Footer Text</p>
	</footer>
	
</body>
</html>






