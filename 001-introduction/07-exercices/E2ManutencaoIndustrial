package exercicios06;

import java.util.Scanner;

public class E2ManutencaoIndustrial {
	
	/*
	 * Descrição: Uma fábrica deseja implementar um sistema 
	 * que calcule o custo de manutenção baseado no número 
	 * de peças substituídas e no custo por peça. Além disso, 
	 * o sistema deve exibir informações detalhadas sobre cada 
	 * manutenção realizada.
	 * 
	 * Tarefa: 
	 * Crie um método com retorno chamado calcularCustoManutencao, 
	 *  que receba dois parâmetros:
	 * * O número de peças substituídas (um número inteiro).
	 * * O custo por peça (um número decimal).
	 * * O método deve retornar o custo total da manutenção.
	 * Crie um método sem retorno chamado exibirDetalhesManutencao, 
	 *  que receba três parâmetros:
	 *  * O nome da máquina (uma String).
	 *  * A data da manutenção (uma String).
	 *  * O custo total calculado pelo método anterior.
	 *  * Este método deve exibir as seguintes informações:
	 *  * * Máquina: [nome]
	 *  * * Data: [data]
	 *  * * Custo Total: R$ [custo calculado]
	 */
	
	public static double calcularCustoManutencao(int pecasSubstituidas, double pecaCusto) {
		double custoTotal = pecasSubstituidas * pecaCusto;
		return custoTotal;
	}
	
	public static void exibirDetalhesManutencao(String nomeMaquina, String dataManutencao, double custoTotal) {
		System.out.printf("Máquina: %s %nData: %s %nCusto Total: R$%.2f", nomeMaquina, dataManutencao, custoTotal);
	}

	public static void main(String[] args) {
		// variáveis
		int pecasSubstituidas;
		double pecaCusto, custoTotal;
		String nome, data;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// pegando os dados das peças
		System.out.print("Digite quantas peças foram substituídas: ");
		pecasSubstituidas = sc.nextInt();
		System.out.print("Digite o custo de cada peça (em reais): ");
		pecaCusto = sc.nextDouble();
		
		// pegando os dados da máquina
		System.out.print("Digite o nome da máquina: ");
		nome = sc.next();
		System.out.print("Insira a data de manutenção (dd-mm-aaaa): ");
		data = sc.next();
		
		// usando as funções
		
		custoTotal = calcularCustoManutencao(pecasSubstituidas, pecaCusto);
		exibirDetalhesManutencao(nome, data, custoTotal);
	}

}
