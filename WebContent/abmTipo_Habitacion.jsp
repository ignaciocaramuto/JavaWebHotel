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
<title>Insert title here</title>
<%
	LinkedList<Tipo_Habitacion> lth = (LinkedList<Tipo_Habitacion>)request.getAttribute("listaTipo_Habitaciones");
%>
</head>
<body>
<div class="container">
		<div class="row">
			<a href="ABM-Tipo_Habitacion/añadirTipo_Habitacion.jsp">Añadir Tipo de habitación</a>
			<h4>Tipo de habitaciones</h4>
			<div class="col-12 col-sm col-lg-12">
				<div class="table-responsive">
					<div class="table">
						<table border="1">
							<tr>
								<th>ID</th>
								<th>Denominación</th>
								<th>Descripción</th>
								<th>Capacidad de personas</th>
								<th>Precio por día</th>
							</tr>
						<% for (Tipo_Habitacion th : lth) { %>
							<tr>
								<td><%=th.getId_Tipo_Habitacion() %></td>
								<td><%=th.getDenominacion() %></td>
								<td><%=th.getDescripcion() %></td>
								<td><%=th.getCapacidad_Personas() %></td>
								<td><%=th.getPrecio_Por_Dia() %></td>
								<td>
									<a href="ABM-Tipo_Habitacion/editarTipo_Habitacion.jsp?id=<%=th.getId_Tipo_Habitacion() %>" class="btn btn-warning">Editar</a>
									<a href="ABM-Tipo_Habitacion/eliminarTipo_Habitacion.jsp?id=<%=th.getId_Tipo_Habitacion() %>" class="btn btn-danger">Eliminar</a>
								</td>
							</tr>
						<% } %>
						</table>	
					</div><!-- /container -->
				</div>	
			</div>
		</div>
	</div>
</body>
</html>