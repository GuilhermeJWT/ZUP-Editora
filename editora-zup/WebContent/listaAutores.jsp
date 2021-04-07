<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Todos os Autores Cadastrados</title>
</head>
<body>
	<h1>Lista dos Autores</h1>
	<ul>
		<c:forEach items="${autores}" var="autor">
			<li>
			${autor.nome} - ${autor.email}
			<a href="/editora-zup/editarAutor?=${autor.id}">Editar</a>
			<a href="/editora-zup/removerAutor?=${autor.id}">Remover</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>