package aprendendo_java_2026;

import java.util.Scanner;

public class E2DecidirVestimenta {

	public static void main(String[] args) {
		/*
		 * Descrição: Escreva um programa que 
		 * sugira o que vestir com base na 
		 * temperatura e no clima (ensolarado, 
		 * chuvoso ou nublado). Use o operador 
		 * ternário para determinar a roupa adequada.
		 * 
		 * Regras:
		 * * Se a temperatura for maior ou igual a 30°C, sugira "Roupas leves".
		 * * Se a temperatura estiver entre 20°C e 29°C, sugira "Roupas confortáveis".
		 * * Se a temperatura for menor que 20°C, sugira "Roupas quentes".
		 * * Além disso:
		 * * * Se o clima for "chuvoso", adicione "e leve um guarda-chuva".
		 * * * Se o clima for "ensolarado", adicione "e use óculos de sol".
		 * * * Para qualquer outro clima, mantenha apenas a sugestão de roupa.
		 */
		
		// variáveis
		String sugestaoTemp, sugestaoClima;
		double temperatura;
		int clima;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// guardando dados
		System.out.print("Informe a temperatura atual: ");
		temperatura = sc.nextDouble();
		System.out.printf("Tipos de clima: %n[1] - Chuvoso %n[2] - Ensolarado %n[3] - Outro %nInforme o clima atual: ");
		clima = sc.nextInt();
		
		// lógica
		sugestaoTemp = (temperatura >= 30) ? "roupas leves" : (temperatura < 20 ? "roupas quentes" : "roupas confortáveis");
		sugestaoClima = (clima == 1) ? "e leve um guarda-chuva" : (clima == 2 ? "e use óculos de sol" : "");
		
		System.out.printf("Use %s %s!!", sugestaoTemp, sugestaoClima);
	}
}
