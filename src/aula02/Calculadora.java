package aula02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("************************************");
		System.out.println("***********CALCULADORA**************\n");

		System.out.println("Digite o primeiro n�mero: ");
		int number1 = entrada.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int number2 = entrada.nextInt();
		double resultado = 0;
		entrada.nextLine();
		System.out.println("\nQual opera��o deseja realizar?");
		System.out.println("1 - ADI��O");
		System.out.println("2 - SUBTRA��O");
		System.out.println("3 - DIVIS�O");
		System.out.println("4 - MULTIPLICA��O\n");
		String operacao = entrada.nextLine();

		switch (operacao) {
		case "1":
			resultado = number1 + number2;
			break;
		case "2":
			resultado = number1 - number2;
			break;
		case "3":
			resultado = number1 / number2;
			break;
		case "4":
			resultado = number1 * number2;
			break;
		default:
			System.out.println("Opera��o inv�lida, por favor tente novamente!");
		}

		System.out.printf("Resultado: %f", resultado);

	}

}
