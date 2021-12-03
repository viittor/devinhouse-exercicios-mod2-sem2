package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, pergunte ao
		 * usuário a seguinte frase: “Adivinhe qual número de 1 a 5 eu estou pensando”.
		 * Na sequência, o usuário deve inserir um número entre 1 e 5, e o seu programa
		 * deve gerar aleatoriamente outro número, também de 1 a 5. Se o número gerado
		 * for o mesmo que o usuário inseriu, o programa deve escrever na tela “Você
		 * acertou!”, mas se for diferente, o programa deve escrever “Você errou, o
		 * número correto era X”, onde X é o número gerado aleatoriamente pelo programa.
		 * 
		 * Opcional: Deixe o jogo mais interessante deixando o usuário continuar
		 * tentando adivinhar até ele acertar e escreva “Parabéns você acertou com X
		 * tentativas”.
		 */
		// EXERCICIO 4
		System.out.println("=======================================");
		System.out.println("========== ADIVINHE O NÚMERO ==========");
		System.out.println("=======================================");
		System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando: ");
		Scanner number = new Scanner(System.in);
		int n1 = number.nextInt();
		System.out.println("=======================================");

		Random aleatorio = new Random();
		int n2 = aleatorio.nextInt(6);

		int contador = 0;

		if (n1 > 0 && n1 < 6) {
			if (n1 == n2) {
				System.out.println("Parabéns! Você Acertou");
				System.out.println("=======================================\n");

				if (contador > 0) {
					System.out.println("Parabéns você acertou com " + contador + " tentativas");
					System.out.println("========== PROGRAMA FINALIZADO ==========\n");

				}
			} else {
				System.out.println("Que pena, você Errou! O numero correto era " + n2);
				System.out.println("=======================================\n");

				contador++;
				main(args);// chama novamente a função main com os mesmos parametros.

			}

		} else {
			System.out.println("Você deve digitar um número entre 1 e 5! Por favor tente novamente.");
			System.out.println("=======================================\n");
			contador++;
			main(args);// chama novamente a função main com os mesmos parametros.
		}

	}

}
