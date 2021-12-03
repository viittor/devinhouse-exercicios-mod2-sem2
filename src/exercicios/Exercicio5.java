package exercicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que receba uma data no formato DD/MM/AAAA e exiba-a em
		 * formato extenso. Por exemplo, para a data 21/07/2020 o programa deve exibir o
		 * resultado 21 de julho de 2020. O programa pode considerar que a entrada de
		 * dados será sempre válida e no formato correto.
		 * 
		 * Desafio opcional: adapte o seu programa para suportar o tratamento de erros.
		 * Ou seja, quando uma data informada estiver fora do padrão esperado, ou for
		 * uma data inválida, exiba uma mensagem de erro e solicite a data novamente.
		 */
		// EXERCICIO 5

		Scanner entrada = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		System.out.println("Digite uma Data:"); // String data
		entrada.nextLine();
		Date data = c.getTime();
		DateFormat f = DateFormat.getDateInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data2 = f.parse("21/01/1995");
		System.out.println(data2);
		System.out.println(data);
		DateFormat formatData = DateFormat.getDateInstance();
		System.out.println(formatData.format(data));

	}

}
