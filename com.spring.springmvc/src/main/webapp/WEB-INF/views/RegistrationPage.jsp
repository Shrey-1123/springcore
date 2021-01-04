<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserRegistration</title>
</head>
<body>
	<div>
		<form method="post" action="registerUser">
			<label for="Id">ID</label>
			<input type="number" name="id">
			<br>
			<label for="name">Name</label>
			<input type="text" name="name">
			<br>
			<label for="Department">Department</label>
			<input type="text" name="department">
			<br>
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>