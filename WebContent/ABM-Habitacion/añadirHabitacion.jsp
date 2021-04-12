<%@ page import="entidades.Tipo_Habitacion" %>
<%@ page import="java.util.LinkedList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

<%
	LinkedList<Tipo_Habitacion> lth = (LinkedList<Tipo_Habitacion>)request.getAttribute("listaTipo_Habitaciones");
%>

<title>Insert title here</title>
</head>
<body>
	<center>
		<div class="container" style="margin-top: 80px">
			<form method="post" action="../ControladorABMHabitacion">
				<div class="card" style="width: 30rem">
					<div class="card-body">
					<h2>Añadir habitación</h2>
						<% for (Tipo_Habitacion th : lth) { %>
						<input type="button" name="<%= th.getDenominacion() %>" class="form-control mt-2">
						<% } %>
					</div>
				</div>
			</form>
		</div>
	</center>
</body>
</html>