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
//      System.out.println(nome +" " + sobrenome + ", Obrigado por usar nosso programa! Agora s�o exatamente: " + hora);

		// EXERCICIO 4
//      System.out.println("=======================================");
//      System.out.println("========== ADIVINHE O N�MERO ==========");
//      System.out.println("=======================================");
//      System.out.println("Adivinhe qual n�mero de 1 a 5 eu estou pensando: ");
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
//              System.out.println("Parab�ns! Voc� Acertou");
//              System.out.println("=======================================\n");
//
//              if (contador > 0){
//                  System.out.println("Parab�ns voc� acertou com " + contador + " tentativas");
//                  System.out.println("========== PROGRAMA FINALIZADO ==========\n");
//
//              }
//          }else{
//              System.out.println("Que pena, voc� Errou! O numero correto era " + n2);
//              System.out.println("=======================================\n");
//
//              contador++;
//              main(args);//chama novamente a fun��o main com os mesmos parametros.
//
//          }
//
//      }else{
//          System.out.println("Voc� deve digitar um n�mero entre 1 e 5! Por favor tente novamente.");
//          System.out.println("=======================================\n");
//          contador++;
//          main(args);//chama novamente a fun��o main com os mesmos parametros.
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
		 * System.out.println("======  C�LCULO DE COMBUST�VEL  ======\n"); Scanner
		 * entrada = new Scanner(System.in);
		 * 
		 * 
		 * System.out.println("Insira o pre�o da Gasolina: ");
		 * System.out.print("Por favor insira o valor em R$ (N�o use v�rgula): "); float
		 * gasolina = entrada.nextFloat();
		 * System.out.println("======================================");
		 * System.out.println("Quanto seu possante rende com Gasolina?");
		 * System.out.print("Por favor insira o valor em KM: "); int rendeGasolina =
		 * entrada.nextInt();
		 * System.out.println("======================================");
		 * System.out.println("Qual a dist�ncia percorrida com Gasolina?");
		 * System.out.print("Por favor insira o valor em KM: "); int distanciaGasolina =
		 * entrada.nextInt();
		 * 
		 * System.out.println("======================================");
		 * System.out.println("======================================");
		 * 
		 * System.out.println("Insira o pre�o do �lcool: ");
		 * System.out.print("Por favor insira o valor em R$ (N�o use v�rgula): "); float
		 * alcool = entrada.nextFloat();
		 * System.out.println("======================================");
		 * System.out.println("Quanto seu possante rende com �lcool? ");
		 * System.out.print("Por favor insira o valor em KM: "); int rendeAlcool =
		 * entrada.nextInt();
		 * System.out.println("======================================");
		 * System.out.println("Qual a dist�ncia percorrida com Alcool?");
		 * System.out.print("Por favor insira o valor em KM: "); int distanciaAlcool =
		 * entrada.nextInt();
		 * System.out.println("======================================");
		 * 
		 * System.out.println("=============  RESULTADO ============="); float
		 * gastoGasolina = (distanciaGasolina / rendeGasolina) * gasolina;
		 * System.out.println("Voc� vai gastar: R$ "+ gastoGasolina +
		 * " usando GASOLINA.");
		 * 
		 * float gastoAlcool = (distanciaAlcool / rendeAlcool) * alcool;
		 * System.out.println("Voc� vai gastar: R$ " + gastoAlcool + " usando �LCOOL.");
		 * 
		 * System.out.println("============ RECOMENDA��O ===========");
		 * 
		 * if(gastoGasolina > gastoAlcool) {
		 * System.out.println("Utilizar ALCOOL � melhor!"); }else {
		 * System.out.println("Utilizar GASOLINA � melhor!"); }
		 * 
		 */

		// EXERCICIO 7
		/*
		 * System.out.println("=============================================");
		 * System.out.println(" SISTEMA SUPER AVAN�ADO DE SA�DE E BEM ESTAR ");
		 * 
		 * keyboard = new Scanner(System.in);
		 * System.out.println("Informe seu Sexo (M ou F): "); String sexo =
		 * keyboard.next();
		 * 
		 * if ((sexo.equals("M")) || (sexo.equals("m"))) {
		 * System.out.println("Masculino Selecionado"); } else if ((sexo.equals("F")) ||
		 * (sexo.equals("f"))) { System.out.println("Feminino Selecionado"); } else {
		 * System.out.
		 * println("Voc� digitou um valor inv�lido. Por favor tente novamente!");
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
		 * println("Informe quantas horas de exercicios f�sicos pratica por dia: "); int
		 * atividade = keyboard.nextInt();
		 * 
		 * System.out.println("Informe quantos quilos precisa perder em um m�s"); int
		 * objetivo = keyboard.nextInt();
		 * 
		 * if (objetivo > 3) {
		 * System.out.println("Perder mais do que 3kg por m�s pode ser prejudicial!");
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
		 * System.out.printf("Voc� precisa de uma dieta de: %.2f kcal/dia",
		 * caloriaDiaria);
		 * 
		 */
		
		//EXERCICIO 8 
		keyboard = new Scanner(System.in);
		System.out.println("=========");
		System.out.println(" JOKENP� ");
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
			System.out.println("Uhuull... Jogador 1 � o vencedor!");
		}else if(placar1 < placar2) {
			System.out.println("Uhuull... Jogador 2 � o vencedor!");
		}else {
			System.out.println("Empatou!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
