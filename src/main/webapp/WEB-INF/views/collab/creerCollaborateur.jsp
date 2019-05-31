<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
		dist/css/bootstrap.css">
	</head>
	<body>
		<h1>Nouveau Collaborateur</h1>

		<form>
			<div class="form-group row">
				<label for="inputNom" class="col-sm-2 col-form-label">Nom</label>
				<div class="col-sm-10">
					<input type="text" readonly class="form-control"
						id="inputName" name="nom">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPrenom" class="col-sm-2 col-form-label">Nom</label>
				<div class="col-sm-10">
					<input type="text" readonly class="form-control"
						id="inputName" name="nom">
				</div>
			</div>
		</form>


</body>
</html>