package aprendendo_java_2026;

import java.util.Scanner;

public class E2MediaPares {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que peça ao usuário 
		 * para inserir uma sequência de números 
		 * inteiros. O programa deve calcular e 
		 * exibir a média dos números pares 
		 * fornecidos. A inserção de números deve 
		 * ser encerrada quando o usuário digitar 
		 * o número zero (0), e o programa deve 
		 * então mostrar a média calculada
		 */
		
		// variáveis
		int numInput, somaPares = 0, qtdPares = 0;
		float mediaPares;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// lógica
		do {
			System.out.print("Digite um número inteiro: ");
			numInput = sc.nextInt();
			
			if (numInput % 2 == 0 && numInput != 0) {
				somaPares += numInput;
				qtdPares += 1;
			}
			
		} while (numInput != 0);
		
		mediaPares = somaPares/qtdPares;
		
		System.out.println("A média dos números pares que você digitou foi: " + mediaPares);

	}
}
