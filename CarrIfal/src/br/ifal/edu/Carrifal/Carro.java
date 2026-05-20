package br.ifal.edu.Carrifal;

public class Carro {
	private String modelo;
	private double preco;
	private int ano;
	
	public Carro() {
		
	}
	public Carro(String modelo, double preco, int ano) {
		this.modelo = modelo;
		this.preco = preco;
		this.ano = ano;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		return ano;
	}
}
