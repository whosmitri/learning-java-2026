package exercicios07;

import java.util.Scanner;

public class E1ControleDeProducao {
	
	/*
	 * Descrição: Você está desenvolvendo 
	 * um sistema para monitorar a eficiência 
	 * de máquinas em uma fábrica. O sistema 
	 * precisa calcular o tempo total de 
	 * operação das máquinas e exibir alertas 
	 * quando o tempo exceder um limite.
	 * 
	 * Tarefa: Crie um método com retorno 
	 * chamado calcularTempoOperacao, que 
	 * receba dois parâmetros:
	 * * O número de horas trabalhadas por dia (um número inteiro).
	 * * O número de dias trabalhados (um número inteiro).
	 * * O método deve retornar o tempo total de operação (em horas).
	 * 
	 * Crie um método sem retorno chamado 
	 * exibirAlerta, que receba o tempo 
	 * total calculado e exiba a seguinte mensagem:
	 * * "Alerta: Tempo de operação excedido!" se 
	 * * * o tempo total for maior que 100 horas.
	 * * "Tempo de operação dentro do limite." caso contrário.
	 */

	public static double calcularTempoOperacao(int diasTrabalhados, double horasTrabalhadas) {
		// calculando todas as horas trabalhadas
		double tmpTotalOperacoes = diasTrabalhados * horasTrabalhadas;
		
		// retornando o valor calculado
		return tmpTotalOperacoes;
	}
	
	public static void exibirAlerta(double tmpTotalOperacoes) {
		if (tmpTotalOperacoes > 100) {
			System.out.printf("%nTempo Total: %.0f %nAlerta: Tempo de operação excedido!", tmpTotalOperacoes);
		} else if (tmpTotalOperacoes <= 0) {
			System.out.println("Tempo de operação nulo.");
		} else {
			System.out.printf("%nTempo Total: %.0f %nTempo de operação dentro do limite.", tmpTotalOperacoes);
		}
	}
	
	public static void main(String[] args) {
		// variáveis
		int dias;
		double horas, tmpTotalOperacoes;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// recebendo os dados do usuário
		System.out.print("Informe o número de dias trabalhados: ");
		dias = sc.nextInt();
		System.out.print("Informa o número de horas trabalhadas por dia: ");
		horas = sc.nextDouble();
		
		// usando as funções criadas
		double tempoDeOperacao = calcularTempoOperacao(dias, horas);
		exibirAlerta(tempoDeOperacao);
		
	}

}
