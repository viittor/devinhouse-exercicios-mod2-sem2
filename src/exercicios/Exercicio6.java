package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Desenvolva um programa que recomende o melhor tipo de combustível (Etanol ou
		 * Gasolina) para um motorista. O programa recebe informações de preço dos
		 * combustíveis, consumo do veículo e quilometragem rodada e responde com o
		 * gasto para cada um dos combustíveis, bem como qual é o combustível
		 * recomendado. Abaixo segue especificação da entrada e saída esperadas:
		 * 
		 * Entrada: Preço do Etanol e da Gasolina por litro Rendimento (km) do veículo
		 * por litro de Etanol e Gasolina Rodagem média (km) do motorista Saída: Custo
		 * médio do motorista com Etanol e com Gasolina Combustível mais indicado para
		 * uso (com gasto menor) Desafio opcional: ajuste o seu programa para receber as
		 * informações de rendimento do veículo e a rodagem na cidade e na rodovia.
		 */

		// EXERCICIO 6

		System.out.println("======  CÁLCULO DE COMBUSTÍVEL  ======\n");
		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o preço da Gasolina: ");
		System.out.print("Por favor insira o valor em R$ (Não use vírgula): ");
		float gasolina = entrada.nextFloat();
		System.out.println("======================================");
		System.out.println("Quanto seu possante rende com Gasolina?");
		System.out.print("Por favor insira o valor em KM: ");
		int rendeGasolina = entrada.nextInt();
		System.out.println("======================================");
		System.out.println("Qual a distância percorrida com Gasolina?");
		System.out.print("Por favor insira o valor em KM: ");
		int distanciaGasolina = entrada.nextInt();

		System.out.println("======================================");
		System.out.println("======================================");

		System.out.println("Insira o preço do Álcool: ");
		System.out.print("Por favor insira o valor em R$ (Não use vírgula): ");
		float alcool = entrada.nextFloat();
		System.out.println("======================================");
		System.out.println("Quanto seu possante rende com Álcool? ");
		System.out.print("Por favor insira o valor em KM: ");
		int rendeAlcool = entrada.nextInt();
		System.out.println("======================================");
		System.out.println("Qual a distância percorrida com Alcool?");
		System.out.print("Por favor insira o valor em KM: ");
		int distanciaAlcool = entrada.nextInt();
		System.out.println("======================================");

		System.out.println("=============  RESULTADO =============");
		float gastoGasolina = (distanciaGasolina / rendeGasolina) * gasolina;
		System.out.println("Você vai gastar: R$ " + gastoGasolina + " usando GASOLINA.");

		float gastoAlcool = (distanciaAlcool / rendeAlcool) * alcool;
		System.out.println("Você vai gastar: R$ " + gastoAlcool + " usando ÁLCOOL.");

		System.out.println("============ RECOMENDAÇÃO ===========");

		if (gastoGasolina > gastoAlcool) {
			System.out.println("Utilizar ALCOOL é melhor!");
		} else {
			System.out.println("Utilizar GASOLINA é melhor!");
		}

	}

}
