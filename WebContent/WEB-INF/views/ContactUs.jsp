<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="resources\\styles.css" rel="stylesheet" />
<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700'
	rel='stylesheet' type='text/css'>

<title>Contact Us</title>
</head>
<body>

	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="./">Dudek Seeds</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="SeedPricing">Seed Pricing</a></li>
					<li><a href="HerbicideUsage">Herbicide Usage</a></li>
					<li><a href="Agronomics">Agronomics</a></li>
					<li><a href="Videos">Videos</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="jumbotron">
			<h1 align="center">About Dudek Seeds</h1>
			<table>
				<tr>
					<td>
						<p>text here</p>
					</td>
					<td>
						<p>pic here</p>
					</td>
				</tr>
			</table>
			<p>Contact Info Here</p>
			<p>
				<a href="Guestbook">Check in that you visted here!</a>
			</p>
			<table border="0">
				<c:forEach var="visitor" items="${contactList}">
					<tr>
						<td>${visitor.name}</td>
						<td>${visitor.date}</td>
					</tr>
					<tr>
						<td>${visitor.comment}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>