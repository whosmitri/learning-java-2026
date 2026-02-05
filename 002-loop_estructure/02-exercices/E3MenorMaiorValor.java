package aprendendo_java_2026;

import java.util.Scanner;

public class E3MenorMaiorValor {

	public static void main(String[] args) {
		/*
		 * Implemente um programa que instrua 
		 * o usuário a digitar um total de 50 
		 * valores numéricos. O algoritmo deve 
		 * determinar qual é o maior e o menor 
		 * valor entre todos os números digitados 
		 * e, em seguida, apresentar esses 
		 * valores ao usuário.
		 */
		
		// variáveis
		int i, numInput, maiorValor=0, menorValor=0;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		//lógica
		for (i=1; i<=5; i++) {
			System.out.printf("Digite um número inteiro [%d/50]: ", i);
			numInput = sc.nextInt();
			
			if (i==1) {
				maiorValor = numInput;
				menorValor = numInput;
			} else if (numInput > maiorValor) {
				maiorValor = numInput;
			} else if (numInput < menorValor) {
				menorValor = numInput;
			}
		}
		
		System.out.printf("Menor valor digitado: %d %nMaior valor digitado: %d", menorValor, maiorValor);

	}
}
