<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<style>
* {
	margin: 0px;
	padding: 0px;
	font-size: 1.5rem;
	-moz-user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
	user-select: none;
	user-select: none;
}

#container {
	height: auto;
}

header {
	height: 100px
}

header>h1 {
	text-align: center;
	vertical-align: middle;
	line-height: 100px;
}

section {
	height: 80vh;
}

table {
	margin: 50px auto;
	border: 1px solid black;
	padding: 10px;
	background: linear-gradient(100deg, #999696, #545252);
}

td {
	border: 1px solid black;
	text-align: center;
	padding: 5px;
	background: linear-gradient(100deg, #b3b6ba, #848a91);
}
a{
	color: black;
	text-decoration: none;
	display: inline-block;
	width: 100%;
	height: 100%;
}

td:hover {
	background: linear-gradient(100deg, #a8afb5, #63676b);
	cursor: pointer;
}

td:active {
	background: linear-gradient(100deg, #6a6c6e, #3c3f42);
}

#resultFrame {
	border: 1px solid black;
	width: 250px;
	text-align: right;
	padding-right: 20px;
	background: linear-gradient(100deg, #63dff7, #3e79b5);
	cursor: text;
	user-select: text;
}
</style>
		<title>계산기</title>
	</head>

	<body>
		<div id="container">
			<header>
				<h1>계산기</h1>
			</header>
			<section>
				<div>
					<table>
						<thead>
							<tr>
								<td id="resultFrame" colspan="4">${display}</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td><a href="?btn=7">7</a></td>
								<td><a href="?btn=8">8</a></td>
								<td><a href="?btn=9">9</a></td>
								<td><a href="?btn=sub">-</a></td>
							</tr>
							<tr>
								<td><a href="?btn=4">4</a></td>
								<td><a href="?btn=5">5</a></td>
								<td><a href="?btn=6">6</a></td>
								<td><a href="?btn=add">+</a></td>
							</tr>
							<tr>
								<td><a href="?btn=1">1</a></td>
								<td><a href="?btn=2">2</a></td>
								<td><a href="?btn=3">3</a></td>
								<td><a href="?btn=mul">*</a></td>
							</tr>
							<tr>
								<td><a href="?btn=C">C</a></td>
								<td><a href="?btn=0">0</a></td>
								<td><a href="?btn=div">/</a></td>
								<td><a href="?btn=E">=</a></td>
							</tr>
						</tbody>
					</table>
				</div>
			</section>
		</div>
	</body>

	</html>