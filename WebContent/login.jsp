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
			<form method="post" action="ControladorABMCliente">
				<div class="card" style="width: 30rem">
					<div class="card-body">
					<h2>Iniciar sesi�n</h2>
						<input type="text" name="txtemail" class="form-control mt-2" placeholder="Ingrese Email" required>
						<input type="password" name="txtpassword" class="form-control mt-2" placeholder="Ingrese contrase�a" required>
						<input type="submit" class="btn btn-primary btn-block mt-2" name="btn-login" value="Ingresar">
					</div>
				</div>
			</form>
		</div>
	</center>
</body>
</html>