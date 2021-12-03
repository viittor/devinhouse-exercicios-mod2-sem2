package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um programa que recomende o melhor tipo de combust�vel (Etanol ou
		 * Gasolina) para um motorista. O programa recebe informa��es de pre�o dos
		 * combust�veis, consumo do ve�culo e quilometragem rodada e responde com o
		 * gasto para cada um dos combust�veis, bem como qual � o combust�vel
		 * recomendado. Abaixo segue especifica��o da entrada e sa�da esperadas:
		 * 
		 * Entrada: Pre�o do Etanol e da Gasolina por litro Rendimento (km) do ve�culo
		 * por litro de Etanol e Gasolina Rodagem m�dia (km) do motorista Sa�da: Custo
		 * m�dio do motorista com Etanol e com Gasolina Combust�vel mais indicado para
		 * uso (com gasto menor) Desafio opcional: ajuste o seu programa para receber as
		 * informa��es de rendimento do ve�culo e a rodagem na cidade e na rodovia.
		 */

		// EXERCICIO 6

		System.out.println("======  C�LCULO DE COMBUST�VEL  ======\n");
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o pre�o da Gasolina: ");
		System.out.print("Por favor insira o valor em R$ (N�o use v�rgula): ");
		float gasolina = entrada.nextFloat();
		System.out.println("======================================");
		System.out.println("Quanto seu possante rende com Gasolina?");
		System.out.print("Por favor insira o valor em KM: ");
		int rendeGasolina = entrada.nextInt();
		System.out.println("======================================");
		System.out.println("Qual a dist�ncia percorrida com Gasolina?");
		System.out.print("Por favor insira o valor em KM: ");
		int distanciaGasolina = entrada.nextInt();

		System.out.println("======================================");
		System.out.println("======================================");

		System.out.println("Insira o pre�o do �lcool: ");
		System.out.print("Por favor insira o valor em R$ (N�o use v�rgula): ");
		float alcool = entrada.nextFloat();
		System.out.println("======================================");
		System.out.println("Quanto seu possante rende com �lcool? ");
		System.out.print("Por favor insira o valor em KM: ");
		int rendeAlcool = entrada.nextInt();
		System.out.println("======================================");
		System.out.println("Qual a dist�ncia percorrida com Alcool?");
		System.out.print("Por favor insira o valor em KM: ");
		int distanciaAlcool = entrada.nextInt();
		System.out.println("======================================");

		System.out.println("=============  RESULTADO =============");
		float gastoGasolina = (distanciaGasolina / rendeGasolina) * gasolina;
		System.out.println("Voc� vai gastar: R$ " + gastoGasolina + " usando GASOLINA.");

		float gastoAlcool = (distanciaAlcool / rendeAlcool) * alcool;
		System.out.println("Voc� vai gastar: R$ " + gastoAlcool + " usando �LCOOL.");

		System.out.println("============ RECOMENDA��O ===========");

		if (gastoGasolina > gastoAlcool) {
			System.out.println("Utilizar ALCOOL � melhor!");
		} else {
			System.out.println("Utilizar GASOLINA � melhor!");
		}

	}

}
