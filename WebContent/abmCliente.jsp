<%@ page import="entidades.Cliente" %>
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
	Cliente c = (Cliente)session.getAttribute("usuario");
	LinkedList<Cliente> lc = (LinkedList<Cliente>)request.getAttribute("listaClientes");
%>
</head>
<body>
<div class="container">
		<div class="row">
			<a href="registrarCliente.jsp">Registrar nuevo cliente</a>
			<h4>Clientes</h4>
			<div class="col-12 col-sm col-lg-12">
				<div class="table-responsive">
					<div class="table">
						<table border="1">
							<tr>
								<th>ID</th>
								<th>Nombre</th>
								<th>Apellido</th>
								<th>Email</th>
								<th>Telefono</th>
								<th>Sexo</th>
								<th>Fecha Nacimiento</th>
							</tr>
						<% for (Cliente cli : lc) { %>
							<tr>
								<td><%=cli.getIdCliente() %></td>
								<td><%=cli.getNombre() %></td>
								<td><%=cli.getApellido() %></td>
								<td><%=cli.getMail() %></td>
								<td><%=cli.getTelefono() %></td>
								<td><%=cli.getSexo() %></td>
								<td><%=cli.getFechaNacimiento() %></td>
								<td>
									<a href="Controlador" class="btn btn-warning">Editar</a>
									<a href="eliminarCliente.jsp" class="btn btn-danger">Eliminar</a>
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