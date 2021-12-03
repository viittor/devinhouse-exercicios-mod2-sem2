package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	private static Scanner keyboard;

	public static void main(String[] args) {
//		A obesidade � considerada por muitos especialistas a doen�a do s�culo XXI. Visando 
//		auxiliar o planejamento de nutricionistas e educadores f�sicos, voc� teve a ideia de
//		desenvolver um sistema que os auxilie na recomenda��o de dietas para pessoas. O seu 
//		programa recebe algumas informa��es e responde com a quantidade m�xima de calorias da 
//		dieta, conforme os objetivos da pessoa. Os especialistas lhe informaram o seguinte:
//
//			Considere que para perder 1 kg uma pessoa precisa deixar de ingerir 7000kcal;
//			Considere que para cada 1 hora de exerc�cio f�sico, uma pessoa consome 400kcal;
//			A quantidade de kcal que uma pessoa consome por dia em repouso (taxa metab�lica basal) 
//			se d� pelas f�rmulas:
//			Homem: (10 peso) + (6.25 altura) - (5 * idade) + 5;
//			Mulher: (10 peso) + (6.25 altura) - (5 * idade) - 161;
//			Abaixo segue especifica��o da entrada e sa�da esperadas:
//
//			Entrada
//			Sexo da pessoa (M ou F).
//			Caso a valor informado difere do esperado, exibir mensagem de erro e abortar execu��o;
//			Peso atual (kg)
//			Altura (cm)
//			Idade (anos)
//			Horas de atividade f�sica por dia
//			Peso (kg) que a pessoa deseja perder em um m�s.
//			Se for informado mais do que 3 kg exibir a mensagem: "Perder mais do que 3 kg por m�s 
//				pode ser prejudicial" e abortar a execu��o.
//			Sa�da:
//			M�ximo de kcal que a pessoa deve consumir por dia (dieta)
//			Exemplo de execu��o:
//
//			Informe seu sexo (M ou F): M
//			Informe quantos quilos precisa perder em um m�s: 2
//			Informe seu peso em quilos: 110
//			Informe sua altura em cm: 175
//			Informe sua idade em anos: 30
//			Informe quantas horas de exerc�cios f�sicos pratica por dia: 1
//			-------------
//			Voc� precisa de uma dieta de: 1982,75 kcal/dia
//			Desafio opcional: ajuste o seu programa para, ao inv�s de solicitar as horas de atividades 
//				f�sicas por dia, exibir o m�ximo de kcal que a pessoa deve consumir se praticar 1, 2 ou 3 horas de exerc�cio por dia.

		// EXERCICIO 7

		System.out.println("=============================================");
		System.out.println(" SISTEMA SUPER AVAN�ADO DE SA�DE E BEM ESTAR ");

		keyboard = new Scanner(System.in);
		System.out.println("Informe seu Sexo (M ou F): ");
		String sexo = keyboard.next();

		if ((sexo.equals("M")) || (sexo.equals("m"))) {
			System.out.println("Masculino Selecionado");
		} else if ((sexo.equals("F")) || (sexo.equals("f"))) {
			System.out.println("Feminino Selecionado");
		} else {
			System.out.println("Voc� digitou um valor inv�lido. Por favor tente novamente!");
			System.exit(0);
		}

		System.out.println("Informe seu peso em quilos: ");
		int peso = keyboard.nextInt();

		System.out.println("Informe sua altura em centimetros: ");
		int altura = keyboard.nextInt();

		System.out.println("Informe sua idade em anos: ");
		int idade = keyboard.nextInt();

		System.out.println("Informe quantas horas de exercicios f�sicos pratica por dia: ");
		int atividade = keyboard.nextInt();

		System.out.println("Informe quantos quilos precisa perder em um m�s");
		int objetivo = keyboard.nextInt();

		if (objetivo > 3) {
			System.out.println("Perder mais do que 3kg por m�s pode ser prejudicial!");
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

		System.out.printf("Voc� precisa de uma dieta de: %.2f kcal/dia", caloriaDiaria);
	}
}
