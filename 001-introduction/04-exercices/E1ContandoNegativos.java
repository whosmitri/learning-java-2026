package aprendendo_java_2026;

import java.util.Scanner;

public class E1ContandoNegativos {

	public static void main(String[] args) {
		/*
		 * Desenvolva um programa em que solicite 
		 * ao usuário a entrada de cinco valores 
		 * numéricos, um após o outro. O programa 
		 * deve contar quantos desses valores são 
		 * negativos. Ao final da entrada dos dados, 
		 * o programa deverá exibir a quantidade de 
		 * valores negativos informados pelo usuário.
		 * */
		
		// variáveis
		int i, numInput, numsNegativos = 0;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// lógica
		for (i = 0; i < 5; i++) {
			System.out.print("Digite um número inteiro qualquer: ");
			numInput = sc.nextInt();
			
			if (numInput < 0) {
				numsNegativos += 1;
			}
		}
		
		System.out.printf("Você digitou %d número(s) negativo(s)!!", numsNegativos);

	}
}
