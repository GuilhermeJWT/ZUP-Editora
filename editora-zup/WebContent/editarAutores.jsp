<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/editarAutor" var="redirecionaNovoAutor"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela para Editar os Autores</title>
</head>
<body>
	<form action="${redirecionaNovoAutor}" method="post">
		<label>Nome Autor: </label>
		<input type="text" name="nome" maxlength="20" value="${autor.nome}">
		<label>E-mail: </label>
		<input type="text" name="email" maxlength="30" value="${autor.email}">
		<input type="hidden" name="id" value="${autor.id}">
		<input type="submit">
	</form>
</body>
</html>