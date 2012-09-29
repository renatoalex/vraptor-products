package br.gov.taxacao.controlador;

import java.util.List;

import br.gov.taxacao.modelo.Produto;
import br.gov.taxacao.repositorio.ProdutoRepository;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class ProdutoController {

	private final Result result;
	private final ProdutoRepository repository;
	private final Validator validator;
	
	ProdutoController(Result result, ProdutoRepository repository, Validator validator) {
		this.result = result;
		this.repository = repository;
		this.validator = validator;
	}
	
	@Get("/produtos")
	public List<Produto> index() {
		return repository.findAll();
	}
	
	@Post("/produtos")
	public void create(Produto produto) {
		validator.validate(produto);
		validator.onErrorUsePageOf(this).newProduto();
		repository.create(produto);
		result.redirectTo(this).index();
	}
	
	@Get("/produtos/new")
	public Produto newProduto() {
		return new Produto();
	}
	
	@Put("/produtos")
	public void update(Produto produto) {
		validator.validate(produto);
		validator.onErrorUsePageOf(this).edit(produto);
		repository.update(produto);
		result.redirectTo(this).index();
	}
	
	@Get("/produtos/{produto.id}/edit")
	public Produto edit(Produto produto) {
		return repository.find(produto.getId());
	}

	@Get("/produtos/{produto.id}")
	public Produto show(Produto produto) {
		return repository.find(produto.getId());
	}

	@Delete("/produtos/{produto.id}")
	public void destroy(Produto produto) {
		repository.destroy(repository.find(produto.getId()));
		result.redirectTo(this).index();  
	}
}