<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- html estatico -->
<h3>Por primera vez en JSP</h3>
<p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Nostrum.</p>

<!-- html dinamico -->
<%
String mensaje = new String("<div style='color:blue;'>Bievenidos a nuestro primer JSP</div>");

for(int i=0; i<4; i++) {
	out.println(i + mensaje);
	out.println("<br><br>");
}
%>
</body>
</html>