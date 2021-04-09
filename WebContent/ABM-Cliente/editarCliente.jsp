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
	Cliente c = new Cliente();
	c = ctrlLogica.getOne(id);
%>
</head>
<body>
<center>
		<div class="container" style="margin-top: 80px">
			<form method="post" action="../ControladorABMCliente">
				<div class="card" style="width: 30rem">
					<div class="card-body">
					<h2>Editar cliente</h2>
						<input type="text" name="nombre" class="form-control mt-2" placeholder="Ingrese nombre" value="<%=c.getNombre() %>" required>
						<input type="text" name="apellido" class="form-control mt-2" placeholder="Ingrese apellido" value="<%=c.getApellido() %>" required>
						<input type="text" name="tipoDoc" class="form-control mt-2" placeholder="Ingrese tipo documento" value="<%=c.getTipoDoc() %>" required>
						<input type="text" name="numDoc" class="form-control mt-2" placeholder="Ingrese numero documento" value="<%=c.getNumDoc() %>" required>
						<input type="text" name="sexo" class="form-control mt-2" placeholder="Ingrese sexo" value="<%=c.getSexo() %>" required>
						<input type="text" name="fechaNacimiento" class="form-control mt-2" placeholder="Ingrese fecha de nacimiento" value="<%=c.getFechaNacimiento() %>" required>
						<input type="text" name="email" class="form-control mt-2" placeholder="Ingrese email" value="<%=c.getMail() %>" required>
						<input type="text" name="telefono" class="form-control mt-2" placeholder="Ingrese telefono" value="<%=c.getTelefono() %>" required>
						<input type="password" name="contraseña" class="form-control mt-2" placeholder="Ingrese contraseña" value="<%=c.getContraseña() %>" required>
						<input type="text" name="tipoTarjetaCredito" class="form-control mt-2" placeholder="Ingrese tipo de tarjeta de credito" value="<%=c.getTipoTarjetaCredito() %>" required>
						<input type="text" name="numTarjetaCredito" class="form-control mt-2" placeholder="Ingrese numero de tarjeta de credito" value="<%=c.getNumTarjetaCredito() %>" required>
						<input type="hidden" name="txtid" value="<%=c.getIdCliente() %>">
						<input type="submit" class="btn btn-primary btn-block mt-2" name="btn-actualizarCliente" value="Actualizar">
					</div>
				</div>
			</form>
		</div>
	</center>
</body>
</html>