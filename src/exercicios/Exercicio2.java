package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, pergunte ao
		 * usu�rio seu sobrenome, depois seu nome, e ent�o escreva na tela, em uma �nica
		 * �string�, o nome completo do usu�rio.
		 */
		// EXERCICIO 2
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual seu Sobrenome? ");
		String sobrenome = entrada.nextLine();

		System.out.print("Qual seu Nome? ");
		String nome = entrada.nextLine();

		System.out.println(nome + " " + sobrenome + ", Obrigado por usar nosso programa!");

	}

}
