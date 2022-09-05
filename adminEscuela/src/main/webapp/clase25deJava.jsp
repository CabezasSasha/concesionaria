<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
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
        //conectarnos a una base de datos y treer listados de alumnos
       String msj = new String("<p style='color:pink'> Hola Jsp, texto dinamico</p>");
        out.println("<br>");
		out.println(msj);
	
    
        %>
    </body>

    </html>