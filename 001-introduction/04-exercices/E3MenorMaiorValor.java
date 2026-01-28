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
		int i, numInput;
		int[] numeros = new int[50];
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		//lógica
		for (i=0; i<10; i++) {
			System.out.printf("Digite um número inteiro [%d/50]: ", i+1);
			numInput = sc.nextInt();
			
			numeros[i] = numInput;
		}
		
		System.out.println(numeros);

	}
}
