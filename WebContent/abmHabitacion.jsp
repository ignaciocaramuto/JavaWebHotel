<%@ page import="entidades.Habitacion" %>
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
<title>Insert title here</title>
<%
	LinkedList<Habitacion> habs = (LinkedList<Habitacion>)request.getAttribute("listaHabitaciones");
%>
</head>
<body>
<div class="container">
		<div class="row">
			<form method="post" action="ControladorABMHabitacion">
			<input type="button" class="btn btn-primary btn-block mt-2" name="btn-añadirHabitacion" value="Añadir habitación">
			<h4>Habitaciones</h4>
			<div class="col-12 col-sm col-lg-12">
				<div class="table-responsive">
					<div class="table">
						<table border="1">
							<tr>
								<th>Nro habitación</th>
								<th>ID Tipo habitación</th>
							</tr>
						<% for (Habitacion h : habs) { %>
							<tr>
								<td><%=h.getNro_Habitacion() %></td>
								<td><%=h.getId_Tipo_Habitacion() %></td>
								<td>
									<a href="ABM-Habitacion/editarHabitacion.jsp?id=<%=h.getNro_Habitacion() %>" class="btn btn-warning">Editar</a>
									<a href="ABM-Habitacion/eliminarHabitacion.jsp?id=<%=h.getNro_Habitacion() %>" class="btn btn-danger">Eliminar</a>
								</td>
							</tr>
						<% } %>
						</table>	
					</div><!-- /container -->
				</div>	
			</div>
			</form>
		</div>
	</div>
</body>
</html>