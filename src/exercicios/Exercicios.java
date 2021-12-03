package exercicios;

import java.text.ParseException;
import java.util.Scanner;

public class Exercicios {

	private static Scanner keyboard;

	public static void main(String[] args) throws ParseException {

		// EXERCICIO 1
//      Random numero = new Random();
//      System.out.println(numero.nextInt(2));

		// EXERCICIO 2
//      Scanner entrada = new Scanner(System.in);
//      System.out.print("Qual seu Sobrenome? ");
//      String sobrenome = entrada.nextLine();
//
//      System.out.print("Qual seu Nome? ");
//      String nome = entrada.nextLine();
//
//      System.out.println(nome +" " + sobrenome + ", Obrigado por usar nosso programa!");

		// EXERCICIO 3
//      Scanner entrada = new Scanner(System.in);
//      System.out.print("Qual seu Sobrenome? ");
//      String sobrenome = entrada.nextLine();
//
//      System.out.print("Qual seu Nome? ");
//      String nome = entrada.nextLine();
//
//      LocalTime hora = LocalTime.now();
//
//      System.out.println(nome +" " + sobrenome + ", Obrigado por usar nosso programa! Agora são exatamente: " + hora);

		// EXERCICIO 4
//      System.out.println("=======================================");
//      System.out.println("========== ADIVINHE O NÚMERO ==========");
//      System.out.println("=======================================");
//      System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando: ");
//      Scanner number = new Scanner(System.in);
//      int n1 = number.nextInt();
//      System.out.println("=======================================");
//
//
//      Random aleatorio = new Random();
//      int n2 = aleatorio.nextInt(6);
//
//      int contador = 0;
//
//      if (n1 > 0 && n1 < 6){
//          if (n1 == n2){
//              System.out.println("Parabéns! Você Acertou");
//              System.out.println("=======================================\n");
//
//              if (contador > 0){
//                  System.out.println("Parabéns você acertou com " + contador + " tentativas");
//                  System.out.println("========== PROGRAMA FINALIZADO ==========\n");
//
//              }
//          }else{
//              System.out.println("Que pena, você Errou! O numero correto era " + n2);
//              System.out.println("=======================================\n");
//
//              contador++;
//              main(args);//chama novamente a função main com os mesmos parametros.
//
//          }
//
//      }else{
//          System.out.println("Você deve digitar um número entre 1 e 5! Por favor tente novamente.");
//          System.out.println("=======================================\n");
//          contador++;
//          main(args);//chama novamente a função main com os mesmos parametros.
//      }

		// EXERCICIO 5
		/*
		 * Scanner entrada = new Scanner(System.in); Calendar c =
		 * Calendar.getInstance(); System.out.println("Digite uma Data:"); //String data
		 * = entrada.nextLine(); Date data = c.getTime(); DateFormat f =
		 * DateFormat.getDateInstance(); SimpleDateFormat sdf = new
		 * SimpleDateFormat("dd/MM/yyyy"); Date data2 = f.parse("21/01/1995");
		 * System.out.println(data2); System.out.println(data); DateFormat formatData =
		 * DateFormat.getDateInstance(); System.out.println(formatData.format(data));
		 */

		/*
		 * //EXERCICIO 6
		 * 
		 * System.out.println("======  CÁLCULO DE COMBUSTÍVEL  ======\n"); Scanner
		 * entrada = new Scanner(System.in);
		 * 
		 * 
		 * System.out.println("Insira o preço da Gasolina: ");
		 * System.out.print("Por favor insira o valor em R$ (Não use vírgula): "); float
		 * gasolina = entrada.nextFloat();
		 * System.out.println("======================================");
		 * System.out.println("Quanto seu possante rende com Gasolina?");
		 * System.out.print("Por favor insira o valor em KM: "); int rendeGasolina =
		 * entrada.nextInt();
		 * System.out.println("======================================");
		 * System.out.println("Qual a distância percorrida com Gasolina?");
		 * System.out.print("Por favor insira o valor em KM: "); int distanciaGasolina =
		 * entrada.nextInt();
		 * 
		 * System.out.println("======================================");
		 * System.out.println("======================================");
		 * 
		 * System.out.println("Insira o preço do Álcool: ");
		 * System.out.print("Por favor insira o valor em R$ (Não use vírgula): "); float
		 * alcool = entrada.nextFloat();
		 * System.out.println("======================================");
		 * System.out.println("Quanto seu possante rende com Álcool? ");
		 * System.out.print("Por favor insira o valor em KM: "); int rendeAlcool =
		 * entrada.nextInt();
		 * System.out.println("======================================");
		 * System.out.println("Qual a distância percorrida com Alcool?");
		 * System.out.print("Por favor insira o valor em KM: "); int distanciaAlcool =
		 * entrada.nextInt();
		 * System.out.println("======================================");
		 * 
		 * System.out.println("=============  RESULTADO ============="); float
		 * gastoGasolina = (distanciaGasolina / rendeGasolina) * gasolina;
		 * System.out.println("Você vai gastar: R$ "+ gastoGasolina +
		 * " usando GASOLINA.");
		 * 
		 * float gastoAlcool = (distanciaAlcool / rendeAlcool) * alcool;
		 * System.out.println("Você vai gastar: R$ " + gastoAlcool + " usando ÁLCOOL.");
		 * 
		 * System.out.println("============ RECOMENDAÇÃO ===========");
		 * 
		 * if(gastoGasolina > gastoAlcool) {
		 * System.out.println("Utilizar ALCOOL é melhor!"); }else {
		 * System.out.println("Utilizar GASOLINA é melhor!"); }
		 * 
		 */

		// EXERCICIO 7
		/*
		 * System.out.println("=============================================");
		 * System.out.println(" SISTEMA SUPER AVANÇADO DE SAÚDE E BEM ESTAR ");
		 * 
		 * keyboard = new Scanner(System.in);
		 * System.out.println("Informe seu Sexo (M ou F): "); String sexo =
		 * keyboard.next();
		 * 
		 * if ((sexo.equals("M")) || (sexo.equals("m"))) {
		 * System.out.println("Masculino Selecionado"); } else if ((sexo.equals("F")) ||
		 * (sexo.equals("f"))) { System.out.println("Feminino Selecionado"); } else {
		 * System.out.
		 * println("Você digitou um valor inválido. Por favor tente novamente!");
		 * System.exit(0); }
		 * 
		 * System.out.println("Informe seu peso em quilos: "); int peso =
		 * keyboard.nextInt();
		 * 
		 * System.out.println("Informe sua altura em centimetros: "); int altura =
		 * keyboard.nextInt();
		 * 
		 * System.out.println("Informe sua idade em anos: "); int idade =
		 * keyboard.nextInt();
		 * 
		 * System.out.
		 * println("Informe quantas horas de exercicios físicos pratica por dia: "); int
		 * atividade = keyboard.nextInt();
		 * 
		 * System.out.println("Informe quantos quilos precisa perder em um mês"); int
		 * objetivo = keyboard.nextInt();
		 * 
		 * if (objetivo > 3) {
		 * System.out.println("Perder mais do que 3kg por mês pode ser prejudicial!");
		 * System.exit(0); }
		 * 
		 * 
		 * //taxa metabolica basal
		 * 
		 * float calculoBasal = 0;
		 * 
		 * if ((sexo.equals("M")) || (sexo.equals("m"))) { calculoBasal = (float) ((10 *
		 * peso) + (6.25 * altura) - (5 * idade) + 5);
		 * 
		 * } else { calculoBasal = (float) ((10 * peso) + (6.25 * altura) - (5 * idade)
		 * + 161); }
		 * 
		 * //perda total diaria / mensal float perda = (float) (atividade * 0.400);
		 * float perdaDiaria = calculoBasal + perda; float perdaMensal = perdaDiaria *
		 * 30;
		 * 
		 * //objetivo de perda de peso int objetivoPerda = objetivo * 7000; float
		 * totalCalorias =(float)( perdaMensal - objetivoPerda); float caloriaDiaria =
		 * totalCalorias / 30;
		 * 
		 * System.out.printf("Você precisa de uma dieta de: %.2f kcal/dia",
		 * caloriaDiaria);
		 * 
		 */
		
		//EXERCICIO 8 
		keyboard = new Scanner(System.in);
		System.out.println("=========");
		System.out.println(" JOKENPÔ ");
		System.out.println("=========");
		String entrada = "OI";
		
		char pedra = 'R';
		char papel = 'P';
		char tesoura = 'S';					
		int placar1 = 0;
		int placar2 = 0;
		
		while(!entrada.equals("")) {
			System.out.print("Informe as jogadas: ");
			entrada = keyboard.nextLine();
			if(!entrada.equals("")){
			char jog1 = entrada.charAt(0);
			char jog2 = entrada.charAt(2);			
			
			if(jog1 == pedra && jog2 == tesoura) {
				placar1++;
			}else if(jog1 == pedra && jog2 == papel) {
				placar2++;
			}else if (jog1 == tesoura && jog2 == pedra) {
				placar2++;
			}else if(jog1 == tesoura && jog2 == papel) {
				placar1++;
			}else if (jog1 == papel && jog2 == pedra) {
				placar1++;
			}else if(jog1 == papel && jog2 == tesoura) {
				placar2++;
			}
			}
		}
		
		System.out.println("===================");
		System.out.println("Jogo finalizado! Placar:");
		System.out.printf(" Jogador A    %d  X   %d    Jogador B\n", placar1, placar2);
		
		if(placar1 > placar2) {
			System.out.println("Uhuull... Jogador 1 é o vencedor!");
		}else if(placar1 < placar2) {
			System.out.println("Uhuull... Jogador 2 é o vencedor!");
		}else {
			System.out.println("Empatou!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
