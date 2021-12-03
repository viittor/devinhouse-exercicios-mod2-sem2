package aula03;

import java.util.Scanner;

public class LoopInfinito {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);

		int resposta = 21;
		
		while (resposta >= 20) {
			System.out.println("Digite sua tentativa: ");
			int tentativa = keyboard.nextInt();	
			resposta--;
		}
		System.out.println("Saiu do Loop");
	}

}
