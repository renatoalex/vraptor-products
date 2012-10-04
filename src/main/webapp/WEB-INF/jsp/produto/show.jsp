<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<head>
	<title>Produto [show]</title>
</head>
<body>
	<p>
		<b>Nome:</b>
		${produto.nome}
	</p>
	<p>
		<b>Preço:</b>
		${produto.precoFormatado}
	</p>

	<a href="${pageContext.request.contextPath}/produtos/${produto.id}/edit">Editar</a>
	<a href="${pageContext.request.contextPath}/produtos">Voltar</a>
</body>