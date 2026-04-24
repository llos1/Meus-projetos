package br.edu.ifal.exemplojogo;
import br.edu.ifal.exemplojogo.personagens.*;

public class Jogo {

	public static void main(String[] args) {
		System.out.println("*Iniciando o Ifal Royale*");
		
		Mago listaMago[] = new Mago[5];
		listaMago[0].nome = "Davy";
		listaMago[0].xp = 10;
		
		Mago m1 = new Mago();
		m1.nome = "Maguinho";
		m1.xp = 10;
		
		Mago m2 = new Mago();
		m2.nome = "Potter";

		System.out.println("Nome do mago: " + m1.nome + " xp: " + m1.xp);
		System.out.println("Nome do mago 2: " + m2.nome + " xp: " + m2.xp);
		
		Cavaleiro c1 = new Cavaleiro();
		c1.nome = "Rei";
		
		System.out.println("Nome do cavaleiro: " + c1.nome);
	}

}
