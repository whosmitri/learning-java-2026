package aprendendo_java_2026;

import java.util.Scanner;

public class E1ClassificarIdade {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que classifique 
		 * uma pessoa com base na idade. Use o 
		 * operador ternário para determinar se 
		 * a pessoa é:
		 * * "Criança" (idade menor que 12),
		 * * "Adolescente" (idade entre 12 e 17),
		 * * "Adulto" (idade maior ou igual a 18).
		 * 
		 * Dica: Você pode usar operadores ternários aninhados para resolver.
		 */

		// variáveis
		int idade;
		String classificacao;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// pegando os dados
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		// lógica
		classificacao = (idade <= 12) ? ("criança") : (idade >= 18 ? "adulto" : "adolescente" );
		
		System.out.println("Classificação: " + classificacao);
	}
}
