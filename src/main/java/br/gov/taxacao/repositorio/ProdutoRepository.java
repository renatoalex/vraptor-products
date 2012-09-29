package br.gov.taxacao.repositorio;

import java.util.List;

import br.gov.taxacao.modelo.Produto;

public interface ProdutoRepository {
	/*
	 * Delete the methods you don't want to expose
	 */
	 
	void create(Produto entity);
	
	Produto update(Produto entity);
	
	void destroy(Produto entity);
	
	Produto find(Long id);
	
	List<Produto> findAll();

}
