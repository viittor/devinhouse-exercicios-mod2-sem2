package exercicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que receba uma data no formato DD/MM/AAAA e exiba-a em
		 * formato extenso. Por exemplo, para a data 21/07/2020 o programa deve exibir o
		 * resultado 21 de julho de 2020. O programa pode considerar que a entrada de
		 * dados ser� sempre v�lida e no formato correto.
		 * 
		 * Desafio opcional: adapte o seu programa para suportar o tratamento de erros.
		 * Ou seja, quando uma data informada estiver fora do padr�o esperado, ou for
		 * uma data inv�lida, exiba uma mensagem de erro e solicite a data novamente.
		 */
		// EXERCICIO 5

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma Data:");
		String data = entrada.nextLine();

		String dia = data.substring(0,2);
		String mes = data.substring(3,5);
		String ano = data.substring(6);

		switch (mes) {
		case "01":
			mes = "Janeiro";
			break;
		case "02":
			mes = "Fevereiro";
			break;
		case "03":
			mes = "Mar�o";
			break;
		case "04":
			mes = "Abril";
			break;
		case "05":
			mes = "Maio";
			break;
		case "06":
			mes = "Junho";
			break;
		case "07":
			mes = "Julho";
			break;
		case "08":
			mes = "Agosto";
			break;
		case "09":
			mes = "Setembro";
			break;
		case "10":
			mes = "Outubro";
			break;
		case "11":
			mes = "Novembro";
			break;
		case "12":
			mes = "Dezembro";
			break;
			default:
				System.out.println("Voc� digitou o m�s incorretamente!");
				System.exit(0);
		}
		
		System.out.printf("A data � %s de %s de %s!", dia, mes, ano);

	}

}
