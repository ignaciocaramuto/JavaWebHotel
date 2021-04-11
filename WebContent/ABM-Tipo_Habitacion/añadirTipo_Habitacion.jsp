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
</head>
<body>
	<center>
		<div class="container" style="margin-top: 80px">
			<form method="post" action="../ControladorABMTipo_Habitacion">
				<div class="card" style="width: 30rem">
					<div class="card-body">
					<h2>Añadir Tipo de habitación</h2>
						<input type="text" name="denominacion" class="form-control mt-2" placeholder="Ingrese denominación" required>
						<input type="text" name="descripcion" class="form-control mt-2" placeholder="Ingrese descripción" required>
						<input type="number" name="capacidadPersonas" class="form-control mt-2" placeholder="Ingrese capacidad de personas" required>
						<input type="number" step="0.01" name="precioPorDia" class="form-control mt-2" placeholder="Ingrese precio por día" required>
						<input type="submit" class="btn btn-primary btn-block mt-2" name="btn-añadirTipo_Habitacion" value="Añadir">
					</div>
				</div>
			</form>
		</div>
	</center>
</body>
</html>