package br.com.bytefood.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer comanda;
	
	private double taxaEntrega = 15;	
	
	
	private String cliente;
	private String enderecoEntrega;
	private String formaPagamento;
	
	
	private String prato;
	private Integer quantidade;
	private double valor;
	
	private String entregador;
	
	
	private double precoTotal = (valor * quantidade) + taxaEntrega;


	public double getTaxaEntrega() {
		return taxaEntrega;
	}


	public void setTaxaEntrega(double taxaEntrega) {
		this.taxaEntrega = taxaEntrega;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}


	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


	public String getPrato() {
		return prato;
	}


	public void setPrato(String prato) {
		this.prato = prato;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getEntregador() {
		return entregador;
	}


	public void setEntregador(String entregador) {
		this.entregador = entregador;
	}


	public double getPrecoTotal() {
		return precoTotal;
	}


	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	
	
}
