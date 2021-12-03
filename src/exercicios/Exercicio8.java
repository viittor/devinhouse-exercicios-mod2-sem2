package exercicios;

import java.util.Scanner;

public class Exercicio8 {

	private static Scanner keyboard;

	public static void main(String[] args) {

		/*
		 * Jokenpô é o clássico jogo de "pedra, papel e tesoura". Crie um programa em
		 * Java para que dois jogadores possam jogar Jokenpo no computador. O programa
		 * deve receber em uma linha as jogadas de ambos jogadores separadas por um
		 * espaço. O código das jogadas (movimentos) segue a especificação:
		 * 
		 * R: Pedra P: Papel S: Tesoura Relembrando as regras do jogo: - Pedra vence
		 * Tesoura e perde de Papel - Papel vence Pedra e perde de Tesoura - Tesoura
		 * vence Papel e perde de Pedra
		 * 
		 * O programa deve continuar recebendo as jogadas até que uma linha em branco
		 * (sem jogadas) seja informada. Após o término das jogadas, o programa deve
		 * apresentar o placar da partida.
		 * 
		 * Exemplo de execução:
		 * 
		 * Informe as jogadas: S P Informe as jogadas: R S Informe as jogadas: P R
		 * Informe as jogadas: -------------------------------- Jogador A 3 x 0 Jogador
		 * B
		 */

		// EXERCICIO 8
		keyboard = new Scanner(System.in);
		System.out.println("=========");
		System.out.println(" JOKENPÔ ");
		System.out.println("=========");
		String entrada = "OI";

		char pedra = 'R';
		char papel = 'P';
		char tesoura = 'S';
		int placar1 = 0;
		int placar2 = 0;

		while (!entrada.equals("")) {
			System.out.print("Informe as jogadas: ");
			entrada = keyboard.nextLine();
			if (!entrada.equals("")) {
				char jog1 = entrada.charAt(0);
				char jog2 = entrada.charAt(2);

				if (jog1 == pedra && jog2 == tesoura) {
					placar1++;
				} else if (jog1 == pedra && jog2 == papel) {
					placar2++;
				} else if (jog1 == tesoura && jog2 == pedra) {
					placar2++;
				} else if (jog1 == tesoura && jog2 == papel) {
					placar1++;
				} else if (jog1 == papel && jog2 == pedra) {
					placar1++;
				} else if (jog1 == papel && jog2 == tesoura) {
					placar2++;
				}
			}
		}

		System.out.println("===================");
		System.out.printf(" Jogador A    %d  X   %d    Jogador B\n", placar1, placar2);

		if (placar1 > placar2) {
			System.out.println("Uhuull... Jogador 1 é o vencedor!");
		} else if (placar1 < placar2) {
			System.out.println("Uhuull... Jogador 2 é o vencedor!");
		} else {
			System.out.println("Empatou!");
		}
		System.out.println("Jogo finalizado! Placar:");

	}

}
