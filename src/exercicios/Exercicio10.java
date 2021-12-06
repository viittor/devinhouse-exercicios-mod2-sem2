package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*A CUBO, emissora de TV nacional, está com uma nova iniciativa de marketing para aumentar o engajamento dos telespectadores. Agora, durante uma partida de futebol, a emissora irá receber, pelo WhatsApp, votos para os melhores jogadores de um time. Sabendo que uma equipe de futebol titular é composta por 11 jogadores, os telespectadores só precisam enviar por mensagem o número da camisa do jogador. Para o primeiro protótipo a ser apresentado, considere que os jogadores serão numerados de 1 até 11. O seu programa deve se manter solicitando o número do jogador que irá receber um voto até que o número 0 seja informado para encerrar a votação. Ao término da votação o programa deve mostrar a quantidade de votos que cada jogador recebeu, bem como o percentual de votos.

Abaixo segue exemplo de execução:

Vote em um jogador (1 ~ 11): 7
Vote em um jogador (1 ~ 11): 7
Vote em um jogador (1 ~ 11): 8
Vote em um jogador (1 ~ 11): 2
Vote em um jogador (1 ~ 11): 3
Vote em um jogador (1 ~ 11): 1
Vote em um jogador (1 ~ 11): 0

Jogador N:      Votos      Percentual
-------------------------------------
Jogador 1:      1              16.7%
Jogador 2:      1              16.7%
Jogador 3:      1              16.7%
Jogador 7:      2              33.3%
Jogador 8:      1              16.7%
Desafio opcional: caso um número de jogador inválido seja informado, mostra uma mensagem de apoio ao usuário orientando os números corretos e continue o recebimento dos votos.

Desafio opcional 2: ao término da votação indique o jogador com o maior percentual de votos. O craque da rodada!*/

		Scanner keyboard = new Scanner(System.in);
		int voto = 0;
		int jogador1 = 0;
		int jogador2 = 0;
		int jogador3 = 0;
		int jogador4 = 0;
		int jogador5 = 0;
		int jogador6 = 0;
		int jogador7 = 0;
		int jogador8 = 0;
		int jogador9 = 0;
		int jogador10 = 0;
		int jogador11 = 0;
		float percentual = 0;

		do {
			System.out.print("Vote em um jogador (1 ~ 11): ");
			voto = keyboard.nextInt();

			if (voto == 1) {
				jogador1++;
			} else if (voto == 2) {
				jogador2++;
			} else if (voto == 3) {
				jogador3++;
			} else if (voto == 4) {
				jogador4++;
			} else if (voto == 5) {
				jogador5++;
			} else if (voto == 6) {
				jogador6++;
			} else if (voto == 7) {
				jogador7++;
			} else if (voto == 8) {
				jogador8++;
			} else if (voto == 9) {
				jogador9++;
			} else if (voto == 10) {
				jogador10++;
			} else if (voto == 11) {
				jogador11++;
			} else if (voto == 0) {
				System.out.println("Encerrando votação!");
			}else {
				System.out.println("Inválido");
			}
		} while (voto != 0);

		System.out.println("Jogador N:    Votos    Percentual");
		float soma = jogador1 + jogador2 + jogador3 + jogador4 + jogador5 + jogador6 + jogador7 + jogador8 + jogador9
				+ jogador10 + jogador11;
		System.out.println("---------------------------------");

		if (jogador1 > 0) {
			percentual = (jogador1 / soma) * 100;
			System.out.printf("Jogador 1:      %d       %.1f %%\n", jogador1, percentual);
		}
		if (jogador2 > 0) {
			percentual = (jogador2 / soma) * 100;
			System.out.printf("Jogador 2:      %d       %.1f %%\n", jogador2, percentual);
		}
		if (jogador3 > 0) {
			percentual = (jogador3 / soma) * 100;
			System.out.printf("Jogador 3:      %d       %.1f %%\n", jogador3, percentual);
		}
		if (jogador4 > 0) {
			percentual = (jogador4 / soma) * 100;
			System.out.printf("Jogador 4:      %d       %.1f %%\n", jogador4, percentual);
		}
		if (jogador5 > 0) {
			percentual = (jogador5 / soma) * 100;
			System.out.printf("Jogador 5:      %d       %.1f %%\n", jogador5, percentual);
		}
		if (jogador6 > 0) {
			percentual = (jogador6 / soma) * 100;
			System.out.printf("Jogador 6:      %d       %.1f %%\n", jogador6, percentual);
		}
		if (jogador7 > 0) {
			percentual = (jogador7 / soma) * 100;
			System.out.printf("Jogador 7:      %d       %.1f %%\n", jogador7, percentual);
		}
		if (jogador8 > 0) {
			percentual = (jogador8 / soma) * 100;
			System.out.printf("Jogador 8:      %d       %.1f %%\n", jogador8, percentual);
		}
		if (jogador9 > 0) {
			percentual = (jogador9 / soma) * 100;
			System.out.printf("Jogador 9:      %d       %.1f %%\n", jogador9, percentual);
		}
		if (jogador10 > 0) {
			percentual = (jogador10 / soma) * 100;
			System.out.printf("Jogador 10:     %d       %.1f %%\n", jogador10, percentual);
		}
		if (jogador11 > 0) {
			percentual = (jogador11 / soma) * 100;
			System.out.printf("Jogador 11:     %d       %.1f %%\n", jogador11, percentual);
		}

	}

}
