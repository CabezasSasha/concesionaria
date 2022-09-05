
<%@page import="concesionaria.Cliente"%>
<%@page import="concesionaria.Vendedor"%>
<%@page import="concesionaria.Automovil"%>
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
	Automovil auto1 = new Automovil();
	auto1.setColor("azul");
	auto1.setPatente("AAD222");
	auto1.setDisponible(true);
	
	Automovil auto2 = new Automovil();
	auto2.setColor("azul");
	auto2.setPatente("ZDD3332");
	auto2.setDisponible(true);
	
	Automovil auto3 = new Automovil();
	auto3.setColor("azul");
	auto3.setPatente("GFE222");
	auto3.setDisponible(false);
	
	Vendedor vend1 = new Vendedor();
	vend1.setNombre("Juan");
	vend1.setApellido("Suarez");
	
	Cliente cli1 = new Cliente("Roxana", "Diaz", "");

	vend1.venderAuto(auto2, cli1);

	
	Cliente cli2 = new Cliente("Pedro", "Gimenez", "");

	vend1.venderAuto(auto2, cli2);	
	
	
	%>

</body>
</html>