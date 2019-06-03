<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-
		dist/css/bootstrap.css">
		<%--<style>
		h1 {margin-left:30px;}
		.form-group {display:flex; justify-content: flex-start; margin-left:200px;}
		.col-sm-2 {flex:none; width:200px ;}
		.col-sm-10 {width:300px; margin-left: 100px; padding-bottom:20px;}
		.form-control {width:400px; height:25px;}
		#inputAdresse {height:100px;}
		</style>--%>
		<style>
		h1 {margin-left:30px;}
		.form-group {margin-left:200px;}
		.form-control {width:500px;}
		#inputAdresse {height:100px;}
		.btn {margin-left:700px;}
		</style>
	</head>
	<body>
		<h1>Nouveau Collaborateur</h1>

		<form>
			<div class="form-group row">
				<label for="inputNom" class="col-sm-2 col-form-label">Nom</label>
				<div class="col-sm-10">
					<input type="text"  class="form-control "
						id="inputNom" name="nom">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPrenom" class="col-sm-2 col-form-label">Prenom</label>
				<div class="col-sm-10">
					<input type="text" class="form-control"
						id="inputPrenom" name="prenom">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputDate" class="col-sm-2 col-form-label">Date de naissance</label>
				<div class="col-sm-10">
					<input type="text" class="form-control"
						id="inputDate" name="dateDeNaissance">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputAdresse" class="col-sm-2 col-form-label">Adresse</label>
				<div class="col-sm-10">
					<input type="text" class="form-control"
						id="inputAdresse" name="adresse">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputSecu" class="col-sm-2 col-form-label">Numéro de sécurité sociale</label>
				<div class="col-sm-10">
					<input type="text" class="form-control"
						id="inputSecu" name="secu">
				</div>
			</div>
			
			<button type="submit" class="btn btn-primary">Créer</button>
		</form>

<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/js/bootstrap.js"></script>
</body>
</html>