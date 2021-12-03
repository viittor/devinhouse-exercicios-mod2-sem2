package exercicios;

import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*
		 * Atualize o programa do exercício 2 para que ao executar, verifique o horário
		 * atual e escreva para o usuário uma saudação, contendo o período e o horário.
		 * Por exemplo: “Boa tarde [nome_completo], no momento são 15:08.”.
		 */
		// EXERCICIO 3
      Scanner entrada = new Scanner(System.in);
      System.out.print("Qual seu Sobrenome? ");
      String sobrenome = entrada.nextLine();

      System.out.print("Qual seu Nome? ");
      String nome = entrada.nextLine();

      LocalTime hora = LocalTime.now();

      System.out.println(nome +" " + sobrenome + ", Obrigado por usar nosso programa! Agora são exatamente: " + hora);


	}

}
