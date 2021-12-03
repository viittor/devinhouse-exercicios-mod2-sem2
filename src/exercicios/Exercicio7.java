package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	private static Scanner keyboard;

	public static void main(String[] args) {
//		A obesidade é considerada por muitos especialistas a doença do século XXI. Visando 
//		auxiliar o planejamento de nutricionistas e educadores físicos, você teve a ideia de
//		desenvolver um sistema que os auxilie na recomendação de dietas para pessoas. O seu 
//		programa recebe algumas informações e responde com a quantidade máxima de calorias da 
//		dieta, conforme os objetivos da pessoa. Os especialistas lhe informaram o seguinte:
//
//			Considere que para perder 1 kg uma pessoa precisa deixar de ingerir 7000kcal;
//			Considere que para cada 1 hora de exercício físico, uma pessoa consome 400kcal;
//			A quantidade de kcal que uma pessoa consome por dia em repouso (taxa metabólica basal) 
//			se dá pelas fórmulas:
//			Homem: (10 peso) + (6.25 altura) - (5 * idade) + 5;
//			Mulher: (10 peso) + (6.25 altura) - (5 * idade) - 161;
//			Abaixo segue especificação da entrada e saída esperadas:
//
//			Entrada
//			Sexo da pessoa (M ou F).
//			Caso a valor informado difere do esperado, exibir mensagem de erro e abortar execução;
//			Peso atual (kg)
//			Altura (cm)
//			Idade (anos)
//			Horas de atividade física por dia
//			Peso (kg) que a pessoa deseja perder em um mês.
//			Se for informado mais do que 3 kg exibir a mensagem: "Perder mais do que 3 kg por mês 
//				pode ser prejudicial" e abortar a execução.
//			Saída:
//			Máximo de kcal que a pessoa deve consumir por dia (dieta)
//			Exemplo de execução:
//
//			Informe seu sexo (M ou F): M
//			Informe quantos quilos precisa perder em um mês: 2
//			Informe seu peso em quilos: 110
//			Informe sua altura em cm: 175
//			Informe sua idade em anos: 30
//			Informe quantas horas de exercícios físicos pratica por dia: 1
//			-------------
//			Você precisa de uma dieta de: 1982,75 kcal/dia
//			Desafio opcional: ajuste o seu programa para, ao invés de solicitar as horas de atividades 
//				físicas por dia, exibir o máximo de kcal que a pessoa deve consumir se praticar 1, 2 ou 3 horas de exercício por dia.

		// EXERCICIO 7

		System.out.println("=============================================");
		System.out.println(" SISTEMA SUPER AVANÇADO DE SAÚDE E BEM ESTAR ");

		keyboard = new Scanner(System.in);
		System.out.println("Informe seu Sexo (M ou F): ");
		String sexo = keyboard.next();

		if ((sexo.equals("M")) || (sexo.equals("m"))) {
			System.out.println("Masculino Selecionado");
		} else if ((sexo.equals("F")) || (sexo.equals("f"))) {
			System.out.println("Feminino Selecionado");
		} else {
			System.out.println("Você digitou um valor inválido. Por favor tente novamente!");
			System.exit(0);
		}

		System.out.println("Informe seu peso em quilos: ");
		int peso = keyboard.nextInt();

		System.out.println("Informe sua altura em centimetros: ");
		int altura = keyboard.nextInt();

		System.out.println("Informe sua idade em anos: ");
		int idade = keyboard.nextInt();

		System.out.println("Informe quantas horas de exercicios físicos pratica por dia: ");
		int atividade = keyboard.nextInt();

		System.out.println("Informe quantos quilos precisa perder em um mês");
		int objetivo = keyboard.nextInt();

		if (objetivo > 3) {
			System.out.println("Perder mais do que 3kg por mês pode ser prejudicial!");
			System.exit(0);
		}

		// taxa metabolica basal

		float calculoBasal = 0;

		if ((sexo.equals("M")) || (sexo.equals("m"))) {
			calculoBasal = (float) ((10 * peso) + (6.25 * altura) - (5 * idade) + 5);

		} else {
			calculoBasal = (float) ((10 * peso) + (6.25 * altura) - (5 * idade) + 161);
		}

		// perda total diaria / mensal
		float perda = (float) (atividade * 0.400);
		float perdaDiaria = calculoBasal + perda;
		float perdaMensal = perdaDiaria * 30;

		// objetivo de perda de peso
		int objetivoPerda = objetivo * 7000;
		float totalCalorias = (float) (perdaMensal - objetivoPerda);
		float caloriaDiaria = totalCalorias / 30;

		System.out.printf("Você precisa de uma dieta de: %.2f kcal/dia", caloriaDiaria);
	}
}
