<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/produtos" method="post">
  
	<c:if test="${not empty produto.id}">
		<input type="hidden" name="produto.id" value="${produto.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Nome:<br />
		<input type="text" name="produto.nome" value="${produto.nome}"/>
	</div>
	<div class="field">
		Preço:<br />
		<input type="text" name="produto.preco" value="${produto.preco}"/>
	</div>

<div class="actions">
	<button type="submit">Salvar</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/produtos">Voltar</a>
