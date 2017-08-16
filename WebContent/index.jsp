<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
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
					<li class="active"><a href="listarEstrenos">CineTic</a></li>
					<li><a href="ServletPeliculas">Peliculas</a></li>
					<li><a href="contacto.jsp">Contacto</a></li>
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

		<!-- SLIDER -->
		<div class="carousel slide" id="carousel-341501">
			<ol class="carousel-indicators">
				<li data-slide-to="0" data-target="#carousel-341501" class="active"></li>
				<li data-slide-to="1" data-target="#carousel-341501"></li>
				<li data-slide-to="2" data-target="#carousel-341501"></li>
			</ol>
			<div class="carousel-inner">
				<div class="item active">
					<img alt="Carousel Bootstrap First" src="images/Estrenos2017.jpg"
						width="100%">
				</div>
				<div class="item">
					<img alt="Carousel Bootstrap Second" src="images/Estreno2.jpg"
						width="100%">
				</div>
				<div class="item">
					<img alt="Carousel Bootstrap Third" src="images/Estreno1.jpg"
						width="100%">
				</div>
			</div>
			<a class="left carousel-control" href="#carousel-341501"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left"></span></a> <a
				class="right carousel-control" href="#carousel-341501"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span></a>
		</div>
		<br>
		<!-- FIN SLIDER -->

		<div class="row">
			<div class="col-md-12">
				<h2>
					<b>Proximos estrenos</b>
				</h2>
				<hr>
			</div>
		</div>

		<div class="row">
			<c:forEach var="estreno" items="${listaEstrenos}" varStatus="cont">
					
						<div class="col-md-3">
							<div class="thumbnail">
								<img alt="${estreno.titulo}" src="${estreno.imagen}"
									class="img-rounded">
								<div class="caption">
									<h2>
										<b> ${estreno.titulo} </b>
									</h2>
									<p>
										<b>Descripcion</b>:${estreno.descripcion}
									</p>
									<p>
										<b>Director</b>:${estreno.director}
									</p>
									<p>
										<b>Genero</b>:${estreno.genero}
									</p>
									<p>
										<b>Duracion</b>:${estreno.duracion}
									</p>
									<br>
								</div>
							</div>
						</div>
					<c:if test="${cont.count % 4 eq 0 }"><div class="row"></div></c:if>
			</c:forEach>
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