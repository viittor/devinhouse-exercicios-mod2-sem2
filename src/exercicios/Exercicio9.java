package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio9 {

	private static Scanner keyboard;

	public static void main(String[] args) {

		/*
		 * Ap�s o sucesso da modalidade Skate Street nas olimp�adas, a Confedera��o
		 * Brasileira de Skate lhe contratou para desenvolver o programa que ir�
		 * contabilizar os pontos dos atletas no pr�ximo campeonato brasileiro. Na
		 * modalidade Street cada competidor recebe uma nota de 0 a 10 por volta. Ao
		 * final de 5 voltas a maior e a menor nota s�o descartadas. A nota do
		 * competidor � a m�dia das tr�s notas restantes. Seu programa deve receber uma
		 * nota por vez e ao final mostrar qual foi a maior nota, a menor nota, a m�dia
		 * das notas contabilizadas e quais as notas foram contabilizadas.
		 * 
		 * Abaixo segue exemplo da execu��o:
		 * 
		 * Informe a nota 1: 8.5 
		 * Informe a nota 2: 8.9 
		 * Informe a nota 3: 9.2 
		 * Informe a nota 4: 6 
		 * Informe a nota 5: 7 
		 * ----------------------- 
		 * A m�dia das notas consideradas foi: 8.13 
		 * A maior nota foi: 9.2 
		 * A menor nota foi: 6.0 
		 * Notas consideradas: 8.5, 8.9, 7.0
		 */
		
		//EXERCICIO 9
		
		System.out.println("CAMPEONATO BRASILEIRO DE SKATE STREET");
		keyboard = new Scanner(System.in);
		float[] notas = new float[5];
		
		float media = 0;

		for(int i=0; i< notas.length; i++) {
			System.out.printf("Informe a nota %d: ", (i+1));
			
			float nota = keyboard.nextFloat();
			notas[i] = nota;
		}
		Arrays.sort(notas);//Algoritmo de ordena��o SORT
		
		System.out.println("------------------------------");

		media = ((notas[1] + notas[2] + notas[3]) / 3);
		System.out.printf("A m�dia das notas consideradas foi: %.2f\n", media);
		System.out.printf("A maior nota foi: %.2f\n", notas[4]);
		System.out.printf("A menor nota foi: %.2f\n", notas[0]);
		System.out.printf("Notas consideradas: %.2f, %.2f, %.2f \n", notas[1], notas[2], notas[3]);
		

}
}
