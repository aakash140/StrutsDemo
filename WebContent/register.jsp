<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<form action="register.do" method="get">
		Username: 
		<input type="text" name="userName"><br /> 
		Password:
		<input type="password" name="pass1"><br /> 
		Re-Enter Password:
		<input	type="password" name="pass2"><br /> 
		<input type="submit"
			value="Register">
	</form>

</body>
</html>