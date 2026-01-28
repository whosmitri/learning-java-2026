package aprendendo_java_2026;

import java.util.Scanner;

public class E4Tabuada {

	public static void main(String[] args) {
		/*
		 * Elabore um algoritmo que solicite 
		 * ao usuário que insira 20 números, 
		 * um de cada vez. Para cada número 
		 * informado, o programa deve gerar e 
		 * exibir a tabuada completa de multiplicação 
		 * desse número, começando do 1 e indo 
		 * até o próprio número fornecido.
		 */
		
		// variáveis
		int i, o, numInput;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// lógica
		for (i=0; i<20; i++) {
			System.out.printf("Digite um número inteiro [%d/20]: ", i+1);
			numInput = sc.nextInt();
			
			System.out.println("Tabuada do " + numInput);
			for (o=1; o<11; o++) {
				System.out.printf("%d x %d = %d %n", numInput, o, numInput*o);
			}
		}

	}

}
