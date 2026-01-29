package aprendendo_java_2026;

import java.util.Scanner;

public class E3VerificacaoMaioridadePenal {

	public static void main(String[] args) {
		/*
		 * Solicite ao usuário que digite sua idade.
		 * Armazene a idade em uma variável.
		 * Verifique se a idade é maior ou igual a 18 anos.
		 * Se a idade for maior ou igual a 18 anos, exiba a mensagem "Você é penalmente responsável".
		 * Caso contrário, exiba a mensagem "Você não é penalmente responsável".
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
			System.out.println("Você é penalmente responsável");
		} else {
			System.out.println("Você NÃO é penalmente responsável");
		}

	}
}
