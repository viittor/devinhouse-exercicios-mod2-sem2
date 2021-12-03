package aula03;

import java.util.Scanner;

public class Ex1Arrays {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		for(int i = 0; i <numeros.length; i++) {
			System.out.println("Digite um número inteiro:");
			int numeroDigitado = keyboard.nextInt();
			numeros[i] = numeroDigitado;
		}
		
		for(int numero :numeros) {
			System.out.println(numero);
		}
	}

}
