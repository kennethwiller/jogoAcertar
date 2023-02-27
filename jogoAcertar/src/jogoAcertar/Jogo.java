package jogoAcertar;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		
		int opcao;
		int escolhaComputador;
		int escolhaUsuario;
		
		System.out.print("Olá, Qual o seu nome? ");
		String nome = sc.nextLine();
		
		System.out.println("\nPrazer em conhece-lo " + nome + "!");
		System.out.println(nome + ", você quer jogar comigo?");
		System.out.println("Informe o número da sua opção: \n1 -> Jogar\n2 -> Sair");
		opcao = sc.nextInt();
		
		if (opcao == 2) {
			System.out.println("Que pena! mas tudo bem, fica para a proxima!");
		}
		else {
			System.out.println("Ok! o jogo funciona da seguinte forma...");
			System.out.println("Eu vou escolher um número de 0 a 10 mas não vou falar para você qual é.");
			System.out.println("Seu objetivo é advinhar qual número eu escolhi, caso você escolha o número correto, você vence o jogo!");
		
			escolhaComputador = gerador.nextInt(11);
			
			System.out.println("Ok, " + nome + " Já escolhi!");
			System.out.println("Agora tente advinhar qual é o número: ");
			
			do {
				escolhaUsuario = sc.nextInt();
				
				if (escolhaUsuario != escolhaComputador) {
					System.out.println("Resposta errada!");
				} else {
					System.out.println("Parabéns! você acertou!");
				}
			} while (escolhaComputador != escolhaUsuario);
			
		}
		
		sc.close();

	}

}
