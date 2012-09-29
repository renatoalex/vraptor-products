package br.gov.taxacao.modelo;

@javax.persistence.Entity
public class Produto extends Entity {
	
	private String nome;
	private Double preco;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getPreco() {
		return preco;
	}
	
}
