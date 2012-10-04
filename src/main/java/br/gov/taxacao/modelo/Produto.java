package br.gov.taxacao.modelo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import java.text.DecimalFormat;
import java.text.NumberFormat;  
import java.util.Currency;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@javax.persistence.Entity
public class Produto extends Entity {
	
	@NotEmpty(message = "{campo.obrigatorio}") 
	private String nome;
	
	@NotNull(message = "{campo.obrigatorio}")  
    @DecimalMin(value="0.01", message = "{preco.minimo}")  
	@DecimalMax(value="1000000.00", message = "{preco.maximo}")
	private BigDecimal preco;

	private String precoFormatado;

	public String getPrecoFormatado(){
		if (preco != null) {
			NumberFormat formatter = NumberFormat.getNumberInstance();
			return formatter.format(preco);
		}
		return "";
	}
	
	public void setPrecoFormatado(String precoFormatado){
		this.precoFormatado = precoFormatado;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		if (preco!=null){
		BigDecimal precoformatado = preco.divide(BigDecimal.ONE, 2, BigDecimal.ROUND_HALF_UP);
		this.preco = precoformatado;
		} else {
		this.preco = new BigDecimal(new BigInteger("0"), 2);	
		}		
	}
 
	
}
