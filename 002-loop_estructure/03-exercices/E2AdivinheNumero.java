package exercicios06;

import java.util.Random;
import java.util.Scanner;

public class E2AdivinheNumero {

	public static void main(String[] args) {
		/*
		 * Implemente um algoritmo que escolha 
		 * um número aleatório entre 1 e 10. O 
		 * usuário deve tentar adivinhar o número, 
		 * e o laço enquanto deverá ser usado 
		 * para permitir tentativas até que o 
		 * usuário acerte o número. Quando o número 
		 * correto for adivinhado, o programa deve 
		 * informar quantas tentativas foram necessárias.
		 */
		
		// variáveis
		int numAleatorio, chute, tentativas=0;
		
		// criando um objeto da classe Random
		Random random = new Random();
        numAleatorio = random.nextInt(10) + 1; // gera um número aleatório entre 1 e 10
		
		// criando scanner
        Scanner sc = new Scanner(System.in);
        
        // lógica
        while (true) {
        	// entrada do usuário
        	System.out.print("Tente adivinhar o número de 1 a 10: ");
        	chute = sc.nextInt();
        	
        	// incrementando o número de tentativas
        	tentativas += 1;
        	
        	// condição de parada
        	if (chute == numAleatorio) {
        		System.out.printf("Você conseguiu adivinhar o número %d com %d tentativas !!", numAleatorio, tentativas);
        		break;
        	}
        }

	}
}
