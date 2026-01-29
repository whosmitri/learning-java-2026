package aprendendo_java_2026;

import java.util.Scanner;

public class E2ValidacaoNumPrimo {

	public static void main(String[] args) {
		/*
		 * Solicite ao usuário que digite um número.
		 * Armazene o número em uma variável.
		 * Verifique se o número é primo.
		 * Se o número for primo, exiba a mensagem "O número é primo".
		 * Caso contrário, exiba a mensagem "O número não é primo".
		 */
		
		// variáveis
		int i, num, contador=0;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
				
		// guardando valor
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
				
		// lógica
		for (i=1; i<=num; i++) {
			if (num%i==0) {
				contador++;
			}
		}
		
		if (contador <= 2) {
			System.out.printf("O número %d é um número primo!!", num);
		} else {
			System.out.printf("O número %d NÃO é um número primo!!", num);
		}

	}
}
