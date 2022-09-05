
<%@page import="concesionaria.Cliente"%>
<%@page import="concesionaria.Automovil"%>
<%@page import="concesionaria.Vendedor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% 
	
	Vendedor vendedor = new Vendedor();
	Automovil auto = new Automovil();
	auto.setPatente("ADD212");
	
	Cliente cliente = new Cliente();
	cliente.setNombre("Pedro");
	cliente.setApellido("Suarez");
	
	
	vendedor.venderAuto(auto, cliente);
	%>
</body>
</html>