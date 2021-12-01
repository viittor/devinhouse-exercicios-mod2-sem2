/*
Exerc�cio: Escreva um programa para ler duas notas de um aluno. Calcule e imprima a 
m�dia do semestre. O programa deve aceitar apenas pontua��es v�lidas, notas entre 0 
e 10. Cada pontua��o deve ser validada separadamente.
O programa deve imprimir uma mensagem "Novo c�lculo (1 - sim 2 - n�o)". Depois, a 
entrada ser� (1 ou 2). 1 significa um novo c�lculo, 2 significa que a execu��o deve 
ser conclu�da.

Entrada:
O programa deve come�ar solicitando um n�mero inteiro X, ap�s do n�mero X duas entradas
Entrada:
O programa deve come�ar solicitando um n�mero inteiro X, ap�s do n�mero X duas entradas
de 2 pontua��es v�lidas devem ser inseridas. Seu programa deve parar quando X = 2.
Sa�da:
Se uma pontua��o inv�lida for lida, deve ser impressa a mensagem "Nota inv�lida". Quando
duas pontua��es v�lidas s�o lidas, a mensagem "M�dia = [valor da m�dia]" deve ser impressa. A mensagem "Novo c�lculo (1 - sim 2 - n�o)" deve ser impressa ap�s a leitura de X. Essa mensagem deve ser exibida novamente se o n�mero de entrada padr�o para X for menor que 1 ou maior que 2.
*/

package aula02;

import java.util.Scanner;

public class CalculoNotas {

	public static void main(String[] args) {
		System.out.println("Fazer novo c�lculo: 1 - Sim | 2 - N�o");
		Scanner entrada = new Scanner(System.in);

		float nota1 = 0;
		float nota2 = 0;
		float media = 0;
		int opcao = entrada.nextInt();

		while (opcao != 2) {
			System.out.println("Digite a primeira nota:");
			nota1 = entrada.nextFloat();
			if (nota1 < 0 || nota1 > 10) {
				System.out.println("Nota Inv�lida");
				continue;
			}
			System.out.println("Digite a segunda nota:");
			nota2 = entrada.nextFloat();
			if (nota2 < 0 || nota2 > 10) {
				System.out.println("Nota Inv�lida");
				continue;
			}
			media = (nota1 + nota2) / 2;
			System.out.printf("M�dia: %.2f", media);
		}
	}

}
