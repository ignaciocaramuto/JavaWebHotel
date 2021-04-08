<%@ page import="logica.LogicaCliente" %>
<%@ page import="entidades.Cliente" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<title>Insert title here</title>

<%
	int id = Integer.parseInt((String)request.getParameter("id"));
	LogicaCliente ctrlLogica = new LogicaCliente();
	//Cliente c = new Cliente();
	//c = ctrlLogica.getOne(id);
	ctrlLogica.eliminarCliente(id);
%>
</head>
<body>
	<form method="post" action="Controlador">
		<h2>Cliente eliminado</h2>
		<input type="submit" class="btn btn-primary btn-block mt-2" name="btn-abmCliente" value="Volver">
	</form>
</body>
</html>