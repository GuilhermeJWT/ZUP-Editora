<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/autorServlet" var="redirecionaAutor"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Autores</title>
</head>
<body>
	<form action="${redirecionaAutor}" method="post">
		<label>Nome Autor: </label>
			<input type="text" name="nome" maxlength="20">
		<label>E-mail: </label>	
		<input type="text" name="email" maxlength="30">
		
		<input type="submit">
		
	</form>
</body>
</html>