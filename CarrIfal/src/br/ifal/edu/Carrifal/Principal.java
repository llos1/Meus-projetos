package br.ifal.edu.Carrifal;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Carro> banco = new ArrayList<Carro>();
		Scanner ler = new Scanner(System.in);
		
		Carro c = new Carro("Fusca", 70000.00, 2006);
		Carro c2 = new Carro("Ferrari", 1000000.00, 2023);
		Carro c3 = new Carro("Jeep", 250000.00, 2017);
		Carro c4 = new Carro("Pickup", 300000.00, 2026);
		
		banco.add(c);
		banco.add(c2);
		banco.add(c3);
		banco.add(c4);
		
		int opcao = -1;
		while(opcao != 0) {
			System.out.println("=== Olá === \nBem vindo ao CarrIfal, em que podemos te ajudar? Digite: ");
			System.out.println("1 - Vizualizar todos os carros cadastrados e suas características");
			System.out.println("2 - Cadastrar novos carros");
			System.out.println("3 - Excluir carros");
			System.out.println("4 - Relatorio de preços");
			System.out.println("0 - Sair");
			opcao = ler.nextInt();
			ler.nextLine();
			
			switch(opcao){
			case 1:
				for(Carro x : banco) {
					System.out.println("Modelo: " + x.getModelo());
					System.out.println("Preco: " + x.getPreco());
					System.out.println("Ano: " + x.getAno());
				}
				break;
			case 2:
				System.out.println("== Iniciando processo de cadastro ==");
				System.out.println("Modelo: ");
				String modelo = ler.nextLine();
				
				System.out.println("Preço: ");
				double preco = ler.nextDouble();
				
				System.out.println("Ano:");
				int ano = ler.nextInt();
				banco.add(new Carro(modelo, preco, ano));
				
				System.out.println("Carro cadastrado com sucesso!!");
				break;
				
			case 3:
				System.out.println("Me diga qual carro você deseja excluir");
				String carroRemovido = ler.nextLine();
				boolean remocao;
				remocao = banco.removeIf(x -> x.getModelo().equalsIgnoreCase(carroRemovido));
				
				if(remocao) {
					System.out.println("Carro removido com sucesso");
				} else {
					System.out.println("O carro que você citou não foi encontrado");
				}
				break;
			
			case 4:
				int contador = 0;
				for(Carro x : banco) {
					if(x.getPreco() > 170000.00) {
						System.out.println("O carro " + x.getModelo() + " custa mais de 170 mil reais");
						contador++;
					}
				}
					if(contador == 0) {
						System.out.println("Não há nenhum carro de luxo");
					} else if(contador ==1) {
						System.out.println("Há apenas um carro de luxo");
					} else {
						System.out.println("Há " + contador + " carros de luxo");
					}
				   break;
			case 0:
				System.out.println("== FINALIZANDO PROGRAMA ==");
				continue;
				
				
			}
			System.out.println("O que você gostaria de fazer agora?");
		}
		
		ler.close();
		
	}

}
