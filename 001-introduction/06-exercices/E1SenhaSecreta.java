package exercicios06;

import java.util.Scanner;

public class E1SenhaSecreta {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que peça ao usuário 
		 * para digitar uma senha. Utilize o laço 
		 * enquanto para continuar solicitando a 
		 * senha até que o usuário digite a senha 
		 * correta, "abracadabra". Quando a senha 
		 * correta for inserida, o programa deverá 
		 * exibir uma mensagem de sucesso.
		 */
		
		// variáveis
		String username="whosmitri", passwd="abracadabra", passwdInput;
		int tentativas = 0;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// lógica
		
		do {
			System.out.print("Digite sua senha: ");
			passwdInput = sc.next();
			
			tentativas += 1;
			
			if (passwdInput.equals(passwd)) {
				System.out.printf("Seja bem-vindo, %s !!%n", username);
				break;
			} else {
				System.err.println("Senha incorreta!");
			}
			
			if (tentativas == 3) {
				System.out.println("Número máximo de tentativas. Aguarde por 1 hora até tentar novamente.");
			}
		} while (tentativas < 3);
		
	}
}
