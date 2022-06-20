package br.com.bytefood.orm;

public class Pratos {
	
	private Integer id;
	
	private String nome;
	private char tamanho;
	private String Idenficiador;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getTamanho() {
		return tamanho;
	}
	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	public String getIdenficiador() {
		return Idenficiador;
	}
	public void setIdenficiador(String idenficiador) {
		Idenficiador = idenficiador;
	}
	
	
	
}
