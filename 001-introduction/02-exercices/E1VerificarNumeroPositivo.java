package aprendendo_java_2026;

import java.util.Scanner;

public class E1VerificarNumeroPositivo {

	public static void main(String[] args) {
		/*
		 * Solicite ao usuário que digite um número.
		 * Armazene o número em uma variável.
		 * Verifique se o número é positivo.
		 * Se o número for positivo, exiba a mensagem "O número é positivo".
		 * Caso contrário, exiba a mensagem "O número é negativo".
		 */
		
		// variáveis
		int num;
		
		// entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// colocando valor na variável
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		// lógica
		if (num > 0) {
			System.out.println("O número " + num + " é positivo!");
		} else if (num == 0) {
			System.out.println("O número 0 é neutro!");
		} else {
			System.out.println("O número " + num + " é negativo!");
		}

	}

}
