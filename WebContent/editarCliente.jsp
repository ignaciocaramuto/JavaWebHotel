<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
		<div class="container" style="margin-top: 80px">
			<form method="post" action="Controlador">
				<div class="card" style="width: 30rem">
					<div class="card-body">
					<h2>Editar cliente</h2>
						<input type="text" name="nombre" class="form-control mt-2" value="Ingrese nombre" value="" required>
						<input type="text" name="apellido" class="form-control mt-2" placeholder="Ingrese apellido" value="" required>
						<input type="text" name="tipoDoc" class="form-control mt-2" placeholder="Ingrese tipo documento" value="" required>
						<input type="text" name="numDoc" class="form-control mt-2" placeholder="Ingrese numero documento" value="" required>
						<input type="text" name="sexo" class="form-control mt-2" placeholder="Ingrese sexo" value="" required>
						<input type="text" name="fechaNacimiento" class="form-control mt-2" placeholder="Ingrese fecha de nacimiento" value="" required>
						<input type="text" name="email" class="form-control mt-2" placeholder="Ingrese email" value="" required>
						<input type="text" name="telefono" class="form-control mt-2" placeholder="Ingrese telefono" value="" required>
						<input type="password" name="contraseña" class="form-control mt-2" placeholder="Ingrese contraseña" value="" required>
						<input type="text" name="tipoTarjetaCredito" class="form-control mt-2" placeholder="Ingrese tipo de tarjeta de credito" value="" required>
						<input type="text" name="numTarjetaCredito" class="form-control mt-2" placeholder="Ingrese numero de tarjeta de credito" value="" required>
						<input type="hidden" name="txtid" value="">
						<input type="submit" class="btn btn-primary btn-block mt-2" name="btn-actualizarCliente" value="Actualizar">
					</div>
				</div>
			</form>
		</div>
	</center>
</body>
</html>