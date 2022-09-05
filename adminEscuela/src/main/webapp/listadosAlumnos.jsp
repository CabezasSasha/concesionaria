<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap CSS v5.0.2 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"  integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<link rel="stylesheet" href="CSS/estilo.css>
	
</head>
<body>

 <h3>LISTADO DE ALUMNOS</h3> 
 
 <p> LIsta de presente</p> 
  
 <%  
    	//simulamos la lectura de la tabla Alumnos de la DB
    	List<String> listAlumnos = new ArrayList<String>();
    	listAlumnos.add("Sol Perez 1565466546");
    	listAlumnos.add("Lana Suarez 1565466546");
    	listAlumnos.add("Beatriz Rodriguez 1565466546");
    	listAlumnos.add("Mora Diaz 1565466546");
    	
    	out.println("<ul>");
    	for(int i=0; i < listAlumnos.size(); i++) {
    		out.println("<li class='text-primary textoComun'>" + listAlumnos.get(i) + "</li>");
    	}
    	out.println("</ul>");
%>

<script>
	var mensaje="<p> Hola JS </p
	>";
	document.write ("<br>");
	document.write (mensaje);
</script>
<!-- Bootstrap JavaScript Libraries -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</body>
</html>