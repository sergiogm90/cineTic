<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/nuestro.css" rel="stylesheet">
<link href="css/footer.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Leckerli+One"
	rel="stylesheet">
<link rel="icon" type="image/png" href="images/Logo.png">
<title>CineTic</title>
</head>

<body>
	<div class="container-fluid">

		<!--   CABECERA-->
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-1">
				<img class="img-responsive" alt="Logo CineTic" src="images/Logo.png">
			</div>
			<div class="col-md-2">
				<h1 id="tituloEmpresa">CineTic</h1>
			</div>
			<div class="col-md-5"></div>
		</div>
		<!-- 		NAVBAR -->
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<ul class="nav navbar-nav">
					<li><a href="listarEstrenos">CineTic</a></li>
					<li><a href="ServletPeliculas">Peliculas</a></li>
					<li class="active"><a href="contacto.jsp">Contacto</a></li>
				</ul>
				<form class="navbar-form navbar-left" method="post"
					action="ServletBuscar">
					<div class="input-group">
						<input id="busqueda" name="busqueda" type="text"
							class="form-control" placeholder="Busqueda">
						<div class="input-group-btn">
							<button class="btn btn-default" type="submit">
								<i class="glyphicon glyphicon-search"></i>
							</button>
						</div>
					</div>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="loginCliente.jsp"><span
							class="glyphicon glyphicon-user"></span> Login Cliente</a></li>
					<li><a href="ServletCarrito"> <span
							class="glyphicon glyphicon-shopping-cart"></span> Compra
					</a></li>
											<%-- <c:if test="${logeado eq true }"></c:if>  --%> 
					<li><a href="loginAdministrador.jsp"><span
							class="glyphicon glyphicon-cog"></span> Administrador</a></li>
				</ul>
			</div>
		</nav>
		<br>
		<!--   FIN DE CABECERA-->


		<div class="container margenContacto">
			<form action="recibir" method="post" class="form-horizontal">
				<fieldset>

					<!-- Form Name -->
					<legend>
						<b>Formulario de Contacto</b>
					</legend>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="nombre">Nombre</label>
						<div class="col-md-4">
							<input id="nombre" name="nombre" type="text" placeholder="Nombre"
								class="form-control input-md" required="">

						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="email">Email</label>
						<div class="col-md-4">
							<input id="email" name="email" type="email" placeholder="Email" class="form-control input-md" required>

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4 control-label" for="nombre">Telefono</label>
						<div class="col-md-4">
							<input id="telefono" name="telefono" type="text" placeholder="Telefono" class="form-control input-md" required>
						</div>
					</div>

					<!-- Select Basic -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="asunto">Asunto</label>
						<div class="col-md-4">
							<select id="asunto" name="asunto" class="form-control">
								<option value="0">---Elegir Opcion---</option>
								<option value="Devoluciones pedidos">Devoluciones pedidos</option>
								<option value="Problemas de envío">Problemas de envío</option>
								<option value="Recibir promociones">Recibir promociones</option>
							</select>
						</div>
					</div>

					<!-- Textarea -->
					<div class="form-group">
						<label class="col-md-4 control-label" for="mensaje">Mensaje</label>
						<div class="col-md-4">
							<textarea class="form-control" id="mensaje" name="mensaje"></textarea>
						</div>
					</div>

					<!-- Button -->
					<div class="form-group">
						<div class="col-md-4"></div>
						<div class="col-md-4">
							<input type="submit" id="enviar" name="enviar" class="btn btn-success">
						</div>
					</div>
				</fieldset>
			</form>
		</div>

		<footer>
			<div class="container">
				<div class="row">
					<div class="col-md-4 col-sm-6 footerleft ">
						<h6 class="heading7">NUESTRA TIENDA</h6>
						<p>Tu tienda online con las mejores peliculas al mejor precio
							.</p>
						<p>
							<i class="fa fa-map-pin"></i> Calle Encinar ,5 Madrid España
						</p>
						<p>
							<i class="fa fa-phone"></i> Telefono (España) : +91 74 15 21 47
						</p>
						<p>
							<i class="fa fa-envelope"></i> E-mail : cineTic@webenlance.com
						</p>

					</div>
					<div class="col-md-2 col-sm-6 paddingtop-bottom">
						<h6 class="heading7">LINKS</h6>
						<ul class="footer-ul">
							<li><a href="contacto.jsp"> Contacto</a></li>
							<li><a href="loginCliente.jsp"> Zona Cliente</a></li>
							<li><a target="_new" href="http://politicadecookies.com">Politica
									de cookies</a></li>
							<li><a
								href="http://www.timeinc.net/subs/privacy/termsofservice/pptos.html">
									Terminos y Condiciones</a></li>
						</ul>
					</div>
					<div class="col-md-3 col-sm-6 paddingtop-bottom">
						<h6 class="heading7">OPINIONES</h6>
						<div class="post">
							<p>
								"La mejor tienda online para la compra de peliculas"<span>Junio
									3,2017</span>
							</p>
							<p>
								"Una atención perfecta y a muy buen precio" <span>Noviembre
									7,2017</span>
							</p>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 paddingtop-bottom">
						<div class="fb-page" data-href="https://www.facebook.com/facebook"
							data-tabs="timeline" data-height="300" data-small-header="false"
							style="margin-bottom: 15px;" data-adapt-container-width="true"
							data-hide-cover="false" data-show-facepile="true">
							<div class="fb-xfbml-parse-ignore">
								<blockquote cite="https://www.facebook.com/facebook">
									<a href="https://www.facebook.com/facebook">Facebook</a>
								</blockquote>
							</div>
						</div>
					</div>
				</div>
			</div>
			<br> <br>
		</footer>
		<div class="copyright">
			<div class="container">
				<div class="col-md-6">
					<p>© 2017 - Sergio García, Beatriz Rodriguez, Renzo Quispe,
						Carlos Vasco.</p>
				</div>
				<div class="col-md-6"></div>
			</div>
		</div>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/scripts.js"></script>
</body>
</html>