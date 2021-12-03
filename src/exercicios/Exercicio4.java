package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, pergunte ao
		 * usu�rio a seguinte frase: �Adivinhe qual n�mero de 1 a 5 eu estou pensando�.
		 * Na sequ�ncia, o usu�rio deve inserir um n�mero entre 1 e 5, e o seu programa
		 * deve gerar aleatoriamente outro n�mero, tamb�m de 1 a 5. Se o n�mero gerado
		 * for o mesmo que o usu�rio inseriu, o programa deve escrever na tela �Voc�
		 * acertou!�, mas se for diferente, o programa deve escrever �Voc� errou, o
		 * n�mero correto era X�, onde X � o n�mero gerado aleatoriamente pelo programa.
		 * 
		 * Opcional: Deixe o jogo mais interessante deixando o usu�rio continuar
		 * tentando adivinhar at� ele acertar e escreva �Parab�ns voc� acertou com X
		 * tentativas�.
		 */
		// EXERCICIO 4
		System.out.println("=======================================");
		System.out.println("========== ADIVINHE O N�MERO ==========");
		System.out.println("=======================================");
		System.out.println("Adivinhe qual n�mero de 1 a 5 eu estou pensando: ");
		Scanner number = new Scanner(System.in);
		int n1 = number.nextInt();
		System.out.println("=======================================");

		Random aleatorio = new Random();
		int n2 = aleatorio.nextInt(6);

		int contador = 0;

		if (n1 > 0 && n1 < 6) {
			if (n1 == n2) {
				System.out.println("Parab�ns! Voc� Acertou");
				System.out.println("=======================================\n");

				if (contador > 0) {
					System.out.println("Parab�ns voc� acertou com " + contador + " tentativas");
					System.out.println("========== PROGRAMA FINALIZADO ==========\n");

				}
			} else {
				System.out.println("Que pena, voc� Errou! O numero correto era " + n2);
				System.out.println("=======================================\n");

				contador++;
				main(args);// chama novamente a fun��o main com os mesmos parametros.

			}

		} else {
			System.out.println("Voc� deve digitar um n�mero entre 1 e 5! Por favor tente novamente.");
			System.out.println("=======================================\n");
			contador++;
			main(args);// chama novamente a fun��o main com os mesmos parametros.
		}

	}

}
