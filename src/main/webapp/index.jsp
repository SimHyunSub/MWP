
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Servlet</title>
	</head>
	
	<body>
	
		<h2 style="text-align: center;">Hello World!</h2>
		
		<a href="Calc">Calculator</a>
		<form action="Calc">
		
			<select name="key">
				<option value="add"> + </option>
				<option value="subtract"> - </option>
				<option value="multiply"> * </option>
				<option value="divide"> / </option>
			</select>
			
			<input type="number" name = "a" placeholder="첫번째 숫자를 입력하세요.">
			<input name = "b" placeholder="두번째 숫자를 입력하세요.">
			
			
			<input type ="submit" value="계산">
		</form>
		
	</body>
</html>
