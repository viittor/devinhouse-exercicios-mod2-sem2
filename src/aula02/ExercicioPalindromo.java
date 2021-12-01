package aula02;

import java.util.Scanner;

public class ExercicioPalindromo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um palindromo");
		String tentativa = entrada.nextLine();
		
		String palavraInvertida = "";
		
		for(int i = tentativa.length() -1; i >=0; i--) {
			palavraInvertida += tentativa.charAt(i);
		}
		
		if(palavraInvertida.equals(tentativa)) {
			System.out.println("É um palíndromo!");
		}else {
			System.out.println("Não é um palíndromo!");
		}
		
	}

}
