<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Registration</title>
<link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>
	<div class="container" id="register" style="margin:0 auto ">
		
			<h3>Product Registered!</h3>
			<p>
			Barcode:
			<%
				Object object = request.getAttribute("barcode");
				int barcode = Integer.parseInt(object.toString());
			%>
			<%=barcode%><br>
			Name:
			<%
				String name = (String) request.getAttribute("name");
			%>
			<%=name%><br>
			Color:
			<%
				String color = (String) request.getAttribute("color");
			%>
			<%=color%><br>
			Description:
			<%
				String desc = (String) request.getAttribute("desc");
			%>
			<%=desc%><br>
			</p>
			<fieldset>
				<button name="submit" type="submit" id="register-submit"
					onclick="location.href='index.html';">Register more</button>
			</fieldset>
		
	</div>
</body>
</html>


