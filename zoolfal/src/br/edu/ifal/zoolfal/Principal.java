 package br.edu.ifal.zoolfal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Animal> banco = new ArrayList<Animal>();
		Scanner entrada = new Scanner (System.in);
		
		Animal a = new Animal();
		a.setNome("Camelo");
		a.getNome();
		a.setIdade(12);
		a.getIdade();
		a.setPeso(450.45);
		a.getPeso();
		a.setAltura(1.80);
		a.getAltura();
		
		Animal a2 = new Animal();
		a2.setNome("Cobra");
		a2.getNome();
		a2.setIdade(5);
		a2.getIdade();
		a2.setPeso(190.6);
		a2.getPeso();
		a2.setAltura(4.10);
		a2.getAltura();
		
		Animal a3 = new Animal("Zebra", 1, 350, 1.70);
		
		Animal a4 = new Animal("Tatu", 6, 6.7, 0.6);
		//banco.remove(a);
		banco.add(a3);
		banco.add(a);
		banco.add(a2);
		banco.add(a4);
		
		int opcao = -1;
		
		while(opcao != 5) {
		System.out.println("Escolha uma opção, digite: ");
		System.out.println("1 - Vizualizar animais já cadastrados e suas características");
		System.out.println("2 - Cadastrar novos animais");
		System.out.println("3 - Excluir animais");
		System.out.println("4 - Contar animais com mais de 5 anos");
		System.out.println("5 - Sair");
		System.out.println("6 - Saber quais animais tem mais de 10 anos");
		System.out.println("7 - Saber qual/quais animal/animais está/estão no sobrepeso");
		opcao = entrada.nextInt();
		entrada.nextLine();
		
		switch (opcao) {
		case 1:
			System.out.println("Segue abaixo lista de animais e suas características");
			for (Animal x: banco) {
				System.out.println("Nome do Animal: " + x.getNome());
				System.out.println("Peso do Animal: " + x.getPeso());
				System.out.println("Idade do Animal: " + x.getIdade());
				System.out.println("Altura do Animal: " + x.getAltura());
			}
			break;
			
		case 2:
			System.out.println("Nome: ");
			 	String nome = entrada.nextLine();
			System.out.println("Idade: ");
			 	int idade = entrada.nextInt();
			System.out.println("Peso: ");
				double peso = entrada.nextDouble();
			System.out.println("Altura: ");
				double altura = entrada.nextDouble();
				
			banco.add(new Animal(nome, idade, peso, altura));
			System.out.println("Cadastro feito com sucesso!!");
			break;
		
		case 3:
			System.out.println("Qual animal deseja excluir?");
			String animalExcluido = entrada.nextLine();
			boolean removido = banco.removeIf(x -> x.getNome().equalsIgnoreCase(animalExcluido));
			
			if(removido) {
				System.out.println("Animal removido");
			} else {
				System.out.println("Animal não encontrado");
			}
		case 4:
			int contador = 0; 

			for (Animal x : banco) {
			    if ( x.getIdade() >= 5 ) {
			        contador++; 
			    }
			}

			System.out.println("Total de animais com mais de 5 anos: " + contador);
			break;
		case 5:
			System.out.println("Finalizando programa!!");
			continue;
			
		case 6:
			System.out.println("Os animais maiores de 10 anos são:");
			for(Animal x : banco) {
				if(x.getIdade() > 10) {
					System.out.println(x.getNome());
				}
			}
		case 7:
			int contador2 = 0;
			
			for(Animal x : banco) {		
				if((x.getPeso()/(x.getAltura() * x.getAltura())) > 130) {
					System.out.println("O animal " + x.getNome() + " está acima do peso");
					contador2++;
				
				}
			}
			if(contador2 ==0) {
				System.out.println("Nenhum animal está no sobrepeso");
			} else if(contador2 == 1){
				System.out.println("Há exatamente um animal no sobrepeso");
			} else {
				System.out.println("Há um total de :" + contador2 + " animais acima do peso");
			}
			break;	
		}
		
		System.out.println("O que você gostaria de fazer agora?");
		}
		
		entrada.close();
	}
}

