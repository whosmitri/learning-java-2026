package aprendendo_java_2026;

import java.util.Scanner;

public class E3VerificacaoDeIdade {

	public static void main(String[] args) {
		/*
		 * Solicite ao usuário que digite sua idade.
		 * Armazene a idade em uma variável.
		 * Verifique se a idade é maior ou igual a 18 anos.
		 * Se a idade for maior ou igual a 18 anos, exiba a mensagem "Você pode dirigir".
		 * Caso contrário, exiba a mensagem "Você não pode dirigir".
		 */
		
		// variaveis
		int idade;
		
		// entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// guardando os dados na variável
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		// lógica
		if (idade >= 18) {
			System.out.println("Você pode dirigir !!");
		} else {
			System.out.println("Você não pode dirigir.");
		}

	}

}
