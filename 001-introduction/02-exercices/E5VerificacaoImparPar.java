package aprendendo_java_2026;

import java.util.Scanner;

public class E5VerificacaoImparPar {

	public static void main(String[] args) {
		/*
		 * Solicite ao usuário que digite um número.
		 * Armazene o número em uma variável.
		 * Verifique se o número é par ou ímpar.
		 * Se o número for par, exiba a mensagem "O número é par".
		 * Caso contrário, exiba a mensagem "O número é ímpar".
		*/
		
		// variáveis
		int num;
		
		// entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// guardando dados
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
		// lógica
		if (num%2==0) {
			System.out.printf("O número %d é um número PAR!!%n", num);
		} else {
			System.out.printf("O número %d é um número IMPAR!!%n", num);
		}

	}

}
