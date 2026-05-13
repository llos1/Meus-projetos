package br.edu.ifal.Sorveteria;

public class Principal {

	public static void main(String[] args) {
		Sorvete sov1 = new Sorvete();
		Sorvete sov2 = new Sorvete();
		Sorvete sov3 = new Sorvete();
		
		sov1.setCor("Azul");
		sov2.setCor("Amarelo");
		sov3.setCor("Branco");

		sov1.getCor();
		String cor = sov2.getCor();
		
		sov1.setSabor("Chocolate");
		sov2.setSabor("Maracujá");
		sov3.setSabor("Flocos");
		String sabor = sov2.getSabor();
		
		System.out.println("A cor do sorvete 2 é: " + cor + ", e o sabor é: " + sabor);
	}

}
