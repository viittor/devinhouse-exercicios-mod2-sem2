package exercicios;

import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*
		 * Atualize o programa do exerc�cio 2 para que ao executar, verifique o hor�rio
		 * atual e escreva para o usu�rio uma sauda��o, contendo o per�odo e o hor�rio.
		 * Por exemplo: �Boa tarde [nome_completo], no momento s�o 15:08.�.
		 */
		// EXERCICIO 3
      Scanner entrada = new Scanner(System.in);
      System.out.print("Qual seu Sobrenome? ");
      String sobrenome = entrada.nextLine();

      System.out.print("Qual seu Nome? ");
      String nome = entrada.nextLine();

      LocalTime hora = LocalTime.now();

      System.out.println(nome +" " + sobrenome + ", Obrigado por usar nosso programa! Agora s�o exatamente: " + hora);


	}

}
