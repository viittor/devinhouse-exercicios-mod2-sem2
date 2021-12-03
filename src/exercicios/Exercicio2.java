package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Crie um programa em Java que, utilizando a classe Scanner, pergunte ao
		 * usuário seu sobrenome, depois seu nome, e então escreva na tela, em uma única
		 * “string”, o nome completo do usuário.
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
