package br.edu.ifal.Sorveteria;

public class Sorvete {
	private String cor;
	private String nome;
	private String sabor;
	private boolean especial;
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor(){
		return cor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getSabor() {
		return sabor;
	}
	
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public boolean getEspecial() {
		return especial;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}



