package aprendendo_java_2026;

import java.util.Scanner;

public class E5VerificarMultiploDeCinco {

	public static void main(String[] args) {
		/*
		 * Solicite ao usuário que digite um número.
		 * Armazene o número em uma variável.
		 * Verifique se o número é par e múltiplo de 5.
		 * Se o número for par e múltiplo de 5, exiba a mensagem "O número é par e múltiplo de 5".
		 * Caso contrário, exiba a mensagem "O número não atende aos critérios".
		 */
		
		// variáveis
		int numero;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// lógica
		System.out.print("Digite um número inteiro qualquer: ");
		numero = sc.nextInt();
		
		if (numero%5==0 && numero%2==0) {
			System.out.printf("O número %d é par e múltimo de 5!!", numero);
		} else {
			System.out.printf("O número %d não atende aos critérios", numero);
		}

	}
}
