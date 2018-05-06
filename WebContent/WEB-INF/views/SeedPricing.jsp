<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
<title>Seed Pricing</title>

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
				<li><a href="HerbicideUsage">Herbicide Usage</a></li>
				<li><a href="Agronomics">Agronomics</a></li>
				<li><a href="Videos">Videos</a></li>
				<li><a href="ContactUs">About Us</a></li>
			</ul>
		</div>
	</div>
	</nav>
	
<div class="container">
<div class="jumbotron">
<p>We offer 80k (55lb) bags, 5lb plot bags, and 1lb garden bags</p>
<br>
<p>Prices are as follows:</p>
<table border="1">
<tr>
<th>Bag Type</th>
<th>Full Price</th>
<th>Pay by Dec 1st Price</th>
</tr>
<c:forEach var="price" items="${priceList}">
<tr>
<td>${price.type}</td>
<td>${price.price}</td>
<td>${dPrice}</td>
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