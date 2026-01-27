package aprendendo_java_2026;

import java.util.Scanner;

public class E2CalculoDesconto {

	public static void main(String[] args) {
		/*
		 * Solicite ao usuário que digite o valor do produto.
		 * Armazene o valor em uma variável.
		 * Verifique se o valor é maior que R$ 50,00.
		 * Se o valor for maior que R$ 50,00, calcule o desconto de 10% sobre o valor e exiba o novo valor com desconto.
		 * Caso contrário, exiba a mensagem "Não há desconto para este produto".
		 */
		
		// variáveis
		float desconto;
		float valorFinal;
		float valor;
		
		// entrada de dados
		Scanner sc = new Scanner(System.in);
				
		// colocando valor na variável
		System.out.println("Digite o valor da compra: ");
		valor = sc.nextFloat();
		
		// lógica
		if (valor > 50) {
			desconto = valor * 10/100;
			valorFinal = valor - desconto;
			System.out.println("Para a sua compra de R$" + valor + ", o desconto é de R$" + desconto + " e o total a pagar é: R$" + valorFinal);
		} else {
			System.out.println("Não há desconto para esta compra. O total a pagar é: R$" + valor);
		}

	}

}
