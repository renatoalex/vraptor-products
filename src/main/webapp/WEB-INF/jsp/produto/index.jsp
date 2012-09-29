<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
<title>Produto [index]</title>
</head>
<body>
	<div class="container well">
		<h1>Lista de produtos cadastrados</h1>

		<table class="table table-striped table-condensed">
			<tr>
				<th>Nome</th>
				<th>Preço</th>
				<th></th>
				<th></th>
				<th></th>
			</tr>

			<c:forEach items="${produtoList}" var="produto">
				<tr <c:if test="${empty produto.preco}">class="error"</c:if>>
					<td>${produto.nome}</td>
					<td>${produto.preco}</td>
					<td><a
						href="${pageContext.request.contextPath}/produtos/${produto.id}"
						class="btn btn-info"><i class="icon-info-sign"></i>detalhes</a></td>
					<td><a
						href="${pageContext.request.contextPath}/produtos/${produto.id}/edit"
						class="btn"><i class="icon-edit"></i>editar</a></td>
					<td>
						<form
							action="${pageContext.request.contextPath}/produtos/${produto.id}"
							method="post">
							<input type="hidden" name="_method" value="delete" />
							<button type="submit" class="btn btn-danger"
								onclick="return confirm('Tem certeza que deseja remover este produto?')">
								<i class="icon-remove-sign icon-white"></i>remover
							</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>

		<br /> <a href="${pageContext.request.contextPath}/produtos/new"
			class="btn btn-primary"><i class="icon-plus"></i>Novo Produto</a>
	</div>	


</body>