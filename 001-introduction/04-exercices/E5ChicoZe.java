package aprendendo_java_2026;

import java.util.Scanner;

public class E5ChicoZe {

	public static void main(String[] args) {
		/*
		 * Programe um algoritmo que simule o 
		 * crescimento anual de Chico e Zé. Chico 
		 * começa com 1,50m de altura e cresce 2 
		 * centímetros a cada ano, enquanto Zé 
		 * começa com 1,10m e cresce 3 centímetros 
		 * anualmente. O programa deve calcular e 
		 * informar após quantos anos Zé será mais 
		 * alto que Chico.
		 */
		
		// variáveis
		double alturaChico=1.50, alturaZe=1.10;
		int i, qtdAnos=0;
		
		// criando scanner
		Scanner sc = new Scanner(System.in);
		
		// lógica
		
		for (i=0; ; i++) {
			qtdAnos++;
			alturaChico += 0.02;
			alturaZe += 0.03;
			
			System.out.printf("----- %nAno: %d %nAltura do Chico: %f %nAltura do Zé: %f %n----- %n%n", qtdAnos, alturaChico, alturaZe);
			
			if (alturaZe > alturaChico) {
				break;
			}
		}
		
		System.out.printf("Zé será mais alto que Chico após %d anos", qtdAnos);

	}
}
