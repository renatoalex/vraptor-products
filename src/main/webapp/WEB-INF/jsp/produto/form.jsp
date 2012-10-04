<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		<div class="alert alert-error">
			${error.category} - ${error.message}<br />
		</div>
	</c:forEach>
</c:if>

<div class="container well">
	<form class="form-horizontal"
		action="${pageContext.request.contextPath}/produtos" method="post">

		<c:if test="${not empty produto.id}">
			<input type="hidden" name="produto.id" value="${produto.id}" />
			<input type="hidden" name="_method" value="put" />
		</c:if>
		<div class="control-group">
			<label class="control-label" for="produto.nome">Nome</label>
			<div class="controls">
				<input type="text" name="produto.nome" id="produto.nome"
					value="${produto.nome}" placeholder="Descrição" maxLength="50"/>
				<span class="help-block">Example block-level help text here.</span>	
			</div>

		</div>
		<div class="control-group">
			<label class="control-label" for="produto.preco">Preço</label>
			<div class="controls">
				<div class="input-prepend">
			  		<span class="add-on">R$</span><input type="text" name="produto.preco" id="produto.preco"
						value="${produto.precoFormatado}" placeholder="Valor" maxLength="12"/>
				</div>
				<span class="help-block">Example block-level help text here.</span>	
			</div>
		</div>
		<div class="control-group">
			<div class="actions">
				<button class="btn btn-success" type="submit">Salvar</button>
			</div>
		</div>
	</form>

	<a href="${pageContext.request.contextPath}/produtos">Voltar</a>

</div>
